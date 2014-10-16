package com.jzkjdataservice.domain;

public class PResume {
	private int ptjId;
	private Person person;
	private String name;
	private String sex;
	private String birthday;
	private String ptjType;
	private String workPlace;
	private String wage;
	private String education;
	private String introduction;
	private String location;	
	
	public int getPtjId() {
		return ptjId;
	}

	public void setPtjId(int ptjId) {
		this.ptjId = ptjId;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPtjType() {
		return ptjType;
	}

	public void setPtjType(String ptjType) {
		this.ptjType = ptjType;
	}

	public String getWorkPlace() {
		return workPlace;
	}

	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}

	public String getWage() {
		return wage;
	}

	public void setWage(String wage) {
		this.wage = wage;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "PResume [ptjId=" + ptjId + ", pId=" + person.getpId() + ", name="
				+ name + ", sex=" + sex + ", birthday=" + birthday
				+ ", ptjType=" + ptjType + ", workPlace=" + workPlace
				+ ", wage=" + wage + ", education=" + education
				+ ", introduction=" + introduction + ", location=" + location
				+ "]";
	}	
    
	
}
