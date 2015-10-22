package com.pro.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Member entity. @author MyEclipse Persistence Tools
 */

public class Member implements java.io.Serializable {

	// Fields

	private Integer memberId;
	private MemberSet memberSet;
	private String memberName;
	private String memberType;
	private String memberGrade;
	private Double memberRate;
	private Double memberBalance;
	private Integer memberIntegral;
	private Double memberExpense;
	private String memberBirthday;
	private Integer memberTel;
	private String memberDatetime;
	private Set bills = new HashSet(0);

	// Constructors

	/** default constructor */
	public Member() {
	}

	/** minimal constructor */
	public Member(Integer memberId) {
		this.memberId = memberId;
	}

	/** full constructor */
	public Member(Integer memberId, MemberSet memberSet, String memberName,
			String memberType, String memberGrade, Double memberRate,
			Double memberBalance, Integer memberIntegral, Double memberExpense,
			String memberBirthday, Integer memberTel, String memberDatetime,
			Set bills) {
		this.memberId = memberId;
		this.memberSet = memberSet;
		this.memberName = memberName;
		this.memberType = memberType;
		this.memberGrade = memberGrade;
		this.memberRate = memberRate;
		this.memberBalance = memberBalance;
		this.memberIntegral = memberIntegral;
		this.memberExpense = memberExpense;
		this.memberBirthday = memberBirthday;
		this.memberTel = memberTel;
		this.memberDatetime = memberDatetime;
		this.bills = bills;
	}

	// Property accessors

	public Integer getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public MemberSet getMemberSet() {
		return this.memberSet;
	}

	public void setMemberSet(MemberSet memberSet) {
		this.memberSet = memberSet;
	}

	public String getMemberName() {
		return this.memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberType() {
		return this.memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getMemberGrade() {
		return this.memberGrade;
	}

	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}

	public Double getMemberRate() {
		return this.memberRate;
	}

	public void setMemberRate(Double memberRate) {
		this.memberRate = memberRate;
	}

	public Double getMemberBalance() {
		return this.memberBalance;
	}

	public void setMemberBalance(Double memberBalance) {
		this.memberBalance = memberBalance;
	}

	public Integer getMemberIntegral() {
		return this.memberIntegral;
	}

	public void setMemberIntegral(Integer memberIntegral) {
		this.memberIntegral = memberIntegral;
	}

	public Double getMemberExpense() {
		return this.memberExpense;
	}

	public void setMemberExpense(Double memberExpense) {
		this.memberExpense = memberExpense;
	}

	public String getMemberBirthday() {
		return this.memberBirthday;
	}

	public void setMemberBirthday(String memberBirthday) {
		this.memberBirthday = memberBirthday;
	}

	public Integer getMemberTel() {
		return this.memberTel;
	}

	public void setMemberTel(Integer memberTel) {
		this.memberTel = memberTel;
	}

	public String getMemberDatetime() {
		return this.memberDatetime;
	}

	public void setMemberDatetime(String memberDatetime) {
		this.memberDatetime = memberDatetime;
	}

	public Set getBills() {
		return this.bills;
	}

	public void setBills(Set bills) {
		this.bills = bills;
	}

}