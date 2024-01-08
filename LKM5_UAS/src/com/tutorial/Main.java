package com.tutorial;

// superclass Pegawai
class Pegawai {
    String nama;
    float gajiPokok;

    // Metode untuk menampilkan informasi pegawai
    void display() {
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}

// subclass PegawaiTetap yang mewarisi dari Pegawai
class PegawaiTetap extends Pegawai {
    float durasiLembur;
    float tunjangan;
    float gajiBersih;

    void setDurasiLembur(float durasi) {
        this.durasiLembur = durasi;
    }

    // hitung besaran lembur
    float hitungLembur() {
        return durasiLembur * (0.1f * gajiPokok); // Uang lembur perjam: 10% dari gaji pokok
    }

    // Setter untuk mengatur nilai tunjangan
    void setTunjangan(float nilaiTunjangan) {
        this.tunjangan = nilaiTunjangan;
    }
    
    // Metode untuk menghitung besaran tunjangan
    float hitungTunjangan() {
        return tunjangan;
    }

    // Metode untuk menghitung gaji bersih pegawai tetap
    float hitungGajiBersih() {
        float lembur = hitungLembur();
        float gajiBersihPegawaiTetap = gajiPokok + tunjangan + lembur;
        return gajiBersihPegawaiTetap;
    }

    // display untuk menampilkan informasi pegawai tetap
    void display() {
        super.display(); // Memanggil metode display dari superclass
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Durasi Lembur: " + durasiLembur);
        System.out.println("Gaji Bersih: " + hitungGajiBersih());
    }
}

// subclass PegawaiTidakTetap yang mewarisi dari Pegawai
class PegawaiTidakTetap extends Pegawai {
    float durasiLembur;
    float gajiBersih;

    // Setter untuk mengatur durasi lembur
    void setDurasiLembur(float durasi) {
        this.durasiLembur = durasi;
    }

    // Metode untuk menghitung besaran lembur
    float hitungLembur() {
        return durasiLembur * (0.05f * gajiPokok); // Uang lembur perjam: 5% dari gaji pokok
    }

    // Metode untuk menghitung gaji bersih pegawai tidak tetap
    float hitungGajiBersih() {
        float lembur = hitungLembur();
        float gajiBersihPegawaiTidakTetap = gajiPokok + lembur;
        return gajiBersihPegawaiTidakTetap;
    }

    // display untuk menampilkan informasi pegawai tidak tetap
    void display() {
        super.display(); // Memanggil metode display dari superclass
        System.out.println("Durasi Lembur: " + durasiLembur);
        System.out.println("Gaji Bersih: " + hitungGajiBersih());
    }
}


public class Main {
    public static void main(String[] args) {
        PegawaiTetap pegawaiTetap = new PegawaiTetap();
        pegawaiTetap.nama = "NURUL";
        pegawaiTetap.gajiPokok = 800000;
        pegawaiTetap.setTunjangan(0.7f * pegawaiTetap.gajiPokok);
        pegawaiTetap.setDurasiLembur(10);

        pegawaiTetap.display();
        System.out.println("=============");

        PegawaiTidakTetap pegawaiTidakTetap = new PegawaiTidakTetap();
        pegawaiTidakTetap.nama = "JIMIN";
        pegawaiTidakTetap.gajiPokok = 500000;
        pegawaiTidakTetap.setDurasiLembur(8);

        pegawaiTidakTetap.display();
    }
}