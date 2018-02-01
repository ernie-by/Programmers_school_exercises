package com.ex_670;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        File input = new File("src\\com\\ex_670\\input.txt");
        File output = new File("src\\com\\ex_670\\output.txt");
        PrintWriter printWriter = new PrintWriter(output);
        Scanner sc =new Scanner(input);
        int lenght = sc.nextInt();
        int counter=0;
        int number = 0;
            for(int i = 1; i<10000; i++){
                if(i<10) {counter++; number =i;}
                if(i>9&&i<100 && i%10!=i/10) {counter++; number =i;}
                if(i>99&&i<1000 && i%10!=i/10%10 && i%10!=i/100 && i/10%10!=i/100) {counter++; number = i;}
                if(i>999 && i%10!=i/1000
                         && i%10!=i/100%10
                         && i%10!=i/10%10
                         && i/1000!=i/10%10
                         && i/1000!=i/100%10
                         && i/100%10!=i/10%10) {counter++; number =i;}
                if (counter == lenght) {
                   printWriter.print(number);
                   printWriter.close();
                }

            }
    }
}
