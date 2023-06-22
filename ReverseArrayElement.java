/*The user enters the dimension of the array and then the two-digit integers as elements of the array.
It is necessary to check whether the last number entered in reverse (first and second digits replaced) appears among the previous numbers. 
If it is found, "YES" is printed, otherwise program prints "NO". For example, if six values were entered, and the last value is 32, 
when the digits of that number are reversed, we get the value 23. Therefore the program prints "Yes", if the value 23 is in the sequence.*/

import static java.lang.Math.*; 
import java.util.Arrays;
import java.util.Scanner;
public class proba {
public static int reverseNum (int obrnut[]) {
int n;
int reverseC=0;
reverseC=Math.abs(reverseC);
while (obrnut[obrnut.length-1]>0) {
n = obrnut[obrnut.length-1] % 10;
reverseC = (reverseC*10)+n;
obrnut[obrnut.length-1] = obrnut[obrnut.length-1]/10; 
}
return reverseC;
}
public static void main(String[] args) {
Scanner unos=new Scanner(System.in);
System.out.println("Unesite duzinu niza.");
int n = unos.nextInt(); 
int[] array = new int [n];
System.out.println("Unesite elemente u niz.");
for (int i=0;i<n;i++) {
array [i]=unos.nextInt();
}
int [] obrnut = new int [n];
for (int i=0;i<n;i++) {
obrnut[i]=array[i];
}
obrnut[n-1]=reverseNum(obrnut); 
boolean imaISTA = false;
for (int i=0;i<array.length;i++) {
if (obrnut[array.length-1]==array[i]) {
imaISTA = true;
break;
}
}
if (imaISTA==true) {
System.out.println("DA");
}
else {
System.out.println("NE");
}
}
}
