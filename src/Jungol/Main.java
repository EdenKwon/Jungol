package Jungol;

import java.io.*;
import java.util.*;

// prac,test,exam ==> 연습문제,형성평가,자가진단
public class Main {
    public static void main(String[] args) throws IOException {
        
    }

    public static int[] readInt(BufferedReader br, int count) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        return numbers;
    }
}