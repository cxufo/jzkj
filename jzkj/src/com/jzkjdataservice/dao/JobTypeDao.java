package com.jzkjdataservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jzkjdataservice.db.DBoperator;
import com.jzkjdataservice.domain.Administrator;
import com.jzkjdataservice.domain.JobType;
import com.jzkjdataservice.util.HibernateUtil;

public class JobTypeDao extends DBoperator<JobType>{

	@Override
	public Boolean Insert(JobType jobType) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
		try {
			session.save(jobType);
			trans.commit();
		} catch (Exception e) {
			System.out.println("JobTypeDao的Insert(JobType t)异常");
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public Boolean Update(JobType jobType) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			JobType jt = (JobType) session.get(JobType.class,
					new Integer(jobType.getTypeId()));
			if(jt!=null){
			if (null != jobType.getJobSign())
				jt.setJobSign(jt.getJobSign());
			if (null != jobType.getJobType())
				jt.setJobType(jobType.getJobType());
			}else{
				System.out.println("数据库中没有该记录");
				return false;
			}
			session.update(jt);
			trans.commit();
		} catch (Exception ex) {
			System.out.println("JobTypeDao的Update(JobType jobType)异常");
			ex.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public JobType QueryById(int id) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		JobType type = null;
		List<?>list = null;
		String hql="from JobType jobtype where jobtype.typeId=:id";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setInteger("id", id);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("JobTypeDao的QueryById(int id)异常");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					type = (JobType) list.get(i);
				}
			}else{
				System.out.println("数据库中没有该记录");
			}
		}
		return type;
	}

	public List<JobType> QueryBySign(String sign) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		JobType jobType = null;
		List<?>list = null;
		List<JobType> jlist= new ArrayList<JobType>();
		String hql="from JobType jobtype where jobtype.jobSign=:sign";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setString("sign",sign);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("JobTypeDao的QueryBySign(String sign)异常");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					jobType = (JobType) list.get(i);
					jlist.add(jobType);
				}
			}else{
				System.out.println("数据库中没有记录");
			}
		}
		return jlist;
	}
	
	@Override
	public List<JobType> Query(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		JobType jobType = null;
		List<?>list = null;
		List<JobType> jlist= new ArrayList<JobType>();
		String hql="from JobType jobtype";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("JobTypeDao的Query(int currentpage, int pagesize)异常");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					jobType = (JobType) list.get(i);
					jlist.add(jobType);
				}
			}else{
				System.out.println("数据库中没有记录");
			}
		}
		return jlist;
	}

	@Override
	public Boolean Delete(JobType jobType) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		try{
			JobType jt = (JobType) session.get(Administrator.class,
					new Integer(jobType.getTypeId()));
			Transaction trans = session.beginTransaction();
			if(jt!=null){
				session.delete(jt);
			}else{
				System.out.println("��ݿ���û�иü�¼");
			}			
			trans.commit();
		}catch(Exception ex){
			System.out.println("����JobTypeDao��Delete(JobType jobType)����ɾ��ʧ��");
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
		String sql="select count(typeId) from jobType";
		List<?> list=session.createSQLQuery(sql).list();
		Object size=0;
		for(int i=0;i<list.size();i++){
			size=(Object)list.get(i); 
		}
		return Integer.parseInt(size.toString());
	}

}
