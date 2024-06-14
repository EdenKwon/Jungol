package Jungol;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        exam05();
    }

    public static int[] readInt(BufferedReader br, int count) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        return numbers;
    }

    public static void exam01() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int avg;
        int inputs[] = readInt(br, 4);

        for(int i=0; i<inputs.length; i++) {
            sum += inputs[i];
        }

        avg = sum / inputs.length;
        bw.write("sum " + sum);
        bw.newLine();
        bw.write("avg " + avg);

        br.close();
        bw.flush();
    }

    public static void exam02() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputs[] = readInt(br, 2);
        int a = inputs[0];
        int b = inputs[1];
        int result = a / b;
        int left = a % b;

        bw.write(a + " / " + b + " = " + result + "..." + left);

        br.close();
        bw.flush();
    }

    public static void exam03() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputs[] = readInt(br, 2);
        int width = inputs[0];
        int length = inputs[1];
        int area;

        width += 5;
        length *= 2;
        area = width * length;

        bw.write("width = " + width + "\n");
        bw.write("length = " + length + "\n");
        bw.write("area = " + area);

        br.close();
        bw.flush();
    }

    public static void exam04() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputs[] = readInt(br, 2);
        int a = inputs[0];
        int b = inputs[1];

        bw.write(++a + " " + b--);
        bw.newLine();
        bw.write(a + " " + b);

        br.close();
        bw.flush();
    }

    public static void exam05() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int minsu[] = readInt(br, 2);
        int kiyoung[] = readInt(br, 2);

        bw.write((minsu[0] > kiyoung[0]) && (minsu[1] > kiyoung[1]) ? "true" : "false");

        br.close();
        bw.flush();
    }
}



