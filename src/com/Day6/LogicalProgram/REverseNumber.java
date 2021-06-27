package com.Day6.LogicalProgram;

public class REverseNumber {
    public static void main(String[] args) {
        Utility utility = new Utility();
        System.out.print("Enter the num to reverse n : ");
        int n = utility.getIntValue();
        utility.getReverseNum(n);

    }
}
