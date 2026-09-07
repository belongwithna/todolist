# 📝 Aplikasi To-Do List Sederhana (Tugas OOP - Pertemuan 3)

Aplikasi **To-Do List** berbasis Konsol/CLI yang dibuat menggunakan bahasa pemrograman **Java**. Aplikasi ini dirancang sebagai implementasi fondasi dasar dari pemikiran berorientasi objek (*Object-Oriented Programming*).

---

## 🎯 Pembahasan Materi Pertemuan 3

Program ini menerapkan 6 konsep dasar OOP yang telah dipelajari pada Pertemuan 3:

1. **Class**: `Tugas` bertindak sebagai blueprint/cetakan untuk setiap item tugas.
2. **Field**: Variabel `namaTugas`, `prioritas`, dan `selesai` sebagai status/state dari objek.
3. **Constructor**: `public Tugas(...)` digunakan untuk inisialisasi data awal saat objek dibuat.
4. **Method**: `tandaiSelesai()` dan `tampilkanTugas()` sebagai perilaku/aksi (*behavior*) objek.
5. **Object Instantiation**: Menggunakan kata kunci `new` untuk mengalokasikan memori objek.
6. **Object**: Instance nyata seperti `tugas1` dan `tugas2` yang memegang data spesifik.

---

## 🛠️ Struktur Kode

```text
├── Main.java          # Kelas utama yang mengeksekusi program (main method)
└── Tugas.java         # Kelas model/blueprint untuk item tugas
```

> *Catatan: Jika kode digabung dalam satu file, pastikan nama file sesuai dengan kelas `public` (`Main.java`).*

---

## 💻 Potongan Kode Tugas

```java
// Implementasi Class, Field, Constructor, dan Method
class Tugas {
    String namaTugas;
    String prioritas;
    boolean selesai;

    public Tugas(String namaTugas, String prioritas) {
        this.namaTugas = namaTugas;
        this.prioritas = prioritas;
        this.selesai = false;
    }

    public void tandaiSelesai() {
        this.selesai = true;
        System.out.println(" Status tugas \"" + namaTugas + "\" diperbarui menjadi SELESAI.");
    }

    public void tampilkanTugas() {
        String status = selesai ? "[Selesai]" : "[Belum Selesai]";
        System.out.println(status + " " + namaTugas + " | Prioritas: " + prioritas);
    }
}
```

---

## 🖥️ Contoh Output Program

```text
=== APLIKASI TO-DO LIST ===

--- DAFTAR TUGAS AWAL ---
[Belum Selesai] Kerjakan Tugas OOP Pertemuan 3 | Prioritas: Tinggi
[Belum Selesai] Beli Bahan Makanan | Prioritas: Rendah

--- UPDATE STATUS TUGAS ---
 Status tugas "Kerjakan Tugas OOP Pertemuan 3" diperbarui menjadi SELESAI.

--- DAFTAR TUGAS TERBARU ---
[Selesai] Kerjakan Tugas OOP Pertemuan 3 | Prioritas: Tinggi
[Belum Selesai] Beli Bahan Makanan | Prioritas: Rendah
```
