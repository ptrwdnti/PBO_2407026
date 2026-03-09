package latihan_pbo.inheritance_bangun_datar;

public class PersegiPanjang extends BangunDatar {
    public double luasPersegipanjang() {
        return getpanjang() * getlebar();
    }
    public double kelilingPersegiPanjang() {
        return 2 * (getpanjang() * getlebar());
    }
    
}
