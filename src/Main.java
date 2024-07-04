import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Kelas utama untuk menguji aplikasi Manajemen Pegawai
public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan kelas Pegawai
        Pegawai pegawai1 = new Pegawai("John Doe", "Staff", 5000000); // Membuat objek Pegawai
        
        System.out.println("Informasi Pegawai:");
        pegawai1.display(); // Memanggil metode display untuk menampilkan informasi pegawai
        
        // Menggunakan mutator untuk mengubah nilai atribut
        pegawai1.setJabatan("Senior Staff");
        System.out.println("\nInformasi Pegawai Setelah Perubahan Jabatan:");
        pegawai1.display();
        
        // Contoh penggunaan kelas Manajer
        Manajer manajer1 = new Manajer("Jane Smith", "Manager", 8000000, 2000000); // Membuat objek Manajer
        
        System.out.println("\nInformasi Manajer:");
        manajer1.display(); // Memanggil metode display untuk menampilkan informasi manajer
        
        // Menggunakan mutator untuk mengubah nilai atribut
        manajer1.setJabatan("Senior Manager");
        System.out.println("\nInformasi Manajer Setelah Perubahan Jabatan:");
        manajer1.display();
        
        // Menggunakan polymorphism untuk menghitung gaji total
        System.out.println("\nGaji Total Manajer:");
        System.out.println(manajer1.hitungGajiTotal());
        
        // Contoh penggunaan array untuk menyimpan objek Pegawai
        ArrayList<Pegawai> daftarPegawai = new ArrayList<>();
        daftarPegawai.add(pegawai1);
        daftarPegawai.add(manajer1);
        
        System.out.println("\nDaftar Pegawai:");
        for (Pegawai pegawai : daftarPegawai) {
            pegawai.display();
            System.out.println();
        }
        
        // Contoh penggunaan seleksi (if statement)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Apakah Anda ingin menambahkan pegawai baru? (ya/tidak): ");
        String jawaban = scanner.nextLine();
        
        if (jawaban.equalsIgnoreCase("ya")) {
            try {
                Pegawai pegawaiBaru = new Pegawai("", "", 0);
                pegawaiBaru.inputData(); // Memanggil metode inputData untuk memasukkan data pegawai baru
                daftarPegawai.add(pegawaiBaru);
                
                System.out.println("\nDaftar Pegawai Setelah Penambahan:");
                for (Pegawai pegawai : daftarPegawai) {
                    pegawai.display();
                    System.out.println();
                }
            } catch (InputMismatchException e) {
                System.out.println("Input yang dimasukkan tidak valid.");
                System.out.println("Terima kasih, tidak ada pegawai baru yang ditambahkan.");
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                System.out.println("Terima kasih, tidak ada pegawai baru yang ditambahkan.");
            }
        } else {
            System.out.println("Terima kasih, tidak ada pegawai baru yang ditambahkan.");
        }
    }
}
