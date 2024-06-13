package Jungol;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        test01();
    }

    public static int[] readInt(BufferedReader br, int count) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        return numbers;
    }

    public static void test01() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] inputs = readInt(br, 3);

        int a = inputs[0];
        int b = inputs[1];
        int c = inputs[2];

        int sum = a + b + c;
        int avg = sum / 3;

        bw.write("sum : " + sum);
        bw.newLine();
        bw.write("avg : " + avg);

        bw.flush();
    }

    public static void test02() throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+100 + " " + b%10);
        sc.close();
    }

    public static void test03() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a++);
        System.out.println(++a);
    }

    public static void test04() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] inputs = readInt(br, 2);

        int a = inputs[0];
        int b = inputs[1];

        int result = a++ * --b;

        bw.write(a + " " + b + " " + result);
        bw.flush();
    }

    public static void test05() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] inputs = readInt(br, 2);

        int a = inputs[0];
        int b = inputs[1];

        bw.write(a == b ? "true" : "false");
        bw.newLine();
        bw.write(a != b ? "true" : "false");
        bw.flush();
    }

    public static void test06() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] inputs = readInt(br, 2);

        int a = inputs[0];
        int b = inputs[1];

        bw.write(a + " > " + b + " --- " + (a > b));
        bw.newLine();
        bw.write(a + " < " + b + " --- " + (a < b));
        bw.newLine();
        bw.write(a + " >= " + b + " --- " + (a >= b));
        bw.newLine();
        bw.write(a + " <= " + b + " --- " + (a <= b));
        bw.flush();
    }

    public static void test07() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] inputs = readInt(br, 2);

        int a = inputs[0];
        int b = inputs[1];

        boolean c = a * b != 0;
        boolean d = a + b != 0;
        bw.write(c + " " + d);
        bw.flush();
    }

    public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] inputs = readInt(br, 3);

        int a = inputs[0];
        int b = inputs[1];
        int c = inputs[2];

        bw.write((a > b) && (a > c) ? "true" : "false");
        bw.write((a == b) && (a == c) ? "true" : "false");
        bw.flush();
    }
}
