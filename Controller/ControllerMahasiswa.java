package Controller;

import Mahasiswa.Mahasiswa;
import java.util.Scanner;
import java.util.ArrayList;

public class ControllerMahasiswa {

    static Scanner in = new Scanner(System.in);

    static ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
    static Mahasiswa mhs = new Mahasiswa();

    static void viewMenu(){
        System.out.println("");
        System.out.println("=======================================");
        System.out.println("|               M E N U               |");
        System.out.println("=======================================");
        System.out.println("|1. Add Mahasiswa                     |");
        System.out.println("|2. View Mahasiswa                    |");
        System.out.println("|3. Update Mahasiswa                  |");
        System.out.println("|4. Delete Mahasiswa                  |");
        System.out.println("|0. Exit (0)                          |");
        System.out.println("=======================================");
    }

    static void addMahasiswa(){
        System.out.println("");
        System.out.println("=======================================");
        System.out.println("|          TAMBAH MAHASISWA           |");
        System.out.println("=======================================");

        System.out.print("Npm Mahasiswa         : "); String npm = in.nextLine();
        System.out.print("Nama Mahasiswa        : "); String nama = in.nextLine();
        System.out.print("Gender Mahasiswa(L/P) : "); char gender = in.next().charAt(0);in.nextLine();
        System.out.print("Alamat Mahasiswa      : "); String alamat = in.nextLine();
        System.out.print("No Telp Mahasiswa     : "); String noTelp = in.nextLine();
        System.out.print("Jurusan Mahasiswa     : "); String jurusan = in.nextLine();

        Mahasiswa listMhs = new Mahasiswa(
                npm,
                nama,
                gender,
                alamat,
                noTelp,
                jurusan);

        listMahasiswa.add(listMhs);

        System.out.println("");
        System.out.println("      [v] DATA MAHASISWA SUKSES SUKSES !");
    }

    static void viewMahasiswa(){
        System.out.println("");
        System.out.println("=======================================");
        System.out.println("|           LIST MAHASISWA            |");
        System.out.println("=======================================");

        for(int i = 0; i < listMahasiswa.size(); i++){

            System.out.println("=======================================");
            System.out.println(" [Mahasiswa Ke " + (i+1) + "]");
            System.out.println("=======================================");
            System.out.println(" Npm Mahasiswa         : " + listMahasiswa.get(i).getNpm());
            System.out.println(" Nama Mahasiswa        : " + listMahasiswa.get(i).getNama());
            System.out.println(" Gender Mahasiswa      : " + listMahasiswa.get(i).getJenis_kelamin());
            System.out.println(" Alamat Mahasiswa      : " + listMahasiswa.get(i).getAlamat());
            System.out.println(" No Telp Mahasiswa     : " + listMahasiswa.get(i).getNoTelp());
            System.out.println(" Jurusan Mahasiswa     : " + listMahasiswa.get(i).getJurusan());
        }

    }

    static void updateMahasiswa(){

        viewMahasiswa();

        System.out.println("");
        System.out.println("=======================================");
        System.out.println("|          UPDATE  MAHASISWA          |");
        System.out.println("=======================================");

        System.out.print(" Masukkan nomor data yang ingin diupdate : ");
        int no = in.nextInt();

        if ((no >= 1) && (no <= listMahasiswa.size())){
            in.nextLine();
            System.out.print(" Npm Mahasiswa         : "); String npm = in.nextLine();
            System.out.print(" Nama Mahasiswa        : "); String nama = in.nextLine();
            System.out.print(" Gender Mahasiswa      : "); char gender = in.next().charAt(0); in.nextLine();
            System.out.print(" Alamat Mahasiswa      : "); String alamat = in.nextLine();
            System.out.print(" No Telp Mahasiswa     : "); String noTelp = in.nextLine();
            System.out.print(" Jurusan Mahasiswa     : "); String jurusan = in.nextLine();

            Mahasiswa mahasiswa = listMahasiswa.get(no - 1);
            mahasiswa.setNpm(npm);
            mahasiswa.setNama(nama);
            mahasiswa.setJenis_kelamin(gender);
            mahasiswa.setAlamat(alamat);
            mahasiswa.setNoTelp(noTelp);
            mahasiswa.setjurusan(jurusan);

            System.out.println("");
            System.out.println("      [v] DATA SUKSES DIPERBARUI !");
        } else {
            System.out.println("");
            System.out.println("      [!] DATA GAGAL DIPERBARUI !");
        }
    }

    static void deleteMahasiwa(){

        viewMahasiswa();

        System.out.println("");
        System.out.println("=======================================");
        System.out.println("|           DELETE  MAHASISWA         |");
        System.out.println("=======================================");

        System.out.print(" Masukkan nomor data yang ingin dihapus : "); int no = in.nextInt(); in.nextLine();

        if (no >= 1 && no <= listMahasiswa.size()){
            listMahasiswa.remove(no-1);
            System.out.println("");
            System.out.println("      [v] DATA SUKSES DIPERBARUI !");
        } else {
            System.out.println("");
            System.out.println("      [!] DATA SUKSES DIPERBARUI !");
        }
    }
}