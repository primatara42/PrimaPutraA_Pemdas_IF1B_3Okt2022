package packagePrima;

import java.util.Scanner;

public class PrimaPutraA_Soal4 
{
	public static void main(String[] args)
	{
		int jam, menit, detik, totalDetik;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Jam = ");
		jam = input.nextInt();
		
		System.out.print("Masukkan Menit = ");
		menit = input.nextInt();
		
		System.out.print("Masukkan Detik = ");
		detik = input.nextInt();
		
		jam = jam*3600;
		menit = menit*60;
		totalDetik = jam + menit + detik;
		
		System.out.print("Pelari Tersebut Berlari Selama " + totalDetik + " Detik");
		
	}
}
