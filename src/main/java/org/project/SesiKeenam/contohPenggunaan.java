package org.project.SesiKeenam;

public class contohPenggunaan {

    int number = 0;

    Integer angka = null;

    public static void main(String[] args) {
//        String nama = "Yonkie";//Kondisi Awal
//
//        if(null != nama){
//            nama = "Yudha"; //Proses mengubah nilai
//        }
        // Akses class Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();

        //mengambil nilai
//        String namaMahasiswa = mahasiswa.getNama();


        // Menetapkan Nilai Awal
        mahasiswa.setNama("Yonkie Yudha");
        mahasiswa.setJurusan("Sistem Komputer");
        mahasiswa.setAngkatan(2014);

        // Mengambil Nilai
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
        System.out.println("Jurusan Mahasiswa: " + mahasiswa.getJurusan());
        System.out.println("Angkat Mahasiswa: " + mahasiswa.getAngkatan());


    }


}
