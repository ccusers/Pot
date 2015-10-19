package com.pro.action;

import com.pro.domain.Tab;
import com.pro.service.TabService;

public class TabAction {
	private Tab tab;
	
	private TabService tabService;

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

}
