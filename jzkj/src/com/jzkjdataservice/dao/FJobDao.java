package com.jzkjdataservice.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.jzkjdataservice.db.DBoperator;
import com.jzkjdataservice.domain.FJob;
import com.jzkjdataservice.domain.PJob;
import com.jzkjdataservice.util.HibernateUtil;

public class FJobDao extends DBoperator<FJob>{

	@Override
	public Boolean Insert(FJob fjob) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
		try {
			session.save(fjob);
			trans.commit();
		} catch (Exception e) {
			System.out.println("����FJobDao��Insert(FJob fjob)��������ʧ��");
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public Boolean Update(FJob ftjob) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			FJob ftj = (FJob) session.get(FJob.class,
					new Integer(ftjob.getFtJobId()));
			if (ftj != null) {
				if (0 != ftjob.getTips().getTipsId())
					ftj.setTips(ftjob.getTips());
				if (null != ftjob.getJobTitle())
					ftj.setJobTitle(ftjob.getJobTitle());
				if (null != ftjob.getFtjType())
					ftj.setFtjType(ftjob.getFtjType());
				if (0 != ftjob.getrCount())
					ftj.setrCount(ftjob.getrCount());
				if (0 != ftjob.getbCount())
					ftj.setbCount(ftjob.getbCount());
				if (null != ftjob.getEducation())
					ftj.setEducation(ftjob.getEducation());
				if (null != ftjob.getJobExperiense())
					ftj.setJobExperiense(ftjob.getJobExperiense());
				if (null != ftjob.getMeetTime())
					ftj.setMeetTime(ftjob.getMeetTime());
				if (null != ftjob.getPublishDate())
					ftj.setPublishDate(ftjob.getPublishDate());
				if (null != ftjob.getWage())
					ftj.setWage(ftjob.getWage());
				if (null != ftjob.getWorkPlace())
					ftj.setWorkPlace(ftjob.getWorkPlace());
				if (null != ftjob.getSex())
					ftj.setSex(ftjob.getSex());
				if (null != ftjob.getAge())
					ftj.setAge(ftjob.getAge());
				if (null != ftjob.getJobSign())
					ftj.setJobSign(ftjob.getJobSign());
			} else {
				System.out.println("û���ҵ�Id=" + ftjob.getFtJobId()+ "��ȫְְλ");
				return false;
			}
			session.update(ftj);
			trans.commit();
		} catch (Exception ex) {
			System.out.println("����FJobDao��Update(FJob ftjob)����ʧ��");
			ex.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public FJob QueryById(int id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		FJob fjob = null;
		List<?> list = null;
		String hql = "from FJob fjob where fjob.ftJobId=:id";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setInteger("id", id);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out.println("����FJobDao��QueryById(int id)������ѯʧ��");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					fjob = (FJob) list.get(i);
				}
			} else {
				System.out.println("����FJobDao��QueryById(int id)û��id=" + id
						+ "�ļ�¼");
			}

		}
		return fjob;
	}

	@Override
	public FJob QueryByName(String name) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		FJob fjob = null;
		List<?> list = null;
		String hql = "from FJob fjob where fjob.jobTitle=:name";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setString("name", name);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out.println("����FJobDao��QueryByName(String name)������ѯʧ��");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					fjob = (FJob) list.get(i);
				}
			} else {
				System.out.println("��ݿ���û�иü�¼");
			}

		}
		return fjob;
	}

	@Override
	public List<FJob> Query(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		FJob fjob = null;
		List<?> list = null;
		List<FJob> flist = new ArrayList<FJob>();
		String hql = "from FJob fjob order by ftJobId desc";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("����FJobDao��Query(int currentpage, int pagesize)������ѯʧ��");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					fjob = (FJob) list.get(i);
					flist.add(fjob);
				}
			} else {
				System.out.println("û���ҵ���ݿ��еļ�¼");
			}
		}
		return flist;
	}

	@Override
	public Boolean Delete(FJob fjob) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		try {
			FJob fj = (FJob) session.get(PJob.class,
					new Integer(fjob.getFtJobId()));
			Transaction trans = session.beginTransaction();
			if (fj != null) {
				session.delete(fj);
			} else {
				System.out.println("û���ҵ�Id=" + fjob.getFtJobId() + "��ȫְְλ");
				return false;
			}
			trans.commit();
		} catch (Exception ex) {
			System.out.println("����FJobDao��Delete(FJob fjob)����ɾ��ʧ��");
			ex.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public int getTableSize() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		String sql = "select count(ftJobId) from ptJob";
		List<?> list = session.createSQLQuery(sql).list();
		Object size = 0;
		for (int i = 0; i < list.size(); i++) {
			size = (Object) list.get(i);
		}
		return Integer.parseInt(size.toString());
	}

}
