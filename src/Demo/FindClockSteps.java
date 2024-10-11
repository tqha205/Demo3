package Demo;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class FindClockSteps {
    static Scanner sc;
    static int[][] clocks;

    public static void main(String[] args) throws Exception {

        sc = new Scanner(new File("./src/Demo/FindClockSteps.txt"));
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            readFile();
            process(tc);
        }
    }

    private static void process(int testcase) {
        int minSteps = Integer.MAX_VALUE;
        for (int i = 0; i < 12; i++) {
            int sum = 0;
            sum += getMinStepForDial(0, i);
            sum += getMinStepForDial(1, i);
            sum += getMinStepForDial(2, i);
            minSteps = Math.min(minSteps, sum);
        }

        System.out.println("\n# " + testcase + ":" + minSteps);
    }

    private static int getMinStepForDial(int dial, int i) {
        int temp = Integer.MAX_VALUE;
        for (int j = 0; j < 12; j++) {
            if (clocks[dial][j] == 1) {
                temp = Math.min(temp, getSteps(j, i));
            }
        }
        return temp;
    }

    private static void readFile() {
        clocks = new int[3][12];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 12; j++) {
                clocks[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(clocks[0]));
        System.out.println(Arrays.toString(clocks[1]));
        System.out.println(Arrays.toString(clocks[2]));
    }

    public static int getSteps(int j, int flagHour) {
        // ((A + or - B) + n ) % n công tính khoảng cách di chuyen B -> A theo 2 chiều xuôi ngược
        int tongNguoc = ((flagHour - j) + 12) % 12;
        int tongXuoi = ((j - flagHour) + 12) % 12;
        return Math.min(tongNguoc, tongXuoi);
    }
}

