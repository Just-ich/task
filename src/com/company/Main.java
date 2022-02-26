package com.company;


import com.sun.jdi.IntegerValue;
import com.sun.jdi.connect.Connector;

public class Main {

    public static void main(String[] args) {
// 1
        Double c = Double.valueOf(5);
        System.out.println(c);

// 2
        String s = String.valueOf(80);
        Integer i = Integer.parseInt(s);
        System.out.println(i);


// 3
        int q =Integer.parseInt("1100001001", 2);
        System.out.println(q);

// 4
        String w = String.valueOf(1234567890);
        Integer w1 = Integer.parseInt(w);
        System.out.println(w1);

// 5
        System.out.println(Integer.MAX_VALUE);

// 6
        System.out.println(Integer.MIN_VALUE);

// 7
        System.out.println(Byte.MAX_VALUE);

// 8
        System.out.println(Byte.MIN_VALUE+"\n");

// 9
        String str = "Привет группа 132";
        String strUpper = str.toUpperCase();
        System.out.println("Оригинал строки: " + str);
        System.out.println("Изменение строки в верхний регистр: " + strUpper+"\n");

// 10
        String Str1 = new String("Привет группа 132");
        System.out.print("Длина строки \"Привет группа 132\" - " + Str1.length()+ " \n" );

// 11

        String str1 = strUpper.replaceAll("(.{1})", "$1 ");
        System.out.println(str1);
    }
}