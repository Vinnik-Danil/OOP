package Password;

import java.io.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Md5 {

    public String encryption(String st) throws IOException {
        MessageDigest messageDigest = null;
        byte[] digest = new byte[0];

        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(st.getBytes());
            digest = messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            System.out.println("ERROR METHOD getInstance");
            e.printStackTrace();
        }

        BigInteger bigInt = new BigInteger(1, digest);
        String md5Hex = bigInt.toString(16);

        while( md5Hex.length() < 32 ){
            md5Hex = "0" + md5Hex;
        }
        FileWriter fileWriter = new FileWriter("Password1.txt",true);
        fileWriter.write(st+"\t");
        fileWriter.write(md5Hex+"\n");

        PrintStream printStream = new PrintStream("Password.txt");
        printStream.print(st+"\t");
        printStream.print(md5Hex+"\n");
        return md5Hex;
    }

    public void save(String st)  throws FileNotFoundException {
//        PrintWriter out = new PrintWriter("Password.txt");
//        out.println(st);

        PrintStream printStream = new PrintStream("Password.txt");
        printStream.println(st);
    }


}
