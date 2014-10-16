package com.jzkjdataservice.db;

import java.util.List;

public interface IDBoperator<T> {
	public Boolean Insert(T t);
	public Boolean Insert(List<T> t);	
	public Boolean Delete(T t);
	public int getTableSize();
	public Boolean Update(T t);
	public Boolean Update(int pk,String content);
	public Boolean Update(List<T> t);
	public Boolean UpdateImage(T t);	
	public T QueryById(int id);
	public T QueryByName(String name);
	public List<T> Query(int currentpage,int pagesize);	
}
