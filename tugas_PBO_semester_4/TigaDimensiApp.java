
// package ;
import G3D.*;
import G2D.*;
// import ;

public class TigaDimensiApp {
  ValidatorInput Validator = new ValidatorInput();

  public void open() {
    // Scanner sc = new Scanner(System.in);

    // digunakan untuk membaca titik sebagai desimal
    // bukan sebuah karakter
    // sc.useLocale(Locale.US);

    // clear screen
    System.out.print("\033[H\033[2J");
    System.out.flush();

    String format1 = "| %-25s | %-25s |\n";
    boolean ulang = true;
    do {
      // System.out.print("\033[H\033[2J");
      // System.out.flush();
      PrintGaris(57, '-');
      PrintTextDiTengah(57, "Menu 3 Dimensi", '|', ' ');
      PrintGaris(57, '-');
      System.out.format(format1, "1. Balok Persegi", "11. Limas Trapesium");
      System.out.format(format1, "2. Balok Persegi Panjang", "12. Prisma Belah Ketupat");
      System.out.format(format1, "3. Kerucut", "13. Prisma Jajar Genjang");
      System.out.format(format1, "4. Bola", "14. Prisma Layang-layang");
      System.out.format(format1, "5. Limas Belah Ketupat", "15. Prisma Segitiga");
      System.out.format(format1, "6. Limas Jajar Genjang", "16. Prisma Trapesium");
      System.out.format(format1, "7. Limas Layang-layang", "17. Sferoid");
      System.out.format(format1, "8. Limas Persegi", "18. Tabung");
      System.out.format(format1, "9. Limas Persegi Panjang", "19. Cincin (Torus)");
      System.out.format(format1, "10. Limas Segitiga", " ");
      PrintGaris(57, '-');
      System.out.format(format1, "20. Kembali (Main menu)", "21. Keluar Program ");
      PrintGaris(57, '-');
      // prototype method Try_catch TigaDimensiApp.java di class ValidatorInput
      int pilihan = (int) Validator.CekInputFloat("Pilih berdasarkan nomor : ");

      System.out.print("\033[H\033[2J");
      System.out.flush();
      switch (pilihan) {
        case 1:
          HitungBalokPersegi();
          break;
        case 2:
          HitungBalokPersegiPanjang();
          break;
        case 3:
          HitungKerucut();
          break;
        case 4:
          HitungBola();
          break;
        case 5:
          HitungLimasBelahKetupat();
          break;
        case 6:
          HitungLimasJajarGenjang();
          break;
        case 7:
          HitungLimasLayang();
          break;
        case 8:
          HitungLimasPersegi();
          break;
        case 9:
          HitungLimasPersegiPanjang();
          break;
        case 10:
          HitungLimasSegitiga();
          break;

        case 11:
          HitungLimasTrapesium();
          break;

        case 12:
          HitungPrismaBelahKetupat();
          break;

        case 13:
          HitungPrismaJajarGenjang();
          break;

        case 14:
          HitungPrismaLayang();
          break;

        case 15:
          HitungPrismaSegitiga();
          break;

        case 16:
          HitungPrismaTrapesium();
          break;

        case 17:
          HitungSferoid();
          break;

        case 18:
          HitungTabung();
          break;

        case 19:
          HitungCincinTorus();
          break;

        case 20:
          MainProgram.main(null);
          break;

        case 21:
          System.exit(0);
          break;

        default:
          System.out.println("Maaf nomor yang anda pilih tidak terdaftar!");
          break;
      }
      Validator.ScreenBreak("\nUntuk lanjut, tekan Enter..");

    } while (true);

    // if (ulang == false){
    // System.exit(0);
    // }
  }

  public static void PrintTextDiTengah(int panjangText, String textUtama, char pinggir, char isianKosong) {
    System.out.print(pinggir);
    int longHalf = ((panjangText - 2) - textUtama.length()) / 2;
    for (int i = 0; i < longHalf; i++) {
      System.out.print(isianKosong);
    }
    System.out.print(textUtama);
    for (int i = 0; i < longHalf; i++) {
      System.out.print(isianKosong);
    }
    if ((panjangText + textUtama.length()) % 2 == 1) {
      System.out.print(isianKosong);
    }
    System.out.println(pinggir);
  }

  public static void PrintGaris(int panjangGaris, char isianGaris) {
    System.out.println(new String(new char[panjangGaris]).replace('\0', isianGaris));
  }

  void PrintHasilBangun3D(String namaBangun3D, float volume, float luas) {
    PrintTextDiTengah(40, "Hasil", '#', '-');
    System.out.format("Volume %-33s : %.2f\n", namaBangun3D, volume);
    System.out.format("Luas Permukaan %-25s : %.2f\n", namaBangun3D, luas);
  }

  public void HitungBalokPersegi() {
    PrintTextDiTengah(40, "Balok Persegi", ' ', ' ');
    PrintGaris(40, '=');
    DuaDimensiApp.GambarPersegi3D();
    BalokPersegi balokPersegi = new BalokPersegi(
        Validator.CekInputFloat("Masukkan sisi   : "),
        Validator.CekInputFloat("Masukkan tinggi : "));
    PrintHasilBangun3D("Balok Persegi", balokPersegi.getVolume(), balokPersegi.getLuas());
  }

  void HitungBalokPersegiPanjang() {
    PrintTextDiTengah(40, "Balok Persegi Panjang", ' ', ' ');
    PrintGaris(40, '=');
    DuaDimensiApp.GambarPersegiPanjang3D();
    BalokPersegiPanjang balokPersegiPanjang = new BalokPersegiPanjang(
        Validator.CekInputFloat("Masukkan panjang : "),
        Validator.CekInputFloat("Masukkan lebar   : "),
        Validator.CekInputFloat("Masukkan tinggi  : "));
    PrintHasilBangun3D("Balok Persegi Panjang", balokPersegiPanjang.getVolume(), balokPersegiPanjang.getLuas());
  }

  void HitungKerucut() {
    PrintTextDiTengah(40, "Kerucut", ' ', ' ');
    PrintGaris(40, '=');

    Kerucut kerucut = new Kerucut(
        Validator.CekInputFloat("Masukkan tinggi         : "),
        Validator.CekInputFloat("Masukkan jari-jari alas : "));
    PrintHasilBangun3D("Kerucut", kerucut.getVolume(), kerucut.getLuas());

  }

  void HitungBola() {
    PrintTextDiTengah(40, "Bola", ' ', ' ');
    PrintGaris(40, '=');

    Bola bola = new Bola(
        Validator.CekInputFloat("Masukkan jari-jari bola : "));
    PrintHasilBangun3D("Bola", bola.getVolume(), bola.getLuas());
  }

  void HitungLimasBelahKetupat() {
    PrintTextDiTengah(40, "Limas Belah Ketupat", ' ', ' ');
    PrintGaris(40, '=');
    DuaDimensiApp.GambarBelahKetupat();
    LimasBelahKetupat limasBelahKetupat = new LimasBelahKetupat(
        Validator.CekInputFloat("Masukkan tinggi limas        : "),
        Validator.CekInputFloat("Masukkan diagonal vertical   : "),
        Validator.CekInputFloat("Masukkan diagonal horizontal : "));
    PrintHasilBangun3D("Limas Belah Ketupat", limasBelahKetupat.getVolume(), limasBelahKetupat.getLuas());
  }

  void HitungLimasJajarGenjang() {
    PrintTextDiTengah(40, "Limas Jajar Genjang", ' ', ' ');
    PrintGaris(40, '=');
    DuaDimensiApp.GambarJajargenjang();
    LimasJajarGenjang limasJarGen = new LimasJajarGenjang(
        Validator.CekInputFloat("Masukkan tinggi limas         : "),
        Validator.CekInputFloat("Masukkan alas jajar genjang   : "),
        Validator.CekInputFloat("Masukkan tinggi jajar genjang : "),
        Validator.CekInputFloat("Masukkan gap alas-atap        : "));
    PrintHasilBangun3D("Limas Jajar Genjang", limasJarGen.getVolume(), limasJarGen.getLuas());
  }

  void HitungLimasLayang() {
    PrintTextDiTengah(40, "Limas Layang-layang", ' ', ' ');
    PrintGaris(40, '=');
    DuaDimensiApp.GambarLayanglayang();
    LimasLayang limasLayang = new LimasLayang(
        Validator.CekInputFloat("Masukkan tinggi limas        : "),
        Validator.CekInputFloat("Masukkan diagonal vertical   : "),
        Validator.CekInputFloat("Masukkan diagonal horizontal : "),
        Validator.CekInputFloat("Masukkan jarak titik puncak ke perpotongan diagonal : "));
    PrintHasilBangun3D("Limas Layang-layang", limasLayang.getVolume(), limasLayang.getLuas());
  }

  void HitungLimasPersegi() {
    PrintTextDiTengah(40, "Limas Persegi", ' ', ' ');
    PrintGaris(40, '=');
    DuaDimensiApp.GambarPersegi();
    LimasPersegi limPersegi = new LimasPersegi(
        Validator.CekInputFloat("Masukkan sisi persegi  : "),
        Validator.CekInputFloat("Masukkan tinggi limas  : "));
    PrintHasilBangun3D("Limas Persegi", limPersegi.getVolume(), limPersegi.getLuas());
  }

  void HitungLimasPersegiPanjang() {
    PrintTextDiTengah(40, "Limas Persegi Panjang", ' ', ' ');
    PrintGaris(40, '=');
    DuaDimensiApp.GambarPersegiPanjang();
    LimasPersegiPanjang limPersegiP = new LimasPersegiPanjang(
        Validator.CekInputFloat("Masukkan panjang alas  : "),
        Validator.CekInputFloat("Masukkan lebar alas    : "),
        Validator.CekInputFloat("Masukkan tinggi limas  : "));
    PrintHasilBangun3D("Limas Persegi Panjang", limPersegiP.getVolume(), limPersegiP.getLuas());
  }

  void HitungLimasSegitiga() {
    PrintTextDiTengah(40, "Limas Segitiga", ' ', ' ');
    PrintGaris(40, '=');
    DuaDimensiApp.GambarSegitiga();
    LimasSegitiga limSegitiga = new LimasSegitiga(
        Validator.CekInputFloat("Masukkan alas segitiga   : "),
        Validator.CekInputFloat("Masukkan tinggi segitiga : "),
        Validator.CekInputFloat("Masukkan tinggi limas    : "));
    PrintHasilBangun3D("Limas Segitiga", limSegitiga.getVolume(), limSegitiga.getLuas());
  }

  void HitungLimasTrapesium() {
    PrintTextDiTengah(40, "Limas Trapesium", ' ', ' ');
    PrintGaris(40, '=');
    DuaDimensiApp.GambarTrapesium();
    LimasTrapesium limTrapesium = new LimasTrapesium(
        Validator.CekInputFloat("Masukkan alas trapesium         : "),
        Validator.CekInputFloat("Masukkan atap trapesium         : "),
        Validator.CekInputFloat("Masukkan sisi samping trapesium : "),
        Validator.CekInputFloat("Masukkan tinggi limas           : "));
    PrintHasilBangun3D("Limas Trapesium", limTrapesium.getVolume(), limTrapesium.getLuas());
  }

  void HitungPrismaBelahKetupat() {
    PrintTextDiTengah(40, "Prisma belah ketupat", ' ', ' ');
    PrintGaris(40, '=');
    DuaDimensiApp.GambarBelahKetupat();
    PrismaBelahKetupat prisBelahKetupat = new PrismaBelahKetupat(
        Validator.CekInputFloat("Masukkan diagonal vertical   : "),
        Validator.CekInputFloat("Masukkan diagonal horizontal : "),
        Validator.CekInputFloat("Masukkan tinggi prisma       : "));
    PrintHasilBangun3D("Prisma belah ketupat", prisBelahKetupat.getVolume(), prisBelahKetupat.getLuas());
  }

  void HitungPrismaJajarGenjang() {
    PrintTextDiTengah(40, "Prisma Jajar Genjang", ' ', ' ');
    PrintGaris(40, '=');
    DuaDimensiApp.GambarJajargenjang();
    PrismaJajarGenjang prisJarGenjang = new PrismaJajarGenjang(
        Validator.CekInputFloat("Masukkan alas jajar genjang   : "),
        Validator.CekInputFloat("Masukkan tinggi jajar genjang : "),
        Validator.CekInputFloat("Masukkan gap alas-atap        : "),
        Validator.CekInputFloat("Masukkan tinggi prisma        : "));
    PrintHasilBangun3D("Prisma Jajar Genjang", prisJarGenjang.getVolume(), prisJarGenjang.getLuas());
  }

  void HitungPrismaLayang() {
    PrintTextDiTengah(40, "Prisma Layang-layang", ' ', ' ');
    PrintGaris(40, '=');
    DuaDimensiApp.GambarLayanglayang();
    PrismaLayang prisLayang = new PrismaLayang(
        Validator.CekInputFloat("Masukkan diagonal_1 layang-layang   : "),
        Validator.CekInputFloat("Masukkan diagonal_2 layang-layang   : "),
        Validator.CekInputFloat("Masukkan jarak titik puncak ke perpotongan diagonal : "),
        Validator.CekInputFloat("Masukkan tinggi prisma              : "));
    PrintHasilBangun3D("Prisma Layang-layang", prisLayang.getVolume(), prisLayang.getLuas());
  }

  void HitungPrismaSegitiga() {
    PrintTextDiTengah(40, "Prisma Segitiga", ' ', ' ');
    PrintGaris(40, '=');
    DuaDimensiApp.GambarSegitigaPrisma();
    PrismaSegitiga prisSegitiga = new PrismaSegitiga(
        Validator.CekInputFloat("Masukkan tinggi prisma   : "),
        Validator.CekInputFloat("Masukkan alas segitiga   : "),
        Validator.CekInputFloat("Masukkan tinggi segitiga : "));
    PrintHasilBangun3D("Prisma Segitiga", prisSegitiga.getVolume(), prisSegitiga.getLuas());
  }

  void HitungPrismaTrapesium() {
    PrintTextDiTengah(40, "Prisma Trapesium", ' ', ' ');
    PrintGaris(40, '=');
    DuaDimensiApp.GambarTrapesium();
    PrismaTrapesium prisTrapesium = new PrismaTrapesium(
        Validator.CekInputFloat("Masukkan alas trapesium         : "),
        Validator.CekInputFloat("Masukkan atap trapesium         : "),
        Validator.CekInputFloat("Masukkan sisi samping trapesium : "),
        Validator.CekInputFloat("Masukkan tinggi prisma          : "));
    PrintHasilBangun3D("Prisma Trapesium", prisTrapesium.getVolume(), prisTrapesium.getLuas());
  }

  void HitungSferoid() {
    PrintTextDiTengah(40, "Oval Sferoid", ' ', ' ');
    PrintGaris(40, '=');

    Sferoid sferoid = new Sferoid(
        Validator.CekInputFloat("Masukkan diagonal_1 : "),
        Validator.CekInputFloat("Masukkan diagonal_2 : "));
    PrintHasilBangun3D("Oval Sferoid", sferoid.getVolume(), sferoid.getLuas());
  }

  void HitungTabung() {
    PrintTextDiTengah(40, "Tabung", ' ', ' ');
    PrintGaris(40, '=');

    Tabung tabung = new Tabung(
        Validator.CekInputFloat("Masukkan tinggi tabung  : "),
        Validator.CekInputFloat("Masukkan jari-jari alas :"));
    PrintHasilBangun3D("Tabung", tabung.getVolume(), tabung.getLuas());
  }

  void HitungCincinTorus() {
    PrintTextDiTengah(40, "Cincin (Torus)", ' ', ' ');
    PrintGaris(40, '=');

    Torus torus = new Torus(
        Validator.CekInputFloat("Masukkan tinggi tabung  : "),
        Validator.CekInputFloat("Masukkan jari-jari alas :"));
    PrintHasilBangun3D("Cincin (Torus)", torus.getVolume(), torus.getLuas());
  }

}
