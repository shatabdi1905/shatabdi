package dineshCoding.day3;

public class TicTacToeWinner1275 {

	int [][][] winningMovesArray = {{{0,0},{1,1},{2,2}},
								{{0,0},{0,1},{0,2}},
								{{0,0},{1,0},{2,0}},
								{{0,1},{1,1},{2,1}},
								{{0,2},{1,2},{2,2}},
								{{1,0},{1,1},{1,2}},
								{{2,0},{2,1},{2,2}},
								{{0,2},{1,1},{2,0}}};
	

	public int[] fillArray(int []player, int row, int col) {
		player[row]++;
		player[col+3]++;
		if(row == col)
			player[6]++;
		if(row == 2-col)
			player[7]++;
		return player;
	}
    public String tictactoe(int[][] moves) {
        
    	int []aWinningMoves = new int[8];
    	int []bWinningMoves = new int[8];    	
    	
    	for(int i=0;i<moves.length;i++) {
    		int row = moves[i][0],col = moves[i][1];
    		if(i%2==0) 
    			aWinningMoves = fillArray(aWinningMoves, row, col);
			else
    			bWinningMoves = fillArray(bWinningMoves, row, col);
    	}
    	for(int i=0;i<8;i++) {
    		if(aWinningMoves[i]==3)
    			return "A";
    		if(bWinningMoves[i]==3)
    			return "B";
    	}
    	
    	if(moves.length==9)
    		return "Draw";
    	else
    		return "Pending";
    }
	
    public String tictactoeBruteForce(int[][] moves) {
    
    	int aMovesCount =0, bMovesCount=0;
    	for(int i=0;i<moves.length;i++) {
    		if(i%2==0)
    			aMovesCount++;
    		else
    			bMovesCount++;    		
    	}
    	int [][]aMoves = new int[aMovesCount][2];
    	int [][]bMoves = new int[bMovesCount][2];
    	int j=0,k=0;
    	for(int i=0;i<moves.length;i++) {
    		if(i%2==0)
        		aMoves[j++] = moves[i];
    		else
    			bMoves[k++] = moves[i];
    	}
    	for(int [][] winningMoves: winningMovesArray) {
    		int count=0;
        	for(int [] aMove: aMoves) {
    	    	if(doesExist(aMove, winningMoves))
    				count++;
    		}
        	if(count==3)
        		return new String("A");
        	count = 0;
        	for(int [] bMove: bMoves) {
        		if(doesExist(bMove, winningMoves))
    				count++;
    		}
        	if(count==3)
        		return new String("B");
    	    	
    	}
    	if(moves.length==9)
    		return "Draw";
    	else
    		return "Pending";
    }
    
    boolean doesExist(int []move, int[][] winningMoves) {
    	for(int[] winMove: winningMoves) {
    		if(winMove[0]==move[0] && winMove[1]==move[1])
    			return true;
    	}
    	return false;
    }
    
	public static void main(String[] args) {
		TicTacToeWinner1275 obj = new TicTacToeWinner1275();
		int [][] arr = {{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}};
		System.out.println(obj.tictactoe(arr));

	}

}
