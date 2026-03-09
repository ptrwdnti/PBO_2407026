package latihan_pbo.inheritance_bangun_datar;

public class Main {
    public static void main(String[] args) {
        
        // 1. Objek Persegi
        Persegi p = new Persegi();
        p.setSisi(5);
        System.out.println("\n=== PERSEGI ===");
        System.out.println("Luas: " + p.LuasPersegi());
        System.out.println("Keliling: " + p.kelilingPersegi());

        // 2. Objek Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang();
        pp.setpanjang(10);
        pp.setlebar(5);
        System.out.println("\n=== PERSEGI PANJANG ===");
        System.out.println("Luas: " + pp.luasPersegipanjang());
        System.out.println("Keliling: " + pp.kelilingPersegiPanjang());

        // 3. Objek Segitiga
        Segitiga s = new Segitiga();
        s.setalas(6);
        s.settinggi(8);
        s.setsisi1(6);
        s.setsisi2(8);
        s.setsisi3(10);
        System.out.println("\n=== SEGITIGA ===");
        System.out.println("Luas: " + s.luasSegitiga());
        System.out.println("Keliling: " + s.kelilingSgitiga());

        // 4. Objek Belah Ketupat
        BelahKetupat bk = new BelahKetupat();
        bk.setdiagonal1(10);
        bk.setdiagonal2(12);
        bk.setSisiBelahKetupat(7);
        System.out.println("\n=== BELAH KETUPAT ===");
        System.out.println("Luas: " + bk.luasBelahKetupat());
        System.out.println("Keliling: " + bk.kelilingBelahKetupat());
    }
}