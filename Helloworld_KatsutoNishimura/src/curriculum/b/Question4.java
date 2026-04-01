package curriculum.b;

import java.util.Scanner;

public class Question4 {

	
	public static void main(String[] args) {
		
		//Q1
		int[] numbers = {1, 2, 3, 4, 5};
		for (int num : numbers) {
		System.out.println(num);
		}
		
		//Q2
				int[] score = {10, 20, 30, 40, 50};
				for (int i = score.length-1; i >= 0; i--) {
					System.out.println(score[i]);
				}
				
		//Q3
		int[] sosu = {3, 5, 7, 9, 11};
		int sum = 0;
		for (int sos : sosu) {
			sum += sos;
			
		}
		System.out.println(sum);
		
		//Q4
		int[] hairetu = {12,7, 9, 21, 5, 18};
		int Max = hairetu[0];
		int Min = hairetu[0];
		for (int ma : hairetu) {
			if(ma > Max) {
				Max = ma;
			}
			if(ma < Min) {
				Min = ma;
			}
			
		}
		System.out.println(Max);
		System.out.println(Min);
		
		//Q5
		int [] nibai = {1, 2, 3, 4, 5};
		for (int i = 0; i < nibai.length; i++) {
			nibai[i] *= 2;
		}
		for (int bai : nibai ) {
			System.out.println(bai);}
			
		//Q6
		Scanner scanner = new Scanner(System.in);	
		int [] konsoru = {4, 7, 10, 15, 20};
		
		int number = scanner.nextInt();
		
		boolean found = false;
		for (int num : konsoru) {
			if (number == num){
				found = true;
				break;
			}
		}
		if (found) {
		System.out.println(number + "は配列に含まれています");
		}else {
			System.out.println(number + "は配列に含まれていません");
		}
		
		//Q7
		int [][] array = {
				{1, 2},
				{3, 4},
				{5, 6}
		};
		for ( int i = 0; i < array.length; i++) {
			for ( int j = 0; j < array[i].length ; j++) {
				System.out.println(array[i][j]);
			}
				
			
		}
		
		//Q8
		int [][] matrix = {
				{10, 20, 30},
				{40, 50, 60},
				{70, 80, 90}
		};
		 sum = 0;
		 for ( int i = 0; i < matrix.length; i++) {
				for ( int j = 0; j < matrix[i].length ; j++) {
					sum += matrix[i][j];
	
				}
		 }
		 System.out.println(sum);
		
		 //Q9
		 int [][] arrays = {
				 {12, 15, 8},
				 {6, 19, 25},
				 {30, 2, 10}
		 };
		 Max = arrays[0][0];
		 Min = arrays[0][0];
		 for ( int i = 0; i < arrays.length; i++) {
				for ( int j = 0; j < arrays[i].length ; j++) {
					if(arrays[i][j] > Max) {
						Max = arrays[i][j];
					}
					if(arrays[i][j] < Min) {
						Min = arrays[i][j];
					}
				}
		 }
				System.out.println(Max);
				System.out.println(Min);
		 
		//Q10
		int [][][]arrayss = {
				{
				{1, 2},
				{3, 4},
				},{
				{5, 6},
				{7, 8}}
		};
		for ( int i = 0; i < arrayss.length; i++) {
			for ( int j = 0; j < arrayss[i].length ; j++) {
				for (int k = 0; k < arrayss[i][j].length ; k++){
					System.out.println(arrayss[i][j][k]);
				}
					
				}
			}
		// TODO 自動生成されたメソッド・スタブ

	}

	}
