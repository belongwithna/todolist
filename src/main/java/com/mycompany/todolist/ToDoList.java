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
        System.out.println("Prioritas 'Rendah' 'Sedang' 'Tinggi'");

        Tugas tugas1 = new Tugas();
        Tugas tugas2 = new Tugas();
        
        tugas1.setTugas("Belajar OOP");
        tugas1.setPrioritas("Tinggi");
        
        tugas2.setTugas("Belajar Web");
        tugas2.setPrioritas("Normal");
        
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
