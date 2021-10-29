/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.AbstractList;
/**
 *
 * @author USER
 */
public class Buku {
  private final ArrayList<String> namaBuku;
  private final ArrayList<Integer> stok;
  private final ArrayList<Integer> harga;
  
  public Buku(){
      this.namaBuku = new ArrayList();
      this.stok = new ArrayList();
      this.harga = new ArrayList();
      
      this.iniListBuku();
  }
  
  private void iniListBuku(){
      this.namaBuku.add("The One");
      this.stok.add(10);
      this.harga.add(100000);
      
      this.namaBuku.add("The Second");
      this.stok.add(7);
      this.harga.add(100000);
      
      this.namaBuku.add("The Third");
      this.stok.add(5);
      this.harga.add(100000);
  }
  
  public void printListBuku(){
      System.out.println("Ketersediaan Buku di perpus Moklet");
      System.out.println("");
      for(int i = 0; i < this.namaBuku.size(); i++){
          String msg = i + ". ";
          msg += this.namaBuku.get(i)+ " | ";
          msg += this.stok.get(i)+ " buku | ";
          msg += "Rp "+ this.harga.get(i)+ ",-";
          System.out.println(msg);
      }
      System.out.println("");
  }
  
  public void pinjam(int id, int banyak){
      int sisaStok = this.stok.get(id);
      sisaStok -= banyak;
      
      this.stok.set(id, sisaStok);
  }
  
  public void kembali(int id, int banyak){
      int sisaStok = this.stok.get(id);
      sisaStok += banyak;
      
      this.stok.set(id, sisaStok);
  }
  public integer getStock(int )
}
