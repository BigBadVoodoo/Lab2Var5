package com.company;

public class Main {

    public static void main(String[] args) {

 public double functionCalculation (double x) {

            double y;
            double a = 2.3;

     if (x<=0.3) {
         y=1.5*a*Math.pow(Math.cos(x), 2);
     } else if (x>2.3) {
         y=3*a*Math.tan(x);
     } else {
         y=Math.pow((x-2), 2) + 6*a;
     }
    return y;
        }
    }
}
