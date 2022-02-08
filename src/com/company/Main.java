package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nums = scan.nextLine().split(" ");
        int s = nums.length/2;
        int[] arr1 = new int[s];
        int[] arr2 = new int[nums.length - s];
        for (int i = 0; i < nums.length; i ++) {
            if (i < s) {
                arr1[i] = Integer.parseInt(nums[i]);
            }
            else {
                arr2[i-s] = Integer.parseInt(nums[i]);
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("Sum: " + Sum(arr1) + "; " + "Product: " + Product(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("Sum: " + Sum(arr2) + "; " + "Product: " + Product(arr2));

    }
    public static int Sum(int[] arr) {
        int a = 0;
        for (int i: arr) {
            a = a + i;
        }
        return a;
    }
    public static int Product(int[] arr) {
        int a = 1;
        for (int i:arr) {
            a = a * i;
        }
        return a;
    }

}
