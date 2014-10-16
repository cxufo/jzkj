package com.jzkjdataservice.service;

import java.util.List;

import com.jzkjdataservice.dao.PResumeBoxDao;
import com.jzkjdataservice.dao.PcommentDao;
import com.jzkjdataservice.domain.PResumeBox;
import com.jzkjdataservice.domain.Pcomment;
import com.jzkjdataservice.util.Canstant;
import com.jzkjdataservice.util.Json;

public class Pcomments {
	/**
	 * 添加评论
	 * @param p评论对象
	 * @return 是否插入成功
	 */
	public Boolean add(Pcomment p,int sendId) {
		PcommentDao dao =new PcommentDao();
		Boolean isSucessful=dao.Insert(p);
		if(isSucessful==false)
			return false;
		else
		{
			PResumeBox pb = new PResumeBox();
			pb.setSendId(sendId);
			pb.setIsComment(Canstant.COMMENDED);
			PResumeBoxDao prdao = new PResumeBoxDao();
			isSucessful=prdao.Update(pb);
		}
		return isSucessful;
	}
	
	/**
	 * 根据兼职标题，个人编号，是否评价过该工作返回评价Id
	 * @param title 职位标题
	 * @param personId 个人编号
	 * @param isComment 是否评价
	 * @return 兼职投递表中的编号
	 */
	public int getSendId(String title,int personId,String isComment){
		PResumeBoxDao dao = new PResumeBoxDao();
		int id = dao.QueryByName(title,personId,isComment).getSendId();
		return id;		
	}
	
	/**
	 * 删除评论
	 * @param p 评论
	 * @return 是否插入成功
	 */
	public Boolean delete(Pcomment p){
		PcommentDao dao =new PcommentDao();
		return dao.Delete(p);
	}
	
	/**
	 * 更新评论
	 * @param p评论对象
	 * @return 返回更新是否成功
	 */
	public Boolean update(Pcomment p){
		PcommentDao dao =new PcommentDao();
		return dao.Update(p);
	}
	
	/**
	 * 根据个人Id查询评论
	 * @param id
	 * @return
	 */
	public List<Pcomment> queryByPersonId(int id){
		PcommentDao dao =new PcommentDao();
		List<Pcomment> list = dao.QueryByPersonId(id);
		return list;
	}
	
	/**
	 * 根据评论Id返回评论
	 * @param id
	 * @return
	 */
	public Pcomment queryById(int id){
		PcommentDao dao =new PcommentDao();
		Pcomment p = dao.QueryById(id);
		return p;
	}
	/**
	 * 根据公司Id查询评论
	 * @param currentpage
	 * @param pagesize
	 * @param cId
	 * @return
	 */
	public List<Pcomment> queryByCId(int currentpage, int pagesize,int cId) {
		// TODO Auto-generated method stub
		PcommentDao dao =new PcommentDao();
		List<Pcomment> p = dao.QueryByCId(currentpage,pagesize,cId);
		return p;
	}
	
	/**
	 * 查询未评价的工作
	 * @param currentpage
	 * @param pagesize
	 * @param personId
	 * @param isComment
	 * @return
	 */
	public List<PResumeBox> getNotComment(int currentpage, int pagesize,int personId,String isComment){
		PResumeBoxDao dao = new PResumeBoxDao();
		List<PResumeBox> list = dao.QueryNotComment(currentpage, pagesize, personId, Canstant.COMMENDED, isComment);
		return list;		
	}
}
