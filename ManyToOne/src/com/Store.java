package com;    
  
import org.hibernate.*;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;    
    
public class Store {    
public static void main(String[] args) {    
      
    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
      
    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
    Session session=factory.openSession();  
      
    Transaction t=session.beginTransaction();    
        
    Employee e1=new Employee();    
    e1.setW_name("Ravi Malik");    
       
      
    Employee e2=new Employee();  
    e2.setW_name("Anuj Verma");  
     
        
    Address address1=new Address();    

    address1.setA_city("Noida");    
       
    address1.setA_country("India");     
        
    e1.setAddress(address1);    
    e2.setAddress(address1);  
  
    session.persist(e1);    
    session.persist(e2);  
    t.commit();    
        
    session.close();    
    System.out.println("success");    
}    
}    