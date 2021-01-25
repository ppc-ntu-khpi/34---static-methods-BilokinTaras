package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {

        int m=1;
        int n=1;
        System.out.println("Ackerman's function for number"+n+"and"+m+"is"+Exercise.Calculate(n,m));
    }
}
