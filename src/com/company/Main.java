package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

  /*   1. 2 целых числа - сумма, разность, (ср. ариф(суммы и разности). округляем в большую сторону, - месяца).

    Scanner in = new Scanner(System.in);
    System.out.print("Введите первое число: ");
    int x = in.nextInt();
    System.out.print("Введите второе число: ");
    int y = in.nextInt();
    in.close();
    int sum = x+y;
    int raz = x-y;
    System.out.printf("Сумма: %d\nРазность: %d\n", sum, raz);
    double sr = Math.ceil((sum+raz)/2);
    System.out.printf("Ср. ариф: %f\n", sr);
        if (sr == 1) {
            System.out.println("Январь");
        } else if (sr == 2) {
            System.out.println("Февраль");
        } else if (sr == 3) {
            System.out.println("Март");
        } else if (sr == 4) {
            System.out.println("Апрель");
        } else if (sr == 5) {
            System.out.println("Май");
        } else if (sr == 6) {
            System.out.println("Июнь");
        } else if (sr == 7) {
            System.out.println("Июль");
        } else if (sr == 8) {
            System.out.println("Август");
        } else if (sr == 9) {
            System.out.println("Сентябрь");
        } else if (sr == 10) {
            System.out.println("Октябрь");
        } else if (sr == 11) {
            System.out.println("Ноябрь");
        } else if (sr == 12) {
            System.out.println("Декабрь");
        } else {
            System.out.println("Месяца под данным номером не существует");
        }
Сумма четных чисел - консоль
в матрице сумму диагоналей - рандом
*/

//        Scanner in = new Scanner(System.in);
//        int d = 0;
//        System.out.println("Введите числа массива");
//        int[] mas = new int[10] ;
//        for (int i = 0; i < mas.length; i ++)
//        {
//            mas[i] = in.nextInt();
//        }
//        System.out.println("Массив ");
//        for (int i = 0; i < mas.length; i++) {
//            System.out.print (" " + mas[i]);
//        }
//        System.out.println(" ");
//        for (int i = 0; i < mas.length; i++) {
//            if (mas[i]%2 == 0)
//            {
//                 d += mas[i];
//
//            }
//
//        }
//        System.out.print ("Сумма " + d);
//        in.close();
//

//        System.out.print("\nВторой массив ");
//        int b = 0;
//        int f = 0;
//        int min = 10;
//        int max = 20;
//        int diff = max - min;
//        int[][] mas1 = new int[5][5] ;
//        Random rnd = new Random();
//        for (int i = 0; i < mas1.length; i ++)
//        {
//            for (int j = 0; j < mas1.length; j ++)
//            {
//            mas1[i][j] = rnd.nextInt(diff+1);
//            mas1[i][j] += min;
//        }
//        }
//        for (int i=0;i < mas1.length;i++)
//        {
//            System.out.println();
//            for (int j=0;j < mas1[i].length;j++)
//            {
//                System.out.print(mas1[i][j]+" ");
//            }
//        }
//        for (int i=0;i < mas1.length;i++)
//        {
//            for (int j=0;j < mas1[i].length;j++)
//            {
//             if(i == j)
//             {
//                 b += mas1[i][j];
//             }
//             else if ( i+j == mas1.length -1)
//             {
//                 f+= mas1[i][j];
//             }
//            }
//        }
//        int g = b+f;
//        System.out.println("\nГлавная диагональ " +b);
//        System.out.println("Побочная " +f);
//        System.out.println("Сумма  диагоналей матрицы " + g);


//
//        //Задание 1
//        String str = "Привет мир и Земля";
//        char[] g = str.toCharArray();
//        int k = 0;
//        for(char i:g)
//        {
//            if(i >= 'а' && i <='я') {
//                k++;
//            }
//
//        }
//        System.out.println("Кол-во : " + k);
//

//
//        //Задание 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Преложение ");
//        String str1 = sc.nextLine();
//        System.out.println("Символ ");
//        String ch = sc.next();
//        char char1 = ch.charAt(0);
//        int kol = 0;
//        for(int i = 0; i< str1.length(); i++)
//        {
//            str1.split(" ");
//            if(str1.charAt(i) == char1)
//            {kol++; }
//        }
//        System.out.println("Количество вхождений " + kol);
//
//        //Задание 3
//        int h = 6;
//        String st = " ";
//        char a = '%';
//        char b = '!';
//        for (int i = 0; i < h; i ++)
//        {
//            System.out.printf("%s%c%c",st,a,b);
//        }


        //Строка aadddjjjjssssopapa
        //Вывести букву- сколько ее
        //a2d3j4s4o

        String str = "AAAHDDYYTAAARRR";
//        Scanner str1 = new Scanner(System.in);
//        System.out.println("Преложение ");
//        String str = str1.nextLine();
        int k = 0;
       count(str,k);
        }
        public static void count (String str,int k) {
            char ch;
            for (int i = 0; i < str.length(); i++)
            {
                ch = str.charAt(i);
                if (str.indexOf(ch) < i) {continue;}
                for(int j = 0;j< str.length(); j++)
                {
                    if(str.charAt(j) == ch)
                    {k++;}
                }
                if(k == 1) {
                    System.out.print(ch);}
                else{
                    System.out.print(ch + "" + k);
                    k = 0;
                }
            }
    }
}















