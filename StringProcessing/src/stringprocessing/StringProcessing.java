/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Eliza
 */
public class StringProcessing {

    /**
     * @param args the command line arguments
     */
    public class JavaApplication2 {
    public static boolean firstName(String firstName){
        String temp = firstName.toLowerCase();
         for (int i=0;i<firstName.length(); i++){
         if( Character.isDigit(firstName.charAt(i))){
           return true; 

         }
     }
     return false;
    }
    public static boolean lastName(String lastName){
        String temp = lastName.toLowerCase();
      for(int i=0;i<lastName.length(); i++){
         if(Character.isDigit(lastName.charAt(i)))
             return true;
      }
      return false;
    }
    public static boolean Gender(String Gender){
         String temp =Gender.toUpperCase();
         if (temp=="male"|| temp =="female"){
           return false;

         }
       return true;
    }
    public static boolean phoneNumber(String phoneNumber){
         String temp = phoneNumber.toLowerCase();
       for (int i=0;i<phoneNumber.length(); i++) {
       if (Character.isDigit(phoneNumber.charAt(i))){
           return false;
       }   
      }
       public static boolean email(String email){
         String temp = email.toLowerCase();
        for(int i=0;i<email.length(); i++){
        if(Character.isDigit(email.charAt(i))){
            return false;
        }
           return true;
        }
       
    
    }
    public static void main(String[] args) {
        String[] records = new String[100];
        

        try {

            Scanner reader = new Scanner(new File(args[0]));

            int currentIndex = 0;
            while (reader.hasNext()) {
                String[] line = reader.nextLine().split(",");

                String firstName = line[0];
                String lastName = line[1];
                String age = line[2];
                String gender = line[3];
                String phoneNumber = line[4];
                String email = line[5];
                records[currentIndex] = String.format(" %-20s%-10s-%10d-20s-10s%-20s-%30s", firstName,lastName,age,gender,phoneNumber);
                currentIndex++;
                System.out.println(records[currentIndex]);
                 currentIndex++;
                   if (firstName(firstName)){
                    System.out.print(firstName);
                    }
                      if (lastName(lastName)){
                    System.out.print(lastName);
                     }
                   if (Gender(gender)){
                     System.out.print(gender);
                        }
             
               
            }
        }
          
             
                     
             
        catch (FileNotFoundException ex) {
            System.err.println("Could not find input file");

        }
    }
    
}
