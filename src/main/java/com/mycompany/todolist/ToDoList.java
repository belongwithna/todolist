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
