package com.company.additions;

import java.math.BigDecimal;

public class MathAction {

    public static BigDecimal performAction(double d1, double d2, String act){
        BigDecimal res = BigDecimal.valueOf(0);
        switch (act){
            case "+":
                res = add(d1,d2);
                break;
            case "-":
                res = sub(d1,d2);
                break;
            case "*":
                res = mult(d1,d2);
                break;
            case "/":
                res = div(d1,d2);
        }
        return res;
    }

    protected static BigDecimal add (double d1, double d2){
        BigDecimal result = BigDecimal.valueOf(d1).add(BigDecimal.valueOf(d2));
        return result;
    }
    protected static BigDecimal sub (double d1, double d2){
        BigDecimal result = BigDecimal.valueOf(d1).subtract(BigDecimal.valueOf(d2));
        return result;
    }
    protected static BigDecimal mult (double d1, double d2){
        BigDecimal result = BigDecimal.valueOf(d1).multiply(BigDecimal.valueOf(d2));
        return result;
    }
    protected static BigDecimal div (double d1, double d2){
        BigDecimal result = BigDecimal.valueOf(d1).divide(BigDecimal.valueOf(d2));
        return result;
    }
}
