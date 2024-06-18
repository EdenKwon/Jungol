package Jungol;

import java.io.*;
import java.util.*;

// prac,test,exam ==> 연습문제,자가진단,형성평가
public class Main {
    public static void main(String[] args) throws IOException {
        ex06();
    }

    public static int[] readInt(BufferedReader br, int count) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        return numbers;
    }

    public static void ex01() {
        int i = 1;
        while (i < 16) {
            System.out.print(i + " ");
            i++;
        }
    }

    public static void ex02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int i = 1;

        while (i <= num) {
            sum += i;
            i++;
        }

        System.out.println(sum);
    }

    public static void ex03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("number? ");
            int a = Integer.parseInt(br.readLine());

            if (a > 0)
                System.out.println("positive integer");
            else if (a < 0)
                System.out.println("negative number");
            else
                break;
        }
    }

    public static void ex04() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0, count = 0;
        double avg = 0;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            sum += num;
            count++;

            if (num > 100) break;
        }
        avg = (double) sum / count;

        System.out.println(sum);
        System.out.printf("%.1f", avg);

    }

    public static void ex05() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int a = Integer.parseInt(br.readLine());

            if (a % 3 == 0) {
                System.out.println(a / 3);
            }
            if(a == -1) break;
        }
    }

    public static void ex06() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            System.out.println("1. Korea\n" +
                    "2. USA\n" +
                    "3. Japan\n" +
                    "4. China");
            System.out.println("number?");

            int num = Integer.parseInt(br.readLine());
            if(!checkNum(num)) {
                System.out.println();
                System.out.println("none");
                break;
            }
            printCity(num);
        }
    }

    public static void printCity(int num) {
        System.out.println();
        switch(num) {
            case 1:
                System.out.println("Seoul"); break;
            case 2:
                System.out.println("Washington"); break;
            case 3:
                System.out.println("Tokyo"); break;
            default:
                System.out.println("Beijing");
        }
        System.out.println();
    }

    public static boolean checkNum(int num) {
        switch (num) {
            case 1, 2, 3, 4 -> {
                return true;
            }

            default -> {
                return false;
            }
        }
    }
}