/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tpp4;

/**
 *
 * @author kasmi lamia
 */
import java.util.Scanner;
public class Tpp4 {
  
    public static void main(String[] args) {
        System.out.println("task 5");
         Scanner input =new Scanner(System.in);
        adress adress1= new adress("absk","belaiba",0625,"algeria");
        adress adress2= new adress("mohamed","barika",0625,"algeria");
        adress location []={adress1,adress2};
                 
        student student1 =new student("lamia","0561201514","lkasmi",2,13, location);
        student1.printinfo();
            //  System.out.println(task6.get_numberofobject());
      //_____________________________________________________________________ :task6:
     
   
    }

}