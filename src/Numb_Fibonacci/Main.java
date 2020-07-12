package Numb_Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        long a = 0, b = 1;
        int n;
        long sum_fib;
        System.out.println("Please input count numb");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        for (int i = 0; i < n; i++) {
            sum_fib = a + b;
            a = b;
            b = sum_fib;
            array.add(sum_fib);

        }

        array.getMas();
        System.out.println("Please input index of numb");
        int x = s.nextInt();
        if (x <= n) {
            System.out.println(array.numbOfindex(x));
        } else {
            System.out.println("index have not collection");
            return;
        }
//        array.add(1);
//        array.add(2);
//        array.add(3);
//        array.add(4);
//        array.add(5);

        System.out.println(" Numb have array fibonacci "+array.BinarySearch_Iter(13));
    }
}