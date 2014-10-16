package com.jzkjdataservice.service;

import java.util.List;

import com.jzkjdataservice.dao.PersonDao;
import com.jzkjdataservice.domain.Person;

public class Persons {
	/**
	 * 根据Id删除个人
	 * @param Id
	 * @return
	 */
	public Boolean delete(int Id){
		Person person = new Person();
		person.setpId(Id);
		PersonDao dao = new PersonDao();
		return dao.Delete(person);		
	}
	
	/**
	 * 设置某用户成为会员
	 * @param level
	 * @return
	 */
	public Boolean becomeMember(String level){
		Person person = new Person();
		person.setLevel(level);;
		PersonDao dao = new PersonDao();
		return dao.Update(person);
	}
	
	/**
	 * 更改账户余额
	 * @param account
	 * @return
	 */
	public Boolean updateAccount(int account){
		Person person = new Person();
		person.setAccount(account);
		PersonDao dao = new PersonDao();
		return dao.Update(person);
	}
	
	/**
	 * 更改面试次数
	 * @param meetCount
	 * @return
	 */
	public Boolean updateMeetCount(int meetCount){
		Person person = new Person();
		person.setMeetCount(meetCount);
		PersonDao dao = new PersonDao();
		return dao.Update(person);
	}
	
	/**
	 * 更改兼职次数
	 * @param workCount
	 * @return
	 */
	public Boolean updateWorkTime(int workCount){
		Person person = new Person();
		person.setPtjCount(workCount);
		PersonDao dao = new PersonDao();
		return dao.Update(person);
	}
	
	/**
	 * 根据Id查询会员等级
	 * @param Id
	 * @return
	 */
	public String queryLevelById(int Id){
		String level = null;
		PersonDao dao = new PersonDao();
		level = dao.QueryById(Id).getLevel();
		return level;
	}
	/**
	 * 根据姓名查询会员级别
	 * @param name
	 * @return
	 */
	public String queryLevelByName(String name){
		String level = null;
		PersonDao dao = new PersonDao();
		level = dao.QueryByName(name).getLevel();
		return level;
	}
	/**
	 * 查询注册个人
	 * @param currentpage
	 * @param pagesize
	 * @return
	 */
	public List<Person> queryPerson(int currentpage, int pagesize){
		PersonDao dao = new PersonDao();
		return dao.Query(currentpage, pagesize);
	}
	
	/**
	 * 根据字段名和值查询注册个人
	 * @param currentpage
	 * @param pagesize
	 * @param arg0
	 * @param value
	 * @return
	 */
	public List<Person> queryPerson(int currentpage, int pagesize,String arg0,String value){
		PersonDao dao = new PersonDao();
		return dao.Query(currentpage, pagesize,arg0,value);
	}
	
	/**
	 * 计算注册人数
	 * @return
	 */
	public int size(){
		PersonDao dao = new PersonDao();
		return dao.getTableSize();
	}
	
	
}
