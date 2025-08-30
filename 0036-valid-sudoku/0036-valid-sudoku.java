class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        HashSet<Character> row[] = new HashSet[9];
        HashSet<Character> col[] = new HashSet[9];
        HashSet<Character> box[] = new HashSet[9];

      for(int i=0;i<9;i++){
         row[i] = new HashSet<Character>();
         col[i] = new HashSet<Character>();
         box[i] =new HashSet<Character>();
      }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    
                if(!row[i].add(board[i][j]))
                return false;
                row[i].add(board[i][j]);

                if(!col[j].add(board[i][j])){
                return false;
                }

                col[j].add(board[i][j]);

                int boxindex = 3*(i/3)+(j/3);

                if(!box[boxindex].add(board[i][j])){
                return false;
                }

                box[boxindex].add(board[i][j]);
            }
         }
        }

        return true;
    }
}