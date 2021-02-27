package calc;

import java.util.Scanner;

public class Method {
    Scanner scan = new Scanner(System.in);
    public int sum (int numb1, int numb2){
        return numb1 + numb2;
    }
    public int del (int numb1, int numb2){
        return numb1 - numb2;
    }
    public int mul (int numb1, int numb2){
        return numb1 * numb2;
    }
    public int div (int numb1, int numb2){
        return numb1 / numb2;
    }
}
