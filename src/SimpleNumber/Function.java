package SimpleNumber;

import Pow.Metod;

import java.awt.*;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Function {

    public double double_mean(ArrayList<Integer> list){
        double result=0;
        for (int i = 0; i < list.size() ; i++) {
            result = result + list.get(i);
        }
        return result/list.size();
    }

    public double returnPositiveNumb(ArrayList<Integer> list){
        long result=0;
        Metod m= new Metod();

        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) < 0) {
                continue;
            }

            if (list.get(i) == null) {
                continue;
            }

            if (m.pow(list.get(i),2) % 2 == 0) {
                result += m.pow(list.get(i),2) ;
            }
        }
        return result;
    }
}
