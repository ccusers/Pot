package com.pro.domain;

public class Tab {

	private int tab_Id;//餐台号
	
	private String tab_name;//餐台名
	
	private TabState tabState;//状态表

	private String tab_type;//餐台类型
	
	private Set<OrderTable> orderTable=new HashSet<OrderTable> ;//订单表
	
	private String tab_comeDate;//进店时间
	
	private int tab_con;//最低消费
	
	private String tab_other;//备注

	public int getTab_Id() {
		return tab_Id;
	}

	public void setTab_Id(int tabId) {
		tab_Id = tabId;
	}

	public String getTab_name() {
		return tab_name;
	}

	public void setTab_name(String tabName) {
		tab_name = tabName;
	}

	public TabState getTabState() {
		return tabState;
	}

	public void setTabState(TabState tabState) {
		this.tabState = tabState;
	}

	public String getTab_type() {
		return tab_type;
	}

	public void setTab_type(String tabType) {
		tab_type = tabType;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int orderId) {
		order_id = orderId;
	}

	public String getTab_comeDate() {
		return tab_comeDate;
	}

	public void setTab_comeDate(String tabComeDate) {
		tab_comeDate = tabComeDate;
	}

	public int getTab_con() {
		return tab_con;
	}

	public void setTab_con(int tabCon) {
		tab_con = tabCon;
	}

	public String getTab_other() {
		return tab_other;
	}

	public void setTab_other(String tabOther) {
		tab_other = tabOther;
	}
	
}
