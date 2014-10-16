package com.jzkjdataservice.service;

import com.jzkjdataservice.dao.AdminDao;
import com.jzkjdataservice.dao.CompanyDao;
import com.jzkjdataservice.dao.PersonDao;
import com.jzkjdataservice.domain.Administrator;
import com.jzkjdataservice.domain.Company;
import com.jzkjdataservice.domain.Person;
import com.jzkjdataservice.util.Canstant;

public class Redister {

	/**
	 * 个人注册
	 * @param person
	 * @return
	 */
	public String registerPerson(Person person){
		PersonDao dao = new PersonDao();
		person.setLevel(Canstant.USERLEVEL_1);
		Boolean isSucessful=dao.Insert(person);
		if(isSucessful==true)
			return Canstant.USERLEVEL_1;
		else
			return Canstant.REGISTER_FAILED;	
	}
//	
//	public Boolean registerPerson(String person){
//		Gson 
//		Person person = 
//		PersonDao dao = new PersonDao();
//		Boolean isSucessful=dao.Insert(person);		
//		return isSucessful;
//	}
	/**
	 * 企业注册
	 * @param company
	 * @return
	 */
	public String registerCompany(Company company){
		CompanyDao dao = new CompanyDao();
		company.setLevel(Canstant.USERLEVEL_1);
		Boolean isSucessful=dao.Insert(company);
		if(isSucessful==true)
			return Canstant.USERLEVEL_1;
		else
			return Canstant.REGISTER_FAILED;
	}
	
	/**
	 * 管理员注册
	 * @param admin
	 * @return
	 */
	public Boolean registerAdmin(Administrator admin){
		AdminDao dao = new AdminDao();
		Boolean isSucessful=dao.Insert(admin);
		return isSucessful;		
	}
}
