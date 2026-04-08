package app;

import module.Mahasiswa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<Mahasiswa>();

        System.out.print("Masukan jumlah mahasiswa yang ingin anda input : ");
        int jumlah = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("============= Input mahasiswa ke - " + i);
            System.out.print("Masukan nama mahasiswa : ");
            String nama = input.nextLine();
        }
    }
}