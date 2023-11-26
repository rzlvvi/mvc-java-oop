package Mahasiswa;

import Controller.ControllerMahasiswa;
public class Mahasiswa {
    String npm;
    String nama;
    char jenis_kelamin;
    String alamat;
    String noTelp;
    String jurusan;

    public Mahasiswa() {

    }

    public Mahasiswa(String npm, String nama, char jenis_kelamin, String alamat, String noTelp, String jurusan) {
        this.npm = npm;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.jurusan = jurusan;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public char getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(char jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {

        return noTelp;
    }

    public void setNoTelp(String noTelp) {

        this.noTelp = noTelp;
    }

    public String getJurusan() {

        return jurusan;
    }

    public void setjurusan(String jurusan) {

        this.jurusan = jurusan;
    }

}