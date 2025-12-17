package SEN.Week11;

public class Example01 {
    public static int findMin(int n) {
        int count = 0;
        int[] denomination = {1, 8, 10,15};
        for (int i = denomination.length - 1; i >= 0; i--) {

            // Find denominations
            count+=n/denomination[i];
            System.out.println(denomination[i]+" : "+n/denomination[i]+" : "+n%denomination[i]);
            n=n%denomination[i];

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findMin(28));
    }


}
