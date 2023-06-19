package generics;

import java.util.Arrays;
import java.util.List;

public class wildcards{
    public static double sumOfList( List<? extends Number> list){
        double sum = 0.0;
        for(Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }
    
    public static void main(String[] args) {
        List<Double> l = Arrays.asList(1.12, 2.59, 64.45);
        System.out.println("sum : " + sumOfList(l));
    }
}