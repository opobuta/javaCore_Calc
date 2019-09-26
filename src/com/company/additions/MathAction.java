package com.company.additions;

import java.math.BigDecimal;

public class MathAction {

    public static BigDecimal performAction(double d1, double d2, String act){
        switch (act){
            case "+":
                return add(d1,d2);
            case "-":
                return sub(d1,d2);
            case "*":
                return mult(d1,d2);
            case "/":
                return div(d1,d2);
            default:
                return BigDecimal.ZERO;
        }
    }

    private static BigDecimal add (double d1, double d2){
        BigDecimal result = BigDecimal.valueOf(d1).add(BigDecimal.valueOf(d2));
        return result;
    }
    private static BigDecimal sub (double d1, double d2){
        BigDecimal result = BigDecimal.valueOf(d1).subtract(BigDecimal.valueOf(d2));
        return result;
    }
    private static BigDecimal mult (double d1, double d2){
        BigDecimal result = BigDecimal.valueOf(d1).multiply(BigDecimal.valueOf(d2));
        return result;
    }
    private static BigDecimal div (double d1, double d2){
        BigDecimal result = BigDecimal.valueOf(d1).divide(BigDecimal.valueOf(d2));
        return result;
    }
}
