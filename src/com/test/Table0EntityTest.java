package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Created by yexianshan on 2016/7/16.
 */
public class Table0EntityTest {
    public static void main(String[] args){
        Table0Entity f = new Table0Entity();
        f.setIdtable0(2);
        f.setTable0Col("aa");
        f.setTable0Col1("bb");


        Configuration config = new Configuration();
        SessionFactory factory = config.configure().buildSessionFactory();
        Session s = factory.openSession();


        s.save(f);


    }
}
