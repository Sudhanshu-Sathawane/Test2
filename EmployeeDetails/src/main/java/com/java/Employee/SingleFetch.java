package com.java.Employee;

import javax.persistence.*;

import javax.persistence.criteria.*;

import com.java.jpa.Employee;

import java.util.*;

public class SingleFetch {

  public static void main( String args[]) {

     EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Employee_details" );

     EntityManager em = emf.createEntityManager();

    em.getTransaction().begin( );
    Employee e1=new Employee();
    e1.setempId(1);
    e1.setempName("Kamlesh");
    e1.setempDes("Manager");
    e1.setempSal(6000);
    Employee e2=new Employee();
    e2.setempId(2);
    e2.setempName("Ramesh");
    e2.setempDes("Labour");
    e2.setempSal(2000);
    em.persist(e1);
    em.persist(e2);

em.getTransaction().commit();

     em.close();

     emf.close();

     Employee emp=em.find(Employee.class,2);
     System.out.println("Details are");
     System.out.println("EmpNo: "+getempNo());
     System.out.println("EmpName: "+getempName());
     System.out.println("EmpDes: "+getempDes());
     System.out.println("EmpNo: "+getempSal());
   }

}
