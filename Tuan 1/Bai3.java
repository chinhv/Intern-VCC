/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap;

/**
 *
 * @author TT
 */
public class Bai3 {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        result[0] = findFirstPosition(nums, target);
        result[1] = findLastPosition(nums, target);

        return result;
    }

    private static int findFirstPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int firstPos = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                firstPos = mid;
                right = mid - 1; // tiếp tục tìm về bên trái
            }
        }

        return firstPos;
    }

    private static int findLastPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int lastPos = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                lastPos = mid;
                left = mid + 1; // tiếp tục tìm về bên phải
            }
        }

        return lastPos;
    }

    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 8, 8, 15};
        int target = 8;

        int[] result = searchRange(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
