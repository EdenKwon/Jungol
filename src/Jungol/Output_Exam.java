package Jungol;

import java.io.*;
import java.util.*;

// prac,test,exam ==> 연습문제,형성평가,자가진단
public class Output_Exam {
    public static void main(String[] args) throws IOException {
        ex04();
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
        System.out.println("My name is Hong");
    }

    public static void ex02() {
        System.out.println("My hometown\n" +
                "Flowering mountain");
    }

    public static void ex03() {
        System.out.println("TTTTTTTTTT\n" +
                "TTTTTTTTTT\n" +
                "    TT\n" +
                "    TT\n" +
                "    TT");
    }

    public static void ex04() {
        System.out.println("kor 90\n" +
                "mat 80\n" +
                "eng 100\n" +
                "sum 270");
    }

    public static void ex05() {
        System.out.println("          Seoul     10,312,545        +91,375\n" +
                "          Pusan      3,567,910         +5,868\n" +
                "        Incheon      2,758,296        +64,888\n" +
                "          Daegu      2,511,676        +17,230\n" +
                "        Gwangju      1,454,636        +29,774");
    }
}