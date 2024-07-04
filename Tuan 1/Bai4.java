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
public class Bai4 {
    public static void countingSort(int[] arr) {
        int n = arr.length;
        if (n == 0) return;

        // Tìm giá trị lớn nhất trong mảng
        int max = Arrays.stream(arr).max().getAsInt();
        
        // Tạo mảng đếm
        int[] count = new int[max + 1];
        
        // Đếm số lần xuất hiện của từng phần tử
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        
        // Tính mảng tích lũy (prefix sum)
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        
        // Tạo mảng kết quả
        int[] output = new int[n];
        
        // Đặt các phần tử vào đúng vị trí
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        
        // Sao chép mảng kết quả vào mảng đầu vào
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        countingSort(arr);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
