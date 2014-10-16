package com.jzkjdataservice.domain;

import java.util.HashSet;
import java.util.Set;

public class Company {
    private int cId;
    private String cName;
    private String leader;
    private String cPassword;
    private String phone;
    private String adress;
    private String mailBox;
    private int score;//���
    private int account;//�˻����
    private int jobCount;//ְλ��
    private int overplusCount;//ʣ��ְλ��
    private int resumeCount;//���鿴������
    private String image;
    private String attestation;
    private String level;
    private String redisterTime;
    private Set<Fcomment> fconments=new HashSet<Fcomment>();
    private Set<Pcomment> pcomments=new HashSet<Pcomment>();
    private Set<FJob> fjobs = new HashSet<FJob>();
    private Set<PJob> pjobs=new HashSet<PJob>();
    
	public Set<FJob> getFjobs() {
		return fjobs;
	}
	public void setFjobs(Set<FJob> fjobs) {
		this.fjobs = fjobs;
	}
	public Set<PJob> getPjobs() {
		return pjobs;
	}
	public void setPjobs(Set<PJob> pjobs) {
		this.pjobs = pjobs;
	}

	public Set<Pcomment> getPcomments() {
		return pcomments;
	}
	public void setPcomments(Set<Pcomment> pcomments) {
		this.pcomments = pcomments;
	}
	public Set<Fcomment> getFconments() {
		return fconments;
	}
	public void setFconments(Set<Fcomment> fconments) {
		this.fconments = fconments;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
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
	public int getJobCount() {
		return jobCount;
	}
	public void setJobCount(int jobCount) {
		this.jobCount = jobCount;
	}
	public int getOverplusCount() {
		return overplusCount;
	}
	public void setOverplusCount(int overplusCount) {
		this.overplusCount = overplusCount;
	}
	public int getResumeCount() {
		return resumeCount;
	}
	public void setResumeCount(int resumeCount) {
		this.resumeCount = resumeCount;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAttestation() {
		return attestation;
	}
	public void setAttestation(String attestation) {
		this.attestation = attestation;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getRedisterTime() {
		return redisterTime;
	}
	public void setRedisterTime(String redisterTime) {
		this.redisterTime = redisterTime;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}	
	
	
}
