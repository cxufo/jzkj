package com.jzkjdataservice.service;

import java.util.List;

import com.jzkjdataservice.dao.CompanyDao;
import com.jzkjdataservice.dao.PJobDao;
import com.jzkjdataservice.domain.PJob;
import com.jzkjdataservice.util.Json;

public class PTJob {
	/**
	 * 添加兼职职位
	 * @param pjob
	 * @return
	 */
	public Boolean add(PJob pjob) {
		PJobDao dao = new PJobDao();		
		return dao.Insert(pjob);
	}
	
	/**
	 * 删除职位
	 * @param pjob
	 * @return
	 */
	public Boolean delete(PJob pjob){
		PJobDao dao = new PJobDao();		
		return dao.Delete(pjob);
	}
	/**
	 * 修改职位
	 * @param pjob
	 * @return
	 */
	public Boolean update(PJob pjob){
		PJobDao dao = new PJobDao();
		return dao.Update(pjob);
	}
	
	/**
	 * 取得数据库中表的数据数
	 * @return
	 */
	public int size(){
		PJobDao dao = new PJobDao();
		return dao.getTableSize();
	}
	/**
	 * 获取兼职区域
	 * @return
	 */
	public List<String> getPJobArea(){
		PJobDao dao = new PJobDao();
		List<String> list = dao.QueryAllJobAdress();
		return list;
	}
	
	/**
	 * 获得所有工作时间
	 * @return
	 */
	public String getPJobDate(){
		PJobDao dao = new PJobDao();
		List<String> list = dao.QueryAllWorkTime();
		return Json.toDateJson(list);
	}
	
	/**
	 * 获取职位标签
	 * @return
	 */
	public String getSign(){
		PJobDao dao = new PJobDao();
		List<String> list = dao.QuerySign();		
		return Json.toSignJson(list);
	}
	
	/**
	 * 根据单位Id查询数据库
	 * @param cId
	 * @return 返回Json字符串
	 */
	public String queryByCId(int cId){
		PJobDao dao = new PJobDao();
		List<PJob> list = dao.QueryByCId(cId);
		return Json.toPJobJson(list);
	}
	/**
	 * 根据Id查询
	 * @param id
	 * @return
	 */
	public String queryById(int id){
		PJobDao dao = new PJobDao();
		PJob pjob = dao.QueryById(id);
		return Json.toPJobJson(pjob);
	}
	/**
	 * 根据工作标题查询
	 * @param title
	 * @return
	 */
	public String queryByTitle(String title){
		PJobDao dao = new PJobDao();
		PJob pjob = dao.QueryByName(title);
		return Json.toPJobJson(pjob);
	}
	
	/**
	 * 查询兼职职位
	 * @param currentpage
	 * @param pagesize
	 * @return
	 */
	public List<PJob> queryPJob(int currentpage, int pagesize){
		PJobDao dao = new PJobDao();
		List<PJob> list=dao.QueryPJob(currentpage, pagesize);
		return list;
	}
	
	/**
	 * 查询所有信息
	 * @param currentpage
	 * @param pagesize
	 * @return
	 */
	public String queryAll(int currentpage, int pagesize){
		PJobDao dao = new PJobDao();
		List<PJob> list=dao.Query(currentpage, pagesize);
		return Json.toPJobJson(list);
	}
	
	/**
	 * 根据公司名查询兼职
	 * @param currentpage
	 * @param pagesize
	 * @param name
	 * @return
	 */
	public List<PJob> queryByCompanyName(int currentpage, int pagesize,String name){
		CompanyDao cdao = new  CompanyDao();
		int cId = cdao.QueryByName(name).getcId();
		if(cId!=0){
			PJobDao pdao = new PJobDao();
			return pdao.QueryByCId(currentpage, pagesize, cId);
		}else{
			return null;
		}
	}
	
	/**
	 * 
	 * @param currentpage 当前页面
	 * @param pagesize 页面大小
	 * @param arg1  属性名
	 * @param arg2 属性内容
	 * @return json字符串
	 */
	public String query(int currentpage, int pagesize,String arg1,String arg2){
		PJobDao dao = new PJobDao();
		List<PJob> list=null;
		switch(arg1){
		case "ptjType":
			dao.QueryByJobType(currentpage, pagesize, arg2);
			break;
		case "workPlace":
			dao.QueryByPlace(currentpage, pagesize, arg2);
			break;	
		case "workTime":
			dao.QueryByTime(currentpage, pagesize, arg2);
			break;	
		case "jobSign":
			dao.QueryBySign(currentpage, pagesize, arg2);
			break;	
		}
		return Json.toPJobJson(list);
	}
		
	/**
	 * 根据2个条件筛选信息
	 * @param currentpage
	 * @param pagesize
	 * @param arg1属性1
	 * @param arg2属性值
	 * @param arg3属性2
	 * @param arg4属性值
	 * @return
	 */
	public String queryByTwoConditions(int currentpage, int pagesize,String arg1,String arg2,String arg3,String arg4){
		PJobDao dao=new PJobDao();
		List<PJob> list=dao.QueryByTwo(currentpage, pagesize, arg1, arg2, arg3, arg4);
		return Json.toPJobJson(list);		
	}
	
	/**
	 * 根据3个条件筛选信息
	 * @param currentpage
	 * @param pagesize
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @param arg4
	 * @param arg5
	 * @param arg6
	 * @return
	 */
	public String queryByThreeConditions(int currentpage, int pagesize,String arg1,String arg2,String arg3,String arg4,String arg5,String arg6){
		PJobDao dao=new PJobDao();
		List<PJob> list=dao.QueryByThree(currentpage, pagesize, arg1, arg2, arg3, arg4,arg5,arg6);
		return Json.toPJobJson(list);
	}
	
	/**
	 * 根据4个条件查询时数据
	 * @param currentpage
	 * @param pagesize
	 * @param type
	 * @param workPlace
	 * @param workTime
	 * @param jobSign
	 * @return
	 */
	public String queryByFourConditions(int currentpage, int pagesize, String type,
			String workPlace, String workTime, String jobSign){
		PJobDao dao=new PJobDao();
		List<PJob> list = dao.QueryByFour(currentpage, pagesize, type,workPlace,workTime,jobSign);
		return Json.toPJobJson(list);
	}
		
}
