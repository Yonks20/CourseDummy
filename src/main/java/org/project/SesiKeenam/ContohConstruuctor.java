package org.project.SesiKeenam;

public class ContohConstruuctor {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Yonkie", "Sistem Informasi", 2019);

        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
        System.out.println("Nama Jurusan: " + mahasiswa.getJurusan());
        System.out.println("Angkatan : " + mahasiswa.getAngkatan());
        //langsung asssign value dari field yang ada di class Mahasiswa
    }
}
