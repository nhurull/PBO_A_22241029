package com.tutorial;
// Kelas Induk atau Superclass
class BangunDatar {
    public float hitungLuas() {
        return 0.0f;
    }

    public float hitungKeliling() {
        return 0.0f;
    }
}

// Subkelas Persegi
class Persegi extends BangunDatar {
    private float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }
    
    public float hitungLuas() {
        return sisi * sisi;
    }

    public float hitungKeliling() {
        return 4 * sisi;
    }

    public void display() {
        System.out.println("Persegi dengan sisi: " + sisi);
    }
}

// Subkelas Lingkaran
class Lingkaran extends BangunDatar {
    private float jariJari;
    private final float PI = 3.14f;

    public Lingkaran(float jariJari) {
        this.jariJari = jariJari;
    }
    public float hitungLuas() {
        return PI * jariJari * jariJari;
    }
    public float hitungKeliling() {
        return 2 * PI * jariJari;
    }
    public void display() {
        System.out.println("Lingkaran dengan jari-jari: " + jariJari);
    }
}

// Subkelas Persegi Panjang
class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;

    public PersegiPanjang(float panjang, float lebar) {
       this.panjang = panjang;
       this.lebar = lebar;
    }

    //Override
    public float hitungLuas() {
        return panjang * lebar;
    }

    //Override
    public float hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public void display() {
        System.out.println("Persegi Panjang dengan panjang: " + panjang + " dan lebar: " + lebar);
    }
}

// Subkelas Segitiga
class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;
    private float sisi1;
    private float sisi2;
    private float sisi3;

    public Segitiga(float alas, float tinggi, float sisi1, float sisi2, float sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    //Override
    public float hitungLuas() {
        return 0.5f * alas * tinggi;
    }

    //Override
    public float hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }

    public void display() {
        System.out.println("Segitiga dengan alas: " + alas + ", tinggi: " + tinggi +
                ", dan panjang sisi-sisi: " + sisi1 + ", " + sisi2 + ", " + sisi3);
    }
}

public class Main {
    public static void main(String[] args) {
        // Menggunakan kelas Persegi
        Persegi persegi = new Persegi(3.0f);
        persegi.display();
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());
        System.out.println();

        // Menggunakan kelas Lingkaran
        Lingkaran lingkaran = new Lingkaran(9.0f);
        lingkaran.display();
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());
        System.out.println();

        // Menggunakan kelas Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(6.0f, 8.0f);
        persegiPanjang.display();
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());
        System.out.println();

        // Menggunakan kelas Segitiga
        Segitiga segitiga = new Segitiga(3.0f, 4.0f, 5.0f, 6.0f, 8.0f);
        segitiga.display();
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());
    }
}
