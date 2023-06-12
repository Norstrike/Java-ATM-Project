package ExceptionLearning;

import java.util.Scanner;

public class Student {
    public static void func() throws ArithmeticException{
        int num=10/0;
    }
    public static void main(String[] args) throws Exception {
     //   System.out.println("Enter the roll no");
      //  Scanner sc=new Scanner(System.in);
     //   int age = sc.nextInt();
      /*  try {
            if (age<5){
                throw new Exception("Invalid age!");
            } else if (age>18) {
                System.out.println("Your age is more than 5");
            }else {
                System.out.println("welcome");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

       */
     /*   try {
            if (age<0){
                throw new Exception("Enter Valid Roll No");
            }else {
                System.out.println("Valid Roll no");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

      */
        try {
            func();
        }catch (Exception e){
            System.out.println("Arithmetic exception thrown");
            System.out.println(e.getMessage());
        }


    }
}
