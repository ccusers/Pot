package com.pro.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
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
	
	
	@SuppressWarnings("unchecked")
	public Map<String,Object> pageTab(final int currentPage,final int pageSize){
		
		Map<String,Object> map=(Map<String, Object>) this.getHibernateTemplate().execute(new HibernateCallback() {
			public Map<String,Object> doInHibernate(Session session) throws HibernateException,
					SQLException {
				Connection conn = session.connection();
				CallableStatement cstmt=conn.prepareCall("{call pkg_classes.Pager(?,?,?,?,?,?,?)}");
				cstmt.setInt(1, currentPage);
				cstmt.setInt(2, pageSize);
				cstmt.setString(3, "Tab");
				cstmt.setString(4, "");
				cstmt.setString(5, "tab_id");
				cstmt.registerOutParameter(6, OracleTypes.INTEGER);
				cstmt.registerOutParameter(7, OracleTypes.CURSOR);
				
				cstmt.execute();
				
				ResultSet rs = (ResultSet) cstmt.getObject(7);
				Map<String,Object> map=new HashMap<String, Object>();
				List<Tab> tabList = new ArrayList<Tab>();
				while(rs.next()){
					
					Tab tab = new Tab();
					tab.setTabId(rs.getInt("tab_id"));
					tab.setTabName(rs.getString("tab_name"));
					tab.setTabType(rs.getString("tab_type"));
					tab.setTabComedate(rs.getString("tab_comeDate"));
					tab.setTabCon(rs.getString("tab_con"));
					tab.setTabOther(rs.getString("tab_other"));
					
					/*TabstateDao tabstateDao = new TabstateDaoImpl();
				    Tabstate tabstate = tabstateDao.get(rs. getLong("state_id"));
				    tab.setTabstate(tabstate);
				    
				    OrdertableDao ordertableDao = new OrdertableDaoImpl();
				    Ordertable ordertable = ordertableDao.get(rs.getLong("order_id"));
				    tab.setOrdertable(ordertable);*/
				    
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
