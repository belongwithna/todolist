# 📝 Aplikasi To-Do List Sederhana (Tugas OOP - Inheritance)

Aplikasi **To-Do List** berbasis Konsol/CLI yang dibuat menggunakan bahasa pemrograman **Java**. Aplikasi ini dirancang sebagai implementasi fondasi dasar dari pemikiran berorientasi objek (*Object-Oriented Programming*), khususnya penerapan konsep **Inheritance (Pewarisan)**.

---

## 🎯 Pembahasan Materi Pertemuan 5

Program ini menerapkan konsep-konsep OOP yang telah dipelajari, dengan fokus utama pada **Inheritance**:

1. **Super Class (Parent Class)**: `Tugas` berfungsi sebagai kelas induk yang menyimpan atribut umum (`namaTugas`, `prioritas`, `selesai`) dan method bawaan (`tandaiSelesai`).
2. **Sub Class (Child Class)**: `TugasKuliah` dan `TugasProyek` mewarisi properti dari `Tugas` menggunakan kata kunci `extends`, serta menambahkan atribut spesifik masing-masing.
3. **Access Modifier (`protected`)**: Digunakan pada `Tugas.java` agar atribut dapat diakses secara langsung oleh kelas turunannya.
4. **Method Overriding**: Method `tampilkanTugas()` di-override pada kelas turunan untuk menyesuaikan format tampilan sesuai jenis tugas.
5. **Encapsulation & Getter/Setter**: Tetap diterapkan pada atribut tambahan di *child class* (`namaMatkul`, `deadline`, `namaTim`, `estimasiJam`).
6. **Object Instantiation**: Membuat objek nyata dari kelas turunan (`TugasKuliah` dan `TugasProyek`) menggunakan kata kunci `new`.

---

## 🛠️ Struktur Kode

```text
├── ToDoList.java       # Kelas utama yang mengeksekusi program (main method)
├── Tugas.java          # Super Class (Parent Class)
├── TugasKuliah.java    # Sub Class 1 (Turunan dari Tugas)
└── TugasProyek.java    # Sub Class 2 (Turunan dari Tugas)
```

---

## 💻 Kodingan Utama

### `Tugas.java` (Parent Class)
```java
public class Tugas {
    protected String namaTugas;
    protected String prioritas;
    protected boolean selesai;
    
    public void setTugas(String namaTugas){
        this.namaTugas = namaTugas;
    }
    
    public String getTugas(){
        return namaTugas;
    }
    
    public void setPrioritas(String prioritas){
        this.prioritas = prioritas;
    }
    
    public String getPrioritas(){
        return prioritas;
    }

    public void tandaiSelesai() {
        this.selesai = true;
        System.out.println(" Status tugas \"" + namaTugas + "\" diperbarui menjadi SELESAI.");
    }

    public void tampilkanTugas() {
        String status = selesai ? "[Selesai]" : "[Belum Selesai]";
        System.out.println(status + " " + getTugas() + " | Prioritas: " + getPrioritas());
    }
}
```

### `TugasKuliah.java` (Child Class 1)
```java
public class TugasKuliah extends Tugas {
    private String namaMatkul;
    private String deadline;

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getDeadline() {
        return deadline;
    }

    @Override
    public void tampilkanTugas() {
        String status = selesai ? "[Selesai]" : "[Belum Selesai]";
        System.out.println(status + " [KULIAH] " + getTugas() + " | Matkul: " + namaMatkul + 
                           " | Deadline: " + deadline + " | Prioritas: " + getPrioritas());
    }
}
```

### `TugasProyek.java` (Child Class 2)
```java
public class TugasProyek extends Tugas {
    private String namaTim;
    private int estimasiJam;

    public void setNamaTim(String namaTim) {
        this.namaTim = namaTim;
    }

    public String getNamaTim() {
        return namaTim;
    }

    public void setEstimasiJam(int estimasiJam) {
        this.estimasiJam = estimasiJam;
    }

    public int getEstimasiJam() {
        return estimasiJam;
    }

    @Override
    public void tampilkanTugas() {
        String status = selesai ? "[Selesai]" : "[Belum Selesai]";
        System.out.println(status + " [PROYEK] " + getTugas() + " | Tim: " + namaTim + 
                           " | Est. Pengerjaan: " + estimasiJam + " Jam | Prioritas: " + getPrioritas());
    }
}
```

### `ToDoList.java` (Main Class)
```java
public class ToDoList {
    public static void main(String[] args) {
        System.out.println("=== APLIKASI TO-DO LIST (INHERITANCE) ===");

        TugasKuliah tugas1 = new TugasKuliah();
        tugas1.setTugas("Praktikum OOP Pertemuan 4");
        tugas1.setPrioritas("Tinggi");
        tugas1.setNamaMatkul("Pemrograman Berorientasi Objek");
        tugas1.setDeadline("Besok 23:59");

        TugasProyek tugas2 = new TugasProyek();
        tugas2.setTugas("Slicing UI Web E-Commerce");
        tugas2.setPrioritas("Sedang");
        tugas2.setNamaTim("Tim Frontend");
        tugas2.setEstimasiJam(12);

        System.out.println("\n--- DAFTAR TUGAS AWAL ---");
        tugas1.tampilkanTugas();
        tugas2.tampilkanTugas();

        System.out.println("\n--- UPDATE STATUS TUGAS ---");
        tugas1.tandaiSelesai();

        System.out.println("\n--- DAFTAR TUGAS TERBARU ---");
        tugas1.tampilkanTugas();
        tugas2.tampilkanTugas();
    }
}
```

---

## 🚀 Cara Menjalankan Program

### Prasyarat
- Java Development Kit (JDK) versi 8 atau yang lebih baru.

### Langkah-Langkah

1. **Clone / Download** repository ini atau simpan semua file (`Tugas.java`, `TugasKuliah.java`, `TugasProyek.java`, dan `ToDoList.java`) dalam satu folder.
2. Buka terminal/command prompt, lalu masuk ke direktori tempat file disimpan.
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
=== APLIKASI TO-DO LIST (INHERITANCE) ===

--- DAFTAR TUGAS AWAL ---
[Belum Selesai] [KULIAH] Praktikum OOP Pertemuan 4 | Matkul: Pemrograman Berorientasi Objek | Deadline: Besok 23:59 | Prioritas: Tinggi
[Belum Selesai] [PROYEK] Slicing UI Web E-Commerce | Tim: Tim Frontend | Est. Pengerjaan: 12 Jam | Prioritas: Sedang

--- UPDATE STATUS TUGAS ---
 Status tugas "Praktikum OOP Pertemuan 4" diperbarui menjadi SELESAI.

--- DAFTAR TUGAS TERBARU ---
[Selesai] [KULIAH] Praktikum OOP Pertemuan 4 | Matkul: Pemrograman Berorientasi Objek | Deadline: Besok 23:59 | Prioritas: Tinggi
[Belum Selesai] [PROYEK] Slicing UI Web E-Commerce | Tim: Tim Frontend | Est. Pengerjaan: 12 Jam | Prioritas: Sedang
```
