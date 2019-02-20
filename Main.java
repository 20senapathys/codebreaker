import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;

class Main{
  /*Setup*/
  public static void main (String str[]) throws IOException {
  Scanner scan = new Scanner(System.in);
  
  int x = 1;
  
  /*Shall we start?*/
  System.out.println("Welcome. What is your name?");
  String name = scan.nextLine();
  System.out.println("Hello " + name + ". Try your best to crack the code!");
  
  while (x != 1);
  /*PHASE 1*/
  System.out.println("PHASE 1");
  System.out.println("Enter a number:");
  int a = scan.nextInt();
  
  if (a == 3) {
  System.out.println("Correct!");
  
  /*PHASE 2*/
  System.out.println("PHASE 2");
  System.out.println("Enter a number:");
  int b = scan.nextInt();
  
  if (b == 1 || b >= 33 && b <= 100) {
    System.out.println("Correct!"); 
    
    /*PHASE 3*/
    System.out.println("PHASE 3");
    System.out.println("Enter a number:");
    int c = scan.nextInt();
    double crem3 = c % 3;
    double crem7 = c % 7;
    
    if ((c > 0 && crem3 == 0) || (c > 0 && crem7 == 0)) {
      System.out.println("Correct!");  
      System.out.println("You have cracked the code!");
      x++;
    }  
    
    else {
      System.out.println("Sorry, that was incorrect!");
      System.out.println("Better luck next time!"); 
      x++;
    }  
  }  
  else {
    System.out.println("Sorry, that was incorrect!");
    System.out.println("Better luck next time!");
    x++;
  } 
  
  }
  else {
  System.out.println("Sorry, that was incorrect!");
  System.out.println("Better luck next time!");
  x++;
  }  
  
  

}
}
