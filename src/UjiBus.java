
public class UjiBus {

    
    public static void main(String[] args) {
        
        //Membuat objek busMini dari kelas Bus
        Bus busMini = new Bus();
        
        //Memasukkan nilai jumlah penumpang dan penumpang maksimal ke dalam objek busMini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        
        //Memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //Menambahkan penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 5;
        //Memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //Mengurangi jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();
        
        //Menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
        
    }
    
}
