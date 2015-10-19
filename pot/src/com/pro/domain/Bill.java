package com.pro.domain;

import java.io.Serializable;

public class Bill implements Serializable{
	private int bill_id;//账单号
	
	private int tab1;//餐桌
	
	private int member;//会员
	
	private int money_ying;//应收金额
	
	private int money_true;//实收金额
	
	private String time_acc;//结算时间
	
	private String state_acc;//结算状态
	
	private String if_invo;//是否开发票
	
	private String text_acc;//结账备注

	public int getBill_id() {
		return bill_id;
	}

	public void setBill_id(int billId) {
		bill_id = billId;
	}

	public int getMoney_ying() {
		return money_ying;
	}

	public void setMoney_ying(int moneyYing) {
		money_ying = moneyYing;
	}

	public int getMoney_true() {
		return money_true;
	}

	public void setMoney_true(int moneyTrue) {
		money_true = moneyTrue;
	}

	public String getTime_acc() {
		return time_acc;
	}

	public void setTime_acc(String timeAcc) {
		time_acc = timeAcc;
	}

	public String getState_acc() {
		return state_acc;
	}

	public void setState_acc(String stateAcc) {
		state_acc = stateAcc;
	}

	public String getIf_invo() {
		return if_invo;
	}

	public void setIf_invo(String ifInvo) {
		if_invo = ifInvo;
	}

	public String getText_acc() {
		return text_acc;
	}

	public void setText_acc(String textAcc) {
		text_acc = textAcc;
	}
	
	
}
