/*Write a program that asks the user to enter a five-digit number. 
The program checks whether the entered number is five-digit, and if so, 
calculates and prints the difference between its largest and smallest digits. 
If the number is not five-digit, the program prints the message: "Wrong entry!".*/

import java.util.Scanner;
public class proba {
public static void main(String[] args) {
Scanner unos=new Scanner(System.in);
int x=unos.nextInt();
if(x>9999&&x<100000)
{
int e=x%10; 
x=x/10;
int d=x%10;
x=x/10;
int c=x%10;
x=x/10;
int b=x%10;
x=x/10;
int a=x;
int tmax=a;
if(b>tmax){
tmax=b;}
if(c>tmax){
tmax=c;}
if(d>tmax){
tmax=d;}
if(e>tmax){
tmax=e;}
int tmin=a;
if(b<tmin){
tmin=b;}
if(c<tmin){
tmin=c;}
if(d<tmin){
tmin=d;}
if(e<tmin){
tmin=e;}
System.out.println(tmax-tmin);
}
else{
System.out.println("Pogresan unos!"); }
}
}
