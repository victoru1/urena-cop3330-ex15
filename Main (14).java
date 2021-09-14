/*
*  UCF COP3330 Fall 2021 Assignment 1 Solution
*  Copyright 2021 Victor Urena
*/

import java.util.Scanner;

public class Main {
  public static void main(String args[])
  {
    String knownPassword  = "abc$123";
      
    System.out.print("Enter your Username: ");
    Scanner s = new Scanner(System.in);
    String username = s.nextLine();
        
    System.out.print("What is the password? ");
    String password = s.nextLine();
             
    if(knownPassword.equals(password))
    {
      System.out.println("Welcome!");
    }

    else
    {
      System.out.println("I don't know you.");
    }
  }
}