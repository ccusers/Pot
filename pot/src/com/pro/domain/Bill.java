package com.pro.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Bill entity. @author MyEclipse Persistence Tools
 */

public class Bill implements java.io.Serializable {

	// Fields

	private String billId;
	private Member member;
	private Ordertable ordertable;
	private String tabId;
	private Double moneyYing;
	private Double moneyTrue;
	private String timeAcc;
	private String stateAcc;
	private String ifInvo;
	private String textAcc;
	private Set operators = new HashSet(0);

	// Constructors

	/** default constructor */
	public Bill() {
	}

	/** minimal constructor */
	public Bill(String billId) {
		this.billId = billId;
	}

	/** full constructor */
	public Bill(String billId, Member member, Ordertable ordertable,
			String tabId, Double moneyYing, Double moneyTrue, String timeAcc,
			String stateAcc, String ifInvo, String textAcc, Set operators) {
		this.billId = billId;
		this.member = member;
		this.ordertable = ordertable;
		this.tabId = tabId;
		this.moneyYing = moneyYing;
		this.moneyTrue = moneyTrue;
		this.timeAcc = timeAcc;
		this.stateAcc = stateAcc;
		this.ifInvo = ifInvo;
		this.textAcc = textAcc;
		this.operators = operators;
	}

	// Property accessors

	public String getBillId() {
		return this.billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Ordertable getOrdertable() {
		return this.ordertable;
	}

	public void setOrdertable(Ordertable ordertable) {
		this.ordertable = ordertable;
	}

	public String getTabId() {
		return this.tabId;
	}

	public void setTabId(String tabId) {
		this.tabId = tabId;
	}

	public Double getMoneyYing() {
		return this.moneyYing;
	}

	public void setMoneyYing(Double moneyYing) {
		this.moneyYing = moneyYing;
	}

	public Double getMoneyTrue() {
		return this.moneyTrue;
	}

	public void setMoneyTrue(Double moneyTrue) {
		this.moneyTrue = moneyTrue;
	}

	public String getTimeAcc() {
		return this.timeAcc;
	}

	public void setTimeAcc(String timeAcc) {
		this.timeAcc = timeAcc;
	}

	public String getStateAcc() {
		return this.stateAcc;
	}

	public void setStateAcc(String stateAcc) {
		this.stateAcc = stateAcc;
	}

	public String getIfInvo() {
		return this.ifInvo;
	}

	public void setIfInvo(String ifInvo) {
		this.ifInvo = ifInvo;
	}

	public String getTextAcc() {
		return this.textAcc;
	}

	public void setTextAcc(String textAcc) {
		this.textAcc = textAcc;
	}

	public Set getOperators() {
		return this.operators;
	}

	public void setOperators(Set operators) {
		this.operators = operators;
	}

}