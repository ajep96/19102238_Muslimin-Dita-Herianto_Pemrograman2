package com.muslimin.pbo;

import java.util.Scanner;

public class demoIf {
    public static void main(String[] args) {
        int diskon = 0, totalBelanja;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Total Belanja : ");
        totalBelanja = input.nextInt();
        if (totalBelanja >= 100000) {
            diskon = totalBelanja / 10;
            System.out.println("Diskon : " + diskon);
        } else {
            System.out.println("Tidak dapat diskon");
        }

        int skorUjian;
        char nilai;
        System.out.print("Masukan Skor Ujian : ");
        skorUjian = input.nextInt();
        if (skorUjian >= 90) {
            nilai = 'A';
        } else if (skorUjian >= 80) {
            nilai = 'B';
        } else if (skorUjian >= 70) {
            nilai = 'C';
        } else {
            nilai = 'D';
        }
        System.out.println("Nilai = " + nilai);

        int nilaiUjian;
        System.out.println("Masukan nilai : ");
        nilaiUjian = input.nextInt();
        switch(nilaiUjian/10){
            case 10:
                System.out.println("A");
                break;
            case 9:
                System.out.println("Nilai : A");
                break;
            case 8:
                System.out.println("Nilai : B");
                break;
            case 7:
                System.out.println("Nilai : C");
                break;
            default:
                System.out.println("Nilai : D");
                break;
        }
    }
}
