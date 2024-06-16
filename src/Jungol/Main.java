package Jungol;

import java.io.*;
import java.util.*;

// prac,test,exam ==> 연습문제,자가진단,형성평가
public class Main {
    public static void main(String[] args) throws IOException {
        ex10();
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

        for(int i=0; i<num; i++) {
            System.out.println("JUNGOL");
        }

        br.close();
    }

    public static void ex02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num[] = readInt(br, 2);
        int a = (num[0] < num[1]) ? num[0] : num[1];
        int b = (num[0] < num[1]) ? num[1] : num[0];

        for(int i=a; i<=b; i++) {
            System.out.print(i + " ");
        }

        br.close();
    }

    public static void ex03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 5 == 0)
                sum += i;
        }

        System.out.println(sum);
        br.close();
    }

    public static void ex04() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int inputs[] = readInt(br, num);

        double avg = Arrays.stream(inputs).average().getAsDouble();
        System.out.printf("%.2f", avg);
    }

    public static void ex05() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int odd = 0, even = 0;

        int inputs[] = readInt(br, 10);
        for(int i=0; i<inputs.length; i++) {
            if(inputs[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("even : " + even);
        System.out.println("odd : " + odd);

        br.close();
    }

    public static void ex06() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputs[] = readInt(br, 2);
        int sum = 0, count = 0;
        double avg = 0;
        int a = Math.min(inputs[0], inputs[1]);
        int b = Math.max(inputs[0], inputs[1]);

        for(int i=a; i<=b; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
                count++;
            }
        }
        avg = sum / (double)count;

        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", avg);
        br.close();
    }

    public static void ex07() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i=1; i<=10; i++) {
            System.out.print(num * i + " ");
        }

        br.close();
    }

    public static void ex08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputs[] = readInt(br, 2);
        int a = inputs[0], b = inputs[1];
        int num = 1;

        for(int i=0; i<a; i++) {
            for(int j=1; j<=b; j++) {
                System.out.print(num * j + " ");
            }
            num += 1;
            System.out.println();
        }

        br.close();
    }

    public static void ex09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i=1; i<=num; i++) {
            for(int j=1; j<=num; j++) {
                System.out.print("(" + i + ", " + j + ") ");
            }
            System.out.println();
        }

        br.close();
    }

    public static void ex10() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputs[] = readInt(br, 2);
        int a = inputs[0], b = inputs[1];

        if(a>b) {
            for(int i=1; i<=9; i++) {
                for(int j=a; j>=b; j--) {
                    System.out.printf("%d * %d = %2d   ", j, i, i * j);
                }
                System.out.println();
            }
        }
        else {
            for(int i=1; i<=9; i++) {
                for(int j=a; j<=b; j++) {
                    System.out.printf("%d * %d = %2d   ", j, i, i * j);
                }
                System.out.println();
            }
        }
    }
}