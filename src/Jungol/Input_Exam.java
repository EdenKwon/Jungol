package Jungol;

import java.io.*;
import java.util.*;

// prac,test,exam ==> 연습문제,자가진단,형성평가
public class Input_Exam {
    public static void main(String[] args) throws IOException {
        ex05();
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
        int a=10, b=20, c=30;
        System.out.println(a + " + " + b + " = " + c);
    }

    public static void ex02() {
        float a = 80.5f, b = 22.34f;
        System.out.printf("%10.2f%10.2f%10.2f\n", a, b, (a+b));
    }

    public static void ex03() {
        int a = 50;
        float b = 100.12f;
        System.out.printf("%.2f * %d = %.0f\n", b, a, a*b);
    }

    public static void ex04() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputs[] = readInt(br, 3);
        int sum = 0;

        for(int i=0; i< inputs.length; i++) {
            sum += inputs[i];
        }

        System.out.println("sum = " + sum);
        br.close();
    }

    public static void ex05() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("yard? ");
        double yard = Double.parseDouble(br.readLine());
        double result = yard * 91.44;

        System.out.printf("%.1fyard = %.1fcm\n", yard, result);
    }
}