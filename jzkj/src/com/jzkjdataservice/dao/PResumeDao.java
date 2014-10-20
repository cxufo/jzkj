package com.jzkjdataservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jzkjdataservice.db.DBoperator;
import com.jzkjdataservice.domain.PResume;
import com.jzkjdataservice.util.HibernateUtil;

public class PResumeDao extends DBoperator<PResume>{

	@Override
	public Boolean Insert(PResume presume) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
		try {
			session.save(presume);
			trans.commit();
		} catch (Exception e) {
			System.out.println("����PResumeDao��Insert(PResume presume)��������ʧ��");
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}


	@Override
	public Boolean Update(PResume presume) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			PResume p = (PResume) session.get(PResume.class,
					new Integer(presume.getPtjId()));
			if(p!=null){
				if (null != presume.getPerson())
					p.setPerson(presume.getPerson());
				if (null != presume.getName())
					p.setName(presume.getName());
				if (null != presume.getSex())
					p.setSex(presume.getSex());
				if (null!=presume.getBirthday())
					p.setBirthday(presume.getBirthday());
				if (null != presume.getPtjType())
					p.setPtjType(presume.getPtjType());
				if (null!= presume.getWorkPlace())
					p.setWorkPlace(presume.getWorkPlace());
				if (null!= presume.getWorkTime())
					p.setWorkTime(presume.getWorkTime());
				if (null!=presume.getWage())
					p.setWage(presume.getWage());
				if (null!=presume.getEducation())
					p.setEducation(presume.getEducation());
				if (null != presume.getIntroduction())
					p.setIntroduction(presume.getIntroduction());
				if (null != presume.getLocation())
					p.setLocation(presume.getLocation());				
			}else{
				System.out.println("数据库中没有该记录");
				return false;
			}
			session.update(p);
			trans.commit();
		} catch (Exception ex) {
			System.out.println("PResumeDao的Update(PResume presume)异常");
			ex.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public PResume QueryById(int id) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		PResume presume = null;
		List<?>list = null;
		String hql="from PResume presume where presume.ptjId=:id";	
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setInteger("id", id);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("����PResumeDao��QueryById(int id)������ѯʧ��");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					presume = (PResume) list.get(i);
				}
			}else{
				System.out.println("����PResumeDao��QueryById(int id)û��id="+id+"�ļ�¼");
			}				
			
		}
		return presume;
	}

	@Override
	public PResume QueryByName(String name) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		PResume presume = null;
		List<?>list = null;
		String hql="from PResume presume where presume.name=:name";	
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setString("name", name);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("PResumeDao的QueryByName(String name)异常");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					presume = (PResume) list.get(i);
				}
			}else{
				System.out.println("数据库中没有该记录");
			}				
			
		}
		return presume;
	}

	
	
	@Override
	public List<PResume> Query(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		PResume presume = null;
		List<?>list = null;
		List<PResume> plist= new ArrayList<PResume>();
		String hql="from PResume presume order by ptjId desc";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("PResumeDao的Query(int currentpage, int pagesize)异常");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					presume = (PResume) list.get(i);
					plist.add(presume);
				}
			}else{
				System.out.println("数据库中没有该记录");
			}
		}
		return plist;
	}

	public PResume QueryByPersonId(int personId){
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		PResume presume = null;
		List<?>list = null;
		String hql="from PResume presume where presume.person.pId=:personId";	
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setInteger("personId", personId);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("PResumeDao的QueryByPersonId(int personId)异常");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					presume = (PResume) list.get(i);
				}
			}else{
				System.out.println("��ݿ���û�иü�¼");
			}				
			
		}
		return presume;
	}
	

	public List<PResume> Query(int currentpage, int pagesize,String arg1,String arg2){
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PResume presume = null;
		List<?> list = null;
		List<PResume> plist = new ArrayList<PResume>();
		String hql = "from PResume presume where presume."+arg1+" like :arg2 order by ptjId desc";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			query.setString("arg2", "%"+arg2+"%");
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("PResumeDao的Query(int currentpage, int pagesize,String arg1,String arg2)异常");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					presume = (PResume) list.get(i);
					plist.add(presume);
				}
			} else {
				System.out.println("数据库中没有该记录");
			}
		}
		return plist;
	}
	
	public List<PResume> Query(int currentpage, int pagesize,String arg1,String arg2,String arg3,String arg4){
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PResume presume = null;
		List<?> list = null;
		List<PResume> plist = new ArrayList<PResume>();
		String hql = "from PResume presume where presume."+arg1+" like :arg2 and presume."+arg3+" =:arg4 order by ptjId desc";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			query.setString("arg2", "%"+arg2+"%");
			query.setString("arg4", "%"+arg4+"%");
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("PResumeDao的Query(int currentpage, int pagesize,String arg1,String arg2,String arg3,String arg4)异常");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					presume = (PResume) list.get(i);
					plist.add(presume);
				}
			} else {
				System.out.println("数据库中没有符合条件的记录");
			}
		}
		return plist;
	}
	
	public List<PResume> Query(int currentpage, int pagesize,String arg1,String arg2,String arg3,String arg4,String arg5,String arg6){
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PResume presume = null;
		List<?> list = null;
		List<PResume> plist = new ArrayList<PResume>();
		String hql = "from PResume presume where presume."+arg1+" like :arg2 and presume."+arg3+" =:arg4 and presume."+arg5+" =:arg6 order by ptjId desc";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			query.setString("arg2", "%"+arg2+"%");
			query.setString("arg4", "%"+arg4+"%");
			query.setString("arg6", "%"+arg6+"%");
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("PResumeDao的Query(int currentpage, int pagesize,String arg1,String arg2,String arg3,String arg4)异常");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					presume = (PResume) list.get(i);
					plist.add(presume);
				}
			} else {
				System.out.println("数据库中没有符合条件的记录");
			}
		}
		return plist;
	} 
	
	
	@Override
	public Boolean Delete(PResume presume) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		try{
			PResume p = (PResume) session.get(PResume.class,
					new Integer(presume.getPtjId()));
			Transaction trans = session.beginTransaction();
			if(p!=null){
				session.delete(p);
			}else{
				System.out.println("数据库中没有该记录");
				return false;
			}			
			trans.commit();
		}catch(Exception ex){
			System.out.println("PResumeDao的Delete(PResume presume)异常");
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
		String sql="select count(ptjId) from ptj_Resume";
		List<?> list=session.createSQLQuery(sql).list();
		Object size=0;
		for(int i=0;i<list.size();i++){
			size=(Object)list.get(i); 
		}
		return Integer.parseInt(size.toString());
	}

}
