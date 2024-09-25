/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2211102208
 */
package ProjectBuku2;

public class BUKU {

    static class Buku {

        private String judul;
        private String pengarang;

        public Buku() {
            judul = "Tidak diketahui";
            pengarang = "Tidak diketahui";
        }

        public Buku(String judul, String pengarang) {
            System.out.println("Konstruktor buku sedang dijalankan...");
            this.judul = judul;
            this.pengarang = pengarang;
        }

        void cetakKeLayar() {
            if (judul == null && pengarang == null) {
                return;
            }
            System.out.println("Judul : " + judul);
            System.out.println("Pengarang : " + pengarang);
        }

        public static void main(String[] args) {
            Buku a, b;
            a = new Buku("Siaga Merah", "Alistair Maclean");
            b = new Buku();
            a.cetakKeLayar();
            b.cetakKeLayar();
        }
    }
}
