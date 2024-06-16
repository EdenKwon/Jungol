package Jungol;

import java.io.*;
import java.util.*;

// prac,test,exam ==> 연습문제,자가진단,형성평가
public class SelCtrl_Exam {
    public static void main(String[] args) throws IOException {
        ex02();
    }

    public static int[] readInt(BufferedReader br, int count) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        return numbers;
    }

    public static void ex01() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputs[] = readInt(br, 2);

        int a = inputs[0];
        int b = inputs[1];

        System.out.println(a>b ? a-b : b-a);
        br.close();
    }

    public static void ex02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        if(num > 0)
            System.out.println("plus");
        else if(num < 0)
            System.out.println("minus");
        else
            System.out.println("zero");

        br.close();
    }

    public static void ex03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println("leap year");
        else
            System.out.println("common year");
    }

    public static void ex04() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Number? ");
        int num = Integer.parseInt(br.readLine());

        if(num == 1)
            System.out.println("dog");
        else if(num == 2)
            System.out.println("cat");
        else if(num == 3)
            System.out.println("chick");
        else
            System.out.println("I don't know.");
    }

    public static void ex05() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int month = Integer.parseInt(br.readLine());

        switch(month) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
            default:
                System.out.println("0");
                break;
        }
    }
}