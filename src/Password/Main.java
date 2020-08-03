package Password;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        Md5 enc = new Md5();

        String hash = "88088b9599f664ba6c7755d07f4a867a";
        enc.decoding(hash);


    }
}