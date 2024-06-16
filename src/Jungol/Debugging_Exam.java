package Jungol;

import java.io.*;
import java.util.*;

// prac,test,exam ==> 연습문제,자가진단,형성평가
public class Debugging_Exam {
    public static void main(String[] args) throws IOException {
        ex03();
    }

    public static int[] readInt(BufferedReader br, int count) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        return numbers;
    }

    public static double[] readDouble(BufferedReader br, int count) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] numbers = new double[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = Double.parseDouble(st.nextToken());
        }
        return numbers;
    }

    public static void ex01() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputs[] = readInt(br, 3);

        double avg = Arrays.stream(inputs).average().getAsDouble();
        System.out.printf("%.1f", avg);

        br.close();
    }

    public static void ex02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double inputs[] = readDouble(br, 3);
        int sum = (int)inputs[0] + (int)inputs[1] + (int)inputs[2];
        int avg = (int)Arrays.stream(inputs).average().getAsDouble();

        System.out.println("sum " + sum);
        System.out.println("avg " + avg);
    }

    public static void ex03() {
        int a = 5;
        a += 10;
        System.out.println(a);
        a = a - 1;
    }
}