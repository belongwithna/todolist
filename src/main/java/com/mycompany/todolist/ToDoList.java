/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.todolist;
import java.util.ArrayList;

/**
 *
 * @author hangineering
 */
public class ToDoList {
    public static void main(String[] args) {
        System.out.println("=== APLIKASI TO-DO LIST ===");
       
        TugasKuliah tugas1 = new TugasKuliah();
        tugas1.setTugas("Praktikum OOP Pertemuan 6");
        tugas1.ubahPrioritas("Tinggi"); // Normal
        tugas1.setNamaMatkul("Pemrograman Berorientasi Objek");
        tugas1.setDeadline("Besok 23:59");

        TugasProyek tugas2 = new TugasProyek();
        tugas2.setTugas("Slicing UI Web E-Commerce");
        tugas2.ubahPrioritas(""); 
        tugas2.setNamaTim("Tim Frontend");
        tugas2.setEstimasiJam(12);

        ArrayList<Tugas> daftarTugas = new ArrayList<>();
        daftarTugas.add(tugas1);
        daftarTugas.add(tugas2);

        System.out.println("\n--- DAFTAR TUGAS AWAL ---");
        for (Tugas t : daftarTugas) {
            t.tampilkanTugas();
        }

        System.out.println("\n--- UPDATE STATUS TUGAS & EXCEPTION TESTING ---");
        
        try {
            daftarTugas.get(5).tandaiSelesai();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(" [ERROR Tertangkap]: Indeks tugas tidak ditemukan! (" + e.getMessage() + ")");
        } finally {
            System.out.println(" (Info: Proses pengecekan indeks list selesai dijalankan).");
        }

        daftarTugas.get(0).tandaiSelesai();

        System.out.println("\n--- DAFTAR TUGAS TERBARU ---");
        for (Tugas t : daftarTugas) {
            t.tampilkanTugas();
        }
    }
}
