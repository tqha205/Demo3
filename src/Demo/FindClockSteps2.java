package Demo;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class FindClockSteps2 {
    static Scanner sc;
    static int[][] clocks;
    static int[] stepDial;

    public static void main(String[] args) throws Exception {

        sc = new Scanner(new File("./src/Demo/FindClockSteps.txt"));
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            readFile();
            process(tc);
        }
    }

    private static void process(int testcase) {
        int minSteps = Integer.MAX_VALUE, sum = 0;
        for (int i = 0; i < 12; i++) {
            int[] stepDial = new int[3];
            int next =0, back = 0;
            for (int j = 0; j < 6; j++) {
                next++;
                back--;

                if (clocks[0][j] == 1) {
                    stepDial[0] = getSteps(j, i);
                }
                if (clocks[1][j] == 1) {
                    stepDial[1] =getSteps(j, i);
                }
                if (clocks[2][j] == 1) {
                    stepDial[2] = getSteps(j, i);
                }
                if(stepDial[0] != -1 && stepDial[1] != -1 && stepDial[2] != -1) {
                    sum = stepDial[0] + stepDial[1] + stepDial[2];
                }
            }
            minSteps = Math.min(minSteps, sum);
        }

        System.out.println("\n# " + testcase + ":" + minSteps);
    }

    private static void readFile() {
        clocks = new int[3][12];
        stepDial = new int[3];
        for (int i = 0; i < 3; i++) {
            stepDial[i] = -1;
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

