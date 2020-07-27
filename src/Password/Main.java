package Password;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Md5 enc = new Md5();

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please print you password: ");
//        String password = scanner.nextLine();
//        System.out.println(password);
//        System.out.println(enc.encryption(password));

        String hash = "88088b9599f664ba6c7755d07f4a867a";
        String pass = "";

        char[] smallLetters = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

//        public static String getPass (int deep, char[] chars, String pass, String hash) throws NoSuchAlgorithmException{
//            if (deep == 0) {
//                if (HashCheck.check(pass, hash)) {
//                    System.out.println(pass);
//                    return pass;
//                } else {
//                    return "";
//                }
//            }
//
//            deep--;
//
//            for (int i = 0; i < chars.length; i++) {
//                String newPass = pass + String.valueOf(chars[i]);
//
//                if (HashCheck.check(newPass, hash)) {
//                    return newPass;
//                }
//
//                String password = getPass(deep, chars, newPass, hash);
//
//                if (!password.isEmpty()) {
//                    return password;
//                }
//            }
//
//            return "";
//
//        }
        String myStr;
        StringBuffer sb = new StringBuffer();
        System.out.println(sb);

        for (char c1 = 'A'; c1 <= 'Z'; c1++) {
            for (char c2 = 'A'; c2 <= 'Z'; c2++) {
                for (char c3 = 'A'; c3 <= 'Z'; c3++) {
                    for (char c4 = 'A'; c4 <= 'Z'; c4++) {
                        sb = new StringBuffer();
                        sb.insert(0, c1);
                        sb.insert(1, c2);
                        sb.insert(2, c3);
                        sb.insert(3, c4);

                        myStr = sb.toString();

                        System.out.println("-----");
                        System.out.println(myStr);

                        String hashResult = enc.encryption(myStr);
                        System.out.println(hashResult);


                        if (hashResult.equals(hash)) {
                            pass=myStr;
                            System.out.println("Password is: " + myStr);
                            return;
                        }
                    }
                }
            }
        }
    }
}