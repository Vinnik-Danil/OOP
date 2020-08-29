package TestForWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N;
        long result = 0;
        N = scanner.nextInt();
        long [] array = new long[N] ;

        for (int i=0; i<N; i++){
            if (result<array[i]) {
                result = array[i];
            }
        }


        for (int i = 0; i < N; i++) {

            array[i] = scanner.nextInt();

            System.out.print(array[i]);
        }

        System.out.println(result);
    }
}
