import java.util.Scanner;

public class ValidatorBeda {
  float nilai;
  boolean valid;
  Scanner sc = new Scanner();

  public float CekInputBeda(String perintah, float alas, float atap) {

    while (!valid) {

      try {
        if (alas > atap) {
          gap = (alas - atap) / 2;
        } else if (alas < atap) {
          gap = (atap - alas) / 2;
        } else {
          throw new Error("Alas dan atap tidak boleh sama. IDIOT");
        }

      } catch (Error e) {
        System.out.println(e.getMessage());
        sc.next();
      }
    }
    // System.out.println("nilai float = "+nilai+" dibagi > "+(nilai/2));
    valid = false;
    return nilai;
  }
}
