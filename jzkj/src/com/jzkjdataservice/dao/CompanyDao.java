package com.jzkjdataservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jzkjdataservice.db.DBoperator;
import com.jzkjdataservice.domain.Company;
import com.jzkjdataservice.util.HibernateUtil;

public class CompanyDao extends DBoperator<Company>{

	@Override
	public Boolean Insert(Company company) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
		try {
			session.save(company);
			trans.commit();
		} catch (Exception e) {
			System.out.println("CompanyDao的Insert(Company company)异常");
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}


	@Override
	public Boolean Update(Company company) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			Company c = (Company) session.get(Company.class,
					new Integer(company.getcId()));
			if(c!=null){
				if (null != company.getcName())
					c.setcName(company.getcName());
				if (null != company.getcPassword())
					c.setcPassword(company.getcPassword());
				if (null != company.getMailBox())
					c.setMailBox(company.getMailBox());
				if (0 != company.getScore())
					c.setScore(company.getScore());
				if (0 != company.getAccount())
					c.setAccount(company.getAccount());
				if (0 != company.getJobCount())
					c.setJobCount(company.getJobCount());
				if (0 != company.getOverplusCount())
					c.setOverplusCount(company.getOverplusCount());
				if (0 != company.getResumeCount())
					c.setResumeCount(company.getResumeCount());
				if (null != company.getImage())
					c.setImage(company.getImage());
				if (null != company.getAttestation())
					c.setAttestation(company.getAttestation());
				if (null != company.getLevel())
					c.setLevel(company.getLevel());
				if (null != company.getRedisterTime())
					c.setRedisterTime(company.getRedisterTime());
				if(null!=company.getLeader())
					c.setLeader(company.getLeader());
				if(null!=company.getAdress())
					c.setAdress(company.getAdress());
			}else{
				System.out.println("数据库中没有该记录");
				return false;
			}
			session.update(c);
			trans.commit();
		} catch (Exception ex) {
			System.out.println("CompanyDao的Update(Company company)异常");
			ex.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public Company QueryById(int id) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Company company = null;
		List<?>list = null;
		String hql="from Company company where company.cId=:id";	
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setInteger("id", id);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("CompanyDao异常QueryById(int id)异常");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					company = (Company) list.get(i);
				}
			}else{
				System.out.println("数据库中没有该记录");
			}				
			
		}
		return company;
	}
	
	@Override
	public Company QueryByName(String name) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Company company = null;
		List<?>list = null;
		String hql="from Company company where company.cName=:name";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setString("name", name);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("CompanyDao的QueryByName(String name)异常");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					company = (Company) list.get(i);
				}
			}else{
				System.out.println("数据库中没有该记录");
			}				
			
		}
		return company;
	}

	

	@Override
	public List<Company> Query(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Company company = null;
		List<?>list = null;
		List<Company> clist= new ArrayList<Company>();
		String hql="from Company company  order by cId desc";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("CompanyDao的Query(int currentpage, int pagesize)异常");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					company = (Company) list.get(i);
					clist.add(company);
				}
			}else{
				System.out.println("数据库中没有该记录");
			}
		}
		return clist;
	}
	
	public List<Company> Query(int currentpage, int pagesize,String arg1,String arg2) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Company company = null;
		List<?>list = null;
		List<Company> clist= new ArrayList<Company>();
		String hql="from Company company where company."+arg1+" like :arg2 order by cId desc";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			query.setString("arg2","%"+arg2+"%");
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("CompanyDao的Query(int currentpage, int pagesize)异常");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					company = (Company) list.get(i);
					clist.add(company);
				}
			}else{
				System.out.println("数据库中没有该记录");
			}
		}
		return clist;
	}
	
	
	public List<Company> Query(int currentpage, int pagesize,String arg1,String arg2,String arg3,String arg4) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Company company = null;
		List<?>list = null;
		List<Company> clist= new ArrayList<Company>();
		String hql="from Company company where company."+arg1+" like :arg2 and company."+arg3+" :arg4 order by cId desc";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			query.setString("arg2","%"+arg2+"%");
			query.setString("arg4","%"+arg4+"%");
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("CompanyDao的Query(int currentpage, int pagesize,String arg1,String arg2,String arg3,String arg4)异常");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					company = (Company) list.get(i);
					clist.add(company);
				}
			}else{
				System.out.println("数据库中没有该记录");
			}
		}
		return clist;
	}
	
	
	@Override
	public Boolean Delete(Company company) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		try{
			Company c = (Company) session.get(Company.class,
					new Integer(company.getcId()));
			Transaction trans = session.beginTransaction();
			if(c!=null){
				session.delete(c);
			}else{
				System.out.println("数据库中没有该记录");
				return false;
			}			
			trans.commit();
		}catch(Exception ex){
			System.out.println("CompanyDao的Delete(Company company)");
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
		String sql="select count(cId) from company";
		List<?> list=session.createSQLQuery(sql).list();
		Object size=0;
		for(int i=0;i<list.size();i++){
			size=(Object)list.get(i); 
		}
		return Integer.parseInt(size.toString());
	}		

}
