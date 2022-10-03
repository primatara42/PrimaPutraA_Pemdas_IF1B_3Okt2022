package packagePrima;

import java.util.Scanner;

public class PrimaPutraA 
{
	public static void main(String[] args)
	{
		double x;
		int a, b, c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Nilai Variabel A : ");
		a = input.nextInt();
		
		System.out.print("Masukkan Nilai Variabel B : ");
		b = input.nextInt();
		
		System.out.print("Masukkan Nilai Variabel C : ");
		c = input.nextInt();
		
		x = (-b + (2*c*c) + (4*a*b)) / (2*c);
		
		System.out.println("Hasil Nilai X adalah " + x);
		
	}
}
