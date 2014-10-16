package com.jzkjdataservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jzkjdataservice.db.DBoperator;
import com.jzkjdataservice.domain.Company;
import com.jzkjdataservice.domain.JobType;
import com.jzkjdataservice.domain.Pcomment;
import com.jzkjdataservice.domain.Tip;
import com.jzkjdataservice.util.HibernateUtil;

public class PcommentDao extends DBoperator<Pcomment>{

	@Override
	public Boolean Insert(Pcomment pcomment) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
		try {
			session.save(pcomment);
			trans.commit();
		} catch (Exception e) {
			System.out.println("PcommentDao的Insert(Pcomment pcomment)异常 ");
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public Boolean Update(Pcomment pcomment) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			Pcomment p = (Pcomment) session.get(Pcomment.class,
					new Integer(pcomment.getCommentId()));
			if(p!=null){
			if (0 != pcomment.getPersonId())
				p.setPersonId(pcomment.getPersonId());
			if(null!=pcomment.getcDate())
				p.setcDate(pcomment.getcDate());
			if(0f!=pcomment.getScore())
				p.setScore(pcomment.getScore());
			if(null!=pcomment.getCompany())
				p.setCompany(pcomment.getCompany());
			if(null!=pcomment.getContent())
				p.setContent(pcomment.getContent());
			}else{
				System.out.println("更新失败，数据库中没有该记录");
				return false;
			}
			session.update(p);
			trans.commit();
		} catch (Exception ex) {
			System.out.println("PcommentDao是Update(Pcomment pcomment)异常");
			ex.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}


	@Override
	public Pcomment QueryById(int id) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Pcomment pcomment = null;
		List<?>list = null;
		String hql="from Pcomment comment where comment.commentId=:id";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setInteger("id", id);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("����PcommentDao��QueryById(int id)������ѯʧ��");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					pcomment = (Pcomment) list.get(i);
				}
			}else{
				System.out.println("��ݿ���û�иü�¼");
			}
		}
		return pcomment;
	}

	/**
	 * ����û�ID��ѯ����
	 * @param personId
	 * @return
	 */
	public List<Pcomment> QueryByPersonId(int personId){
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Pcomment comment = null;
		List<?>list = null;
		List<Pcomment> plist= new ArrayList<Pcomment>();
		String hql="from Pcomment comment where comment.personId=:personId ";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setInteger("personId", personId);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("����PcommentDao��QueryByPersonId(int personId)������ѯʧ��");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					comment = (Pcomment) list.get(i);
					plist.add(comment);
				}
			}else{
				System.out.println("û���ҵ���ݿ��еļ�¼");
			}
		}
		return plist;		
	}
	
	/**
	 * ��ݹ�˾Id��ѯ�ù�˾������
	 * @param cId
	 * @return
	 */
	public List<Pcomment> QueryByCId(int currentpage, int pagesize,int cId){
		int firstResult = (currentpage - 1) * pagesize;
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Pcomment comment = null;
		List<?>list = null;
		List<Pcomment> plist= new ArrayList<Pcomment>();
		String hql="select comment from Pcomment comment left join comment.company c with c.cId=:cId";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			query.setInteger("cId", cId);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("PcommentDao的QueryByCId(int cId)异常");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					comment = (Pcomment)list.get(i);
					plist.add(comment);
				}
			}else{
				System.out.println("数据库中没有该记录");
			}
		}
		return plist;	
	}
		
	
	@Override
	public List<Pcomment> Query(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Pcomment pcomment = null;
		List<?>list = null;
		List<Pcomment> plist= new ArrayList<Pcomment>();
		String hql="from Pcomment comment order by commentId desc";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("PcommentDao的Query(int currentpage, int pagesize)异常");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					pcomment = (Pcomment) list.get(i);
					plist.add(pcomment);
				}
			}else{
				System.out.println("数据库中没有该记录");
			}
		}
		return plist;
	}

	@Override
	public Boolean Delete(Pcomment pcomment) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		try{
			Pcomment p = (Pcomment) session.get(Pcomment.class,
					new Integer(pcomment.getCommentId()));
			Transaction trans = session.beginTransaction();
			if(p!=null){
				session.delete(p);
			}else{
				System.out.println("��ݿ���û�иü�¼");
			}			
			trans.commit();
		}catch(Exception ex){
			System.out.println("����PcommentDao��Delete(Pcomment pcomment)����ɾ��ʧ��");
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
		String sql="select count(commentId) from pcomment";
		List<?> list=session.createSQLQuery(sql).list();
		Object size=0;
		for(int i=0;i<list.size();i++){
			size=(Object)list.get(i); 
		}
		return Integer.parseInt(size.toString());
	}

}
