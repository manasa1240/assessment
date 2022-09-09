package com.lulu.test;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float p = sc.nextFloat();

        float t = sc.nextFloat();

        float r = sc.nextFloat();

        float Si = (p*t*r)/100;

        System.out.println("The Simple Interest is " + Si);

        System.out.println("The amount to be paid is "+(Si+p));

    }

}