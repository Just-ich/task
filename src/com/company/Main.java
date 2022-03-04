package com.company;


public class Main {

    public static void main(String[] args) {

//#1
        System.out.println("1. Вывести числа от 1 до 100.");
        for (int i = 1; i <=100 ; i++) {
            System.out.print(i+ " ");
        }

//#2
        System.out.println("\n\n2. Вывести числа от 100 до 1.");
        for (int q = 100; q >=1 ; q--) {
            System.out.print(q+ " ");
        }
//#3
        System.out.println("\n\n3. Вывести только чётные числа от 1 до 100.");
        for (int w = 0; w <=100; w=w+2) {
            System.out.print(w+" ");
        }
//#4
        System.out.println("\n\n4. Вывести только нечётные числа от 100 до 1.");
        for (int e = 99; e >=0; e=e-2) {
            System.out.print(e+ " ");
        }

//#5
        System.out.println("\n\n5. Вывести каждый десяток от 1 до 100.");
        for (int r = 0; r <=100; r=r+10) {
            System.out.print(r+ " ");
        }

//#6
        System.out.print("\n\n6. Вывести лесенку из звёздочек. от 1 до 5 вниз");


        for (int i = 5; i >= 0; i--) {

            for (int j = i; j < 5; j++) {
                System.out.print('*'+ "  ");
            }

            System.out.println( "  ");
        }


//#7
        System.out.println("\n\n7*. Вывести таблицу умножения на 3.");
        int p=3;
        for (int u = 1; u <=10 ; u++) {
            int s=u*p;
            System.out.println(u+"*"+p+"="+s);
        }

//#8
        System.out.println("\n\n8*. Вывести всю таблицу умножения.");

        for (int g = 1; g <=10 ; g++) {

                for (int u = 1; u <=10 ; u++) {
                     int s=u*g;
                     System.out.printf("%-25s" , g + " * " + u + " = " + s + "   ");
                }

            System.out.println();
        }

//#9*.

        System.out.println("\n\n9*. Вывести макс и мин цифру в числе int number = 54734.");

        int number = 54734;
        byte max, min;
        max=min=(byte)(number % 10);
        while (number>0){
            byte cur = (byte)(number % 10);
            if (cur > max) {
                max = cur;
            }
            if (cur < min) {
                min = cur;
            }
            number /= 10;
        }

        System.out.println("Max " + max + ", min " + min);



//#10

        System.out.println("\n\n10*.Вывести среднее значение всех цифр в числе int number = 54734.");

                int[] v = {5,4,7,3,4};
                double summa =0;
                for (int x : v ) {
                    summa += x;
                }
                    System.out.println(summa/ v.length);


//#11**.

        System.out.println("\n\n11**. Вывести чётные и нечётные числа через while and if, int i = 345645678");


        int z= 345645678;
        int k=z;
        int q =0;
        System.out.println("Чётные: ");
        while (z>0) {
            q = z % 10;
            z = z / 10;
            if (q % 2 == 0) {
                System.out.print(q);
            }
        }

        System.out.println("\nНечётные: ");
        while (k>0){
            q = k % 10;
            k = k / 10;
            if ( q % 2!= 0 ){
                System.out.print(q);
            }
        }



    }
}