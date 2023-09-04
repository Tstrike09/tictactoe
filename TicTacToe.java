package com.D.javaworkspace;
import java.util.Scanner;

public class TicTacToe
	{
	public TicTacToe() 
	{
		int arr[][] = {{1,2,3},{6,7,8},{9,1,1}};
		for (int i = 0; i <= 2; i++) 
		{
			for(int j=0; j<=2; j++)
			{
			System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();

	}
}


