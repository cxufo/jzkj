package com.jzkjdataservice.service;

import java.util.List;

import com.jzkjdataservice.dao.JobTypeDao;
import com.jzkjdataservice.domain.JobType;
import com.jzkjdataservice.util.Json;

public class JobTypes {
	
	public Boolean add(JobType jobtype){
		JobTypeDao dao = new JobTypeDao();
		return dao.Insert(jobtype);
	} 
	
	public Boolean update(JobType jobtype){
		JobTypeDao dao = new JobTypeDao();
		return dao.Insert(jobtype);
	}
	
	/**
	 * 获得所有的职位类型
	 * @param currentpage
	 * @param pagesize
	 * @return 
	 */
	public List<JobType> getAllType(int currentpage,int pagesize) {
		JobTypeDao dao = new JobTypeDao();
		List<JobType>list=dao.Query(currentpage, pagesize);
		return list;
//		return Json.toJson(list);
	}	
	
	/**
	 * 根据职位类别标签查询
	 * @param sign
	 * @return
	 */
	public List<JobType> getJobType(String sign){
		JobTypeDao dao = new JobTypeDao();
		return dao.QueryBySign(sign);
//		return Json.toJson(list);
	}
	
	/**
	 * 根据Id获取职位类别
	 * @param id
	 * @return
	 */
	public JobType getJobType(int id){
		JobTypeDao dao = new JobTypeDao();
		return dao.QueryById(id);
//		return Json.toJson(j);
	}
	
	/**
	 * 添加职位类型
	 * @param jobType 职位对象
	 * @return
	 */
	public Boolean addType(JobType jobType){
		JobTypeDao dao = new JobTypeDao();
		return dao.Insert(jobType);		
	}
	
	/**
	 * 删除职位类型
	 * @param jobType 职位对象
	 * @return
	 */
	public Boolean delete(JobType jobType){
		JobTypeDao dao = new JobTypeDao();
		return dao.Delete(jobType);
	}
		
	/**
	 * 获得表中数据数
	 * @return
	 */
	public int size(){
		JobTypeDao dao = new JobTypeDao();
		return dao.getTableSize();
	}
}
