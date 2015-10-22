package com.pro.service;

import java.util.Map;


public interface TabService  extends BaseService {
	
	public Map<String,Object> pageTab(int page,int rows);
}