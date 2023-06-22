/*The user enters a positive integer n. The program prints the length of the longest range in which all consecutive digits are greater than 4. In the following example, 
we have four ranges with digits greater than 4, namely: 7, 75, 786, 98. The longest range is 786, so its length is printed.*/

import java.util.Scanner;
public class proba {
public static void main(String[] args) {
  Scanner unos=new Scanner (System.in);
  long a = unos.nextLong();
  long max_raspon = 0;
  long t_raspon = 0;
  while (a > 0){
    long cifra = a % 10;
    if (cifra < 5) {
      if (t_raspon > max_raspon){
        max_raspon = t_raspon;
      }
      t_raspon = 0;
    }
    else{
      t_raspon += 1;
    }
    a /= 10;
  }
  if (t_raspon > max_raspon){
    max_raspon = t_raspon;
  }
  System.out.println(max_raspon);
}
}
