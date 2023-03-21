/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4;

/**
 *
 *
 */
public class student {
    String name;
    String  phone;
    String email;
    int id;
   int  average;
    adress[] location;

    public student(String name, String  phone, String email, int id, int average, adress[] location) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.id = id;
        this.average = average;
        this.location = location;
    }
    
    

  

        public void printinfo() {
         System.out.println("the name is :"+name);
         System.out.println("the phone is :"+phone);
        System.out.println("the email is :"+email);
        System.out.println("the id is :"+id);
        System.out.println("the average is :"+average);
        int n=1;
for(adress i:location){
    System.out.println(" address :"+n);
    i.printinfoA();
    n++;
}
    }
   
    }
     


     