package service;

import module.Mahasiswa;

public class MahasiswaService {
    public void getInfoMahasiswa(Mahasiswa mhs) {
        System.out.printf("""
                Nama    : %s
                Umur    : %d
                Jurusan : %s
                """, mhs.nama, mhs.umur, mhs.jurusan);
    }
}