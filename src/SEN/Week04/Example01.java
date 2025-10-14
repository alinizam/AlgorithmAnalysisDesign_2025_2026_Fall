package SEN.Week04;

public class Example01 {
    public static int sumofArray(int[] array,int left,int right){
        if (left==right){
            return array[left];
        }
        int mid=(left+right)/2;
        int leftTotal=sumofArray(array,left,mid);
        int rightTotal=sumofArray(array,mid+1,right);
        return leftTotal+rightTotal;
    }
    public static void main(String[] args) {
        int arr []={1,2,3,4,5,6,7,8,9};
        System.out.println(sumofArray(arr,0,arr.length-1));

    }
}
