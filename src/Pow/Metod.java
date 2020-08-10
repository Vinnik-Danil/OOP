package Pow;

public class Metod {
    public double pow  (double numb, double powValue){
        double result=1;
//        for (int i = 1; i <= powValue; i++) {
//            result = result * numb;
//        }

        if (powValue%2==0){
            double avrPowValue = powValue/2;
            for (int i = 1; i <= avrPowValue; i++) {
                result = result * numb;
            }
            return result*result;
        }
        else
        {
            double avrPowValue = (powValue-1)/2;
            for (int i = 1; i <= avrPowValue; i++) {
                result = result * numb;
            }
            return result*result*2;
        }

//        return result;
    }
}
