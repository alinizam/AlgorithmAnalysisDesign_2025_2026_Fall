package BLM.Week05;

import java.util.Arrays;

public class Example01 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,1,1};
        System.out.println(Arrays.toString(getCummilativeSum(arr)));
    }
    static int[] getCummilativeSum(int[] arr){
        int[] res=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            res[i+1]=res[i]+arr[i];
        }
        return res;

    }
}
