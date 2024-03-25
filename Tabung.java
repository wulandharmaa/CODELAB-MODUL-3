import java.util.Scanner;
class Tabung extends BangunRuang {
    private double tinggi;
    private double jari_jari;
    private Scanner scanner = new Scanner(System.in);

    Tabung(String nameBangun) {
        super(nameBangun);
    }

    @Override
    public void inputNilai() {
        super.inputNilai();
        System.out.print("Input tinggi: ");
        tinggi = scanner.nextDouble();
        System.out.print("Input jari-jari: ");
        jari_jari = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        double hasil = 2 * Math.PI * jari_jari * (jari_jari + tinggi);
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    @Override
    public void volume() {
        double hasil = Math.PI * Math.pow(jari_jari, 2) * tinggi;
        super.volume();
        System.out.println("Hasil volume: " + hasil);
    }
}