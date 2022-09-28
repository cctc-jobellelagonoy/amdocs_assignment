package com.training.assignment02;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int[][] array = getInput();
		
		System.out.println(spiralOrder(array));
		
	}
	
	public static int[][] getInput(){
		Scanner input = new Scanner(System.in);
		
		int row, column;
		
		System.out.println("Row: ");
		row = input.nextInt();
		
		System.out.println("Column: ");
		column = input.nextInt();
		
		int[][] array = new int[row][column];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				array[i][j] = Integer.parseInt(input.next());
			}
		}
		
		return array;
	}
	
	public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
  
        if (matrix.length == 0)
            return ans;
  
        int m = matrix.length, n = matrix[0].length;
        boolean[][] seen = new boolean[m][n];
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };
        int x = 0, y = 0, di = 0;
  
        for (int i = 0; i < m * n; i++) {
            ans.add(matrix[x][y]);
            seen[x][y] = true;
            int cr = x + dr[di];
            int cc = y + dc[di];
  
            if (0 <= cr && cr < m && 0 <= cc && cc < n
                    && !seen[cr][cc]) {
                x = cr;
                y = cc;
            } else {
                di = (di + 1) % 4;
                x += dr[di];
                y += dc[di];
            }
        }
        return ans;
    }
	
}
