package com.gl.dsa.lab1;

import java.util.Scanner;

public class TargetMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of transaction array:");
        int size = scanner.nextInt();

        System.out.println("Enter the values of array:");
        int[] transCount = new int[size];
        int i = 0;
        while (i < size && scanner.hasNextInt()) {
            transCount[i++] = scanner.nextInt();
        }

        System.out.println("Enter the total number of targets that need to be achived:");
        int targetCount = scanner.nextInt();

        TargetCal targetCal = new TargetCal(transCount);

        for (int j = 0; j < targetCount; j++) {
            System.out.printf("\nEnter the value of target:");
            int target = scanner.nextInt();

            if (targetCal.isTargetAchieved(target)) {
                int achievedIndex = targetCal.getTransactionAchievedIndex(target);
                System.out.printf("Target achieved after %d transactions\n", achievedIndex);
            } else {
                System.out.printf("Given target is not achieved\n");
            }
        }
        scanner.close();
    }
}
