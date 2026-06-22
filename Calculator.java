
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Calculator {
    Scanner input = new Scanner(System.in);
    
    private int num1;
    private int num2;
     public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        if(num1<0){
            System.out.println("invalid number please enter positive number:!");
            num1= input.nextInt();
        }
        
        this.num1 = num1;
    }

    public int getNum2() {
         
        
        return num2;
    }

    public void setNum2(int num2) {
         if(num2<0){
            System.out.println("invalid number please enter positive number:!");
            num1= input.nextInt();
        }
        this.num2 = num2;
    }
    
    public void Addition(){
        int result = num1 + num2;
        System.out.println("the addition of num1 and num2 is :"+result);
       
        
    }
    public void Substrstion(){
        int result = num1 -  num2;
        System.out.println("the Substrstion of num1 and num2 is :"+result);
       
        
    }
    public void Multiplication(){
        int result = num1 * num2;
        System.out.println("the Multiplication of num1 and num2 is :"+result);
       
        
        
    } 
     public void Division(){
          if (num2==0){
              System.out.println(" error division by zero"+num2);
          } else {
               int result = num1 / num2;
        System.out.println("the Division of num1 and num2 is :"+result);
          }
     }

    

   
     
}
