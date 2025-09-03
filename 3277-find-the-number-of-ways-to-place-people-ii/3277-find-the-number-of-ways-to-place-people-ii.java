class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.parallelSort(points,(a,b)->{
            return a[0]==b[0]?(a[1]-b[1]):(b[0]-a[0]);
                    });
        int n= points.length;
        int count=0;
        for(int i=0;i<n-1;i++){
             int y1 = points[i][1]; int y= Integer.MAX_VALUE;
            for(int j=i+1;j<n;j++){
              int y2 = points[j][1];
               if(y2>=y1 && y>y2){
                count++;
                y=y2;
                if(y1==y2)break;
               }
            }            
            }
        return count;
    }
}