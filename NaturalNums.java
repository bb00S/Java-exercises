/*The user enters the natural numbers m and n one below the other. 
Then the user continues by entering m+n integers one below the other. 
Nikola got the first m numbers, and Petar got the other n. 
If it is possible for Peter to throw out one of his numbers 
so that the sums of Nikola's and Peter's numbers are equal, 
the program prints "yes", otherwise it prints "no".*/

import java.util.Scanner;
public class proba {
public static void main (String[] args) {
  Scanner unos=new Scanner(System.in);
  int m = unos.nextInt(); 
  int n = unos.nextInt(); 
  int [] nikola = new int [m];
  int [] petar = new int [n];
  int sumaNikolinih = 0;
  int sumaPetrovih = 0;
  
  for (int i=0;i<m;i++) {
    nikola [i]=unos.nextInt();
    sumaNikolinih += nikola[i];
  }
  
  for (int i=0;i<n;i++) {
    petar [i]=unos.nextInt();
    sumaPetrovih += petar[i];
  }
  
  System.out.print("Brojevi koje je dobio Nikola ");
  
  for(int i=0; i< n; i++) {
    System.out.print(nikola[i] +" ");
  }
  
  System.out.println("");
  System.out.print("Brojevi koje je dobio Petar ");
  
  for(int i=0; i< n; i++) {
    System.out.print(petar[i] +" ");
  }
  
  System.out.println("");
  int brojKojiPetarTrebaIzbaciti = sumaPetrovih - sumaNikolinih;
  boolean found = false;
  
  for(int i=0;i<petar.length;i++){
    if(petar[i] == brojKojiPetarTrebaIzbaciti){
    found = true;
  break;
  }
  }
  if (found==true) {
    System.out.println("jeste");
  }
  else {
    System.out.println("nije");
  }
}
}
