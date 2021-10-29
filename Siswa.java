/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.ArrayList;

public class Siswa implements UserInterface{
    private final ArrayList<String> nama;
    private final ArrayList<String> alamat;
    private final ArrayList<String> telepon;
    private final ArrayList<Boolean> status;
    
    public Siswa(){
        this.nama = new ArrayList();
        this.alamat = new ArrayList();
        this.telepon = new ArrayList();
        this.status = new ArrayList();
        
        
    }
     private void iniListPetugas(){ //menambahkan data pada array
        this.nama.add("Rama");
        this.alamat.add("Malang");
        this.telepon.add("08522334455");
        this.status.add(false);
        
        this.nama.add("Dani");
        this.alamat.add("Lombok");
        this.telepon.add("098193819313");
        this.status.add(true);
    }
    public void printListPetugas(){
       System.out.println("Daftar List Petugas");
        for(int i = 0; i < this.nama.size(); i++){
            String msg = i + ". ";
            msg += this.nama.get(i)+ " | ";
            msg += this.alamat.get(i)+ " | ";
            msg += this.telepon.get(i)+ " | ";
            msg += this.status.get(i) ? "Meminjam":"Kosong";
            System.out.println(msg);
    }
        System.out.println("");
}
    public void updateStatus(int idSiswa, Boolean status){
        this.status.set(idSiswa, status);
    }

    @Override
    public void setNama(String nama) {
        this.nama.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    
    public void setStatus(Boolean status){
        this.status.add(status);
    }

    @Override
    public String getNama(int id) {
        return this.nama.get(id);
    }

    @Override
    public String getAlamat(int id) {
       return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    
    public Boolean getStatus(int idSiswa){
        return this.status.get(idSiswa);
    }
}
