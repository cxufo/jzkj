package com.jzkjdataservice.service;

import java.util.List;

import com.jzkjdataservice.dao.PJobDao;
import com.jzkjdataservice.dao.PResumeBoxDao;
import com.jzkjdataservice.domain.PJob;
import com.jzkjdataservice.domain.PResumeBox;
import com.jzkjdataservice.util.Canstant;

public class workhistory {
	/**
	 * 报名工作，插入的时候要设置未评价
	 * @param p
	 * @return
	 */
	public Boolean signUp(PResumeBox p){
		p.setIsComment(Canstant.NOTCOMMENDED);
		PResumeBoxDao dao = new PResumeBoxDao();		
		return dao.Insert(p);		
	}
	
	/**
	 * 删除该报名信息
	 * @param id 
	 * @return
	 */
	public Boolean delete(int id){
		PResumeBox p = new PResumeBox();
		p.setSendId(id);
		PResumeBoxDao dao = new PResumeBoxDao();		
		return dao.Delete(p);
	}
	
	/**
	 * 根据个人Id和是否获得该工作查询Id,isGet的值为Canstant.COMMENDED,Canstant.NOTCOMMENDED
	 * @param currentpage
	 * @param pagesize
	 * @param pId 个人Id
	 * @param isGet 是否评价
	 * @return
	 */
	public List<PResumeBox> queryByPersonId(int currentpage, int pagesize,int pId,String isGet){
		PResumeBoxDao dao = new PResumeBoxDao();
		return dao.QueryByPersonId(currentpage, pagesize,pId,isGet);
	}

	/**
	 * 根据时间查询报名的兼职工作
	 * @param currentpage
	 * @param pagesize
	 * @param time
	 * @return
	 */
	public List<PResumeBox> queryByTime(int currentpage, int pagesize,String time){
		PResumeBoxDao dao = new PResumeBoxDao();
		return dao.queryByTime(currentpage, pagesize, time);
	}
	/**
	 * 根据时间和是否获得工作查询报名和获得的工作
	 * @param currentpage
	 * @param pagesize
	 * @param isGet
	 * @param time
	 * @return
	 */
	public List<PResumeBox> queryByTime(int currentpage, int pagesize,String isGet,String time){
		PResumeBoxDao dao = new PResumeBoxDao();
		return dao.queryByTime(currentpage, pagesize,isGet,time);
	}
	
	/**
	 * 根据兼职职位查询该职位详细信息
	 * @param ptjId
	 * @return
	 */
	public PJob queryByPtjId(int ptjId){
		PJobDao dao = new PJobDao();
		return dao.QueryById(ptjId);
	}
}
