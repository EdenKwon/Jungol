package Jungol;

import java.awt.*;
import java.io.*;
import java.util.*;

// prac,test,exam ==> 연습문제,자가진단,형성평가
public class LoopCtrl_Exam {
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

    public static void ex01() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i=1; i<=num; i++) {
            System.out.print(i + " ");
        }

        br.close();
    }

    public static void ex02() throws IOException {
        Scanner sc = new Scanner(System.in);
        int odd = 0, even = 0;
        int num = 0;

        while(true) {
            num = sc.nextInt();
            if(num == 0) break;

            if(num % 2 == 0) even++;
            else odd++;
        }

        System.out.println("odd : " + odd);
        System.out.println("even : " + even);
    }

    public static void ex03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num  = 0, sum = 0, count = 0;
        double avg = 0;

        while(st.hasMoreTokens()) {
            num = Integer.parseInt(st.nextToken());
            if(num < 0 || num > 100) {
                break;
            }

            count++;
            sum += num;
        }

        avg = sum / (double)count;
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", avg);
        br.close();
    }

    public static void ex04() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;

        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if(num == 0) break;
            if(num % 3 != 0 && num % 5 != 0) {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }

    public static void ex05() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double area = 0;
        String answer = "";

        while(true) {
            System.out.print("Base = ");
            int base = Integer.parseInt(br.readLine());

            System.out.print("Height = ");
            int height = Integer.parseInt(br.readLine());

            area = (double)(base * height) / 2;
            System.out.println("Triangle width = " + area);

            System.out.print("Continue? ");
            answer = br.readLine();
            if(answer.equals("Y")) continue;
            if(answer.equals("y")) continue;
            else break;
        }
    }
}