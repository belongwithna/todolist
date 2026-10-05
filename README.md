# 📝 Aplikasi To-Do List Sederhana (Tugas OOP - Abstract, Interface & Polymorphism)

Aplikasi **To-Do List** berbasis Konsol/CLI yang dibuat menggunakan bahasa pemrograman **Java**. Aplikasi ini dirancang sebagai implementasi lengkap dari pemikiran berorientasi objek (*Object-Oriented Programming*), dengan menerapkan konsep **Encapsulation**, **Inheritance**, **Abstract Class**, **Interface**, dan **Polymorphism**.

---

## 🎯 Pembahasan Materi OOP Complete

Program ini menerapkan prinsip-prinsip utama OOP secara komprehensif:

1. **Interface (`KelolaTugas`)**: Kontrak/standar method (`tandaiSelesai`, `ubahPrioritas`) yang wajib diimplementasikan oleh kelas model.
2. **Abstract Class (`Tugas`)**: Kelas induk abstrak yang mengimplementasikan interface `KelolaTugas`. Menyediakan atribut umum (`protected`), method konkret, serta *abstract method* `tampilkanTugas()`.
3. **Inheritance & Sub Class**: `TugasKuliah` dan `TugasProyek` mewarisi properti dari `Tugas` menggunakan kata kunci `extends`.
4. **Polymorphism**: 
   - **Polymorphic Collection**: Penggunaan `ArrayList<Tugas>` yang mampu menampung berbagai tipe objek turunan (`TugasKuliah` dan `TugasProyek`).
   - **Dynamic Method Dispatch / Overriding**: Pemanggilan method `tampilkanTugas()` mengeksekusi logika spesifik milik masing-masing *child class* secara dinamis.
5. **Encapsulation**: Atribut khusus pada *child class* disembunyikan dengan modifier `private` dan diakses melalui method *getter/setter*.

---

## 🛠️ Struktur Kode

```text
├── KelolaTugas.java    # Java Interface (Kontrak Method)
├── Tugas.java          # Abstract Parent Class
├── TugasKuliah.java    # Sub Class 1 (Turunan dari Tugas)
├── TugasProyek.java    # Sub Class 2 (Turunan dari Tugas)
└── ToDoList.java       # Main Class (Implementasi Polymorphism & List)
```

---

## 💻 Kodingan Utama

### 1. `KelolaTugas.java` (Interface)
```java
public interface KelolaTugas {
    void tandaiSelesai();
    void ubahPrioritas(String prioritasBaru);
}
```

### 2. `Tugas.java` (Abstract Parent Class)
```java
public abstract class Tugas implements KelolaTugas {
    protected String namaTugas;
    protected String prioritas;
    protected boolean selesai;

    public Tugas() {
        this.selesai = false;
    }

    public void setTugas(String namaTugas) {
        this.namaTugas = namaTugas;
    }

    public String getTugas() {
        return namaTugas;
    }

    public String getPrioritas() {
        return prioritas;
    }

    @Override
    public void tandaiSelesai() {
        this.selesai = true;
        System.out.println(" Status tugas \"" + namaTugas + "\" diperbarui menjadi SELESAI.");
    }

    @Override
    public void ubahPrioritas(String prioritasBaru) {
        this.prioritas = prioritasBaru;
        System.out.println(" Prioritas tugas \"" + namaTugas + "\" diubah menjadi: " + prioritasBaru);
    }

    // Abstract Method: Wajib di-override oleh seluruh Child Class
    public abstract void tampilkanTugas();
}
```

### 3. `TugasKuliah.java` (Sub Class 1)
```java
public class TugasKuliah extends Tugas {
    private String namaMatkul;
    private String deadline;

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public void tampilkanTugas() {
        String status = selesai ? "[Selesai]" : "[Belum Selesai]";
        System.out.println(status + " [KULIAH] " + getTugas() + " | Matkul: " + namaMatkul + 
                           " | Deadline: " + deadline + " | Prioritas: " + getPrioritas());
    }
}
```

### 4. `TugasProyek.java` (Sub Class 2)
```java
public class TugasProyek extends Tugas {
    private String namaTim;
    private int estimasiJam;

    public void setNamaTim(String namaTim) {
        this.namaTim = namaTim;
    }

    public void setEstimasiJam(int estimasiJam) {
        this.estimasiJam = estimasiJam;
    }

    @Override
    public void tampilkanTugas() {
        String status = selesai ? "[Selesai]" : "[Belum Selesai]";
        System.out.println(status + " [PROYEK] " + getTugas() + " | Tim: " + namaTim + 
                           " | Est. Pengerjaan: " + estimasiJam + " Jam | Prioritas: " + getPrioritas());
    }
}
```

### 5. `ToDoList.java` (Main Class)
```java
import java.util.ArrayList;

public class ToDoList {
    public static void main(String[] args) {
        System.out.println("=== APLIKASI TO-DO LIST (ABSTRACT, INTERFACE & POLYMORPHISM) ===");

        TugasKuliah tugas1 = new TugasKuliah();
        tugas1.setTugas("Praktikum OOP Pertemuan 5");
        tugas1.ubahPrioritas("Tinggi");
        tugas1.setNamaMatkul("Pemrograman Berorientasi Objek");
        tugas1.setDeadline("Besok 23:59");

        TugasProyek tugas2 = new TugasProyek();
        tugas2.setTugas("Slicing UI Web E-Commerce");
        tugas2.ubahPrioritas("Sedang");
        tugas2.setNamaTim("Tim Frontend");
        tugas2.setEstimasiJam(12);

        // Polymorphic Collection
        ArrayList<Tugas> daftarTugas = new ArrayList<>();
        daftarTugas.add(tugas1);
        daftarTugas.add(tugas2);

        System.out.println("\n--- DAFTAR TUGAS AWAL ---");
        for (Tugas t : daftarTugas) {
            t.tampilkanTugas();
        }

        System.out.println("\n--- UPDATE STATUS TUGAS ---");
        daftarTugas.get(0).tandaiSelesai();

        System.out.println("\n--- DAFTAR TUGAS TERBARU ---");
        for (Tugas t : daftarTugas) {
            t.tampilkanTugas();
        }
    }
}
```

---

## 🚀 Cara Menjalankan Program

### Prasyarat
- Java Development Kit (JDK) versi 8 atau yang lebih baru.

### Langkah-Langkah

1. **Clone / Download** repository ini atau simpan seluruh file (`KelolaTugas.java`, `Tugas.java`, `TugasKuliah.java`, `TugasProyek.java`, dan `ToDoList.java`) dalam satu direktori.
2. Buka terminal/command prompt, lalu masuk ke direktori tersebut.
3. Kompilasi seluruh file program:
   ```bash
   javac *.java
   ```
4. Jalankan program utama:
   ```bash
   java ToDoList
   ```

---

## 🖥️ Contoh Output Program

```text
=== APLIKASI TO-DO LIST ===
 Prioritas tugas "Praktikum OOP Pertemuan 5" diubah menjadi: Tinggi
 Prioritas tugas "Slicing UI Web E-Commerce" diubah menjadi: Sedang

--- DAFTAR TUGAS AWAL ---
[Belum Selesai] [KULIAH] Praktikum OOP Pertemuan 5 | Matkul: Pemrograman Berorientasi Objek | Deadline: Besok 23:59 | Prioritas: Tinggi
[Belum Selesai] [PROYEK] Slicing UI Web E-Commerce | Tim: Tim Frontend | Est. Pengerjaan: 12 Jam | Prioritas: Sedang

--- UPDATE STATUS TUGAS ---
 Status tugas "Praktikum OOP Pertemuan 5" diperbarui menjadi SELESAI.

--- DAFTAR TUGAS TERBARU ---
[Selesai] [KULIAH] Praktikum OOP Pertemuan 5 | Matkul: Pemrograman Berorientasi Objek | Deadline: Besok 23:59 | Prioritas: Tinggi
[Belum Selesai] [PROYEK] Slicing UI Web E-Commerce | Tim: Tim Frontend | Est. Pengerjaan: 12 Jam | Prioritas: Sedang
```
