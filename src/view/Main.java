package view;

import controller.Negatives;
import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Negatives ng = new Negatives();
        int size = (int)((Math.random() * 100000) % 10);
        int[] vec = new int[size];
        for (int i = 0; i < size; i++) {
            vec[i] = (int)((Math.random() * 100000) % 100);
            if (Math.random() > Math.random()) {
                vec[i] *= -1;
            }
        }

        System.out.print("|");
        for (int num : vec) {
            System.out.print(num + "|");
        }
        System.out.println();

        System.out.print("O vetor tem ");
        System.out.print(ng.total(vec, size - 1, 0));
        System.out.print(" valores negativos\n");
    }
}
