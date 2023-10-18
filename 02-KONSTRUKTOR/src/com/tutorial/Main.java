package com.tutorial;

// class tampa kontruktor
   class polos {
        String datastring;
        int datainteger;

   }
    
// class dengan konstruktor
   class Mahasiswa {
       String nama;
       String nim;
       String prodi;

  
       // membuat konstruktor
    // mahasiswa() {
    //     System.out.println("ini adalah konstruktor");
    // }
   

     // Membuat konstruktor dengan parameter
     // mahasiswa() {
     //      system.out.println(" ini adalah konstruktor");
     //
               
     // Membuat konstruktor dengan parameter
     Mahasiswa(String inputnama, String inputnim, String inputprodi) {

        nama = inputnama;
        nim = inputnim;
        prodi = inputprodi;

        System.out.println("Nama: "+nama);
        System.out.println("NIM: "+nim);
        System.out.println("Prodi: "+prodi);
     }

    }
public class Main {
    public static void main(String[] args) {
//         polos pls = new polos ();
//         pls.datastring = "polos";
//         pls.datainteger = 10;

//           System.out.println("isi data string"+ pls.datastring);
//           System.out.println("isi data integer"+ pls.datainteger);

        new Mahasiswa("Nurul", "22241029", "PTI");
    }
// 
}

