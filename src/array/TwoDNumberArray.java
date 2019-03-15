package array;

public class TwoDNumberArray {

	public static void main(String[] args) {
		int number = 7;
		
		int count = 0; boolean flag = false;
		int grid[][] = new int[][] {{5, 7, 4}, {5, 7, 7}, {3, 1, 0}} ;
	
		for (int i = 0; i < grid.length; i++){
			for(int j = 0 ; j <grid[i].length; j++)
				if(grid[i][j] == number ) {
					flag = true; 
					count= count + 1;
				}
		}
		//		if (count >=1)
		if(flag == true) /// Means if flag == true
			System.out.println("My number " + number + " is found " + count + " times");
		else
			System.out.println("My number " + number + " is NOT found");
	}
}
