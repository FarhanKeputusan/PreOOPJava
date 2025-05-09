public class Tbioskop {
    String judulFilm;
    double hargaTiket;
    int jumlahTiket;

    public Tbioskop(String judulFilm, double hargaTiket, int jumlahTiket ){
        this.judulFilm = judulFilm;
        this.hargaTiket = hargaTiket;
        this.jumlahTiket = jumlahTiket;
    }

     void cetakNota (){
        System.out.println("Judul film: " + judulFilm);
        System.out.println("Harganya : " + hargaTiket);
        System.out.println("Jumlah dipesan: " + jumlahTiket);
     }

     double hitungTotharga(){
        return this.hargaTiket * jumlahTiket;
     }

     double hitungdiskon(int diskon){
        double total = this.hargaTiket * jumlahTiket;
        double disc = total * diskon / 100;
        return total - disc;
     }
    public static void main(String[] args) throws Exception {
        Tbioskop orang1 = new Tbioskop("Hantu gagah", 30000, 2);
        orang1.cetakNota();
        double totharga = orang1.hitungTotharga();
        System.out.println("Total harga adalah: " + totharga);
        System.out.println("-------------------");

        double hargaSetelahDiskon = orang1.hitungdiskon(50);
        System.out.println("Harga setelah diskon adalah: " + hargaSetelahDiskon);

    }
}
