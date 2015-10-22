package com.pro.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

import oracle.jdbc.OracleTypes;

import com.pro.domain.Ordertable;
import com.pro.domain.Tab;
import com.pro.domain.Tabstate;


public class TabDaoImpl extends BaseDaoImpl<Tab, Long> implements TabDao{
	
	
	public Map<String,Object> page(int currentPage,int pageSize) throws Exception{
		Connection conn = null;
		Class.forName("oracle.jdbc.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","123456");
		
		CallableStatement cstmt=conn.prepareCall("{call pkg_classes.Pager(?,?,?,?,?,?,?)}");
		cstmt.setInt(1, currentPage);
		cstmt.setInt(2, pageSize);
		cstmt.setString(3, "Tab");
		cstmt.setString(4, "");
		cstmt.setString(5, "tabId");
		cstmt.registerOutParameter(6, OracleTypes.INTEGER);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		
		cstmt.execute();
		
		ResultSet rs = (ResultSet) cstmt.getObject(7);
		Map<String,Object> map=new HashMap<String, Object>();
		List<Tab> tabList = new ArrayList<Tab>();
		Tab tab = new Tab();
		while(rs.next()){
			tab = new Tab();
			tab.setTabId(rs.getInt("tabId"));
			tab.setTabName(rs.getString("tabName"));
			tab.setTabType(rs.getString("tabType"));
			tab.setTabComedate(rs.getString("tabComedate"));
			tab.setTabCon(rs.getString("tabCon"));
			tab.setTabOther(rs.getString("tabOther"));
			
			TabstateDao tabstateDao = new TabstateDaoImpl();
		    Tabstate tabstate = tabstateDao.get(rs.getLong("stateId"));
		    tab.setTabstate(tabstate);
		    
		    OrdertableDao ordertableDao = new OrdertableDaoImpl();
		    Ordertable ordertable = ordertableDao.get(rs.getLong("orderId"));
		    tab.setOrdertable(ordertable);
		    
			tabList.add(tab);
		}
		map.put("rows", tabList);
		map.put("total", cstmt.getInt(6));
		conn.close();
		
		return map;
	}
	
	@SuppressWarnings("unchecked")
	public Map<String,Object> pageTab(final int currentPage,final int pageSize){
		
		Map<String,Object> map=(Map<String, Object>) this.getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				Connection conn = session.connection();
				CallableStatement cstmt=conn.prepareCall("{call pkg_classes.Pager(?,?,?,?,?,?,?)}");
				cstmt.setInt(1, currentPage);
				cstmt.setInt(2, pageSize);
				cstmt.setString(3, "Tab");
				cstmt.setString(4, "");
				cstmt.setString(5, "tabId");
				cstmt.registerOutParameter(6, OracleTypes.INTEGER);
				cstmt.registerOutParameter(7, OracleTypes.CURSOR);
				
				cstmt.execute();
				
				ResultSet rs = (ResultSet) cstmt.getObject(7);
				Map<String,Object> map=new HashMap<String, Object>();
				List<Tab> tabList = new ArrayList<Tab>();
				Tab tab = new Tab();
				while(rs.next()){
					tab = new Tab();
					tab.setTabId(rs.getInt("tabId"));
					tab.setTabName(rs.getString("tabName"));
					tab.setTabType(rs.getString("tabType"));
					tab.setTabComedate(rs.getString("tabComedate"));
					tab.setTabCon(rs.getString("tabCon"));
					tab.setTabOther(rs.getString("tabOther"));
					
					TabstateDao tabstateDao = new TabstateDaoImpl();
				    Tabstate tabstate = tabstateDao.get(rs.getLong("stateId"));
				    tab.setTabstate(tabstate);
				    
				    OrdertableDao ordertableDao = new OrdertableDaoImpl();
				    Ordertable ordertable = ordertableDao.get(rs.getLong("orderId"));
				    tab.setOrdertable(ordertable);
				    
					tabList.add(tab);
				}
				map.put("rows", tabList);
				map.put("total", cstmt.getInt(6));
				return map;
			}
		});
		return map;
	}
}
