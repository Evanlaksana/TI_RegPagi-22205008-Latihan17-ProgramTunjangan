/*
Nama : Evan Eka Laksana
 * Kelas : PBO1
 * NIM : 222050008
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Program Tunjangan
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan17;
import java.util.Scanner;
public class Latihan17 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("***********Program Tunjangan***********");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = scanner.nextDouble();

        System.out.print("Status Anda? (Menikah/Belum) ");
        String statusMenikah = scanner.next();

        double tunjangan = 0;
        if (statusMenikah.equalsIgnoreCase("Menikah")) {
            tunjangan = gajiPokok * 0.35;
        }

        double totalGaji = gajiPokok + tunjangan;

        System.out.println("--------Hasil Perhitungan Gaji Anda------");
        System.out.println("Gaji Pokok : Rp. " + gajiPokok);
        System.out.println("Tunjangan : Rp. " + tunjangan);
        System.out.println("Total Gaji : Rp. " + totalGaji);
    }
    }
   

    
    

