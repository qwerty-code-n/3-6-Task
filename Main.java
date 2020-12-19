package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Task1");
        System.out.print("Введите 3 числа: ");
        solutions();
        System.out.println("Task2");
        System.out.print("");
        findZip();
        System.out.println("Task3");
        System.out.print("Введите число: ");
        System.out.println(checkPerfect());
        System.out.println("Task4");
        System.out.print("Введите cтроку: ");
        flipEndChars();
        System.out.println("Task5");
        System.out.print("Введите cтроку: #... ");
        isValidHexCode();
        System.out.println("Task6");
        System.out.println(same());
        System.out.println("Task7");
        show();
        System.out.println("Task8");
        longestZero();
        System.out.println("Task9");
        nextPrime();
        System.out.println("Task10");
        rightTriangle();








    }

    public static void solutions() {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = b * b - 4 * a * c;
        if (d == 0) {
            System.out.println(1);
        }
        if (d < 0) {
            System.out.println(0);
        }
        if (d > 1) {
            System.out.println(2);
        }
    }

    public static void findZip() {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String z = "z";
        String i = "i";
        String p = "p";
        double chet = 0;
        double jj = 0;
        for (int j = 0; j <= str1.length() - 1; j++) {
            if ((str1.charAt(j) == z.charAt(0)) && (str1.charAt(j + 1) == i.charAt(0)) && (str1.charAt(j + 2) == p.charAt(0))) {
                chet = chet + 1;
            }
            if (chet == 2) {
                jj = j;
                break;
            }
        }
        if (chet == 2) {
            System.out.println(jj);
        } else {
            System.out.println("-1");
        }
    }

    public static boolean checkPerfect() {
        Scanner input = new Scanner(System.in);
        double chislo = input.nextDouble();
        int s = 0;

        for (int i = 0; i < chislo - 1; i++) {
            if (chislo % i == 0) {
                s = s + i;
            }
        }
        if (s == chislo) {
            return true;
        } else return false;
    }

    public static void flipEndChars() {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        char x1 = 1;
        if (str1.length() < 2) {
            System.out.println("Incompatible.");
        } else if (str1.charAt(0) == str1.charAt(str1.length() - 1)) {
            System.out.println("Two's a pair.");
        } else {
            char[] chArray = str1.toCharArray();
            x1 = chArray[0];
            chArray[0] = chArray[str1.length() - 1];
            chArray[str1.length() - 1] = x1;
            System.out.println(chArray);
        }
    }

    public static void isValidHexCode() {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        char[] chArray = str1.toCharArray();
        String s = "0123456789";
        String s1 = "ABCDEFabcdef";
        int b = 0;
        String p = "#";
        for (int i = 1; i <= str1.length() - 1; i++) {
            String z = String.valueOf(chArray[i]);
            if ((s.contains(z)) || (s1.contains(z))) {
                b = b + 1;
            } else {
                break;
            }
        }
        if ((b == 6) && ((str1.charAt(0) == p.charAt(0)))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean same() {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Полученный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();

        System.out.println("Введите кол-во элементов массива №2: ");
        int size2 = input.nextInt();
        int array2[] = new int[size];
        System.out.println("Введите элементы:");

        for (int i = 0; i < size; i++) {
            array2[i] = input.nextInt();
        }
        System.out.print("Полученный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array2[i]);
        }
        System.out.println();

        int a = 1;
        int b = 1;
        for (int i = 1; i < array.length; i++) {
            int c = 0;
            for (int j = 0; j < i; j++) {
                if (array[i] != array[j]) {
                    c = c + 1;
                }
                if (c == i) {
                    a = a + 1;
                }
            }
        }
        for (int i = 1; i < array2.length; i++) {
            int c1 = 0;
            for (int j = 0; j < i; j++) {
                if (array2[i] != array2[j]) {
                    c1 = c1 + 1;
                }
                if (c1 == i) {
                    b = b + 1;
                }
            }
        }
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static void show()
    {

        int a, b;
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        Main p = new Main();
        try {
            int square = (int) Math.pow(no, 2);
            String str = String.valueOf(square);
            int l = (int) str.length() / 2;
            b = Integer.parseInt(str.substring(l));
            if (l == 0) {
                a = 0;
                p.show(a, b, no);
            }
            a = Integer.parseInt(str.substring(0, l));

            p.show(a, b, no);

        } catch (Exception e) {
            System.out.print("");
        }
    }

    public static void show(int a, int b, int no) {
        if ((a + b) != no) {
            System.out.println(no + " Не является числом Капрекара");
        } else {
            System.out.println(no + " Число Капрекара");
        }
    }
    public static void longestZero()
    {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String strArr[] = str1.split("");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++)
        {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        int k = 0;
        int kmax = 0;
        for (int i = 0; i < numArr.length; i++)
        {
            if (numArr[i] == 0)
            {
                k = k + 1;
            }
            else
            {
                k = 0;
            }
            if (k > kmax)
            {
                kmax = k;
            }
        }
        String a = "";
        for (int i = 0; i < kmax; i++) {
            a += "0";
        }
        System.out.println(a);
    }
    public static void nextPrime()
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = 0;
        for (int i = 1; i < n+1; i++)
        {
            if (n%i == 0)
            {
                k = k + 1;
            }
        }
        if (k==2)
        {
            System.out.println(n);
        }
        else
        {
            int n1 = n;
            int k1 = 0;
            while (k1!=1)
            {
                k1 = 0;
                n1 = n1 + 1;
                for (int i = 2; i < n1+1; i++)
                {
                    if (n1%i == 0)
                    {
                        k1 = k1 + 1;
                    }
                }
            }
            System.out.println(n1);
        }
    }
    public static void rightTriangle()
    {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int n = 0;
        if (y > x)
        {
            n = x;
            x = y;
            y = n;
        }
        if (z > x)
        {
            n = x;
            x = z;
            z = n;
        }
        if ((x*x) == ((y*y) + (z*z)))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }

}



