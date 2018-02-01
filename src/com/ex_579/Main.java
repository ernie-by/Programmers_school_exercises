package com.ex_579;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> positiveIndex = new ArrayList<>();
        ArrayList<Integer> negativeIndex = new ArrayList<>();
        File input = new File("src\\com\\ex_579\\input.txt");
        File output = new File("src\\com\\ex_579\\output.txt");
        int positiveSumm = 0;
        int negativeSumm = 0;
        Scanner sc = new Scanner(input);
        int lenght = sc.nextInt();


        while (sc.hasNext()) {
            list.add(sc.nextInt());
        }
        if (lenght == list.size()) {

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < 0) {
                    negativeIndex.add(i);
                    negativeSumm += list.get(i);
                } else {
                    positiveIndex.add(i);
                    positiveSumm += list.get(i);
                }
            }
            PrintWriter printWriter = new PrintWriter(output);

            if (Math.abs(negativeSumm) > Math.abs(positiveSumm)) {
                printWriter.println(negativeIndex.size());
                for (int i = 0; i < negativeIndex.size(); i++) {
                    printWriter.print(negativeIndex.get(i) + 1 + " ");
                }
            } else {
                printWriter.println(positiveIndex.size());
                for (int i = 0; i < positiveIndex.size(); i++) {
                    printWriter.print(positiveIndex.get(i) + 1 + " ");
                }
            }
            printWriter.close();
        }else {
            System.out.println("Incorrect data");
        }
    }
}
