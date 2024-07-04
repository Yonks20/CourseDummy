package org.project.SesiKeenam;

public class Mahasiswa {
    private String nama;
    private String jurusan;
    private int angkatan;

    //GETTER
    public String getNama(){
        return nama;
    }

    public void setNama(String namaBaru){
        this.nama = namaBaru;
    }

    public String getJurusan(){
        return this.jurusan;
    }

    public void setJurusan(String jurusanBaru){
        this.jurusan = jurusanBaru;
    }

    public int getAngkatan(){
        return this.angkatan;
    }

    public void setAngkatan(int angkatanBaru){
        this.angkatan = angkatanBaru;
    }


    //default
    public Mahasiswa(){

    }

    //constructor
    // tidak memiliki void
    // tidak memiliki return value
    // nama method tergantung classnya, jika nama classnya mahasiswa maka methodnya juga mahasiswa

    //main dipanggil ketika running
    //constructor ketika object itu dibuat



    //constructor parameterized

    public Mahasiswa(String nama){
        this.nama = nama;
    }

    public Mahasiswa(int angkatan){
        this.angkatan = angkatan;
    }

    public Mahasiswa(String nama, String jurusan, int angkatan){
        this.nama = nama;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }

}
