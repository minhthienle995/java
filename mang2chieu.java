package bai1;

import java.util.Scanner;

public class mang2chieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m , sum=0,number;
		float tbc;
	     
	    Scanner scanner = new Scanner(System.in);
	    
	         
	    System.out.println("Nhập vào số dòng của mảng: ");
	   n = scanner.nextInt();
	    System.out.println("Nhập vào số cột của mảng: ");
	    m = scanner.nextInt();
	         

	    int[][]diem = new int[n][m];
	    for (int a=0; a<n-1 ; a ++) {
	    	for(int b=0; b<m-1; b++)
	   
			  System.out.println("Nhập các phần tử cho mảng: ");
	    }
		
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < m; j++) {
	            System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
	            diem[i][j] = number=scanner.nextInt();
	            sum+=number;
	        }
	    }
	    System.out.println("Mảng vừa nhập: ");
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < m; j++) {
	            System.out.print(diem[i][j] + "\t");
	        }
	        System.out.println("\n"); 
	        
	    }
	    System.out.println("tong cac hang va cot="+sum);
		        tbc= (float)sum/(m*n);
		        System.out.println("trung binh cong cua m="+tbc);
		        scanner.close();
	    }

	}

