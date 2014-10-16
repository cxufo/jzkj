package com.jzkjdataservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jzkjdataservice.db.DBoperator;
import com.jzkjdataservice.domain.Administrator;
import com.jzkjdataservice.domain.JobType;
import com.jzkjdataservice.domain.Tip;
import com.jzkjdataservice.util.HibernateUtil;

public class TipsDao extends DBoperator<Tip>{

	@Override
	public Boolean Insert(Tip tips) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
		try {
			session.save(tips);
			trans.commit();
		} catch (Exception e) {
			System.out.println("TipsDao的Insert(Tips tips)异常");
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public Boolean Update(Tip tips) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			Tip t = (Tip) session.get(Tip.class,
					new Integer(tips.getTipsId()));
			if(t!=null){
			if (null != tips.getTipsContent())
				t.setTipsContent(tips.getTipsContent());		
			}else{
				System.out.println("数据库中没有该记录");
				return false;
			}
			session.update(t);
			trans.commit();
		} catch (Exception ex) {
			System.out.println("TipsDao的Update(Tip tips)异常");
			ex.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public Tip QueryById(int id) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Tip tips = null;
		List<?>list = null;
		String hql="from Tip tips where tips.tipsId=:id";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setInteger("id", id);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("TipsDao的QueryById(int id)异常");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					tips = (Tip) list.get(i);
				}
			}else{
				System.out.println("数据库中没有该记录");
			}
		}
		return tips;
	}

	@Override
	public List<Tip> Query(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Tip tips = null;
		List<?>list = null;
		List<Tip> tlist= new ArrayList<Tip>();
		String hql="from Tip tips";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("TipsDao的Query(int currentpage, int pagesize)异常");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					tips = (Tip) list.get(i);
					tlist.add(tips);
				}
			}else{
				System.out.println("数据库中没有该记录");
			}
		}
		return tlist;
	}

	@Override
	public Boolean Delete(Tip tips) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		try{
			Tip t = (Tip) session.get(Tip.class,
					new Integer(tips.getTipsId()));
			Transaction trans = session.beginTransaction();
			if(t!=null){
				session.delete(t);
			}else{
				System.out.println("数据库中没有该记录");
			}			
			trans.commit();
		}catch(Exception ex){
			System.out.println("TipsDao的Delete(Tips tips)异常");
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
		String sql="select count(tipsId) from tips";
		List<?> list=session.createSQLQuery(sql).list();
		Object size=0;
		for(int i=0;i<list.size();i++){
			size=(Object)list.get(i); 
		}
		return Integer.parseInt(size.toString());
	}

}
