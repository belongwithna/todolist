# 📝 Aplikasi To-Do List Sederhana (Tugas OOP)

Aplikasi **To-Do List** berbasis Konsol/CLI yang dibuat menggunakan bahasa pemrograman **Java**. Aplikasi ini dirancang sebagai implementasi fondasi dasar dari pemikiran berorientasi objek (*Object-Oriented Programming*).

---

## 🎯 Pembahasan Materi Pertemuan 4

Program ini menerapkan konsep-konsep dasar OOP yang telah dipelajari pada Pertemuan 4:

1. **Class**: `Tugas` bertindak sebagai blueprint/cetakan untuk setiap item tugas.
2. **Field (Private)**: Variabel `namaTugas`, `prioritas`, dan `selesai` disembunyikan menggunakan akses `private` (menerapkan prinsip *Encapsulation*).
3. **Getter & Setter**: Method untuk membaca (`getTugas`, `getPrioritas`) dan mengubah (`setTugas`, `setPrioritas`) nilai atribut secara aman.
4. **Constructor**: Menggunakan *default constructor* bawaan Java saat instansiasi objek.
5. **Method**: `tandaiSelesai()` dan `tampilkanTugas()` sebagai perilaku/aksi (*behavior*) objek.
6. **Object Instantiation**: Menggunakan kata kunci `new` untuk mengalokasikan memori objek (`tugas1` dan `tugas2`).

---

## 🛠️ Struktur Kode

```text
├── ToDoList.java       # Kelas utama yang mengeksekusi program (main method)
└── Tugas.java          # Kelas model/blueprint untuk item tugas
```

---

## 💻 Kodingan Utama

### `Tugas.java`
```java
public class Tugas {
    private String namaTugas;
    private String prioritas;
    private boolean selesai;
    
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

### `ToDoList.java`
```java
public class ToDoList {
    public static void main(String[] args) {
        System.out.println("=== APLIKASI TO-DO LIST ===");

        Tugas tugas1 = new Tugas();
        Tugas tugas2 = new Tugas();
        
        tugas1.setTugas("Belajar OOP");
        tugas1.setPrioritas("Tinggi");
        
        tugas2.setTugas("Belajar Web");
        tugas2.setPrioritas("Sedang");
        
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

1. **Clone / Download** repository ini atau simpan kedua file (`Tugas.java` dan `ToDoList.java`) dalam satu folder.
2. Buka terminal/command prompt, lalu masuk ke direktori tempat file disimpan.
3. Kompilasi program:
   ```bash
   javac ToDoList.java Tugas.java
   ```
4. Jalankan program:
   ```bash
   java ToDoList
   ```

---

## 🖥️ Contoh Output Program

```text
=== APLIKASI TO-DO LIST ===

--- DAFTAR TUGAS AWAL ---
[Belum Selesai] Belajar OOP | Prioritas: Tinggi
[Belum Selesai] Belajar Web | Prioritas: Sedang

--- UPDATE STATUS TUGAS ---
 Status tugas "Belajar OOP" diperbarui menjadi SELESAI.

--- DAFTAR TUGAS TERBARU ---
[Selesai] Belajar OOP | Prioritas: Tinggi
[Belum Selesai] Belajar Web | Prioritas: Sedang
```
