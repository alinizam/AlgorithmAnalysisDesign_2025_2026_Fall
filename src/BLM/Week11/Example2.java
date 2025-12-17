package BLM.Week11;

public class Example2 {
    public static boolean canPartition(int [] nums){
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        if(totalSum%2!=0){
            return false;
        }
        int target=totalSum/2;
        boolean [][] dp=new boolean[nums.length+1][target+1];

        for(int i=0;i<nums.length;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<=nums.length;i++){
            int current=nums[i-1];
            for(int j=1;j<=target;j++){
                if(current>j){
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-current];
                }
            }
            for(int k=0;k< dp.length;k++){
                for (int m=0;m<dp[k].length;m++){
                    System.out.print(dp[k][m]+" ");
                }
                System.out.println();
            }
            System.out.println("------------------");
        }
        return dp[nums.length][target];
    }
    public static void main(String[] args) {
        int [] nums={1,5,11,5};
        System.out.println(canPartition(nums));
    }
}
