package com.sai.Hiber;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
       Alien a= new Alien();
       a.setAid(001);
       a.setAname("pradeep");
       a.setColor("pink");
       
       Configuration con =new Configuration().configure().addAnnotatedClass(Alien.class);
      System.out.println("asasaaaaaassssssaaa"); 
     SessionFactory sf=con.buildSessionFactory();//the line indicate this method is deprecated we have to use other method
       Session session=sf.openSession();
       Transaction tx=session.beginTransaction();
      
      session.save(a);
      tx.commit();
    }
}
