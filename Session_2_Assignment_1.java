

import java.util.*;
public class Session_2_Assignment_1
{
      //Problem 1
    static void checkEligibility(){
         int age;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter your age: ");
         age=sc.nextInt();
         if(age>=18)
         System.out.println("You are eligible to vote.");
         else
        System.out.println("You are not eligible to vote.");
   }
         public static void main(String[] args)
     {
          checkEligibility();
 }

}