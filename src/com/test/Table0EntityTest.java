package com.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


/**
 * Created by yexianshan on 2016/7/16.
 */
public class Table0EntityTest {
    private static Configuration configuration = null;
    private static SessionFactory sessionFactory = null;
    private static ServiceRegistry serviceRegistry = null;
    public static void main(String[] args){
        Table0Entity f = new Table0Entity();
        f.setIdtable0(2);
        f.setTable0Col("aa");
        f.setTable0Col1("bb");

        try {
            configuration = new Configuration().configure();
            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            Session session = sessionFactory.openSession();
            Transaction tran = session.beginTransaction();
            session.save(f);
            tran.commit();
        }
        catch (HibernateException e){
            e.printStackTrace();
        }

//        Configuration config = new Configuration().configure();
//        SessionFactory factory = config.configure().buildSessionFactory();
//        Session s = factory.openSession();
//
//
//        s.save(f);


    }
}
