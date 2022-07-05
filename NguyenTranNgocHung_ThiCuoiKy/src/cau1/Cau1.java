package cau1;

import java.util.Scanner;

public class Cau1 {
	public static Scanner sc = new Scanner(System.in);
	
	//class main: lớp chính
	public static void main(String[] args) {
		int a[] = null; 
		int b[] = null;
		//int cIndex = 5;
		int c[] = null;
		
		System.out.print("---Nhập mảng a---");
		a = input(a);
		show(a);
		
		System.out.print("\n---Nhập mảng b---");
		b = input(b);
		show(b);
		
		if (a.length >= b.length) {
			c = check(a, b);
		} else {
			c = check(b, a);
		}
		
		if (c.length != 0) {
			System.out.print("Tập số a và b giao nhau!\nPhần giao là tập con c: ");
			show(c);
			System.out.print("Tập c không tăng: ");
			reverse(c);
			show(c);
		} else {
			System.out.print("Tập số a và b không giao nhau!");
		}
		
		
	}
	
	//class nhập input
	public static int[] input(int[] arr) {
		System.out.print("\nNhập số phần tử của mảng: ");
		int n = sc.nextInt();
		arr = new int[n];
		System.out.print("Nhập các phần tử của mảng \n");
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	//class check giao nhau
	public static int[] check(int[] a, int[] b) {
		int m = a.length;
		int n = b.length;
		int[] c = new int[0];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i] == b[j]) {
					int[] temp = c;
			        c = new int[c.length + 1];
			        for(int p = 0; p < temp.length; p++) {
			            c[p] = temp[p];
			        }
			        c[c.length - 1] = a[i];
				}
			}
		}
		return c;
	}
	
	//class sắp xếp không tăng
	public static void reverse(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
        	for (int j = i + 1; j < arr.length; j++) {
        		int temp = 0;
        		if (arr[i] < arr[j]) {
        			temp = arr[i];  
        			arr[i] = arr[j];  
        			arr[j] = temp;
        		}
        	}
        }
	}
	
	//class show xuất kq
	public static void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}
