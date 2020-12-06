/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.Scanner;

/**
 *
 * @author Tseegii
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
    String userInput;
    long answer=1;    

    Scanner myScanner=new Scanner(System.in);
    
    do{
    
    System.out.println("Please enter your a number");
    
    userInput = myScanner.nextLine();
    } while (!userInput.matches("[0-9]+"));
    
    int num = Integer.parseInt(userInput);
    
    for (int counter=num; counter>1; counter--){
        
        answer = answer*counter;
    }
    System.out.println("The factorial of " + num+ " is " + answer);
    }      
}   
  