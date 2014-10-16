package com.jzkjdataservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jzkjdataservice.db.DBoperator;
import com.jzkjdataservice.domain.FResumeBox;
import com.jzkjdataservice.domain.PJob;
import com.jzkjdataservice.domain.PResume;
import com.jzkjdataservice.domain.PResumeBox;
import com.jzkjdataservice.domain.Person;
import com.jzkjdataservice.util.HibernateUtil;

public class PResumeBoxDao extends DBoperator<PResumeBox> {

	@Override
	public Boolean Insert(PResumeBox presumeBox) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
		try {
			session.save(presumeBox);
			trans.commit();
		} catch (Exception e) {
			System.out
					.println("调用PResumeBoxDao的Insert(PResumeBox presumeBox)方法插入失败");
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public Boolean Update(PResumeBox presumeBox) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			PResumeBox p = (PResumeBox) session.get(PResumeBox.class,
					new Integer(presumeBox.getSendId()));
			if (p != null) {
				if (null != presumeBox.getIsGetJob())
					p.setIsGetJob(presumeBox.getIsGetJob());
				if (null != presumeBox.getJobTitle())
					p.setJobTitle(presumeBox.getJobTitle());
				if (null != presumeBox.getPerson())
					p.setPerson(presumeBox.getPerson());
				if (null != presumeBox.getTime())
					p.setTime(presumeBox.getTime());
				if (null != presumeBox.getWage())
					p.setWage(presumeBox.getWage());
				if (0 != presumeBox.getPtJobId())
					p.setPtJobId(presumeBox.getPtJobId());
				if (null != presumeBox.getIsComment())
					p.setIsComment(presumeBox.getIsComment());
			} else {
				System.out.println("数据库中没有该记录");
				return false;
			}
			session.update(p);
			trans.commit();
		} catch (Exception ex) {
			System.out.println("调用PResumeDao的Update(PResume presume)更新失败");
			ex.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public PResumeBox QueryById(int id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PResumeBox presume = null;
		List<?> list = null;
		String hql = "from PResumeBox presumebox where presumebox.sendId=:id";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setInteger("id", id);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out.println("调用FResumeBoxDao的QueryById(int id)方法查询失败");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					presume = (PResumeBox) list.get(i);
				}
			} else {
				System.out.println("数据库中没有该记录");
			}

		}
		return presume;
	}

	@Override
	public PResumeBox QueryByName(String name) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PResumeBox presume = null;
		List<?> list = null;
		String hql = "from PResumeBox presumebox where presumebox.jobTitle=:name";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setString("name", name);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("调用FResumeBoxDao的QueryByName(String name)方法查询失败");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					presume = (PResumeBox) list.get(i);
				}
			} else {
				System.out.println("数据库中没有该记录");
			}

		}
		return presume;
	}

	public PResumeBox QueryByName(String title,int personId,String isComment) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PResumeBox presume = null;
		List<?> list = null;
		String hql = "select presumebox from PResumeBox presumebox where presumebox.jobTitle=:name and presumebox.isComment=:isComment and presumebox.person.pId=:id";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setString("name", title);
			query.setString("isComment", isComment);
			query.setInteger("id", personId);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("调用FResumeBoxDao的QueryByName(String name)方法查询失败");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					presume = (PResumeBox) list.get(i);
				}
			} else {
				System.out.println("数据库中没有该记录");
			}

		}
		return presume;
	}
	
	@Override
	public List<PResumeBox> Query(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PResumeBox presumeBox = null;
		List<?> list = null;
		List<PResumeBox> plist = new ArrayList<PResumeBox>();
		String hql = "from PResumeBox presumeBox order by sendId desc";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("调用PResumeDao的Query(int currentpage, int pagesize)方法查询失败");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					presumeBox = (PResumeBox) list.get(i);
					plist.add(presumeBox);
				}
			} else {
				System.out.println("没有找到数据库中的记录");
			}
		}
		return plist;
	}

	public List<PResumeBox> QueryByPersonId(int currentpage, int pagesize,int personId) {
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PResumeBox presumeBox = null;
		List<?> list = null;
		List<PResumeBox> plist = new ArrayList<PResumeBox>();
		String hql = "select presumeBox from PResumeBox presumeBox right join presumeBox.person person with person.pId =:personId order by sendId desc";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			query.setInteger("personId",personId);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("调用PResumeDao的Query(int currentpage, int pagesize,int personId)方法查询失败");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					presumeBox = (PResumeBox) list.get(i);
					plist.add(presumeBox);
				}
			} else {
				System.out.println("没有找到数据库中的记录");
			}
		}
		return plist;
	}
	
	public List<PResumeBox> queryByTime(int currentpage, int pagesize,String time){
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PResumeBox presumeBox = null;
		List<?> list = null;
		List<PResumeBox> plist = new ArrayList<PResumeBox>();
		String hql = "from PResumeBox presumeBox where presumeBox.time =:time order by sendId desc";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			query.setString("time",time);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("调用PResumeDao的queryByTime(int currentpage, int pagesize,String time)方法查询失败");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					presumeBox = (PResumeBox) list.get(i);
					plist.add(presumeBox);
				}
			} else {
				System.out.println("没有找到数据库中的记录");
			}
		}
		return plist;
	}
	
	public List<PResumeBox> queryByTime(int currentpage, int pagesize,String isGet,String time){
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PResumeBox presumeBox = null;
		List<?> list = null;
		List<PResumeBox> plist = new ArrayList<PResumeBox>();
		String hql = "from PResumeBox presumeBox where presumeBox.time =:time and presumeBox.isGetJob=:isGet order by sendId desc";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			query.setString("time",time);
			query.setString("isGet",isGet);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("调用PResumeDao的queryByTime(int currentpage, int pagesize,String time)方法查询失败");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					presumeBox = (PResumeBox) list.get(i);
					plist.add(presumeBox);
				}
			} else {
				System.out.println("没有找到数据库中的记录");
			}
		}
		return plist;
	}
	
	public List<PResumeBox> QueryNotComment(int currentpage, int pagesize,int personId,String isGetJob,String isComment){
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PResumeBox presumeBox = null;
		List<?> list = null;
		List<PResumeBox> plist = new ArrayList<PResumeBox>();
		String hql = "from PResumeBox presumeBox where presumeBox.isComment =:isComment and and presumeBox.isGetJob =:isGetJob and presumeBox.person.pId =:personId order by sendId desc";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			query.setString("isComment",isComment);
			query.setString("isGetJob", isGetJob);
			query.setInteger("personId",personId);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("调用PResumeDao的QueryNotComment(int currentpage, int pagesize,int personId,String isComment)方法查询失败");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					presumeBox = (PResumeBox) list.get(i);
					plist.add(presumeBox);
				}
			} else {
				System.out.println("没有找到数据库中的记录");
			}
		}
		return plist;
	}
	
	public List<PResumeBox> QueryByPersonId(int currentpage, int pagesize,int personId,String isGet) {
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PResumeBox presumeBox = null;
		List<?> list = null;
		List<PResumeBox> plist = new ArrayList<PResumeBox>();
		String hql = "from PResumeBox presumeBo where presumeBo.isGetJob =:isGet and presumeBo.person.pId =:personId order by sendId desc";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			query.setString("isGet",isGet);
			query.setInteger("personId",personId);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("调用PResumeDao的Query(int currentpage, int pagesize,int personId)方法查询失败");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					presumeBox = (PResumeBox) list.get(i);
					plist.add(presumeBox);
				}
			} else {
				System.out.println("没有找到数据库中的记录");
			}
		}
		return plist;
	}

	@Override
	public Boolean Delete(PResumeBox t) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		try {
			PResumeBox pj = (PResumeBox) session.get(PResumeBox.class,
					new Integer(t.getSendId()));
			Transaction trans = session.beginTransaction();
			if (pj != null) {
				session.delete(pj);
			} else {
				System.out.println("没有找到Id=" + t.getSendId() + "的记录");
				return false;
			}
			trans.commit();
		} catch (Exception ex) {
			System.out.println("调用PResumeBoxDao的Delete(PResumeBox t)方法删除失败");
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
		String sql = "select count(sendId) from p_resume_box";
		List<?> list = session.createSQLQuery(sql).list();
		Object size = 0;
		for (int i = 0; i < list.size(); i++) {
			size = (Object) list.get(i);
		}
		return Integer.parseInt(size.toString());
	}


}
