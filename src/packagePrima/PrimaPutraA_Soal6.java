package packagePrima;

import java.util.Scanner;

public class PrimaPutraA_Soal6 
{
	public static void main(String[]args)
	{
		//DEKLARASI
		String namaKaryawan;
		double gajiBersih, gajiPokok, pajak, tunjangan;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Nama Karyawan = ");
		namaKaryawan = input.nextLine();
		
		System.out.print("Masukkan Gaji Pokok = ");
		gajiPokok = input.nextDouble();
		
		tunjangan = gajiPokok * 0.20;
		pajak = (gajiPokok + tunjangan) * 0.025;
		
		gajiBersih = gajiPokok + tunjangan - pajak;
		
		System.out.println("Nama Karyawan : " + namaKaryawan);
		System.out.println("Gaji Pokok : " + gajiPokok);
		System.out.println("Tunjangan : " + tunjangan);
		System.out.println("Pajak : " + pajak);
		
		System.out.println("Berdasarkan Hasil Perhitungan, maka didapatkan Gaji Bersih Anda Sebesar " + gajiBersih);
		
		
	}
}
