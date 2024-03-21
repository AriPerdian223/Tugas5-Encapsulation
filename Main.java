//NAMA  : ARI PERDIAN
//NIM   : 20220040072
//KELAS : TI22J

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data mahasiswa
        System.out.println("Masukkan nama mahasiswa:");
        String namaMahasiswa = scanner.nextLine();
        System.out.println("Masukkan alamat mahasiswa:");
        String alamatMahasiswa = scanner.nextLine();
        Student mahasiswa = new Student(namaMahasiswa, alamatMahasiswa);

        System.out.println("Masukkan jumlah mata kuliah yang diambil oleh mahasiswa:");
        int jumlahMataKuliahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline
        for (int i = 0; i < jumlahMataKuliahMahasiswa; i++) {
            System.out.println("Masukkan nama mata kuliah:");
            String mataKuliah = scanner.nextLine();
            System.out.println("Masukkan nilai untuk mata kuliah " + mataKuliah + ":");
            int nilai = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline
            mahasiswa.tambahMataKuliahDanNilai(mataKuliah, nilai);
        }

        // Input data dosen
        System.out.println("Masukkan nama dosen:");
        String namaDosen = scanner.nextLine();
        System.out.println("Masukkan alamat dosen:");
        String alamatDosen = scanner.nextLine();
        Teacher dosen = new Teacher(namaDosen, alamatDosen);

        System.out.println("Masukkan jumlah mata kuliah yang diajar oleh dosen:");
        int jumlahMataKuliahDosen = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline
        for (int i = 0; i < jumlahMataKuliahDosen; i++) {
            System.out.println("Masukkan nama mata kuliah yang diajar:");
            String mataKuliah = scanner.nextLine();
            dosen.tambahMataKuliah(mataKuliah);
        }

        // Output informasi
        System.out.println("\nInformasi Mahasiswa:");
        System.out.println(mahasiswa);
        mahasiswa.tampilkanNilai();
        System.out.println("Rata-rata nilai: " + mahasiswa.hitungRataRataNilai());

        System.out.println("\nInformasi Dosen:");
        System.out.println(dosen);
    }
    
}
