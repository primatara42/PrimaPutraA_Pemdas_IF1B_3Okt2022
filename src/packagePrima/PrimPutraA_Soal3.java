package packagePrima;

import java.util.Scanner;

public class PrimPutraA_Soal3 
{
	public static void main(String[] args)
	{
		int a, b, c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Variabel A = ");
		a = input.nextInt();
		
		System.out.print("Masukkan Variabel B = ");
		b = input.nextInt();
		
		System.out.println("Nilai Variabel A Adalah = " + a);
		System.out.println("Nilai Variabel B Adalah = " + b);
		
		c = a;
		
		a = b;
		b = c;
		
		System.out.println("Nilai Variabel A Sekarang Adalah = " + a);
		System.out.println("Nilai Variabel B Sekarang Adalah = " + b);
	}
}
