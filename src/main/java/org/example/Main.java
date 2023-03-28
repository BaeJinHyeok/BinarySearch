package org.example;

public class Main {
    static int[] arr = {1, 3, 5, 7, 8, 10, 20, 35, 99, 100};
    public static void main(String[] args) {

        System.out.println(binarySearch1(8, 0, arr.length-1));
        System.out.println(binarySearch2(8, 0, arr.length-1));

    }


    static int binarySearch1(int key, int low, int high) {
        int mid;

        if (low <= high) {
            mid = (low + high) / 2;

            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                return binarySearch1(key, low, mid - 1);
            } else {
                return binarySearch1(key, mid + 1, high);
            }
        }

        return -1;
    }

    static int binarySearch2(int key, int low, int high) {
        int mid;

        while(low <= high) {
            mid = (low + high) / 2;

            if(key == arr[mid]) {
                return mid;
            } else if(key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
