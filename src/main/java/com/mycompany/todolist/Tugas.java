/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist;

/**
 *
 * @author hangineering
 */
public class Tugas {
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
