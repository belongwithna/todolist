/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.todolist;

/**
 *
 * @author hangineering
 */
public class ToDoList {
    public static void main(String[] args) {
       System.out.println("=== APLIKASI TO-DO LIST ===");

        TugasKuliah tugas1 = new TugasKuliah();
        tugas1.setTugas("Praktikum OOP Pertemuan 4");
        tugas1.setPrioritas("Tinggi");
        tugas1.setNamaMatkul("Pemrograman Berorientasi Objek");
        tugas1.setDeadline("Bokong/Besok 23:59");

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
