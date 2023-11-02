package com.tutorial;

class Mahasiswa {
    // Data Member
    String nama;
    String nim;
    String prodi;
    
    // construktor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputProdi){
        this.nama = inputNama;
        this.nim = inputNIM;
        this.prodi = inputProdi;
    }
    


// method tanpa parameter dan tanpa return
void show() {
    System.out.println("nama : " + this.nama);
    System.out.println("NIM : " + this.nim);
    System.out.println("prodi : " + this.prodi);
}

// method tanpa return dengan parameter
void setNama(String nama) {
    this.nama = nama;
   
}

// method dengan return tanpa parameter
String getNama(){
    return this.nama;
}

// method dengan return dan parameter
String sayHi(String pesan){
    return pesan + "Aku adalah"+ this.nama;
}
}
public class Main {
    public static void main(String[] args) {
        // instansi objek
        Mahasiswa MHS1 = new Mahasiswa("baiq agisna", "22241013", "PTI");

        MHS1.show();
        MHS1.setNama("Jungkook");
        MHS1.show();
        System.out.println(MHS1.getNama());

        String pesan = MHS1.sayHi("Hallo");
        System.out.println(pesan);
    }
} 