package com.company;
import java.util.Arrays;

public class CyclicRotation{
    static int arr[] = new int[]{10,20,30,40,50};
    static void rotate(){
        int a = arr[arr.length-1],i;
        for (i=arr.length-1; i >0;i--)
            arr[i]=arr[i-1];
        arr[0]=a;
    }
    public static void main(String[] args) {
        System.out.println("Given Arrays: ");
        System.out.println(Arrays.toString(arr));
        rotate();
        System.out.println("Rotated Array: ");
        System.out.println(Arrays.toString(arr));


    }
}
