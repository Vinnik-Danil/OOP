package SumOfNumb;

import java.awt.geom.Area;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int myArray[] = {3,5,4,12,7};
        int sum = 12;
        for (int i = 0; i <myArray.length ; i++) {
            for (int j = 0; j <myArray.length ; j++) {
                if (myArray[i]+myArray[j]==sum){
                    System.out.println("Index of numb["+i+","+j+"]");
                    return;
                }
            }
        }
    }
}
