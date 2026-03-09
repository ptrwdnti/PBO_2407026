package tugas_bangun_datar_pbo;

public class BangunDatar {

    double sisi;
    double panjang;
    double lebar;
    double alas;
    double tinggi;
    double diagonal1;
    double diagonal2;

    // luas persegi
    double luasPersegi(double sisi){
        return sisi * sisi;
    }

    // luas persegi panjang
    double luasPersegiPanjang(double panjang, double lebar){
        return panjang * lebar;
    }

    // luas segitiga
    double luasSegitiga(double alas, double tinggi){
        return 0.5 * alas * tinggi;
    }

    // luas belah ketupat
    double luasBelahKetupat(double d1, double d2){
        return 0.5 * d1 * d2;
    }
}