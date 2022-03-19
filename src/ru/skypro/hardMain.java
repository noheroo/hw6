package ru.skypro;

import java.util.Arrays;

public class hardMain {

    public static void main(String[] args) {
        task5();
        task6();
        task7();
        task89();
    }

    public static void task5() {
        int matrix[][] = new int[3][3];
        int merker=0;
        for (int i = 0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){
                if (merker%2==0) {
                     matrix[i][j]=1;
                }
                 merker++;
             }
        }
        System.out.println("task 5");
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void task6() {
        int arr1[]={5,4,3,2,1};
        int arr2[]=new int[arr1.length];
        System.out.println("task 6");
        System.out.println(Arrays.toString(arr1));
        for (int i = arr2.length-1; i >= 0; i--) {
            arr2[i]=arr1[arr2.length-1-i];
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void task7() {
        int arr[] = {5, 4, 3, 2, 1};
        int l=1;
        System.out.println("task 7");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int buffer = arr[i];
            arr[i] = arr[arr.length - 1];
            for (int j = 1; j < arr.length - l; j++) {
                arr[arr.length - j] = arr[arr.length - j - 1];
            }
            l++;
            if (i< arr.length-1) {
                arr[i + 1] = buffer;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task89() {
        int arr[] = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        System.out.println("task 89");
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма этих чисел равна -2:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==-2){
                    System.out.println(arr[i]+" и "+arr[j]);
                }
            }
        }
    }
}


