package com.jzkjdataservice.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

@SuppressWarnings("deprecation")
public class HibernateUtil {
	private HibernateUtil(){};
	private static SessionFactory sessionFactory;
	static{  
        Configuration cfg = new Configuration();  
        cfg.configure();           
        @SuppressWarnings("deprecation")
		ServiceRegistry  sr = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();    
        sessionFactory = cfg.buildSessionFactory(sr);  
    }  
    public static SessionFactory getSessionFactory() {  
        return sessionFactory;  
    }  
    public static Session getSession(){  
        return sessionFactory.openSession();  
    }
    
}
