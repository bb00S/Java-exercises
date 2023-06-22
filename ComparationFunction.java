/*Write a function that receives two numbers as parameters, the first of which is longer (has more digits). 
The function determines if the second number is in the first. The program prints the message "Found" if the second number is in the first
or "Not found" if the second number is not in the first. For the numbers 56789 and 678 the answer is "Found" or "true" 
because the consecutive digits of the number 678 appear consecutively in number 56789, while for numbers 76543 and 7665 the answer is "Not found" or "false". 
Also write a part of the program that tests the function by taking the values of these two numbers from the user and then passing them to the function. 
The program prints the message "Found" if the second number is in the first or "Not found" if the second number is not in the first.*/

import java.util.Scanner;
public class proba {
public static void main(String[] args) {
  Scanner unos=new Scanner(System.in);
  int a = unos.nextInt();
  int b = unos.nextInt();
  int temp = b; 
  int desetine = 1;
  while (temp != 0) { 
    desetine *= 10;
    temp /=10;
  }
  boolean seNalazi = false;
  while (a != 0) {
    temp = a % desetine;
    if (temp == b) {
      seNalazi = true;
      break;
    }
    a /= 10;
  }
  if (seNalazi==true) {
    System.out.println("Nalazi se");
  }
  else {
    System.out.println("Ne nalazi se");
  }
}
}
