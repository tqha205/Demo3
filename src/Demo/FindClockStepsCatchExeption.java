package Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FindClockStepsCatchExeption {
    static Scanner sc;

    public static void main(String[] args) {

        try {
            readFile("./src/Demo/FindClockSteps2.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("==========FileNotFoundException==========\n" + ex);
            try {
                readFile("./src/Demo/FindClockSteps.txt");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int testcase = 1; testcase <= t; testcase++) {
            int[][] clocks = new int[3][12];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 11; j++) {
                    clocks[i][j] = sc.nextInt();
                }
            }
            System.out.println(Arrays.toString(clocks[0]));
            System.out.println(Arrays.toString(clocks[1]));
            System.out.println(Arrays.toString(clocks[2]));

            int minSteps = Integer.MAX_VALUE;
            for (int i = 0; i < 11; i++) {
                int sum = 0;
                for (int j = 0; j < 11; j++) {
                    if (clocks[0][j] == 1) {
                        sum += getSteps(j, i);
                    }
                }
                for (int j = 0; j < 11; j++) {
                    if (clocks[1][j] == 1) {
                        sum += getSteps(j, i);
                    }
                }
                for (int j = 0; j < 11; j++) {
                    if (clocks[2][j] == 1) {
                        sum += getSteps(j, i);
                    }
                }
                minSteps = Math.min(minSteps, sum);
            }

            System.out.println("\n# " + testcase + ":" + minSteps);

        }
    }

    private static void readFile(String path) throws FileNotFoundException, IOException {
        sc = new Scanner(new File(path));
        System.out.println("OK");
    }

    public static int getSteps(int batDau, int ketThuc) {
        int tongBatDau = (ketThuc - batDau + 12) %12;
        int tongKetThuc = (batDau - ketThuc + 12) %12;
        return Math.min(tongBatDau, tongKetThuc);
    }
}

