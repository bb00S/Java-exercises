/*The user enters real numbers one below the other. The end of the entry is indicated by a zero (0). Nikola and Stefan take the numbers alternately. 
The first number entered is Nikola's, the second Stefan's, the third Nikola's, the fourth Stefan's, etc. 
The program prints the difference of the sum of Nikola's numbers and the sum of Stefan's numbers.*/

import java.util.Scanner;
public class proba {
public static void main(String[] args) {
  Scanner unos=new Scanner(System.in);
  float a;
  a=unos.nextFloat();
  float stefan=0;
  float nikola=0;
  float brojac=0;
  while(a!=0){ {
    if (brojac%2==0){ 
      nikola+=a;
    }
    else{
      stefan+=a;
    }
    brojac+=1;
    a=unos.nextFloat();
    }
    System.out.println(nikola-stefan); 
  }
}
}
