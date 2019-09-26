package com.company;

import com.company.additions.MathAction;
import com.company.additions.ReadValue;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        double d1 = ReadValue.readDouble(s);
        String action = ReadValue.readAction(s);
        double d2;
        if (!action.equals("/")) d2 = ReadValue.readDouble(s);
        else do {
            System.out.print("Second value mustn't be equal to '0'. ");
            d2 = ReadValue.readDouble(s);
        } while (d2 == 0);
        BigDecimal res = MathAction.performAction(d1,d2,action);
        System.out.println("The result = " + res);


    }
}
