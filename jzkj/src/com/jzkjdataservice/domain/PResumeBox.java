package com.jzkjdataservice.domain;

public class PResumeBox {
	private int sendId;
	private Person person;
	private int ptJobId;
	private String jobTitle;
	private String wage;
	private String time;
	private String isGetJob;
	private String isComment;
	public int getSendId() {
		return sendId;
	}

	public void setSendId(int sendId) {
		this.sendId = sendId;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getPtJobId() {
		return ptJobId;
	}

	public void setPtJobId(int ptJobId) {
		this.ptJobId = ptJobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getWage() {
		return wage;
	}

	public void setWage(String wage) {
		this.wage = wage;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getIsGetJob() {
		return isGetJob;
	}

	public void setIsGetJob(String isGetJob) {
		this.isGetJob = isGetJob;
	}

	public String getIsComment() {
		return isComment;
	}

	public void setIsComment(String isComment) {
		this.isComment = isComment;
	}

}
