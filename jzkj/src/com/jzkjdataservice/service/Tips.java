package com.jzkjdataservice.service;

import com.jzkjdataservice.dao.TipsDao;
import com.jzkjdataservice.domain.Tip;
import com.jzkjdataservice.util.Json;

public class Tips {
   /**
    * 添加提示
    * @param tips
    * @return
    */
   public Boolean add(Tip tips){
	   TipsDao  dao = new TipsDao();
	   return dao.Insert(tips);
   }
   
   /**
    * 删除提示
    * @param tips
    * @return
    */
   public Boolean delete(Tip tips){
	   TipsDao  dao = new TipsDao();
	   return dao.Delete(tips);
   }
   /**
    * 更新提示
    * @param tips
    * @return
    */
   public Boolean update(Tip tips){
	   TipsDao dao = new TipsDao();
	   return dao.Update(tips);
   }
   
   public String queryTipsById(int Id){
	   TipsDao dao = new TipsDao();
	   return Json.toTipsJson(dao.QueryById(Id));
   }
   
   /**
    * 查询全部提示
    * @param currentpage
    * @param pagesize
    * @return
    */
   public String queryTips(int currentpage, int pagesize){
	   TipsDao dao = new TipsDao();
	   return Json.toTipsJson(dao.Query(currentpage, pagesize));
   }
   
   /**
    * 获得提示的条数
    * @return
    */
   public int size(){
	   TipsDao dao = new TipsDao();
	   return dao.getTableSize();
   }
}
