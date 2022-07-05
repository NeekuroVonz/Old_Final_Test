package cau5;

import java.util.Scanner;
import java.util.Arrays;

public class Cau5 {
	public static Scanner sc = new Scanner(System.in);
	
	//class main: lớp chính
	public static void main(String[] args) {
		int a[] = null; 
		int b[] = null;
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
		
		show(c);
		
		
	}
	
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
	
	public static int[] check(int[] a, int[] b) {
		int m = a.length;
		int n = b.length;
		int[] c = new int[0];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i] == b[j] && j == n) {
					int[] temp = c;
			        c = new int[c.length + 1];
			        for(int p = 0; p < temp.length; p++) {
			            c[p] = temp[p];
			        }
			        c[c.length - 1] = a[i];
				} else if (a[i] != b[i] && j == n) {
					int[] temp = c;
			        c = new int[c.length + 1];
			        for(int p = 0; p < temp.length; p++) {
			            c[p] = temp[p];
			        }
				}
			}
		}
		return c;
	}
	
	public static void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}
