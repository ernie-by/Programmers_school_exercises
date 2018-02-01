package com.ex_557;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File input = new File("src\\com\\ex_557\\input.txt");
        File output = new File("src\\com\\ex_557\\output.txt");
        Scanner sc = new Scanner(input);
        PrintWriter printWriter = new PrintWriter(output);

        int quantityMatrix = sc.nextInt();
        int arrayDimension = sc.nextInt();
        int stringofMatrix = sc.nextInt() - 1;
        int columnofMatrix = sc.nextInt() - 1;
        int number = sc.nextInt();
        int [][] mA = new int[arrayDimension][arrayDimension];
        int [][] mB = new int[arrayDimension][arrayDimension];
        int[][][] matrixes = new int[quantityMatrix][arrayDimension][arrayDimension];

            for (int matrCurrent = 0; matrCurrent < quantityMatrix; matrCurrent++) {
                for (int i = 0; i < arrayDimension; i++) {
                    for (int j = 0; j < arrayDimension; j++) {
                        if (sc.hasNextInt()) {
                            matrixes[matrCurrent][i][j] = sc.nextInt();
                        }
                    }
                }
            }
            for (int i = 0; i < arrayDimension; i++) {
                for (int j = 0; j < arrayDimension; j++) {
                    for (int k = 0; k < arrayDimension; k++) {
                        mA[i][j] += matrixes[0][i][k] * matrixes[1][k][j];
                    }
                }
            }
            for (int i = 0; i < arrayDimension; i++) {
                for (int j = 0; j < arrayDimension; j++) {
                    for (int k = 0; k < arrayDimension; k++) {
                        mB[i][j] += mA[i][k] * matrixes[2][k][j];
                    }
                }
            }
            int s = mB[stringofMatrix][columnofMatrix];

            if(s<number) printWriter.print(s);
            else printWriter.print(s%number);
            printWriter.close();
    }
}

