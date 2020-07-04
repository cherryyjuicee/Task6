package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MySet<Integer> set = new MySet<>();

        int a;
        System.out.println("Input elements. If value is'nt int, then input is completed.");
        do{
            a = scanner.nextInt();
            set.add(a);
        } while (scanner.hasNextInt());
        scanner.next();

        System.out.println("Result :");
        ArrayList<Integer> listOutput = set.getArrayList();
        for (int n:listOutput) {
            System.out.print(n + "; ");
        }

    }
}
