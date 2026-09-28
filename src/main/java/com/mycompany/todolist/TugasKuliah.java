/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist;

/**
 *
 * @author hangineering
 */
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
