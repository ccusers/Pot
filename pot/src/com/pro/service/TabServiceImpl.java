package com.pro.service;

import java.util.Map;

import com.pro.dao.TabDao;
import com.pro.dao.TabDaoImpl;


public class TabServiceImpl extends BaseServiceImpl implements TabService {
	TabDao tabDao = new TabDaoImpl();
	
	public Map<String,Object> pageTab(int currentPage,int pageSize){
		return tabDao.pageTab(currentPage, pageSize);
	}
	
}
