package com.jzkjdataservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jzkjdataservice.db.DBoperator;
import com.jzkjdataservice.domain.Person;
import com.jzkjdataservice.util.HibernateUtil;

public class PersonDao extends DBoperator<Person>{

	@Override
	public Boolean Insert(Person person) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
		try {
			session.save(person);
			trans.commit();
		} catch (Exception e) {
			System.out.println("FJobDao Insert(Person person)异常");
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public Boolean Update(Person person) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			Person p = (Person) session.get(Person.class,
					new Integer(person.getpId()));
			if(p!=null){
				if (null != person.getUserName())
					p.setUserName(person.getUserName());
				if (null != person.getUserPassword())
					p.setUserPassword(person.getUserPassword());
				if (null != person.getPhone())
					p.setPhone(person.getPhone());
				if (null != person.getMailBox())
					p.setMailBox(person.getMailBox());
				if (0!=person.getPtjCount())
					p.setPtjCount(person.getPtjCount());
				if (0 != person.getMeetCount())
					p.setMeetCount(person.getMeetCount());
				if (0!=person.getScore())
					p.setScore(person.getScore());
				if (0 != person.getAccount())
					p.setAccount(person.getAccount());
				if (null != person.getLevel())
					p.setLevel(person.getLevel());
				if (null != person.getRegisterTime())
					p.setRegisterTime(person.getRegisterTime());
				if (null != person.getPresume())
					p.setPresume(person.getPresume());
				if (null != person.getFresume())
					p.setFresume(person.getFresume());
			}else{
				System.out.println("数据库中没有该记录");
				return false;
			}
			session.update(p);
			trans.commit();
		} catch (Exception ex) {
			System.out.println("CompanyDao Update(Person person)异常");
			ex.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}


	@Override
	public Person QueryById(int id) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Person person = null;
		List<?>list = null;
		String hql="from Person person where person.pId=:id";	
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setInteger("id", id);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("PersonDao的QueryById(int id)异常");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					person = (Person) list.get(i);
				}
			}else{
				System.out.println("PersonDao的QueryById(int id)没有找到该记录");
			}		
		}
		return person;
	}

	@Override
	public Person QueryByName(String name) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Person person = null;
		List<?>list = null;
		String hql="from Person person where person.userName=:name";	
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setString("name", name);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("PersonDao的QueryByName(String name)异常");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					person = (Person) list.get(i);
				}
			}else{
				System.out.println("PersonDao的QueryByName(String name)没有找到该记录");
			}		
		}
		return person;
	}

	@Override
	public List<Person> Query(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Person person = null;
		List<?>list = null;
		List<Person> plist= new ArrayList<Person>();
		String hql="from Person person  order by pId desc";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("PersonDao的Query(int currentpage, int pagesize)异常");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					person = (Person) list.get(i);
					plist.add(person);
				}
			}else{
				System.out.println("PersonDao的Query(int currentpage, int pagesize)没有找到该记录");
			}
		}
		return plist;
	}
	/**
	 * 根据属性名和值查询
	 * @param currentpage
	 * @param pagesize
	 * @param arg1
	 * @param arg2
	 * @return
	 */
    public List<Person> Query(int currentpage, int pagesize,String arg1,String arg2){
    	int firstResult = (currentpage - 1) * pagesize;
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Person person = null;
		List<?>list = null;
		List<Person> plist= new ArrayList<Person>();
		String hql="from Person person where person."+arg1+" like :arg2 order by pId desc";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			query.setString("arg2","%"+arg2+"%");
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("PersonDao的Query(int currentpage, int pagesize,String arg1,String arg2)异常");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					person = (Person) list.get(i);
					plist.add(person);
				}
			}else{
				System.out.println("PersonDao的Query(int currentpage, int pagesize)没有找到该记录");
			}
		}
		return plist;
    }
    
	@Override
	public Boolean Delete(Person person) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		try{
			Person p = (Person) session.get(Person.class,
					new Integer(person.getpId()));
			Transaction trans = session.beginTransaction();
			if(p!=null){
				session.delete(p);
			}else{
				System.out.println("PersonDao的Delete(Person person)没有找到该记录");
				return false;
			}			
			trans.commit();
		}catch(Exception ex){
			System.out.println("PersonDao的Delete(Person person)异常");
			ex.printStackTrace();
			return false;
		}finally{
			session.close();
		}
		return true;
	}


	@Override
	public int getTableSize() {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		String sql="select count(pId) from person";
		List<?> list=session.createSQLQuery(sql).list();
		Object size=0;
		for(int i=0;i<list.size();i++){
			size=(Object)list.get(i); 
		}
		return Integer.parseInt(size.toString());
	}

}
