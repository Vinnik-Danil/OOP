package Password;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class HashCheck {

//    public static boolean check(String pass, String hash) throws NoSuchAlgorithmException {
//        MessageDigest md = MessageDigest.getInstance("MD5");
//        md.update(pass.getBytes());
//        byte[] digest = md.digest();
//
//        String newHash = DatatypeConverter.printHexBinary(digest);
//
//        return hash.equalsIgnoreCase(newHash);
//    }
}