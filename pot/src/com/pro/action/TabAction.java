package com.pro.action;

import java.io.PrintWriter;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.pro.domain.Tab;
import com.pro.service.TabService;

public class TabAction extends BaseAction{
	private Tab tab;
	
	private TabService tabService;
	
	private int rows;
	
	private int page;
	
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public Tab getTab() {
		return tab;
	}

	public void setTab(Tab tab) {
		this.tab = tab;
	}

	public TabService getTabService() {
		return tabService;
	}

	public void setTabService(TabService tabService) {
		this.tabService = tabService;
	}

	public String pageTab() throws Exception{
		Map<String,Object> map=tabService.pageTab(page, rows);
		String json=JSON.toJSONString(map);
		PrintWriter out = response.getWriter();
		out.write(json);
   	    out.flush();
		out.close();
		return "success";
	}
}
