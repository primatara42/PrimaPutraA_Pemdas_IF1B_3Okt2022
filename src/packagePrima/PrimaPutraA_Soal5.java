package packagePrima;

import java.util.Scanner;

public class PrimaPutraA_Soal5 
{
	public static void main(String[] args)
	{
		double tinggiBadan, bbIdeal;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Tinggi Badan Anda = ");
		tinggiBadan = input.nextDouble();
		
		bbIdeal = (tinggiBadan - 100) - (0.1 * (tinggiBadan - 100));
		
		System.out.println("Dengan Tinggi Badan Anda " + tinggiBadan + " cm, " + "maka berat badan ideal anda adalah " + bbIdeal + " kg");
		
		 
		
	}
}
