package com.jzkjdataservice.domain;

import java.util.HashSet;
import java.util.Set;

public class Tip {
	private int tipsId;
	private String tipsContent;
	private Set<FJob> fjobs = new HashSet<FJob>(); 
	private Set<PJob> pjobs = new HashSet<PJob>(); 
	public int getTipsId() {
		return tipsId;
	}

	public void setTipsId(int tipsId) {
		this.tipsId = tipsId;
	}

	public String getTipsContent() {
		return tipsContent;
	}

	public void setTipsContent(String tipsContent) {
		this.tipsContent = tipsContent;
	}

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
    
}
