package BLM.Week04;

public class Example01 {
    public static void main(String[] args) {
        int [] myArray = {1, 3, 6, 7,1};
        System.out.println(getSumOfArray(myArray,0,myArray.length-1));
    }
    static int getSumOfArray(int[] A,int left,int rigth){
        if(left==rigth){
            return A[left];
        }
        if(left>rigth){
            return 0;
        }
        int mid=(rigth+left)/2;
        int leftTotal=getSumOfArray(A,left,mid);
        int rightTotal=getSumOfArray(A,mid+1,rigth);

        return leftTotal+rightTotal;
    }
}
