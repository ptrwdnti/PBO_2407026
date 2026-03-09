package latihan_pbo.inheritance_bangun_datar;

public class BangunDatar {
    private double sisi, panjang, lebar, alas, tinggi;
    private double diagonal1, diagonal2, sisiBelahKetupat;
    private double sisi1, sisi2, sisi3;

    // Getter dan Setter untuk Persegi
    public double getSisi() { return sisi; }
    public void setSisi(double sisi) { this.sisi = sisi; }

    // Getter dan Setter untuk Persegi Panjang
    public double getpanjang() { return panjang; }
    public void setpanjang(double panjang) { this.panjang = panjang; }
    public double getlebar() { return lebar; }
    public void setlebar(double lebar) { this.lebar = lebar; }

    // Getter dan Setter untuk Segitiga
    public double getalas() { return alas; }
    public void setalas(double alas) { this.alas = alas; }
    public double gettinggi() { return tinggi; }
    public void settinggi(double tinggi) { this.tinggi = tinggi; }
    public double getsisi1() { return sisi1; }
    public void setsisi1(double sisi1) { this.sisi1 = sisi1; }
    public double getsisi2() { return sisi2; }
    public void setsisi2(double sisi2) { this.sisi2 = sisi2; }
    public double getsisi3() { return sisi3; }
    public void setsisi3(double sisi3) { this.sisi3 = sisi3; }

    // Getter dan Setter untuk Belah Ketupat
    public double getdiagonal1() { return diagonal1; }
    public void setdiagonal1(double diagonal1) { this.diagonal1 = diagonal1; }
    public double getdiagonal2() { return diagonal2; }
    public void setdiagonal2(double diagonal2) { this.diagonal2 = diagonal2; }
    public double getSisiBelahKetupat() { return sisiBelahKetupat; }
    public void setSisiBelahKetupat(double sisiBelahKetupat) { this.sisiBelahKetupat = sisiBelahKetupat; }
}