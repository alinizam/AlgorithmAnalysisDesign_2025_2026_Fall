package BLM.Week04;

public  class Lab_quiz {
    public static int findMaxIterative(int[] arr) {
        int max=arr[0];
        int n=arr.length;
        int chunkSize=4;
        for(int i=0;i<n;i+=chunkSize){
            int end=Math.min(i+chunkSize-1,n-1);
            int blockMax=arr[end];
            if(blockMax>max){
                max=blockMax;
            }
        }
        return max;
    }

    public static int findMaxRecursive(int[] arr,int start) {
        int n=arr.length;
        int chunkSize=4;
        if(start>=n){
            return Integer.MIN_VALUE;
        }
        int end=Math.min(start+chunkSize-1,n-1);
        int blockMax=arr[end];
        int restMax=findMaxRecursive(arr,start+chunkSize);
        return Math.max(blockMax,restMax);
    }

    public static void main(String[] args) {
        int [] arr = {2,5,8,9,16,17,18,20,1,4,6,7,3,10};
        System.out.println(findMaxIterative(arr));
        System.out.println(findMaxRecursive(arr,0));

    }

}
