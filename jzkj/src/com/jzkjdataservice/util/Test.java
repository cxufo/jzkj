package com.jzkjdataservice.util;

import java.util.List;

import com.jzkjdataservice.dao.AdminDao;
import com.jzkjdataservice.dao.CompanyDao;
import com.jzkjdataservice.dao.PJobDao;
import com.jzkjdataservice.domain.Administrator;
import com.jzkjdataservice.domain.Company;
import com.jzkjdataservice.domain.PJob;
import com.jzkjdataservice.domain.PResume;
import com.jzkjdataservice.domain.Pcomment;
import com.jzkjdataservice.domain.Person;
import com.jzkjdataservice.service.JobTypes;
import com.jzkjdataservice.service.Login;
import com.jzkjdataservice.service.PTJResume;
import com.jzkjdataservice.service.PTJob;
import com.jzkjdataservice.service.Pcomments;
import com.jzkjdataservice.service.Tips;
import com.jzkjdataservice.service.workhistory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		  AdminDao dao = new AdminDao(); Administrator admin = new
//		  Administrator(); admin.setLevel("1"); admin.setName("�Գ���");
//		  admin.setPassword("123"); //System.out.println(dao.Insert(admin));
//		  System.out.println(dao.Delete(admin));
//		  System.out.println(dao.QueryByName("�Գ���").password);
		 

		// ------------------------------company------------
//		 CompanyDao dao=new CompanyDao();
//		 Company company= new Company();
//		 company.setcId(1);
//		 company.setcName("��ñ�Ƽ����޹�˾");
//		 company.setcPassword("123123");
//		 company.setJobCount(1);
//		 company.setAccount(9);
//		 company.setPhone("18285111205");
//		 company.setMailBox("123456789@qq.com");
//		 List<Company> clist=dao.Query(2, 5);
		 
		 //company.getFjobs().size()
//		 System.out.println(dao.QueryByName("��ñ�Ƽ����޹�˾"));
//		 for(int i=0;i<20;i++){
		 //System.out.println(dao.Insert(company));
//			 System.out.println(clist.get(i).getcId()); 
//		 }
//		 System.out.println(dao.Delete(company));
//		 System.out.println(dao.getTableSize());

		// -------------------��ְ----------------------------
	//	PJobDao dao = new PJobDao();
//		PJob pjob = new PJob();
//		Company company = new Company();
//		company.setcId(2);
//		pjob.setJobTitle("��̨�д�");
//		pjob.setPtjType("��̨");
//		pjob.setCompany(company);
//		for(int i=0;i<3;i++){
//		System.out.println(dao.Insert(pjob));
//		}
//		List<PJob> plist = dao.QueryByFour(1, 10, "��վ����", "С��ƽ��", "����һ", "����");
//		List<PJob> plist = dao.QueryByTime(1, 10, "���ڶ�");
	//	List<PJob> plist = dao.QueryByTwo(1, 10, "workPlace", "小河平桥", "jobSign", "长期");
//		List<String> plist = dao.QueryAllJobAdress();
	//	for(int i=0;i<plist.size();i++){
			//System.out.println(plist.get(i).getPtJobId());
	//		System.out.println(plist.get(i));
//		}
//		 
//		 Login login = new Login();
//		 System.out.println(login.personLogin("cxzhao", "123123"));
//		 System.out.println(login.companyLogin("草帽科技有限公司", "123123"));
//		 System.out.println(login.managerLogin("cxzhao", "123123"));
		
		PTJResume ptjr = new PTJResume();
//		PResume presume = new PResume();
//		Person person = new Person();
//		person.setpId(1);
//		presume.setPtjId(1);
//		presume.setPerson(person);
//		presume.setName("赵晨曦");
//		presume.setSex("男");
//		presume.setBirthday("1993-3-12");
//		presume.setWorkPlace("小河");
//		presume.setWage("200元/每天");
//		presume.setPtjType("网站建设");
//		presume.setEducation("本科");
//		presume.setIntroduction("我很吊的");
//		presume.setLocation("小河");
//		System.out.println(ptjr.addPResume(presume));
//		System.out.println(ptjr.updatePResume(presume));
//		System.out.println(ptjr.queryPResumeById(1).getName());
//		System.out.println(ptjr.queryPResume(1, 1,"ptjType","网站建设"));
//		System.out.println(ptjr.queryAllPResume(1, 1));		
//		JobTypes jt=new JobTypes();		
//		System.out.println(jt.getJobType("长期"));
		
		
//		PTJob ptjob = new PTJob();
//		System.out.println(ptjob.getPJobArea());
//		System.out.println(ptjob.queryPJob(1, 10));
//		System.out.println(ptjob.queryByCId(3));
//		System.out.println(ptjob.queryByThreeConditions(1, 10, "workPlace", "小河平桥", "jobSign", "长期","sex","不限"));
//		System.out.println(ptjob.queryByTwoConditions(1, 10, "workPlace", "小河平桥", "jobSign", "长期"));
//		System.out.println(ptjob.queryAll(1, 10));
		
//		Tips tips = new Tips();
//		System.out.println(tips.queryTipsById(1));

		Pcomments comment = new Pcomments();
		Pcomment p = new Pcomment();
		p.setCommentId(1);
		p.setcDate("2014-10-14");
		Company c = new Company();
		c.setcId(2);
		p.setCompany(c);
		p.setContent("还不错oooooo");
		p.setPersonId(1);
		p.setScore(5);
//		System.out.println(comment.add(p));
	//	System.out.println(comment.queryByCId(1,2,2).size());
		System.out.println(comment.getSendId("hhhhhhh", 1, "已评价"));
		
//		workhistory work = new workhistory();
//		System.out.println(work.queryByPersonId(1, 2, 1,"fdsa").get(1).getSendId());
//		System.out.println(work.queryByTime(1, 2,"fdsa").size());
		
		
	}
}
