package com.trainingapps.empms;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo=new Demo1();
        demo.runApp();
    }
    public void runApp(){
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("empms");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
        Employee employee1=new Employee("Surya",21);
        entityManager.persist(employee1);
        entityManager.persist(employee1);
        long employeeId= employee1.getId();
        transaction.commit();
        entityManager.close();
        System.out.println("displaying inserted employee");
        display(employee1);

        EntityManager entityManager2=entityManagerFactory.createEntityManager();
        Employee found=entityManager2.find(Employee.class,employeeId);
        System.out.println("found employee by id "+employeeId);
        display(found);
        entityManager2.close();

        EntityManager entityManager3=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager3.getTransaction();
        transaction


        entityManagerFactory.close();
    }
    void display(Employee employee){
        System.out.println("employee- "+employee.getId()+"-"+employee.getName()+"-"+employee.getAge());
    }
}
