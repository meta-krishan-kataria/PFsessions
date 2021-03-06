
public class QueensProblem {
	
	int N;
	//constructor
	public QueensProblem(int n) {
		this.N=n;
	}
	
	//function to check that a queen can be placed or not at position table[row][col]
	boolean isSafe(int[][] table, int row, int col){
		int i,j;
		
		//checking the row on left side
		for(i=col; i<=0; i--){
			if(table[row][i]==1){
				return false;
			}
		}
		//checking upper diagonal on left side
		for(i=row,j=col;  i>=0 && j>=0;  i--,j--){
			if(table[i][j]==1){
				return false;
			}
		}
		//checking lower diagonal on left side
		for(i=row,j=col;  i<=N && j>=0;  i++,j--){
			if(table[i][j]==1){
				return false;
			}
		}
		
		//safe 
		return true;
		
	}
	
	boolean solveProblem(int table[][], int count){
		//base condition, when all queens are palced
		if(count >= N){
			return true;
		}
		
		//placing queens in each row
		for(int i=0; i<N ; i++){
			
			
			
			
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
