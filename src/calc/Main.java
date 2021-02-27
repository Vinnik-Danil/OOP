package calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Method met = new Method();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input data");
        int numb1 = scan.nextInt();
        System.out.println("Please input data");
        int numb2 = scan.nextInt();
        System.out.println(met.sum(numb1, numb2));
        System.out.println(met.mul(numb1, numb2));
        System.out.println(met.del(numb1, numb2));
        System.out.println(met.div(numb1, numb2));
    }
}
