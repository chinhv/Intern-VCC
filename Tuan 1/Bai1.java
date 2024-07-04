/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap;

import java.util.*;

/**
 *
 * @author TT
 */
public class Bai1 {
    
    public static boolean binarySearch(int[] arr, int x){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == x){
                return true;
            }else if(arr[mid] < x){
                left = mid + 1;
            }else if(arr[mid] > x){
                right = mid - 1;
            }
        }
        return false;
    }
    
    public static List<Integer> intersectionSortedArrays(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        for (int num : arr1) {
            if (binarySearch(arr2, num)) {
                result.add(num);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 9};
        int[] arr2 = {2, 3, 5, 7, 9};
        
        List<Integer> result = intersectionSortedArrays(arr1, arr2);
        System.out.println(result); // Output: [2, 5, 9]
    }
}
