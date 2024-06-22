package Jungol;

import java.io.*;
import java.util.*;

// prac,test,exam ==> 연습문제,자가진단,형성평가
public class Main {
    public static void main(String[] args) throws IOException {
        ex01();
    }

    public static void ex01() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int type = Integer.parseInt(st.nextToken());
        checkBound(size, type);

        switch (type) {
            case 1:
                printType1(size);
                break;
            case 2:
                printType2(size);
                break;
            case 3:
                printType3(size);
                break;
            default:
                break; // 안온다
        }
    }

    public static void checkBound(int size, int type) {
        if ((size > 100 || size < 0) || (type > 3 || type < 0)) {
            System.out.println("INPUT ERROR!");
            System.exit(0);
        }
    }

    public static void printType1(int size) {
        for (int i = 0; i < size; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printType2(int size) {
        for (int i = 0; i < size; i++) {
            for(int j=size; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printType3(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = size; j > i+1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}