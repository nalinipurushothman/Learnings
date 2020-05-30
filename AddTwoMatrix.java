package Java;

public class AddTwoMatrix {
	public static void main(String[] args) {
		int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] matrix2 = {{9,8,7},{6,5,4},{3,2,1}};
		int matrix3[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix3[i][j]= matrix1[i][j]+matrix2[i][j];
				
				
			}
		}System.out.println( "Addition of 2 Matrix");
		
		for (int j = 0; j <3; j++) {
			for (int j2 = 0; j2 < 3; j2++) {
				System.out.print(matrix3[j][j2] +" ");
			}System.out.println();
			
			
		}
	}

}
