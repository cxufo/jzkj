package com.jzkjdataservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jzkjdataservice.db.DBoperator;
import com.jzkjdataservice.domain.PJob;
import com.jzkjdataservice.util.HibernateUtil;

public class PJobDao extends DBoperator<PJob> {

	@Override
	public Boolean Insert(PJob pjob) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = session.beginTransaction();
		try {
			session.save(pjob);
			trans.commit();
		} catch (Exception e) {
			System.out.println("PJobDao的Insert(PJob pjob)异常");
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public Boolean Update(PJob ptjob) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			PJob ptj = (PJob) session.get(PJob.class,
					new Integer(ptjob.getPtJobId()));
			if (ptj != null) {
				if (0 != ptjob.getTips().getTipsId())
					ptj.setTips(ptjob.getTips());
				if (null != ptjob.getJobTitle())
					ptj.setJobTitle(ptjob.getJobTitle());
				if (null != ptjob.getPtjType())
					ptj.setPtjType(ptjob.getPtjType());
				if (0 != ptjob.getrCount())
					ptj.setrCount(ptjob.getrCount());
				if (0 != ptjob.getbCount())
					ptj.setbCount(ptjob.getbCount());
				if (null != ptjob.getEducation())
					ptj.setEducation(ptjob.getEducation());
				if (null != ptjob.getJobExperiense())
					ptj.setJobExperiense(ptjob.getJobExperiense());
				if (null != ptjob.getMeetTime())
					ptj.setMeetTime(ptjob.getMeetTime());
				if (null != ptjob.getDetail())
					ptj.setDetail(ptjob.getDetail());
				if (null != ptjob.getPublishTime())
					ptj.setPublishTime(ptjob.getPublishTime());
				if (null != ptjob.getWage())
					ptj.setWage(ptjob.getWage());
				if (null != ptjob.getWorkPlace())
					ptj.setWorkPlace(ptjob.getWorkPlace());
				if (null != ptjob.getWorkTime())
					ptj.setWorkTime(ptjob.getWorkTime());
				if (null != ptjob.getSex())
					ptj.setSex(ptjob.getSex());
				if (null != ptjob.getAge())
					ptj.setAge(ptjob.getAge());
				if (null != ptjob.getJobSign())
					ptj.setJobSign(ptjob.getJobSign());
			} else {
				System.out.println("数据库中没有该记录");
				return false;
			}
			session.update(ptj);
			trans.commit();
		} catch (Exception ex) {
			System.out.println("PJobDao的Update(PJob ptjob)异常");
			ex.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public PJob QueryById(int id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PJob pjob = null;
		List<?> list = null;
		String hql = "from PJob pjob where pjob.ptJobId=:id";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setInteger("id", id);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out.println("PJobDao的QueryById(int id)异常");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					pjob = (PJob) list.get(i);
				}
			} else {
				System.out.println("数据库中没有记录");
			}

		}
		return pjob;
	}
    
	
	@Override
	public PJob QueryByName(String name) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PJob pjob = null;
		List<?> list = null;
		String hql = "from PJob pjob where pjob.jobTitle=:name";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setString("name", name);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out.println("PJobDao的QueryByName(String name)异常");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					pjob = (PJob) list.get(i);
				}
			} else {
				System.out.println("数据库中没有记录");
			}

		}
		return pjob;
	}

    /**
     * ��ѯ��ְ�ص�
     * @return ��ַ����
     */
	public List<String> QueryAllJobAdress(){
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		List<String> adresses = new ArrayList<String>();
		List<?> list = null;
		String hql = "select distinct pjob.workPlace from PJob pjob";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out.println("PJobDao的QueryAllJobAdress()异常");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					String str = (String) list.get(i);
					adresses.add(str);
				}
			} else {
				System.out.println("数据库中没有该记录");
			}

		}
		return adresses;	
	}
	
	/**
	 * ��ԃ�����r�g
	 * @return
	 */
	public List<String> QueryAllWorkTime(){
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		List<String> times = new ArrayList<String>();
		List<?> list = null;
		String hql = "select distinct pjob.workTime from PJob pjob";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out.println("PJobDao的QueryAllWorkTime()异常");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					String str = (String) list.get(i);
					times.add(str);
				}
			} else {
				System.out.println("数据库中没有该记录");
			}

		}
		return times;
	}
	
	/**
	 * ��ѯ��ְ��ǩ
	 * @return
	 */
	public List<String> QuerySign(){
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		List<String> signs = new ArrayList<String>();
		List<?> list = null;
		String hql = "select distinct pjob.jobSign from PJob pjob";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out.println("PJobDao的QueryAllWorkTime()异常");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					String str = (String) list.get(i);
					signs.add(str);
				}
			} else {
				System.out.println("数据库中没有该记录");
			}

		}
		return signs;
	}
	
	
	
	/**
	 * ��ݹ�˾Id��ѯ�ù�˾�����ļ�ְְλ
	 * 
	 * @param cId
	 * @return
	 */
	public List<PJob> QueryByCId(int cId) {
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PJob pjob = null;
		List<?> list = null;
		String hql = "from PJob pjob where pjob.company.cId=:cId";
		List<PJob> plist = new ArrayList<PJob>();
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setInteger("cId", cId);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out.println("PJobDao的QueryByCId(int cId)异常");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					pjob = (PJob) list.get(i);
					plist.add(pjob);
				}
			} else {
				System.out.println("PJobDao的QueryByCId(int cId)没有找到cId=" + cId
						+ "的记录");
			}

		}
		return plist;
	}

	public List<PJob> QueryByCId(int currentpage, int pagesize,int cId){
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PJob pjob = null;
		List<?> list = null;
		List<PJob> plist = new ArrayList<PJob>();
		String hql = "select pjob from PJob pjob where pjob.company.cId =:cId order by ptJobId desc";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			query.setInteger("cId", cId);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("PJobDao的Query(int currentpage, int pagesize)异常");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					pjob = (PJob)list.get(i);		
					plist.add(pjob);
				}
			} else {
				System.out.println("数据库中没有记录");
			}
		}
		return plist;
	}
	/**
	 * ��ѯ���,�����һ����ʼ��ѯ,��ѯ�������
	 * 
	 * @param currentpage
	 * @param pagesize
	 * @return
	 */
	public List<PJob> QueryPJob(int currentpage, int pagesize) {
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PJob pjob = null;
		List<?> list = null;
		List<PJob> plist = new ArrayList<PJob>();
		String hql = "select pjob.ptJobId,pjob.jobTitle,pjob.ptjType,pjob.workTime,"
				+ "pjob.workPlace,pjob.bCount,pjob.wage from PJob pjob order by ptJobId desc";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("PJobDao的Query(int currentpage, int pagesize)异常");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					pjob = new PJob();
					Object[] obj = (Object[]) list.get(i);
					pjob.setPtJobId((int) obj[0]);
					pjob.setJobTitle(obj[1].toString());
					pjob.setPtjType(obj[2].toString());
					pjob.setWorkTime(obj[3].toString());
					pjob.setWorkPlace(obj[4].toString());
					pjob.setbCount((int) obj[5]);
					pjob.setWage(obj[6].toString());
					plist.add(pjob);
				}
			} else {
				System.out.println("数据库中没有记录");
			}
		}
		return plist;
	}

	/**
	 * ��ݼ�ְ������
	 * 
	 * @param currentpage
	 * @param pagesize
	 * @param jobType
	 * @return
	 */
	public List<PJob> QueryByJobType(int currentpage, int pagesize,
			String jobType) {
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PJob pjob = null;
		List<?> list = null;
		List<PJob> plist = new ArrayList<PJob>();
		String hql = "select pjob.ptJobId,pjob.jobTitle,pjob.ptjType,pjob.workTime,"
				+ "pjob.workPlace,pjob.bCount,pjob.wage from PJob pjob where pjob.ptjType=:jobType order by ptJobId desc";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			query.setString("jobType", jobType);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("PJobDao的Query(int currentpage, int pagesize)异常");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					pjob = new PJob();
					Object[] obj = (Object[]) list.get(i);
					if (0 != (int) obj[0])
						pjob.setPtJobId((int) obj[0]);
					if (null != obj[1])
						pjob.setJobTitle(obj[1].toString());
					if (null != obj[2])
						pjob.setPtjType(obj[2].toString());
					if (null != obj[3])
						pjob.setWorkTime(obj[3].toString());
					if (null != obj[4])
						pjob.setWorkPlace(obj[4].toString());
					if (0 != (int) obj[5])
						pjob.setbCount((int) obj[5]);
					if (null != obj[6])
						pjob.setWage(obj[6].toString());
					plist.add(pjob);
				}
			} else {
				System.out.println("数据库中没有记录");
			}
		}
		return plist;
	}

	/**
	 * ��ݹ����ص��ѯְλ
	 * 
	 * @param currentpage
	 * @param pagesize
	 * @param workPlace
	 * @return
	 */
	public List<PJob> QueryByPlace(int currentpage, int pagesize,
			String workPlace) {
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PJob pjob = null;
		List<?> list = null;
		List<PJob> plist = new ArrayList<PJob>();
		String hql = "select pjob.ptJobId,pjob.jobTitle,pjob.ptjType,pjob.workTime,"
				+ "pjob.workPlace,pjob.bCount,pjob.wage from PJob pjob where pjob.workPlace like :place order by ptJobId desc";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			query.setString("place", "%"+workPlace+"%");
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("PJobDao的Query(int currentpage, int pagesize)异常");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					pjob = new PJob();
					Object[] obj = (Object[]) list.get(i);
					pjob.setPtJobId((int) obj[0]);
					pjob.setJobTitle(obj[1].toString());
					pjob.setPtjType(obj[2].toString());
					pjob.setWorkTime(obj[3].toString());
					pjob.setWorkPlace(obj[4].toString());
					pjob.setbCount((int) obj[5]);
					pjob.setWage(obj[6].toString());
					plist.add(pjob);
				}
			} else {
				System.out.println("数据库中没有该记录");
			}
		}
		return plist;
	}

	public List<PJob> QueryByTime(int currentpage, int pagesize, String workTime) {
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PJob pjob = null;
		List<?> list = null;
		List<PJob> plist = new ArrayList<PJob>();
		String hql = "select pjob.ptJobId,pjob.jobTitle,pjob.ptjType,pjob.workTime,"
				+ "pjob.workPlace,pjob.bCount,pjob.wage from PJob pjob where pjob.workTime like :workTime order by ptJobId desc";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			query.setString("workTime", "%"+workTime+"%");
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("PJobDao的Query(int currentpage, int pagesize)异常");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					pjob = new PJob();
					Object[] obj = (Object[]) list.get(i);
					if (0 != (int) obj[0])
						pjob.setPtJobId((int) obj[0]);
					if (null != obj[1])
						pjob.setJobTitle(obj[1].toString());
					if (null != obj[2])
						pjob.setPtjType(obj[2].toString());
					if (null != obj[3])
						pjob.setWorkTime(obj[3].toString());
					if (null != obj[4])
						pjob.setWorkPlace(obj[4].toString());
					if (0 != (int) obj[5])
						pjob.setbCount((int) obj[5]);
					if (null != obj[6])
						pjob.setWage(obj[6].toString());
					plist.add(pjob);
				}
			} else {
				System.out.println("数据库中没有记录");
			}
		}
		return plist;
	}

	public List<PJob> QueryBySign(int currentpage, int pagesize, String jobSign) {
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PJob pjob = null;
		List<?> list = null;
		List<PJob> plist = new ArrayList<PJob>();
		String hql = "select pjob.ptJobId,pjob.jobTitle,pjob.ptjType,pjob.workTime,"
				+ "pjob.workPlace,pjob.bCount,pjob.wage from PJob pjob where pjob.jobSign like :jobSign order by ptJobId desc";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			query.setString("jobSign", "%"+jobSign+"%");
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out.println("PJobDao的Query(int currentpage, int pagesize)异常");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					pjob = new PJob();
					Object[] obj = (Object[]) list.get(i);
					if (0 != (int) obj[0])
						pjob.setPtJobId((int) obj[0]);
					if (null != obj[1])
						pjob.setJobTitle(obj[1].toString());
					if (null != obj[2])
						pjob.setPtjType(obj[2].toString());
					if (null != obj[3])
						pjob.setWorkTime(obj[3].toString());
					if (null != obj[4])
						pjob.setWorkPlace(obj[4].toString());
					if (0 != (int) obj[5])
						pjob.setbCount((int) obj[5]);
					if (null != obj[6])
						pjob.setWage(obj[6].toString());
					plist.add(pjob);
				}
			} else {
				System.out.println("数据库中没有记录");
			}
		}
		return plist;
	}

	/**
	 * 
	 * @param currentpage ��ǰҳ��
	 * @param pagesize ҳ���С
	 * @param arg1 �ֶ���1
	 * @param arg2 ����
	 * @param arg3 �ֶ���2
	 * @param arg4 ����
	 * @return
	 */
	public List<PJob> QueryByTwo(int currentpage, int pagesize, String arg1,
			String arg2,String arg3,String arg4) {
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PJob pjob = null;
		List<?> list = null;
		List<PJob> plist = new ArrayList<PJob>();
		String hql = "select pjob.ptJobId,pjob.jobTitle,pjob.ptjType,pjob.workTime,"
				+ "pjob.workPlace,pjob.bCount,pjob.wage from PJob pjob where pjob."
				+ arg1
				+ " like '%"+arg2+"%'"
				+ " and pjob."
				+ arg3
				+ " like '%"+arg4+"%'"
				+ " order by ptJobId desc";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("PJobDao的Query(int currentpage, int pagesize)异常");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					pjob = new PJob();
					Object[] obj = (Object[]) list.get(i);
					if (0 != (int) obj[0])
						pjob.setPtJobId((int) obj[0]);
					if (null != obj[1])
						pjob.setJobTitle(obj[1].toString());
					if (null != obj[2])
						pjob.setPtjType(obj[2].toString());
					if (null != obj[3])
						pjob.setWorkTime(obj[3].toString());
					if (null != obj[4])
						pjob.setWorkPlace(obj[4].toString());
					if (0 != (int) obj[5])
						pjob.setbCount((int) obj[5]);
					if (null != obj[6])
						pjob.setWage(obj[6].toString());
					plist.add(pjob);
				}
			} else {
				System.out.println("数据库中没有该记录");
			}
		}
		return plist;
	}

	/**
	 * ����������ɸѡ��Ϣ
	 * @param currentpage ��ǰҳ
	 * @param pagesize ҳ���С
	 * @param arg1 �ֶ���1
	 * @param arg2����
	 * @param arg3 �ֶ���2
	 * @param arg4����
	 * @param arg5 �ֶ���3
	 * @param arg6����
	 * @return
	 */
	public List<PJob> QueryByThree(int currentpage, int pagesize, String arg1,
			String arg2,String arg3,String arg4,String arg5, String arg6) {
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PJob pjob = null;
		List<?> list = null;
		List<PJob> plist = new ArrayList<PJob>();
		String hql = "select pjob.ptJobId,pjob.jobTitle,pjob.ptjType,pjob.workTime,"
				+ "pjob.workPlace,pjob.bCount,pjob.wage from PJob pjob where pjob."
				+ arg1
				+ " like '%"+arg2+"%'"
				+ " and pjob."
				+ arg3
				+ " like '%"+arg4+"%'"
				+ " and pjob."
				+ arg5
				+ " like '%"+arg6+"%'"
				+ " order by ptJobId desc";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("PJobDao的Query(int currentpage, int pagesize)异常");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					pjob = new PJob();
					Object[] obj = (Object[]) list.get(i);
					if (0 != (int) obj[0])
						pjob.setPtJobId((int) obj[0]);
					if (null != obj[1])
						pjob.setJobTitle(obj[1].toString());
					if (null != obj[2])
						pjob.setPtjType(obj[2].toString());
					if (null != obj[3])
						pjob.setWorkTime(obj[3].toString());
					if (null != obj[4])
						pjob.setWorkPlace(obj[4].toString());
					if (0 != (int) obj[5])
						pjob.setbCount((int) obj[5]);
					if (null != obj[6])
						pjob.setWage(obj[6].toString());
					plist.add(pjob);
				}
			} else {
				System.out.println("数据库中没有该记录");
			}
		}
		return plist;
	}

	public List<PJob> QueryByFour(int currentpage, int pagesize, String type,
			String workPlace, String workTime, String jobSign) {
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PJob pjob = null;
		List<?> list = null;
		List<PJob> plist = new ArrayList<PJob>();
		String hql = "select pjob.ptJobId,pjob.jobTitle,pjob.ptjType,pjob.workTime,"
				+ "pjob.workPlace,pjob.bCount,pjob.wage from PJob pjob where pjob.ptjType=:type and pjob.workPlace like '%"
				+ workPlace
				+ "%' and "
				+ "pjob.workTime=:workTime and pjob.jobSign=:jobSign order by ptJobId desc";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			query.setString("type", type);
			query.setString("workTime", workTime);
			query.setString("jobSign", jobSign);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("PJobDao的Query(int currentpage, int pagesize)异常");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					pjob = new PJob();
					Object[] obj = (Object[]) list.get(i);
					if (0 != (int) obj[0])
						pjob.setPtJobId((int) obj[0]);
					if (null != obj[1])
						pjob.setJobTitle(obj[1].toString());
					if (null != obj[2])
						pjob.setPtjType(obj[2].toString());
					if (null != obj[3])
						pjob.setWorkTime(obj[3].toString());
					if (null != obj[4])
						pjob.setWorkPlace(obj[4].toString());
					if (0 != (int) obj[5])
						pjob.setbCount((int) obj[5]);
					if (null != obj[6])
						pjob.setWage(obj[6].toString());
					plist.add(pjob);
				}
			} else {
				System.out.println("数据库中没有该记录");
			}
		}
		return plist;
	}

	/**
	 * ��ҳ��ѯȫ������
	 */
	@Override
	public List<PJob> Query(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		int firstResult = (currentpage - 1) * pagesize;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		PJob pjob = null;
		List<?> list = null;
		List<PJob> plist = new ArrayList<PJob>();
		String hql = "from PJob pjob order by cId desc";
		try {
			trans = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstResult);
			query.setMaxResults(pagesize);
			list = query.list();
			trans.commit();
		} catch (Exception ex) {
			System.out
					.println("PJobDao的Query(int currentpage, int pagesize)异常");
			ex.printStackTrace();
			return null;
		} finally {
			if (list != null) {
				for (int i = 0; i < list.size(); i++) {
					pjob = (PJob) list.get(i);
					plist.add(pjob);
				}
			} else {
				System.out.println("数据库中没有该记录");
			}
		}
		return plist;
	}

	@Override
	public Boolean Delete(PJob pjob) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		try {
			PJob pj = (PJob) session.get(PJob.class,
					new Integer(pjob.getPtJobId()));
			Transaction trans = session.beginTransaction();
			if (pj != null) {
				session.delete(pj);
			} else {
				System.out.println("û���ҵ�Id=" + pjob.getPtJobId() + "�ļ�ְְλ");
				return false;
			}
			trans.commit();
		} catch (Exception ex) {
			System.out.println("����PJobDao��Delete(PJob pjob)����ɾ��ʧ��");
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
		String sql = "select count(ptJobId) from ptJob";
		List<?> list = session.createSQLQuery(sql).list();
		Object size = 0;
		for (int i = 0; i < list.size(); i++) {
			size = (Object) list.get(i);
		}
		return Integer.parseInt(size.toString());
	}

}
