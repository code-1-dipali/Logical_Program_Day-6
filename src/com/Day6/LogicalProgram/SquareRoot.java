package com.Day6.LogicalProgram;

public class SquareRoot {
    public static void main(String[] args) {
        Utility utility = new Utility();
        System.out.print("Enter the number: ");
        int number = utility.getIntValue();
        Utility.sqrt(number);
    }

}
