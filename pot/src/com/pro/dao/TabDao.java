package com.pro.dao;

import java.util.Map;

import com.pro.domain.Tab;


public interface TabDao extends BaseDao<Tab, Long>{
	

	public Map<String,Object> pageTab(final int currentPage,final int pageSize);
}