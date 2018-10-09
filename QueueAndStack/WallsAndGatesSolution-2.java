class Solution {
    private static final int EMPTY=Integer.MAX_VALUE;
    private static final int GATE=0;
    private static final List<int[]> Directions=Arrays.asList(
        new int[] {0,1},
        new int[] {0,-1},
        new int[] {1,0},
        new int[] {-1,0}
    );
    
    public void WallsAndGates(int[][] rooms) {
        int m=rooms.length;
        if(m==0) return;
        int n=rooms[0].length;
        Queue<int[]> q=new LinkedList<int[]>();
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(rooms[i][j]==GATE) {
                    q.add(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()) {
            int[] point=(int[]) q.poll();
            int row=point[0];
            int col=point[1];
            for(int[] direction:Directions) {
                int r=row+direction[0];
                int c=col+direction[1];
                if(r <0 || c<0 || r>=m || c>=n|| rooms[r][c]!=EMPTY) {
                    continue;
                }
                rooms[r][c]=rooms[row][col]+1;
                q.add(new int[]{r,c});
            }
        }
    }

}
