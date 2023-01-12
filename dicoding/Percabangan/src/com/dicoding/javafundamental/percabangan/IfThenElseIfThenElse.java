package com.dicoding.javafundamental.percabangan;

public class IfThenElseIfThenElse {

    public static void main(String[] args) {
        int nilaiUjian = 80;
        char nilaiHuruf;

        if (nilaiUjian >= 90) {
            nilaiHuruf = 'A';
        } else if (nilaiUjian >= 80) {
            nilaiHuruf = 'B';
        } else if (nilaiUjian >= 70) {
            nilaiHuruf = 'C';
        } else if (nilaiUjian >= 60) {
            nilaiHuruf = 'D';
        } else if (nilaiUjian >= 50) {
            nilaiHuruf = 'E';
        } else {
            nilaiHuruf = 'F';
        }
        System.out.println("Nilai ujian akhir anda adalah " + nilaiHuruf);
    }

}
