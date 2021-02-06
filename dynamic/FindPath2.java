public class FindPath2 {
	public static void main(String[] args) {
		// The problem is to count all the possible paths from top left to bottom 
		// right of a mXn matrix with the constraints that from each cell you can 
		// either move only to right or down
		int r = 2;
		int c = 2;
		int[][] ar = new int[r+1][c+1];
		
		// initialising matrix with -1
		for (int i =0; i<=r; i++) {
			for (int j =0; j<=c ; j++) {
				ar[i][j] = -1;
			}
		}

		System.out.println(find(r,c,ar));
	}

	public static int find(int r, int c, int[][] ar) {

		if(r == 1 || c ==1) {
			return 1;
		}

		if(ar[r][c] != -1){
			return ar[r][c];
		}

		ar[r][c] = find(r-1, c, ar) + find(r, c-1,ar);

		return ar[r][c];
	}
	
}