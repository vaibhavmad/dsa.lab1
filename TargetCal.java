package com.gl.dsa.lab1;

public class TargetCal {

    private final int[] transCount; 
    
    public TargetCal(int[] transCount) {
        this.transCount = transCount;
    }

    public boolean isTargetAchieved(int target) {
        int cumulativeSum = 0;
        for (int i = 0; i < transCount.length; i++) {
            cumulativeSum += transCount[i];
            if (cumulativeSum >= target) {
                return true;
            }
        }
        return false;
    }

    public int getTransactionAchievedIndex(int target) {
        int cumulativeSum = 0;
        for (int i = 0; i < transCount.length; i++) {
            cumulativeSum += transCount[i];
            if (cumulativeSum >= target) {
                return i + 1; // Adjust for 1-based indexing
            }
        }
        return -1; // Target not achieved
    }
}
