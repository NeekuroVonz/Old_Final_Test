package cau3;

import java.util.Scanner;

public class Cau3 {
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
			c = merge(a, b);
			System.out.print("Dãy số c: ");
			show(c);
		} else {
			c = merge(b, a);
			System.out.print("Dãy số c: ");
			show(c);
		}
		
		System.out.print("Các số nguyên tố có trong c: ");
		for (int i = 0; i < c.length; i++) {
			int check = checkPrime(c[i]);
			if (check == 1) {
				System.out.print(c[i] + ", ");
			}
		}
		
		
	}
	
	//class input: nhập vào số phần tử
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
	
	//class merge: ghép 2 mảng vào nhau
	public static int[] merge(int[] a, int[] b) {
		int j;
		int m = a.length;
		int n = b.length;
		int cIndex = a.length + b.length;
		int c[] = new int[cIndex];
		for (int i = j = 0; i < m || i < n; i++) {
			if (i < m) {
				c[j] = a[i];
				j++;
			}
			if (i < n) {
				c[j] = b[i];
				j++;
			}
		}
		return c;
	}
	
	//class check số nguyên tố
	private static int checkPrime(int n) {
		
		int flag = 1;

	    if (n <= 2) return flag = 0;

	    int i = 2;  
	    while (i < n) {
	    	if (n % i == 0) {
	    		flag = 0;
	    		break;
	        }
	    	i++;
	    }
	    return flag;
	}
	
	//class show: in ra dãy số
	public static void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}
