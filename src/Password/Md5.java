package Password;

import java.io.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.TreeMap;


public class Md5 extends Thread {

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

    public String dearchivatedFourSymbol (String st) throws IOException {
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

                        String hashResult = encryption(myStr);
                        System.out.println(hashResult);


                        if (hashResult.equals(st)) {
                            System.out.println("Password is: " + myStr);
                            return myStr;
                        }
                    }
                }
            }
        }

        return"";
    }

    public void decoding (String st) throws IOException {

        Runnable runnableAG = () -> {
            try {
                System.out.println(Thread.currentThread().getName());
                aG(st);
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        Runnable runnableHN = () -> {
            try {
                System.out.println(Thread.currentThread().getName());
                hN(st);
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        Runnable runnableOU = () -> {
            try {
                System.out.println(Thread.currentThread().getName());
                oU(st);
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        Runnable runnableVZ = () -> {
            try {
                System.out.println(Thread.currentThread().getName());
                vZ(st);
            } catch (IOException e) {
                e.printStackTrace();
            }
        };

        Thread threadAG = new Thread(runnableAG);
        threadAG.start();
        Thread threadHN = new Thread(runnableHN);
        threadHN.start();
        Thread threadOU = new Thread(runnableOU);
        threadOU.start();
        Thread threadVZ = new Thread(runnableVZ);
        threadVZ.start();

    }

    public String aG (String st) throws IOException {
        String myStr;
        StringBuffer sb = new StringBuffer();
        System.out.println(sb);

        for (char c1 = 'A'; c1 <= 'G'; c1++) {
            for (char c2 = 'A'; c2 <= 'Z'; c2++) {
                for (char c3 = 'A'; c3 <= 'Z'; c3++) {
                    for (char c4 = 'A'; c4 <= 'Z'; c4++) {
                        sb = new StringBuffer();
                        sb.insert(0, c1);
                        sb.insert(1, c2);
                        sb.insert(2, c3);
                        sb.insert(3, c4);

                        myStr = sb.toString();

//                        System.out.println("-----");
//                        System.out.println(myStr);

                        String hashResult = encryption(myStr);
//                        System.out.println(hashResult);


                        if (hashResult.equals(st)) {
                            System.out.println("Password is: " + myStr);
                            return myStr;

                        }
                    }
                }
            }
        }

        return"";
    }

    public String hN (String st) throws IOException {

        String myStr;
        StringBuffer sb = new StringBuffer();
        System.out.println(sb);

        for (char c1 = 'H'; c1 <= 'N'; c1++) {
            for (char c2 = 'A'; c2 <= 'Z'; c2++) {
                for (char c3 = 'A'; c3 <= 'Z'; c3++) {
                    for (char c4 = 'A'; c4 <= 'Z'; c4++) {
                        sb = new StringBuffer();
                        sb.insert(0, c1);
                        sb.insert(1, c2);
                        sb.insert(2, c3);
                        sb.insert(3, c4);

                        myStr = sb.toString();

//                        System.out.println("-----");
//                        System.out.println(myStr);

                        String hashResult = encryption(myStr);
//                        System.out.println(hashResult);


                        if (hashResult.equals(st)) {
                            System.out.println("Password is: " + myStr);
                            return myStr;
                        }
                    }
                }
            }
        }

        return"";
    }

    public String oU (String st) throws IOException {

        String myStr;
        StringBuffer sb = new StringBuffer();
        System.out.println(sb);

        for (char c1 = 'O'; c1 <= 'U'; c1++) {
            for (char c2 = 'A'; c2 <= 'Z'; c2++) {
                for (char c3 = 'A'; c3 <= 'Z'; c3++) {
                    for (char c4 = 'A'; c4 <= 'Z'; c4++) {
                        sb = new StringBuffer();
                        sb.insert(0, c1);
                        sb.insert(1, c2);
                        sb.insert(2, c3);
                        sb.insert(3, c4);

                        myStr = sb.toString();

//                        System.out.println("-----");
//                        System.out.println(myStr);

                        String hashResult = encryption(myStr);
//                        System.out.println(hashResult);


                        if (hashResult.equals(st)) {
                            System.out.println("Password is: " + myStr);
                            return myStr;
                        }
                    }
                }
            }
        }

        return"";
    }

    public String vZ (String st) throws IOException {

        String myStr;
        StringBuffer sb = new StringBuffer();
        System.out.println(sb);

        for (char c1 = 'V'; c1 <= 'Z'; c1++) {
            for (char c2 = 'A'; c2 <= 'Z'; c2++) {
                for (char c3 = 'A'; c3 <= 'Z'; c3++) {
                    for (char c4 = 'A'; c4 <= 'Z'; c4++) {
                        sb = new StringBuffer();
                        sb.insert(0, c1);
                        sb.insert(1, c2);
                        sb.insert(2, c3);
                        sb.insert(3, c4);

                        myStr = sb.toString();

//                        System.out.println("-----");
//                        System.out.println(myStr);

                        String hashResult = encryption(myStr);
//                        System.out.println(hashResult);


                        if (hashResult.equals(st)) {
                            System.out.println("Password is: " + myStr);
                            return myStr;
                        }
                    }
                }
            }
        }

        return"";
    }

}
