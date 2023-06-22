/*The user enters a natural number n, followed by n strings one below the other. 
The user should print any string that is of odd length and is longer than any previously entered string 
or any string that is of even length and is shorter than any previously entered string. 
You can assume that no string will be longer than 100.*/

import java.util.Scanner;
public class proba {
public static void main(String[] args) {
  Scanner unos=new Scanner(System.in);
  int n = unos.nextInt();
  int najduzi = 0;
  int najkraci = 101;
  for (int i=0;i<n;i++) {
    String s=unos.nextLine();
    if (s.length() % 2 == 1 && s.length() > najduzi)
    {
      System.out.println(s);
    }
    else if (s.length() % 2 == 0 && s.length() < najkraci)
    {
      System.out.println(s);
    }
    if (s.length() > najduzi) {
      najduzi = s.length();
    }
    if (s.length() < najkraci) {
      najkraci = s.length();
    }
  }
}
}
