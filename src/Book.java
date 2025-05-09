public class Book {

    String title;
    double price;
    int amount;

public Book (String title, double price, int amount){
    this.title = title;
    this.price = price;
    this.amount = amount;

}


    void cetakNota(){
        System.out.println("Judul: " + title);
        System.out.println("Harga: " + price);
        System.out.println("Jumlah: " + amount);
    }

    double hitungTotalHarga(){
       return this.price * amount;
    }

    double hitungDiskon(int disk){//argumen masuk
        double total = hitungTotalHarga();//ambil data obj lalu dapat hasil, disimpan ke total = 40k
        double diskon =  total * disk / 100;//hitung value total = 40k * argu / 100 = diskon 
        return total - diskon;//value total tetap 40k - diskon = variabel di main

    }
    public static void main(String[] args) throws Exception {


        Book buku1 = new Book("Perjalanan", 20000, 2);
        buku1.cetakNota();

        double totalHarga = buku1.hitungTotalHarga();
        System.out.println("Total harga: " + totalHarga);

        System.out.println("---------------------");
        
        double setdisk = buku1.hitungDiskon(10);
        System.out.println("Harga setelah didiskon: " + setdisk);

    }
}
