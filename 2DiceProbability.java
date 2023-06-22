/*Write a program that simulates rolling two dice. Dice have six sides and there are numbers from 1 to 6 on them. 
The program should calculate how many throws are needed on average, in order to get a number greater than 6 three times in a row.*/

import java.util.Scanner;
import java.util.Random; 
public class proba{
public static void main(String[] args) {
Scanner unos=new Scanner(System.in);
Random rn = new Random();
int sims = 10000;
int broj_bacanja = 0;
for (int i=0;i<sims;i++){
boolean b1 = false;
boolean b2 = false;
boolean b3 = false;
int broj = 0;
while (b1 == false || b2 == false || b3 == false) {
int min=1;
int max=6;
int k1 = (1+rn.nextInt(6)); 
int k2 = (1+rn.nextInt(6));
int k = k1 + k2;
broj +=1;
b1 = b2;
b2 = b3;
if (k > 6) {
b3 = true;}
else {
b3 = false;}
}
broj_bacanja += broj;
}
System.out.println(broj_bacanja / sims);
}
}
