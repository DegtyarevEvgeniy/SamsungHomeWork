package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void printPermutn(String str, String ans) {

        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;

        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            printPermutn(ros, ans + ch);

        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        printPermutn(s, "\n");

    }
}

