// Definisi kelas Manajer sebagai subclass dari Pegawai
public class Manajer extends Pegawai {
    private double tunjangan; // Kriteria: Atribut tambahan
    
    // Konstruktor untuk inisialisasi objek Manajer
    public Manajer(String nama, String jabatan, double gajiPokok, double tunjangan) {
        super(nama, jabatan, gajiPokok); // Memanggil konstruktor superclass
        this.tunjangan = tunjangan;
    }
    
    // Override metode untuk menghitung gaji total (contoh polymorphism)
    @Override
    public double hitungGajiTotal() {
        return super.hitungGajiTotal() + tunjangan;
    }
}
