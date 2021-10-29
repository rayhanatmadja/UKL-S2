/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

/**
 *
 * @author USER
 */
public class Perpus {
    static Scanner input;
    static Petugas petugas;
    static Siswa siswa;
    static Buku buku;
    static Peminjaman peminjaman;
    
    static Integer idSiswa;
    
    public static void main(String[] args){
        input = new Scanner(System.in);
        
        System.out.println("Selamat datang siswa kelas XI RPL 6");
        System.out.println(" ");
        
        petugas = new Petugas();
        siswa = new Siswa();
        buku = new Buku();
        peminjaman = new Peminjaman();
        
        petugas.printIniListPetugas();
        siswa.printListPetugas();
        
        idSiswa = pilihSiswa();
        
        Boolean ulang = true;
        while(ulang){
            Integer menu = pilihMenu();
            switch (menu){
                case 1 -> buku.printListBuku();
                case 2 -> prosesPeminjaman();
                case 3 -> prosesPengembalian();
                case 4 -> peminjaman.printPeminjamanSiswa(idSiswa);
                case 99 -> ulang = false;
                default -> {
                    System.out.println("Menu yang anda pilih tidak ada");
                    System.out.println("");
                }
            }
        }
        input.close();
    }
    
    public static Integer pilihSiswa(){
        System.out.println("Silahkan  masukkan id siswa : ");
        return input.nextInt();
    }
    
    public static Integer pilihMenu(){
        System.out.println("Selamat datang di Perpus");
        System.out.println("1. List Buku");
        System.out.println("2. Peminjaman");
        System.out.println("3. Pengembalian");
        System.out.println("4. Data Siswa");
        System.out.println("99 = Keluar");
        System.out.println("=> ");
        return input.nextInt();
    }
    
    public static void prosesPeminjaman(){
        if(!siswa.getStatus(idSiswa)){
            System.out.println("Siswa masih meminjam buku dan belum dikemnalikan");
            System.out.println("");
            return;
        }
        System.out.println("Masukkan id untuk meminjam buku : ");
        int idBuku = input.nextInt();
        
        System.out.println("Banyak buku : ");
        int banyak = input.nextInt();
        
        if(buku.getStock(idBuku) < banyak){
            System.out.println("Sisa stok buku tidak mencukupi");
            System.out.println("");
            return;
        }
        peminjaman.tambahPeminjaman(idSiswa, idBuku, banyak);
        buku.pinjam(idBuku, banyak);
        siswa.updateStatus(idSiswa, Boolean.FALSE);
        System.out.println("Berhasil Melakukan Peminjaman");
        System.out.println("");
    }
    
    public static void prosesPengembalian(){
        int idBuku = peminjaman.getIdBuku(idSiswa);
        int banyak = peminjaman.getBanyak(idSiswa);
        
        peminjaman.hapusPeminjaman(idSiswa);
        buku.kembali(idBuku, banyak);
        siswa.updateStatus(idSiswa, Boolean.TRUE);
        
        System.out.println("Berhasil melakukan pengembalian buku");
        System.out.println("");
    }
}
