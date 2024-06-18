package Jungol;

import java.io.*;
import java.util.*;

// prac,test,exam ==> 연습문제,자가진단,형성평가
public class Main {
    public static void main(String[] args) throws IOException {
        ex09();
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
        int num = Integer.parseInt(br.readLine());

        System.out.println(num);
        if (num < 0) {
            System.out.println("minus");
        }
    }

    public static void ex02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputs[] = readInt(br, 2);
        int height = inputs[0];
        int weight = inputs[1];

        int obesity = weight + 100 - height;
        System.out.println(obesity);

        if (obesity > 0) {
            System.out.println("Obesity");
        }
    }

    public static void ex03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int age = Integer.parseInt(br.readLine());
        if (age >= 20) {
            System.out.println("adult");
        } else {
            System.out.println((20 - age) + " years later");
        }
    }

    public static void ex04() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(br.readLine());

        if (weight <= 50.8) {
            System.out.println("Flyweight");
        } else if (weight <= 61.23) {
            System.out.println("Lightweight");
        } else if (weight <= 72.57) {
            System.out.println("Middleweight");
        } else if (weight <= 88.45) {
            System.out.println("Cruiserweight");
        } else {
            System.out.println("Heavyweight");
        }
    }

    public static void ex05() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double num1 = Double.parseDouble(st.nextToken());
        double num2 = Double.parseDouble(st.nextToken());

        if (num1 >= 4 && num2 >= 4) {
            System.out.println("A");
        } else if (num1 >= 3 && num2 >= 3) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }

    public static void ex06() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String gender = st.nextToken();
        int age = Integer.parseInt(st.nextToken());

        if (gender.equals("M")) {
            if (age >= 18) {
                System.out.println("MAN");
            } else {
                System.out.println("BOY");
            }
        } else {
            if (age >= 18) {
                System.out.println("WOMAN");
            } else {
                System.out.println("GIRL");
            }
        }
    }

    public static void ex07() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();

        switch(a) {
            case "A":
                System.out.println("Excellent"); break;
            case "B":
                System.out.println("Good"); break;
            case "C":
                System.out.println("Usually"); break;
            case "D":
                System.out.println("Effort"); break;
            case "F":
                System.out.println("Failure"); break;
            default:
                System.out.println("error");
        }
    }

    public static void ex08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double avg = Double.parseDouble(br.readLine());

        switch((int)avg) {
            case 4:
                System.out.println("scholarship"); break;
            case 3:
                System.out.println("next semester"); break;
            case 2:
                System.out.println("seasonal semester"); break;
            case 1:
                System.out.println("retake"); break;
        }
    }

    public static void ex09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input[] = readInt(br, 3);
        int a = input[0];
        int b = input[1];
        int c = input[2];
        int min = 0;

        min = a > b ? b : a;
        min = min > c ? c : min;

        System.out.println(min);
    }
}