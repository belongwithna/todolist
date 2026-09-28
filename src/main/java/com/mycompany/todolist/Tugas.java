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
    protected String namaTugas;
    protected String prioritas;
    protected boolean selesai;
    
    public void setTugas(String namaTugas){
        this.namaTugas = namaTugas;
    }
    
    public String getTugas(){
        return namaTugas;
    }
    
    public void setPrioritas(String prioritas){
        if(prioritas == "Rendah" || prioritas == "Sedang" || prioritas == "Tinggi"){
            this.prioritas = prioritas;
        } else {
            System.out.println("Status tidak valid, set ke Rendah");
            this.prioritas = "Rendah";
        }
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
