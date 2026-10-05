/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist;

/**
 *
 * @author hangineering
 */
public abstract class Tugas implements KelolaTugas {
     protected String namaTugas;
    protected String prioritas;
    protected boolean selesai;

    public Tugas() {
        this.selesai = false;
    }

    public void setTugas(String namaTugas) {
        this.namaTugas = namaTugas;
    }

    public String getTugas() {
        return namaTugas;
    }

    public String getPrioritas() {
        return prioritas;
    }

    @Override
    public void tandaiSelesai() {
        this.selesai = true;
        System.out.println(" Status tugas \"" + namaTugas + "\" diperbarui menjadi SELESAI.");
    }

    @Override
    public void ubahPrioritas(String prioritasBaru) {
        this.prioritas = prioritasBaru;
        System.out.println(" Prioritas tugas \"" + namaTugas + "\" diubah menjadi: " + prioritasBaru);
    }

    public abstract void tampilkanTugas();
    
}
