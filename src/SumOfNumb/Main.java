package SumOfNumb;

import Numb_Fibonacci.Array;

import java.awt.geom.Area;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Method method = new Method();

        int myArray[] = {3,5,4,12,7};
//        int sum = 12;
//        for (int i = 0; i <myArray.length ; i++) {
//            for (int j = 0; j <myArray.length ; j++) {
//                if (myArray[i]+myArray[j]==sum){
//                    System.out.println("Index of numb["+i+","+j+"]");
//                    return;
//                }
//            }
//        }

        System.out.println(method.BinarySearch_Iter(myArray, 12));


    }
}
