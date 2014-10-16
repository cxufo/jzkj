package com.jzkjdataservice.db;

import java.util.List;

public class DBoperator<T> implements IDBoperator<T>{

	@Override
	public Boolean Insert(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean Insert(List<T> t) {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public Boolean Update(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean Update(int pk, String content) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Boolean Update(List<T> t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T QueryById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T QueryByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public List<T> Query(int currentpage,int pagesize) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Boolean Delete(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean UpdateImage(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTableSize() {
		// TODO Auto-generated method stub
		return 0;
	}



}
