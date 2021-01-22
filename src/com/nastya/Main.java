package com.nastya;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        first();    //задание 1
        second();   //задание 2
        third();    //задание 3
        fourth();   //задание 4
        fifth();    //задание 5
        sixth();    //задание 6
        seventh();  //задание 7
    }

    public static void first() {    //1
        int arr[] = {0, 1, 0, 0, 1, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i] = 1;
            else
                arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void second() {       //2
        int sm[] = new int[8];
        int counter = 0;
        for (int a = 0; a < sm.length; a++) {
            sm[a] = counter;
            System.out.print(sm[a] + " ");
            counter = counter + 3;
        }
        System.out.println();
    }

    public static void third() {     //3
        int ss[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 2
        for (int i = 0; i < ss.length; i++) {
            if (ss[i] < 6) {
                ss[i] = ss[i] * 2;
            }
            System.out.print(ss[i] + " ");
        }
        System.out.println();
    }

    public static void fourth() {     //4
        int xy[][] = new int[10][10];
        for (int i = 0; i < xy.length; i++) {
            xy[i][i] = 1;
            xy[i][(xy.length - 1 - i)] = 1;
        }
        for (int i = 0; i < xy.length; i++) {
            for (int j = 0; j < xy[i].length; j++) {
                System.out.print(xy[i][j] + "  ");
            }
            System.out.println();
        }

    }

    public static void fifth() {     //5
        int a[] = {1000, 100, 5, 0, 6, -3, 0, -10000};
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
            else min = a[i];
        }
        System.out.println("Максимальное число равно " + max);
        System.out.println("Минимальное число равно " + min);
    }

    public static void seventh() {     //7
        int array[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n =-3;
        int tm ;
        if (n > 0) {
            for (int slide = 0; slide < n; slide++) { //верно
                for (int i = 0; i < (array.length - 1); i++) {
                    tm = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tm;
                }
            }
        }
        else {
            n=Math.abs(n);
            for (int slide = 0; slide < n; slide++) {
                for (int i =(array.length - 1); i > 0 ; i--) {
                    tm = array[i];
                    array[i] = array[i-1];
                    array[i-1] = tm;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void sixth() {     //6
        int array[] = {2, 2, 2, 1, 2, 2, 10, 1};
        for (int d = 1 ; d <(array.length); d++) {
            int sum1 = 0 ;
            int sum2 = 0 ;
            int array1[] = new int[d];
            int array2[] = new int[array.length - d];
            for (int i = 0; i < (array.length -d) ; i++) {
                array2[i] = array[i + d];
                sum2 = sum2 + array2[i] ;
            }
            for (int j = 0; j < d ; j++) {
                array1[j] = array[j];
                sum1 = sum1 + array1[j] ;
            }
            if (sum1 == sum2) {
                System.out.println("checkBalance("+Arrays.toString(array1).replace("]", "")+"||"+Arrays.toString(array2).replace("[", "" )+") → true");
            }
        }
    }
}

