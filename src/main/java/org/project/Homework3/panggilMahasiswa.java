package org.project.Homework3;

import org.project.Homework3.Mahasiswa;

public class panggilMahasiswa {
    public static void main(String[] args) {
        Mahasiswa dataMhs = new Mahasiswa("Dilla", "Sistem Komputer", 2014);

        //panggil method infoMahasiswa() dari class Mahasiswa
        dataMhs.infoMahasiswa();
    }
}
