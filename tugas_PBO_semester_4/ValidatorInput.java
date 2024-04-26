import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class ValidatorInput {
  Scanner sc = new Scanner(System.in);
  int nilai2;
  char keputusan;
  float nilai;
  Boolean valid = false;

  public void CekInputUkuran(float ukuran) throws ValidationException {
    if (ukuran <= 0) {
      throw new ValidationException("Ukuran bangun geometri harus positif!");
    }

  }

  // public void CekInputLanjutProgram(char keputusan) throws ValidationException
  // {
  // if (keputusan != 'y' && keputusan != 'Y' && keputusan != 'n' && keputusan !=
  // 'N') {
  // throw new ValidationException("Gunakanlah Respon yang sesuai!");
  // }
  // }

  // public void CekInputUkura(String Pertanyaan) {
  // Scanner sc = new Scanner(System.in);
  // // digunakan untuk membaca titik sebagai desimal
  // // bukan sebuah karakter
  // sc.useLocale(Locale.US);
  // boolean valid = false;

  // while (!valid) {
  // try {
  // System.out.print(Pertanyaan);
  // // inputan
  // input = sc.nextFloat();
  // CekInputUkuran(input);
  // valid = true;
  // } catch (ValidationException e) {
  // System.out.println("Error: " + e.getMessage());
  // } catch (Exception e) {
  // // pesan error
  // System.out.println("Input tidak cocok! Ulangi Bro.");
  // sc.next();
  // }
  // }
  // valid = false;

  // }

  public boolean CekInputKeputusan(String pertanyaan) {

    while (!valid) {
      try {
        System.out.print(pertanyaan);
        keputusan = sc.next().charAt(0);
        // CekInputLanjutProgram(keputusan);
        valid = true;
      } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        // sc.next();
      }
    }
    valid = false;
    if (keputusan == 'y' || keputusan == 'Y') {
      return true;
    } else {
      return false;
    }
  }

  public float CekInputFloat(String perintah) {

    while (!valid) {
      try {
        System.out.print(perintah);
        // inputan
        nilai = sc.nextFloat();
        CekInputUkuran(nilai);
        valid = true;
      } catch (ValidationException e) {
        System.out.println(e.getMessage());
      } catch (Exception e) {
        // pesan error
        System.out.println("Inputan anda tidak sesuai! Ulangi!");
        sc.next();
      }
    }
    // System.out.println("nilai float = "+nilai+" dibagi > "+(nilai/2));
    valid = false;
    return nilai;
  }

  public void ScreenBreak(String perintah) {
    System.out.print(perintah);
    sc.nextLine();
    sc.nextLine();
  }

  public int CekInputInteger(String perintah) {
    while (!valid) {
      try {
        System.out.print(perintah);
        // inputan
        nilai2 = sc.nextInt();
        valid = true;
      } catch (Exception e) {
        // pesan error
        System.out.println("Inputan anda tidak sesuai! Ulangi!");
        sc.next();
      }
    }
    // System.out.println("nilai float = "+nilai+" dibagi > "+(nilai/2));
    valid = false;
    return nilai2;
  }

  public class ValidationException extends Exception {
    public ValidationException(String message) {
      super(message);
    }
  }

}
