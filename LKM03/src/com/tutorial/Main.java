package com.tutorial;

class karyawan {
    private String nama;
    private String jabatan;
    private double pajak;
    private double gajiPokok;
    private double gajiBersih;

    public karyawan(String nama, String jabatan, double gajiPokok) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.pajak = 0.1;
        this.gajiPokok = gajiPokok;
        hitungGajiBersih();
    }

    public double getGajiBersih() {
        return gajiBersih;
    }

    private void setGajiBersih(double gajiBersih) {
        this.gajiBersih = gajiBersih;
    }

    private void hitungGajiBersih() {
        setGajiBersih(gajiPokok - (gajiPokok * pajak));
    }

    public static void main(String[] args) {
        double gajipokok = 3500000;
        karyawan karyawan1 = new karyawan("adam", "dosen", gajipokok);

        System.out.println("Nama: " + karyawan1.nama);
        System.out.println("Jabatan: " + karyawan1.jabatan);
        System.out.println("Gaji pokok: " + karyawan1.gajiPokok);
        System.out.println("Pajak: " + karyawan1.pajak);
        System.out.println("Gaji Bersih: " + karyawan1.getGajiBersih());
    }
}
   
