package com.jzkjdataservice.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jzkjdataservice.db.DBoperator;
import com.jzkjdataservice.domain.Administrator;
import com.jzkjdataservice.util.HibernateUtil;

public class AdminDao extends DBoperator<Administrator>{

	@Override
	public Boolean Insert(Administrator t) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
		try {
			session.save(t);
			trans.commit();
		} catch (Exception e) {
			System.out.println("����AdminDao��Insert(Administrator t)��������ʧ��");
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public Boolean Update(Administrator t) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			Administrator admin = (Administrator) session.get(Administrator.class,
					new String(t.getName()));
			if(admin!=null){
			if (null != t.getPassword())
				admin.setPassword(t.getPassword());
			if (null != t.getLevel())
				admin.setLevel(t.getLevel());
			}else{
				System.out.println("û���ҵ�name="+t.getName()+"�Ĺ���Ա");
				return false;
			}
			session.update(admin);
			trans.commit();
		} catch (Exception ex) {
			System.out.println("����AdminDao��Update(Administrator t)����ʧ��");
			ex.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public Administrator QueryByName(String name) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		Transaction trans = null;
		Administrator admin = null;
		List<?>list = null;
		String hql="from Administrator admin where admin.name=:name";
		try{
			trans=session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setString("name", name);
			list = query.list();
			trans.commit();
		}catch(Exception ex){
			System.out.println("����AdminDao��QueryByName(String name)������ѯʧ��");
			ex.printStackTrace();
			return null;
		}finally{
			if(list!=null){
				for(int i=0;i<list.size();i++){
					admin = (Administrator) list.get(i);
				}
			}else{
				System.out.println("����AdminDao��QueryByName(String name)û��name="+name+"�ļ�¼");
			}
		}
		return admin;
	}

	@Override
	public Boolean Delete(Administrator t) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSession();
		try{
			Administrator admin = (Administrator) session.get(Administrator.class,
					new String(t.getName()));
			Transaction trans = session.beginTransaction();
			if(admin!=null){
				session.delete(admin);
			}else{
				System.out.println("û���ҵ�name="+t.getName()+"�Ĺ���Ա");
			}			
			trans.commit();
		}catch(Exception ex){
			System.out.println("����ContactDao��Delete(Contact t)����ɾ��ʧ��");
			ex.printStackTrace();
			return false;
		}finally{
			session.close();
		}
		return true;
	}

}
