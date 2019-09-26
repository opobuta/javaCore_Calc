package com.company.additions;

import javafx.scene.Scene;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReadValue {
        public static double readDouble (Scanner s) {
            int c = 0;
            String str;
            do {
                if (c == 0) System.out.println("Enter numeric value:");
                else System.out.println("Wrong value format. Please reenter double value:");
                str = s.nextLine().trim();
                c++;
            } while (!Pattern.matches("[-]?\\d*[.]?\\d*", str));
            return Double.parseDouble(str);
        }

        public static String readAction(Scanner s){
            int c = 0;
            String str;
            do {
                if (c == 0) System.out.println("Enter action ( + - * / ):");
                else System.out.println("Wrong action format. Please reenter action ( + - * / ):");
                str = s.nextLine().trim();
                c++;
            } while (!Pattern.matches("[-+*/]{1}", str));
            return str;
        }
}
