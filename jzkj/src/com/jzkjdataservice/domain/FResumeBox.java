package com.jzkjdataservice.domain;

public class FResumeBox {
	private int sendId;
	private Person person;
	private int ftJobId;
	private String jobTitle;
	private String wage;
	private String time;
	private String isGetJob;

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

	public int getFtJobId() {
		return ftJobId;
	}

	public void setFtJobId(int ftJobId) {
		this.ftJobId = ftJobId;
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
}
