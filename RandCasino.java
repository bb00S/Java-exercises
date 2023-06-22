/*The user enters the amount of money with which he comes to the casino, the amount of the bet and how much money he aims to win.
The player plays a game where in each game he has a 49% chance to double the bet, or lose it.
The program calculates the chances of winning the desired amount.
E.g. The player can come with 100 KM, and set the bet amount to 10 KM and try to win 1000 KM.
The program should calculate his chances of winning the amount.
For an approximate prediction, it is necessary to perform exactly 10,000 simulations.
Probability must be written in the range from 0 to 1 without the % sign
(eg for a probability of 50.2% it is necessary to print 0.502).*/

import java.util.Scanner;
import java.util.Random;
public class proba {
public static void main(String[] args) {
  Scanner unos=new Scanner(System.in);
  Random rn = new Random();
  double BROJ_SIM = 10000;
  int ulog = unos.nextInt();
  int opklada = unos.nextInt();
  int cilj = unos.nextInt();
  double broj_pobjeda = 0;
  for (int s=0;s<BROJ_SIM;s++) {
    double novac = ulog;
    while (novac > 0 && novac < cilj) {
      int a=(rn.nextInt(100)); 
      u rasponu od 0 do 99;
      if (a < 49){
        novac += opklada;
      }
      else {
        novac -= opklada;
      }
    }
    if (novac >= cilj){
    broj_pobjeda += 1;
    }
  }
  System.out.println(broj_pobjeda/BROJ_SIM);
}
}
