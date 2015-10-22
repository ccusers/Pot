package com.pro.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Tab entity. @author MyEclipse Persistence Tools
 */

public class Tab implements java.io.Serializable {

	// Fields

	private Integer tabId;
	private Tabstate tabstate;
	private Ordertable ordertable;
	private String tabName;
	private String tabType;
	private String tabComedate;
	private String tabCon;
	private String tabOther;
	private Set reserves = new HashSet(0);
	private Set kaidans = new HashSet(0);

	// Constructors

	/** default constructor */
	public Tab() {
	}

	/** minimal constructor */
	public Tab(Integer tabId) {
		this.tabId = tabId;
	}

	/** full constructor */
	public Tab(Integer tabId, Tabstate tabstate, Ordertable ordertable,
			String tabName, String tabType, String tabComedate, String tabCon,
			String tabOther, Set reserves, Set kaidans) {
		this.tabId = tabId;
		this.tabstate = tabstate;
		this.ordertable = ordertable;
		this.tabName = tabName;
		this.tabType = tabType;
		this.tabComedate = tabComedate;
		this.tabCon = tabCon;
		this.tabOther = tabOther;
		this.reserves = reserves;
		this.kaidans = kaidans;
	}

	// Property accessors

	public Integer getTabId() {
		return this.tabId;
	}

	public void setTabId(Integer tabId) {
		this.tabId = tabId;
	}

	public Tabstate getTabstate() {
		return this.tabstate;
	}

	public void setTabstate(Tabstate tabstate) {
		this.tabstate = tabstate;
	}

	public Ordertable getOrdertable() {
		return this.ordertable;
	}

	public void setOrdertable(Ordertable ordertable) {
		this.ordertable = ordertable;
	}

	public String getTabName() {
		return this.tabName;
	}

	public void setTabName(String tabName) {
		this.tabName = tabName;
	}

	public String getTabType() {
		return this.tabType;
	}

	public void setTabType(String tabType) {
		this.tabType = tabType;
	}

	public String getTabComedate() {
		return this.tabComedate;
	}

	public void setTabComedate(String tabComedate) {
		this.tabComedate = tabComedate;
	}

	public String getTabCon() {
		return this.tabCon;
	}

	public void setTabCon(String tabCon) {
		this.tabCon = tabCon;
	}

	public String getTabOther() {
		return this.tabOther;
	}

	public void setTabOther(String tabOther) {
		this.tabOther = tabOther;
	}

	public Set getReserves() {
		return this.reserves;
	}

	public void setReserves(Set reserves) {
		this.reserves = reserves;
	}

	public Set getKaidans() {
		return this.kaidans;
	}

	public void setKaidans(Set kaidans) {
		this.kaidans = kaidans;
	}

}