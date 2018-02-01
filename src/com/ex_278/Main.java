package com.ex_278;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        File input = new File("src\\com\\ex_278\\input.txt");
        File output = new File("src\\com\\ex_278\\output.txt");
        Reader reader = new FileReader(input);
        BufferedReader br = new BufferedReader(reader);
        list.add(br.readLine());
        list.add(br.readLine());
        br.close();
        int elementNumber = 0;
            for (int i = 0; i<list.get(1).length(); i++){
                if (list.get(1).charAt(i)==list.get(0).charAt(elementNumber)){
                    elementNumber++;
                }
            }
        PrintWriter printWriter = new PrintWriter(output);
            if (elementNumber == list.get(0).length()) printWriter.print("YES");
            else printWriter.print("NO");
        printWriter.close();

//        *************************************************************************************
//        Реализация задачи с использованием Scanner

        /*ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(new File("src\\com\\ex_278\\input.txt"));
        PrintWriter pw = new PrintWriter(new File("src\\com\\ex_278\\output.txt"));

        list.add(sc.nextLine());
        list.add(sc.nextLine());

        int elementNumber = 0;
        for (int i = 0; i<list.get(1).length(); i++){
            if (list.get(1).charAt(i)==list.get(0).charAt(elementNumber)){
                elementNumber++;
            }
        }

        if (elementNumber == list.get(0).length()) {
            pw.print("YES");
        }else pw.print("NO");

        pw.close();*/
    }
}