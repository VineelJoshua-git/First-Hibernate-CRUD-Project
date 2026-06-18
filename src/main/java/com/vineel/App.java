package com.vineel;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Product p = new Product(102, "Laptop", 55000);

        session.persist(p);

        tx.commit();
        session.close();

        System.out.println("Product Saved!");
    }
}