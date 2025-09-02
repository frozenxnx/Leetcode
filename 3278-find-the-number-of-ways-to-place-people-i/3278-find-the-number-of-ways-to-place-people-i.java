class Solution {
    public int numberOfPairs(int[][] points) {
        int n= points.length;
        int m= points[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            int x1 = points[i][0]; int y1 = points[i][1];
            for(int j=0;j<n;j++){
                if(i==j)continue;
                 int x2 = points[j][0];int y2 = points[j][1];
                 if(x1>x2 || y1<y2)continue;
            
                 boolean valid = true;
                 for(int k=0;k<n;k++){
                    if(k==i || k==j)continue;
                    int x=points[k][0];int y = points[k][1];
                    if(x1 <= x && x <= x2 && y2 <= y && y <= y1){
                        valid = false;
                        break;
                    }
                    }
                    if(valid){
                        count++;
                    }
                }
            }
        return count;
    }
}