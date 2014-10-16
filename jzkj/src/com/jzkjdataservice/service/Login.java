package com.jzkjdataservice.service;

import com.jzkjdataservice.dao.AdminDao;
import com.jzkjdataservice.dao.CompanyDao;
import com.jzkjdataservice.dao.PersonDao;
import com.jzkjdataservice.domain.Administrator;
import com.jzkjdataservice.domain.Company;
import com.jzkjdataservice.domain.Person;

public class Login {
	/**
	 * 个人登录
	 * @param userName
	 * @param password
	 * @return 会员等级
	 */
	public String personLogin(String userName,String password){
		PersonDao dao = new PersonDao();
		Person person = dao.QueryByName(userName);
		if(person!=null&&password.equals(person.getUserPassword()))
		{
			System.out.println("登录成功 ");
			return person.getLevel();
		}
		else
		{
			System.out.println("登录失败");
			return null;
		}
	}
	
	/**
	 * 企业单位登录
	 * @param userName 
	 * @param password 
	 * @return
	 */
	public String companyLogin(String userName,String password){
		CompanyDao dao = new CompanyDao();
		Company company=dao.QueryByName(userName);
		if(company!=null&&password.equals(company.getcPassword()))
		{
			System.out.println("登录成功 ");
			return company.getLevel();
		}
		else
		{
			System.out.println("登录失败");
			return null;
		}
	}
	
	/**
	 * 管理员登录
	 * @param userName
	 * @param password
	 * @return 登陆是否成功
	 */
	public String managerLogin(String userName,String password){
		AdminDao dao = new AdminDao();
		Administrator admin=dao.QueryByName(userName);
		if(admin!=null&&password.equals(admin.getPassword()))
		{
			System.out.println("登录成功 ");
			return admin.getLevel();
		}
		else
		{
			System.out.println("登录失败");
			return null;
		}
	}
}
