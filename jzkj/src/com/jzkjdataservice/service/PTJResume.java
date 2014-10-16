package com.jzkjdataservice.service;
import java.util.List;

import com.jzkjdataservice.dao.PResumeDao;
import com.jzkjdataservice.domain.PResume;
import com.jzkjdataservice.util.Json;
public class PTJResume {

	/**
	 * 发布兼职简历
	 * @param presume 兼职简历
	 * @return 返回是否发布成功
	 */
	public Boolean addPResume(PResume presume) {
		PResumeDao dao = new PResumeDao();
		return dao.Insert(presume);
	}
	
	/**
	 * 修改兼职简历
	 * @param presume
	 * @return
	 */
	public Boolean updatePResume(PResume presume){
		PResumeDao dao = new PResumeDao();
		return dao.Update(presume);
	}
	
	/**
	 * 删除兼职简历
	 * @param presume
	 * @return
	 */
	public Boolean deletePResume(PResume presume){
		PResumeDao dao = new PResumeDao();
		return dao.Delete(presume);
	}
	
	/**
	 * 获取表的大小
	 * @return
	 */
	public int size(){
		PResumeDao dao = new PResumeDao();
		return dao.getTableSize();
	}
	/**
	 * 根据Id查询兼职简历
	 * @param id
	 * @return
	 */
	public String queryPResumeById(int id){
		PResumeDao dao = new PResumeDao();
		return Json.toPResumeJson(dao.QueryById(id));
	}
	
	
	/**
	 * 根据简历发布人的名字查询简历
	 * @param name
	 * @return
	 */
	public String queryPResumeByName(String name){
		PResumeDao dao = new PResumeDao();
		return Json.toPResumeJson(dao.QueryByName(name));
	}
	
	/**
	 * 分页查询所有兼职简历
	 * @param currentpage
	 * @param pagesize
	 * @return
	 */
	public String queryAllPResume(int currentpage, int pagesize){
		PResumeDao dao = new PResumeDao();
		List<PResume> list =dao.Query(currentpage, pagesize);
		return Json.toPResumeJson(list);
	}
	
	/**
	 * 匹配任意字段名和字段内容查询简历
	 * @param currentpage
	 * @param pagesize
	 * @param arg1
	 * @param arg2
	 * @return
	 */
	public String queryPResume(int currentpage, int pagesize,String arg1,String arg2){
		PResumeDao dao = new PResumeDao();
		return Json.toPResumeJson(dao.Query(currentpage, pagesize,arg1,arg2));	
	}
	
	/**
	 * 匹配任意两个查询条件查询简历
	 * @param currentpage
	 * @param pagesize
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @param arg4
	 * @return
	 */
	public String queryPResume(int currentpage, int pagesize,String arg1,String arg2,String arg3,String arg4){
		PResumeDao dao = new PResumeDao();
		return Json.toPResumeJson(dao.Query(currentpage, pagesize,arg1,arg2,arg3,arg4));	
	}
	
	/**
	 * 匹配任意三个查询条件查询建立
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
	public String queryPResume(int currentpage, int pagesize,String arg1,String arg2,String arg3,String arg4,String arg5,String arg6){
		PResumeDao dao = new PResumeDao();
		return Json.toPResumeJson(dao.Query(currentpage, pagesize,arg1,arg2,arg3,arg4,arg5,arg6));	
	}
	
	
}
