package packagePrima;

import java.util.Scanner;

public class PrimaPutraA_Soal2 
{
	public static void main(String[] args)
	{
		int v, t, s;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Kecepatan Mobil = ");
		v = input.nextInt();
		
		System.out.print("Masukkan Berapa Jam Mobil Sudah Berjalan = ");
		t = input.nextInt();
		
		s = v*t;
		
		System.out.println("Dengan Kecepatan " + v + "km/h " + "dan Waktu Mobil Berjalan " + t + " Jam " + "Mobil Sudah Berjalan Sejauh " + s + "km" );
	}
}
