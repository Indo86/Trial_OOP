import java.util.Scanner;
import java.util.Locale;
import G3D.*;
import G2D.*;

public class DuaDimensiApp {
    ValidatorInput Validator = new ValidatorInput();

    public void open() {
        // digunakan untuk membaca nilia titik sebagai desimal
        // bukan sebuah karakter string
        // sc.useLocale(Locale.US);

        String format1 = "| %-25s | %-25s | %-25s |\n";
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            TigaDimensiApp.PrintGaris(85, '-');
            TigaDimensiApp.PrintTextDiTengah(85, "Menu 2 Dimensi", '|', ' ');
            TigaDimensiApp.PrintGaris(85, '-');
            System.out.format(format1, "1. Persegi", "4. Segitiga", "7. Belah Ketupat");
            System.out.format(format1, "2. Persegi Panjang", "5. Lingkaran", "8. Layang-layang");
            System.out.format(format1, "3. Jajar genjang", "6. Elips", "9. trapesium");
            TigaDimensiApp.PrintGaris(85, '-');
            System.out.format(format1, "10. Kembali (Main Menu)", "11. Keluar Program", " ");
            TigaDimensiApp.PrintGaris(85, '-');

            int pilihan = Validator.CekInputInteger("Pilih berdasarkan nomor : ");
            System.out.print("\033[H\033[2J");
            System.out.flush();

            switch (pilihan) {
                case 1:
                    HitungPersegi();
                    break;
                case 2:
                    HitungPersegiPanjang();
                    break;
                case 3:
                    HitungJajargenjang();
                    break;
                case 4:
                    HitungSegitiga();
                    break;
                case 5:
                    HitungLingkaran();
                    break;
                case 6:
                    HitungElips();
                    break;
                case 7:
                    HitungBelahKetupat();
                    break;
                case 8:
                    HitungLayanglayang();
                    break;
                case 9:
                    HitungTrapesium();
                    break;
                case 10:
                    MainProgram.main(null);
                    break;
                case 11:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan menu tidak tersedia");
            }
            Validator.ScreenBreak("\nUntuk lanjut, tekan Enter..");

        } while (true);
    }

    static void GambarPersegi() {
        System.out.println(" +---------+");
        System.out.println(" |         |");
        System.out.println(" |         | sisi");
        System.out.println(" |         |");
        System.out.println(" +---------+");
    }

    static void GambarPersegi3D() {
        System.out.println("   +---------+");
        System.out.println("  /|        /|");
        System.out.println(" +---------+ |  tinggi");
        System.out.println(" | |       | |");
        System.out.println(" | +-------|-+");
        System.out.println(" |/        |/ sisi");
        System.out.println(" +---------+");
    }

    static void GambarPersegiPanjang() {
        System.out.println("      panjang");
        System.out.println(" +---------------+");
        System.out.println(" |               |  lebar");
        System.out.println(" |               |");
        System.out.println(" +---------------+");
    }

    static void GambarPersegiPanjang3D() {
        System.out.println("   +---------------+");
        System.out.println("  /|              /|");
        System.out.println(" +---------------+ |");
        System.out.println(" | |             | |");
        System.out.println(" | +-------------|-+");
        System.out.println(" |/              |/");
        System.out.println(" +---------------+");
    }

    static void GambarJajargenjang() {
        System.out.println("            |gap| ");
        System.out.println("    +-------+---+");
        System.out.println("   /        |  /");
        System.out.println("  /  tinggi | /");
        System.out.println(" /          |/");
        System.out.println("+-----------+");
        System.out.println("     alas");
    }

    static void GambarSegitiga() {
        System.out.println("     +");
        System.out.println("    /|\\");
        System.out.println("   / | \\");
        System.out.println("  /  |  \\");
        System.out.println(" /   |   \\");
        System.out.println("+----+----+");
    }

    static void GambarSegitigaPrisma() {
        System.out.println("     +-------+");
        System.out.println("    /|\\       \\");
        System.out.println("   / | \\       \\");
        System.out.println("  /  |  \\       \\");
        System.out.println(" /   |   \\       \\");
        System.out.println("+----+----+-------+");
    }

    static void GambarBelahKetupat() {
        System.out.println("      *");
        System.out.println("    * | *");
        System.out.println("  *---|---*");
        System.out.println("    * | *");
        System.out.println("      *");
    }

    static void GambarBelahKetupatPrisma() {
        System.out.println("       ");
        System.out.println("      *--------*");
        System.out.println("    * | *        *");
        System.out.println("  *---|---*--------*");
        System.out.println("    * | *");
        System.out.println("      *");
    }

    static void GambarLayanglayang() {
        System.out.println("    *      | titik puncak");
        System.out.println("  * | *    |");
        System.out.println("*---|---*  | titik potong");
        System.out.println(" *  |  *    ");
        System.out.println("  * | *     ");
        System.out.println("   *|*      ");
        System.out.println("    *      ");
    }

    static void GambarTrapesium() {
        System.out.println("       atap");
        System.out.println("    +---------+");
        System.out.println("   +           +  sisi samping");
        System.out.println("  +             + ");
        System.out.println(" +---------------+");
        System.out.println("       alas");
    }

    void PrintHasilBangun2D(String namaBangun2D, float Luas, float Keliling) {
        System.out.format("Luas %-29s : %.2f\n", namaBangun2D, Luas);
        System.out.format("Keliling %-25s : %.2f\n", namaBangun2D, Keliling);
    }

    public void HitungPersegi() {
        TigaDimensiApp.PrintTextDiTengah(30, "Persegi", ' ', ' ');
        TigaDimensiApp.PrintGaris(30, '=');
        GambarPersegi();
        Persegi Persegi = new Persegi(
                Validator.CekInputFloat("Masukkan nilai sisi   : "));
        PrintHasilBangun2D("Persegi", Persegi.getLuas(), Persegi.getKeliling());
    }

    public void HitungPersegiPanjang() {
        TigaDimensiApp.PrintTextDiTengah(30, "Persegi Panjang", ' ', ' ');
        TigaDimensiApp.PrintGaris(30, '=');
        GambarPersegiPanjang();
        PersegiPanjang PersegiPanjang = new PersegiPanjang(
                Validator.CekInputFloat("Masukkan nilai panjang   : "),
                Validator.CekInputFloat("Masukkan nilai lebar     : "));
        PrintHasilBangun2D("Persegi Panjang", PersegiPanjang.getLuas(), PersegiPanjang.getKeliling());
    }

    public void HitungJajargenjang() {
        TigaDimensiApp.PrintTextDiTengah(30, "Jajar Genjang", ' ', ' ');
        TigaDimensiApp.PrintGaris(30, '=');
        GambarJajargenjang();
        Jajargenjang Jajargenjang = new Jajargenjang(
                Validator.CekInputFloat("Masukkan nilai Alas              : "),
                Validator.CekInputFloat("Masukkan nilai Tinggi            : "),
                Validator.CekInputFloat("Masukkan nilai Gap Alas dan Atap : "));
        PrintHasilBangun2D("Persegi Panjang", Jajargenjang.getLuas(), Jajargenjang.getKeliling());
    }

    public void HitungSegitiga() {
        TigaDimensiApp.PrintTextDiTengah(30, "Segitiga", ' ', ' ');
        TigaDimensiApp.PrintGaris(30, '=');
        GambarSegitiga();
        Segitiga Segitiga = new Segitiga(
                Validator.CekInputFloat("Masukkan nilai Alas   : "),
                Validator.CekInputFloat("Masukkan nilai Tinggi : "));
        PrintHasilBangun2D("Segitiga", Segitiga.getLuas(), Segitiga.getKeliling());
    }

    public void HitungLingkaran() {
        TigaDimensiApp.PrintTextDiTengah(30, "Lingkaran", ' ', ' ');
        TigaDimensiApp.PrintGaris(30, '=');

        Lingkaran Lingkaran = new Lingkaran(
                Validator.CekInputFloat("Masukkan nilai jari-jari : "));
        PrintHasilBangun2D("Lingkaran", Lingkaran.getLuas(), Lingkaran.getKeliling());
    }

    public void HitungElips() {
        TigaDimensiApp.PrintTextDiTengah(30, "Elips", ' ', ' ');
        TigaDimensiApp.PrintGaris(30, '=');
        Elips Elips = new Elips(
                Validator.CekInputFloat("Masukkan Diagonal 1 : "),
                Validator.CekInputFloat("Masukkan Diagonal 2 : "));
        PrintHasilBangun2D("Elips", Elips.getLuas(), Elips.getKeliling());
    }

    public void HitungBelahKetupat() {
        TigaDimensiApp.PrintTextDiTengah(30, "Belah Ketupat", ' ', ' ');
        TigaDimensiApp.PrintGaris(30, '=');
        GambarBelahKetupat();
        Belahketupat Belahketupat = new Belahketupat(
                Validator.CekInputFloat("Masukkan Diagonal Vertikal     : "),
                Validator.CekInputFloat("Masukkan Diagonal Horizontal   : "));
        PrintHasilBangun2D("Belah Ketupat", Belahketupat.getLuas(), Belahketupat.getKeliling());
    }

    public void HitungLayanglayang() {
        TigaDimensiApp.PrintTextDiTengah(30, "Layang-layang", ' ', ' ');
        TigaDimensiApp.PrintGaris(30, '=');
        GambarLayanglayang();
        Layanglayang Layanglayang = new Layanglayang(
                Validator.CekInputFloat("Masukkan Diagonal Vertikal            : "),
                Validator.CekInputFloat("Masukkan Diagonal Horizontal          : "),
                Validator.CekInputFloat("Masukkan jarak titik puncak ke perpotongan diagonal : "));
        PrintHasilBangun2D("Layang-Layang", Layanglayang.getLuas(), Layanglayang.getKeliling());
    }

    public void HitungTrapesium() {
        TigaDimensiApp.PrintTextDiTengah(30, "Trapesium", ' ', ' ');
        TigaDimensiApp.PrintGaris(30, '=');
        GambarTrapesium();
        Trapesium Trapesium = new Trapesium(
                Validator.CekInputFloat("Masukkan nilai alas         : "),
                Validator.CekInputFloat("Masukkan nilai atap         : "),
                Validator.CekInputFloat("Masukkan nilai Sisi Samping : "));

        PrintHasilBangun2D("Trapesium", Trapesium.getLuas(), Trapesium.getKeliling());
    }
}
