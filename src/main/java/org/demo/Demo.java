package org.demo;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Demo {
    private static void fibonacciSeries(int n) {
        int a = 0;
        System.out.println(a);
        int b = 1;
        System.out.println(b);
        int c = a + b;
        int counter = 0;
        while (counter++ < n) {
            System.out.println(c);
            a = b;
            b = c;
            c = a + b;
        }
    }

    private static int fibo(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        return fibo(n - 1) + fibo(n - 2);
    }

    private static boolean armstrong3(int n) {
        int num = n;
        int a;
        int armstrong = 0;
        while (num > 0) {
            a = num % 10;
            num /= 10;

            armstrong += a * a * a;
        }

        if (n == armstrong) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean armstrongGeneral(int n) {
        int num = n;
        int a;
        int armstrong = 0;
        int length = String.valueOf(n).length();
        while (num > 0) {
            a = num % 10;
            num /= 10;

            int multiples = 1;
            for (int i = 1; i <= length; i++) {
                multiples *= a;
            }
            armstrong += multiples;
        }

        if (n == armstrong) {
            return true;
        }
        return false;
    }

    private static boolean perfectNumber(int n) {
        int divisor;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            return true;
        }
        return false;
    }

    static int[] factorial(int n) {
        int[] facts = new int[Double.valueOf(Math.sqrt(n)).intValue()];
        int index = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                facts[index++] = i;
            }
        }
        return facts;
    }

    static String reverse(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            char ch = chars[i];
            chars[i] = chars[j];
            chars[j] = ch;
        }
        return new String(chars);
    }
    static int reverseNum(int n) {
        int reversedNum = 0;
        while(n > 0) {
            int r = n % 10;
            reversedNum = reversedNum * 10 + r;
            n/=10;
        }
        return reversedNum;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number:");
        String str = new Scanner(System.in).nextLine();
        System.out.println(reverseNum(Integer.valueOf(str)));
    }
}
