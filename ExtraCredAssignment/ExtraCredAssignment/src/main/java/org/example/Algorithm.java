package org.example;

public class Algorithm {
    public static double findRatio(double[] arr){
        double max1 = 0;
        double max2 = 0;
        double min1 = Double.MAX_VALUE;
        double min2 = Double.MAX_VALUE;

        for (double num: arr){
            if (num < 0)
                return -1;
            if(num > max1){
                max2 = max1;
                max1 = num;
            }
            else if (num > max2)
                max2 = num;

            if (num < min1){
                min2 = min1;
                min1 = num;
            }
            else if (num < min2)
                min2 = num;
        }
        double sum = (max1 + max2)/(min1 + min2);
        return sum;

    }

}
