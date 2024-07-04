import java.util.Scanner;

// Definisi kelas Pegawai sebagai superclass
public class Pegawai {
    // Atribut dari kelas Pegawai
    private String nama;    // Kriteria: Atribut
    private String jabatan; // Kriteria: Atribut
    protected double gajiPokok; // Kriteria: Atribut untuk inheritance
    
    // Konstruktor untuk inisialisasi objek Pegawai
    public Pegawai(String nama, String jabatan, double gajiPokok) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }
    
    // Accessor untuk mengambil nilai atribut nama
    public String getNama() { // Kriteria: Accessor
        return nama;
    }
    
    // Mutator untuk mengubah nilai atribut nama
    public void setNama(String nama) { // Kriteria: Mutator
        this.nama = nama;
    }
    
    // Accessor untuk mengambil nilai atribut jabatan
    public String getJabatan() { // Kriteria: Accessor
        return jabatan;
    }
    
    // Mutator untuk mengubah nilai atribut jabatan
    public void setJabatan(String jabatan) { // Kriteria: Mutator
        this.jabatan = jabatan;
    }
    
    // Metode untuk menghitung gaji total pegawai (contoh polymorphism)
    public double hitungGajiTotal() { // Kriteria: Polymorphism
        return gajiPokok;
    }
    
    // Metode untuk menampilkan informasi pegawai
    public void display() {
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
    
    // Metode untuk input data pegawai
    public void inputData() { // Kriteria: IO Sederhana
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        this.nama = scanner.nextLine();
        System.out.print("Masukkan Jabatan: ");
        this.jabatan = scanner.nextLine();
        System.out.print("Masukkan Gaji Pokok: ");
        this.gajiPokok = scanner.nextDouble();
    }
}
