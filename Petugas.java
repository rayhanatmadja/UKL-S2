/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.ArrayList;

public class Petugas  implements UserInterface{
    // final adalah inisaiasi agar tidak bisa diganti 
    private final ArrayList<String> nama;
    private final ArrayList<String> alamat;
    private final ArrayList<String> telepon;
    
    public Petugas(){ //inisialisasi atribut
        this.nama = new ArrayList();
        this.alamat = new ArrayList();
        this.telepon = new ArrayList();
        
        this.iniListPetugas();
    }
    
    private void iniListPetugas(){ //menambahkan data pada array
        this.nama.add("Rayhan");
        this.alamat.add("Probolinggo");
        this.telepon.add("08123182528");
        
        this.nama.add("Budi");
        this.alamat.add("Bangil");
        this.telepon.add("081122334455");
    }
    
    public void printIniListPetugas(){
        System.out.println("Daftar List Petugas");
        for(int i = 0; i < this.nama.size(); i++){
            String msg = i + ". ";
            msg += this.nama.get(i)+ " | ";
            msg += this.alamat.get(i)+ " | ";
            msg += this.telepon.get(i)+ " | ";
            System.out.println(msg);
        }
        
        System.out.println("");
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
}
