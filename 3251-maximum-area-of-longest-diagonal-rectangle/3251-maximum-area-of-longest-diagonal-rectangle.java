class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n = dimensions.length;
        int m = dimensions[0].length;  
        int max_area=0;
        int max_diagonal=Integer.MIN_VALUE;
         for(int i=0;i<n;i++){        
                  int l= dimensions[i][0];
                  int b = dimensions[i][1];
                  int diagonal = (l*l) + (b*b);
                  int area =l*b;
                if(diagonal>max_diagonal){
                max_diagonal = diagonal;
                max_area = area;
            }
            if(diagonal==max_diagonal){
                   max_area= Math.max(max_area,area);
            }
        }
        return max_area;
    }
}