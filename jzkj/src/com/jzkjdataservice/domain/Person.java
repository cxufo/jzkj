package com.jzkjdataservice.domain;

import java.util.HashSet;
import java.util.Set;

public class Person {
    private int pId;
    private String userName;
    private String userPassword;
    private String phone;
    private String mailBox;
    private int ptjCount;
    private int meetCount;
    private int score;
    private int account;
    private String level;
    private String registerTime;
    private FResume fresume;
    private PResume presume;
    private Set<PResumeBox> prboxs=new HashSet<PResumeBox>();
    private Set<FResumeBox> frboxs=new HashSet<FResumeBox>();
    
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMailBox() {
		return mailBox;
	}
	public void setMailBox(String mailBox) {
		this.mailBox = mailBox;
	}
	public int getPtjCount() {
		return ptjCount;
	}
	public void setPtjCount(int ptjCount) {
		this.ptjCount = ptjCount;
	}
	public int getMeetCount() {
		return meetCount;
	}
	public void setMeetCount(int meetCount) {
		this.meetCount = meetCount;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}
	public FResume getFresume() {
		return fresume;
	}
	public void setFresume(FResume fresume) {
		this.fresume = fresume;
	}
	public PResume getPresume() {
		return presume;
	}
	public void setPresume(PResume presume) {
		this.presume = presume;
	}
	public Set<PResumeBox> getPrboxs() {
		return prboxs;
	}
	public void setPrboxs(Set<PResumeBox> prboxs) {
		this.prboxs = prboxs;
	}
	public Set<FResumeBox> getFrboxs() {
		return frboxs;
	}
	public void setFrboxs(Set<FResumeBox> frboxs) {
		this.frboxs = frboxs;
	}
    
}
