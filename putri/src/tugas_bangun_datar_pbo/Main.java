package tugas_bangun_datar_pbo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BangunDatar bd = new BangunDatar();

        int pilihan;

        System.out.println("=== KALKULATOR BANGUN DATAR ===");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Belah Ketupat");
        System.out.print("Pilih bangun datar: ");
        pilihan = input.nextInt();

        switch(pilihan){

            case 1:
                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();
                System.out.println("Luas Persegi = " + bd.luasPersegi(sisi));
                break;

            case 2:
                System.out.print("Masukkan panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = input.nextDouble();
                System.out.println("Luas Persegi Panjang = " + bd.luasPersegiPanjang(panjang, lebar));
                break;

            case 3:
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();
                System.out.println("Luas Segitiga = " + bd.luasSegitiga(alas, tinggi));
                break;

            case 4:
                System.out.print("Masukkan diagonal 1: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double d2 = input.nextDouble();
                System.out.println("Luas Belah Ketupat = " + bd.luasBelahKetupat(d1, d2));
                break;

            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }
}