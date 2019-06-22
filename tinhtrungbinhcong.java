package bai1;

import java.util.Scanner;

public class tinhtrungbinhcong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum = 0, x;
	 	float TBC;
	   Scanner scanner = new Scanner(System.in);
	         
	    do {
	        System.out.println("Nhập số phần tử của mảng: ");
	        n = scanner.nextInt();
	    } while (n < 0);
	    int array[] = new int[n];
	    for (x=0 ; x<10; x++);
	    {
	         
	    System.out.println("Nhập phần tử cho mảng: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print("Nhập phần tử thứ: " + i + ": ");
	        array[i] = scanner.nextInt();
	    }
	    System.out.println("\nMảng ban đầu: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print(array[i] + "\t");
	    }
	    for (int i = 0; i < n; i++) {
	        sum += array[i];
	    }
	    System.out.println("\nTổng các phần tử có trong mảng = " + sum);
	    
	    TBC = sum / n;
	    
	    System.out.println("Trung bình cộng của mảng:"+TBC);
	    }
	    scanner.close();

	}




	}


