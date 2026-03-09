package latihan_pbo.latihan3;

public class Main {
    public static void main(String[]args) {
        BangunRuang bRuang = new BangunRuang();

        bRuang.setSisi(8);
        System.out.println(bRuang.getSisi());
        bRuang.alas = 27;
        System.out.println(bRuang.alas);
    }
}
