package com.SafeSync.util;

 import org.hibernate.HibernateException;
 import org.hibernate.SessionFactory;
 import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable e) {
            System.out.println("Session created failed: " + e);
            throw new ExceptionInInitializerError();
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
}
