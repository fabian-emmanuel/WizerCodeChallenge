package com.wizercodechallenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        taskOne(10);

//        var arr = new int[]{1,2,3,4,5,6};
//        tasktwo(arr, 2);
//        var arr = new int[]{2,7,11,15};
        var arr = new int[]{3,2,4};

        taskThree(arr, 6);
    }

    public static void taskOne(int height) {

        for (int i = 1; i < height; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void tasktwo(int[] arr, int N){

        for (int i=0;i<N;i++){

        int temp = arr[arr.length - 1];

        for (int j=arr.length-1;j>0;j--){
            arr[j] = arr[j-1];
        }
        arr[0] = temp;
        }
        System.out.print(Arrays.toString(arr));

    }

    public static void taskThree(int[] nums, int target){
        for (int i=0;i< nums.length;i++){
            for (int j=1;j< nums.length-1;j++){
                if (nums[i] + nums[j] == target){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }

    }

}


