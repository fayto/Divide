package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nums = scan.nextLine().split(" ");
        int s = nums.length/2;
        int sum1 = 0;
        int sum2 = 0;
        int pr1 = 1;
        int pr2 = 1;
        for (int i = 0; i < nums.length; i ++) {
            if (i < s) {
                sum1 = sum1 + Integer.parseInt(nums[i]);
                pr1 = pr1 * Integer.parseInt(nums[i]);
            }
            else {
                sum2 = sum2 + Integer.parseInt(nums[i]);
                pr2 = pr2 * Integer.parseInt(nums[i]);
            }
        }
        System.out.println("sum1: " + sum1);
        System.out.println("sum2: " + sum2);
        System.out.println("pr1: " + pr1);
        System.out.println("pr2: " + pr2);
    }
}
