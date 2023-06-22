/*Write a function that takes a multi-digit number n as a parameter and then sums all the digits of that number. 
If the sum itself is multi-digit, the process is repeated until a result containing only one digit is reached. 
E.g. for the value n = 987987987987, the function returns the value 6, because during the first addition of the digits,
the value 96 is obtained, which is multi-digit, so its digits are also added, and the value 15 is obtained, 
whose digits are added again and finally the value 6 is obtained. 
Also write the part a program that tests a function by taking a value from the user, 
then passing it to the function, which after the calculation prints the result.*/

import java.util.Scanner;
public class proba {
public static void main(String[] args) {
  Scanner unos=new Scanner(System.in);
  long n = unos.nextLong(); 
  long result=0;
  while (n > 9) {
    result = 0;
    while (n > 0) {
      result += n % 10;
      n/=10;
    }
    n = result;
  }
  System.out.println(result);
}
}
