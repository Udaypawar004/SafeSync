package com.SafeSync.dao;

import com.SafeSync.modules.File;
import com.SafeSync.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class FileDAO {
    public void saveFile(File file) {
        Transaction transaction = null;

        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(file);
            transaction.commit();
        }
        catch(Exception ex) {
            if (transaction != null) transaction.rollback();
            ex.printStackTrace();
        }
    }

    public List<File> getFilesByUserId(int userId) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM File WHERE user.id = :userId", File.class)
                    .setParameter("userId", userId)
                    .list();
        }
    }
}
