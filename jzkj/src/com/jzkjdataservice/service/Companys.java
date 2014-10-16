package com.jzkjdataservice.service;

import java.util.List;

import com.jzkjdataservice.dao.CompanyDao;
import com.jzkjdataservice.domain.Company;

public class Companys {
	/**
	 * 更新公司信息
	 * @param company
	 * @return
	 */
    public Boolean update(Company company){
	 CompanyDao dao = new CompanyDao();
	 return dao.Update(company);
    }
    
    /**
     * 删除公司
     * @param companyId
     * @return
     */
    public Boolean delete(int companyId){
    	CompanyDao dao = new CompanyDao();
    	Company c = new Company();
    	c.setcId(companyId);
    	return dao.Delete(c);
    }
    
    /**
     * 根据Id查询企业
     * @param companyId
     * @return
     */
    public Company queryById(int companyId){
    	CompanyDao dao = new CompanyDao();
    	return dao.QueryById(companyId);
    }
    
    /**
     * 查询所有公司
     * @param currentpage
     * @param pagesize
     * @return
     */
    public List<Company> query(int currentpage, int pagesize){
    	CompanyDao dao = new CompanyDao();
    	return dao.Query(currentpage, pagesize);
    }
    
    /**
     * 根据1个条件查询
     * @param currentpage
     * @param pagesize
     * @param arg1 字段名
     * @param value 值
     * @return
     */
    public List<Company> query(int currentpage,int pagesize,String arg1,String value){
    	CompanyDao dao = new CompanyDao();
    	return dao.Query(currentpage, pagesize, arg1, value);
    }  
    
    /**
     * 根据2个条件查询
     * @param currentpage
     * @param pagesize
     * @param arg1 属性名1
     * @param value1 值1
     * @param arg2 属性名2
     * @param value2 值2
     * @return 返回的值为公司信息
     */
    public List<Company> query(int currentpage,int pagesize,String arg1,String value1,String arg2,String value2){
    	CompanyDao dao = new CompanyDao();
    	return dao.Query(currentpage, pagesize, arg1, value1,arg2,value2);
    }    
    
    /**
     * 计算注册公司数目
     * @return
     */
    public int size(){
    	CompanyDao dao = new CompanyDao();
    	return dao.getTableSize();
    }
    
   
}
