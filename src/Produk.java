public class Produk {
    String namprod;
    double harga;
    int stok;
    
    public Produk(String namprod, double harga, int stok ) {
        this.namprod = namprod;
        this.harga = harga;
        this.stok = stok;
    }

    void cetakSemua(){
        System.out.println("Nama produk: " + namprod);
        System.out.println("Jumlah harga: " + harga);
        System.out.println("Jumlah stok: " + stok);
    }
    
    void ubahStok(int stokBaru){
        this.stok = stokBaru;
       
    }
    
    double cekDiskon(int persen){
        double diskon = this.harga * persen / 100;
    return this.harga - diskon;
    }
    public static void main(String[] args) throws Exception {

        Produk jajan1 = new Produk("Mie instan", 100000, 100);
        jajan1.cetakSemua();
        jajan1.ubahStok(50);
        jajan1.cetakSemua();

        double data = jajan1.cekDiskon(20);
        
        System.out.println("total harga setelah diskon: " + data);
        
    }

    }

    
