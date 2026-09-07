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

        Tugas tugas1 = new Tugas("Kerjakan Tugas OOP Pertemuan 3", "Tinggi");
        Tugas tugas2 = new Tugas("Beli Bahan Makanan", "Rendah");
        
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
