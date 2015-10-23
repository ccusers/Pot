package com.pro.service;

import java.util.Map;

import com.pro.dao.TabDao;


public class TabServiceImpl extends BaseServiceImpl implements TabService {
	private TabDao tabDao;
	
	
	public void setTabDao(TabDao tabDao) {
		this.tabDao = tabDao;
	}


	public Map<String,Object> pageTab(int page,int rows){
		return tabDao.pageTab(page, rows);
	}
	
}
