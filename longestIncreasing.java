%still, DFS, pretty simple and clean
%There is something bad here, the Integer.MIN_VALUE is not perfect. I think I need to write another methond. Too lazy -.-
public class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix.length==0) return 0;
        int[][] dis=new int[matrix.length][matrix[0].length];
        int max=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(dis[i][j]==0) dis[i][j]=DFS(matrix,i,j,Integer.MIN_VALUE,dis);
                max=Math.max(dis[i][j],max);
            }
        }
        return max;
    }
    public int DFS(int[][] matrix, int i, int j,int last,int[][]dis){
        if(i<0||i>=matrix.length||j<0||j>=matrix[0].length||matrix[i][j]<=last){
            return 0;
        }
        if(dis[i][j]==0) {
        int left=DFS(matrix,i+1,j,matrix[i][j],dis);
        int right=DFS(matrix,i-1,j,matrix[i][j],dis);
        int down=DFS(matrix,i,j+1,matrix[i][j],dis);
        int up=DFS(matrix,i,j-1,matrix[i][j],dis);
        dis[i][j]=Math.max(Math.max(left,right),Math.max(up,down))+1;}
        return dis[i][j];
    }
}
