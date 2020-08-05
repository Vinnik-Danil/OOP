package Password;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //f016441d00c16c9b912d05e9d81d894d = very
        //5ebe2294ecd0e0f08eab7690d2a6ee69 = secret
        //13d70e09909669272b19647c2a55dacb = goodforyou
        //5f50dfa5385e66ce46ad8d08a9c9be68

        Md5 enc = new Md5();

        String hash1 = "88088b9599f664ba6c7755d07f4a867a";
        String hash2 = "5ebe2294ecd0e0f08eab7690d2a6ee69";
        String hash3 = "13d70e09909669272b19647c2a55dacb";

        enc.decoding("5ebe2294ecd0e0f08eab7690d2a6ee69");
    }
}