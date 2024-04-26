
public class MainProgram {
    public static void main(String[] args) {
        ValidatorInput Validator = new ValidatorInput();
        TigaDimensiApp TigaDimensi = new TigaDimensiApp();
        DuaDimensiApp DuaDimensi = new DuaDimensiApp();

        // boolean ulang = false;
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("");
            System.out.println("========================================");
            System.out.println("                Menu Utama              ");
            System.out.println("========================================");
            System.out.println("1. Hitung 2 Dimensi");
            System.out.println("2. Hitung 3 Dimensi");
            System.out.println("3. Exit");
            System.out.println("========================================");
            int pilihan = (int)Validator.CekInputFloat("Pilihan Anda : ");

            System.out.println("");

            switch (pilihan) {
                case 1:
                    DuaDimensi.open();
                    break;
                case 2:
                    TigaDimensi.open();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Maaf Opsi anda tidak terdaftar!");
                    break;
            }
            // System.out.println("------------------------------------------");
            // ulang = Validator.CekInputKeputusan("Lanjut Program(Y/N): ");

        } while (true);

    }
}