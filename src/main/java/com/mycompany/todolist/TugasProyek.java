/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist;

/**
 *
 * @author hangineering
 */
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

    // Overriding method tampilkanTugas untuk menambahkan info khusus TugasProyek
    @Override
    public void tampilkanTugas() {
        String status = selesai ? "[Selesai]" : "[Belum Selesai]";
        System.out.println(status + " [PROYEK] " + getTugas() + " | Tim: " + namaTim + 
                           " | Est. Pengerjaan: " + estimasiJam + " Jam | Prioritas: " + getPrioritas());
    }
}
