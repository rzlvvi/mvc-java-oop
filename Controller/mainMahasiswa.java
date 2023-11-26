package Controller;

import java.util.Scanner;

public class mainMahasiswa {

    static Scanner in = new Scanner(System.in);
    static ControllerMahasiswa controllerMahasiswa = new ControllerMahasiswa();


    public static void main(String[] args) {
        int pil;
        do{
            controllerMahasiswa.viewMenu();
            System.out.print(" Choose : "); pil = in.nextInt();
            switch(pil){
                case 1 :
                    controllerMahasiswa.addMahasiswa();
                    break;

                case 2 :
                    controllerMahasiswa.viewMahasiswa();
                    break;

                case 3 :
                    controllerMahasiswa.updateMahasiswa();
                    break;

                case 4 :
                    controllerMahasiswa.deleteMahasiwa();
                    break;

                case 0 :
                    System.out.println(" EXIT ");
                    break;
            }

        }while(pil != 4);

    }

}
