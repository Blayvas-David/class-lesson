package fle.io.practice;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class FleIoPractice {

    public static void main(String[] args) throws IOException {

        Scanner scan;
        scan = new Scanner(new File("IN.txt"));
        String out = new String();
        int[] array = new int[5];
        int[] arra = new int[5];
        Integer y = 0;
        while (scan.hasNextInt()) {
            array[y++] = scan.nextInt();
        }
        for (int x = 0; x < array.length; x++) {
            System.out.println(array[x]);
        }
        for (int x = 0; x < array.length; x++) {

            arra[x] = array[x] % 5;

        }

        for (int x = 0; x < arra.length; x++) {
            System.out.println(arra[x]);

            int num = arra[x];
            String in = String.valueOf(num);
            out = in;
            FileWriter botadams = new FileWriter("OUT.txt", true);
            botadams.write(out);
            botadams.write("\r\n");
            botadams.close();

        }

    }
}
