package SEN.Week10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class example02 {
    static final int BLOCKED=-1;
    static int maxCoins(int [][] grid){
        int n=grid.length;
        int m=grid[0].length;
        int [][] dp=new int[n][m];

        if(grid[0][0]==BLOCKED) return BLOCKED;
        // first row
        for(int i=1;i<m;i++){
            if(grid[0][i]==BLOCKED || dp[0][i-1]==BLOCKED) {
                dp[0][i]=BLOCKED;
            }
            else{
                dp[0][i]=dp[0][i-1]+grid[0][i];
            }
        }
        // first column
        for(int i=1;i<n;i++){
            if(grid[i][0]==BLOCKED || dp[i-1][0]==BLOCKED) {
                dp[i][0]=BLOCKED;
            }
            else{
                dp[i][0]=dp[i-1][0]+grid[i][0];
            }
        }
        //fill remaning cells
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(grid[i][j]==BLOCKED ){
                    dp[i][j]=BLOCKED;
                    continue;
                }
                int top=dp[i-1][j];
                int left=dp[i][j-1];
                if(top==BLOCKED && left==BLOCKED){
                    dp[i][j]=BLOCKED;
                }
                else{
                    dp[i][j]=grid[i][j]+Math.max(left,top);
                }
            }
        }
        printPath(dp);
        return dp[n-1][m-1];
    }
    static void printPath(int [][] dp){

        int n=dp.length-1;
        int m=dp[0].length-1;
        List<String> path=new ArrayList<>();

        while(n>0 || m>0){
            path.add("("+n+","+m+")");
            int up=(n>0)? dp[n-1][m]:BLOCKED;
            int left=(m>0)? dp[n][m-1]: BLOCKED;
            if(up>=left){
                n--;
            }
            else{
                m--;
            }
        }
        path.add("(0,0");
        Collections.reverse(path);
        System.out.println(path);
    }
    public static void main(String[] args) {
        int [][] x={
                {0,BLOCKED,0,1,0,0},
                {1,0,0,BLOCKED,1,0},
                {0,1,0,BLOCKED,1,0},
                {0,0,0,1,0,1},
                {BLOCKED,BLOCKED,BLOCKED,0,1,0},
        };
        System.out.println(maxCoins(x));

    }
}
