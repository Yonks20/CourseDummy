package org.project.Homework3;

public class Mahasiswa {
    public String nama;
    public String jurusan;
    public int angkatan;

    //Pakai Paramaterized Constructor
    public Mahasiswa(String nama, String jurusan, int angkatan) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }

    // Buat method untuk menampilkan info mahasiswa
    public void infoMahasiswa(){
        System.out.println("Nama Mahasiswa: " + this.nama);
        System.out.println("Jurusan Mahasiswa: " + this.jurusan);
        System.out.println("Angkat Mahasiswa: " + this.angkatan);
    }
}
