package Jungol;

import java.io.*;
import java.util.*;

// prac,test,exam ==> 연습문제,자가진단,형성평가
public class LoopCtrl3_Exam {
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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0, count = 0;

        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if(num == 0) break;

            sum += num;
            count++;
        }

        System.out.printf("%d %d", sum, sum/count);
        br.close();
    }

    public static void ex02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int result = 0;

        while(true) {
            result += num;
            if(result > 100) break;
            System.out.print(result + " ");
            if(result % 10 == 0) break;
        }

        br.close();
    }

    public static void ex03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i=1; i<=num; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=num-1; i>0; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ex04() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i=1; i<=num; i++) {
            for(int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for(int j=i; j<=2*num-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=num-1; i>0; i--) {
            for(int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for(int j=i; j<=2*num-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ex05() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i=1; i<=num; i++) {
            for(int j=1; j<=2*(num-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        br.close();
    }

    public static void ex06() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i=1; i<=num; i++) {
            for(int j=1; j<=2*(num-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        br.close();
    }

    //스터디
    public static void ex07() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        char alpabet = 'A';
        int number = 0;

        for(int i=1; i<=num; i++) {
            for(int j=0; j<=num-i; j++) {
                System.out.print(alpabet + " ");
                alpabet += 1;
            }
            for(int j=0; j<i-1;j++) {
                System.out.print(number + " ");
                number += 1;
            }
            System.out.println();
        }

        br.close();
    }

    public static void ex08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 1;

        for(int i=1; i<=num; i++) {
            for(int j=0; j<2*(i-1); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=num-i+1; j++) {
                System.out.print(count + " ");
                count += 1;
            }
            System.out.println();
        }
        br.close();
    }

    public static void ex09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i=1; i<=num; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        for(int i=2; i<=num; i++) {
            for(int j=0; j<2*(i-1); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=num-i+1; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        br.close();
    }

    public static void ex10() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 1;
        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                System.out.print(count + " ");
                count = checkTen(count);
            }
            System.out.println();
        }

        br.close();
    }

    public static int checkTen(int count) {
        count += 2;
        if(count > 9) {
            count = 1;
        }
        return count;
    }
}