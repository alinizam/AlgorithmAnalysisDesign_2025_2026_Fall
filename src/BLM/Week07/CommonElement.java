package BLM.Week07;

public class CommonElement {
    public static void main(String[] args) {
        int A[]={2,4,8,10};
        int B[]={0,1,4,5,6,7,8};
        int i=0, j=0;
        while(i<A.length && j<B.length){
            if(A[i]==B[j]){
                System.out.println(A[i]+" "+B[j]);
                i++;
                j++;
            } else if (A[i]>B[j]) {
                j++;
            }else  if (A[i]<B[j]) {
                i++;
            }
        }

    }
}
