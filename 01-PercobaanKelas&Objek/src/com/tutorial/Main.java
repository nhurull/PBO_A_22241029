package com.tutorial;

class Mahasiswa {
    String nama;
    String NIM;
    String Prodi;
}


public class Main {
    public static void main(String[] args) {
        // instansiasi pembuatan objek
        Mahasiswa mhs1 = new Mahasiswa();

        //objek mhs1 diberi atribut
        mhs1.nama = "Nurul Khatima";
        mhs1.NIM = "22241029";
        mhs1.Prodi = "PTI";

        System.out.println("Nama Mahasiswa :" + mhs1.nama);
        System.out.println("NIM :" + mhs1.NIM); 
        System.out.println("Program Studi :" + mhs1.Prodi);

        //instantsiasi pembuatan objek
        Mahasiswa mhs2 = new Mahasiswa();

        //objek mhs2 diberi atribut
        mhs2.nama = "Jimin";
        mhs2.NIM = "222410101";
        mhs2.Prodi = "Bahasa Inggris";

        System.out.println("Nama Mahasiswa :" + mhs2.nama);
        System.out.println("NIM :" + mhs2.NIM); 
        System.out.println("Program Studi :" + mhs2.Prodi);

    }
}
