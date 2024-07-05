# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan Manajemen Pegawai menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Proyek ini adalah aplikasi sederhana untuk manajemen pegawai yang ditulis dalam bahasa Java. Aplikasi ini mencakup tiga kelas utama: `Pegawai`, `Manajer`, dan `Main`.

• `Pegawai`: Kelas dasar yang merepresentasikan seseorang dengan atribut nama, jabatan dan gaji pokok. Kelas Pegawai juga merupakan superclass yang mewakili atribut dan perilaku umum dari seorang pegawai. 

• `Manajer`: Kelas `Manajer` adalah subclass dari `Pegawai` yang menambahkan atribut dan perilaku tambahan yang spesifik untuk Manajer.

•`Main`: Kelas `Main` adalah kelas utama yang digunakan untuk menguji aplikasi manajemen pegawai serta menyimpan daftar pegawai dan menyediakan metode untuk menambahkan dan menampilkan informasi pegawai. 

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Pegawai`, `Manajer`, dan `Main` adalah contoh dari class.

```bash
public class Pegawai {
    ...
}

public class Manajer extends Pegawai {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `pegawai1` dan `manajer1` adalah contoh pembuatan object.

```bash
Pegawai pegawai1 = new Pegawai("John Doe", "Staff", 5000000);
Manajer manajer1 = new Manajer("Jane Smith", "Manager", 8000000, 2000000);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `jabatan`, `gaji pokok` adalah contoh atribut. Atribut sendiri mendefinisikan properti dari class.

```bash
private String nama;
private String jabatan;
protected double gajiPokok;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object dan digunakan untuk menginisialisasi objek. Pada kode ini, constructor ada di dalam class `Pegawai` dan `Manajer`.

```bash
public Pegawai(String nama, String jabatan, double gajiPokok) {
    this.nama = nama;
    this.jabatan = jabatan;
    this.gajiPokok = gajiPokok;
}

public Manajer(String nama, String jabatan, double gajiPokok, double tunjangan) {
    super(nama, jabatan, gajiPokok); // Memanggil konstruktor superclass
    this.tunjangan = tunjangan;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setJabatan` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setJabatan(String jabatan) {
    this.jabatan = jabatan;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getJabatan`, adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getJabatan() {
    return jabatan;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `jabatan` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String jabatan;

public String getNama() {
    return nama;
}

public void setNama(String nama) {
    this.nama = nama;
}
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Manajer` mewarisi `Pegawai` dengan sintaks `extends`.

```bash
public class Manajer extends Pegawai {
    private double tunjangan;
    // metode tambahan untuk Manajer
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Overriding sendiri merupakan konsep mengganti metode dari superclass dalam subclass untuk memberikan implementasi spesifik.

```bash
@Override
public double hitungGajiTotal() {
    return super.hitungGajiTotal() + tunjangan;
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` pada class `Main`.

```bash
if (jawaban.equalsIgnoreCase("ya")) {
    try {
        Pegawai pegawaiBaru = new Pegawai("", "", 0);
        pegawaiBaru.inputData();
        daftarPegawai.add(pegawaiBaru);
    } catch (InputMismatchException e) {
        System.out.println("Input yang dimasukkan tidak valid.");
    }
} else {
    System.out.println("Terima kasih, tidak ada pegawai baru yang ditambahkan.");
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, perulangan digunakan untuk menampilkan daftar pegawai dan juga Menggunakan loop `for` untuk meminta input serta menampilkan data.

```bash
for (Pegawai pegawai : daftarPegawai) {
    pegawai.display();
    System.out.println();
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output. Metode `inputData` pada kelas `Pegawai` digunakan untuk menerima input dari pengguna.

```bash
public void inputData() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan Nama: ");
    this.nama = scanner.nextLine();
    System.out.print("Masukkan Jabatan: ");
    this.jabatan = scanner.nextLine();
    System.out.print("Masukkan Gaji Pokok: ");
    this.gajiPokok = scanner.nextDouble();
}
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. ArrayList digunakan untuk menyimpan daftar objek `Pegawai`.

```bash
ArrayList<Pegawai> daftarPegawai = new ArrayList<>();
daftarPegawai.add(pegawai1);
daftarPegawai.add(manajer1);
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    Pegawai pegawaiBaru = new Pegawai("", "", 0);
    pegawaiBaru.inputData();
    daftarPegawai.add(pegawaiBaru);
} catch (InputMismatchException e) {
    System.out.println("Input yang dimasukkan tidak valid.");
} catch (Exception e) {
    System.out.println("Terjadi kesalahan: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Ayu Atut Khofifah

NPM: 2210010553
