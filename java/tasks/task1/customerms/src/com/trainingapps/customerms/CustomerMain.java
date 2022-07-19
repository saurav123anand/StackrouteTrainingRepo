package com.trainingapps.customerms;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customers[]=new Customer[2];
        Customer customer1=new RegularCustomer(1,"rc",21,34.7,"45.7%");
        BusinessCustomer customer2=new BusinessCustomer(2,"bc",22,45.8,34);
        customers[0]=customer1;
        customers[1]=customer2;
        for(Customer iterated:customers){
            long id=iterated.getId();
            String name=iterated.getName();
            int age= iterated.getAge();
            double balance= iterated.getBalance();
            System.out.println(id+" "+name+" "+age+" "+balance);
            boolean isRegularCustomer=iterated instanceof RegularCustomer;
            if(isRegularCustomer){
                RegularCustomer regularCustomer=(RegularCustomer) iterated;
                System.out.println("offer="+regularCustomer.getOffer());
            }
            else{
                BusinessCustomer businessCustomer=(BusinessCustomer) iterated;
                System.out.println("discount="+businessCustomer.getDiscount());
            }
        }

    }
}
