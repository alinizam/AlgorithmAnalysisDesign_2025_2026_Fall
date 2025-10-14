package SEN.Week04;

public class Example02_1{
    public static int getby4(int[] arr, int start ,int end ){
        if(start == end ){
            return arr[start];
        }
        if ((end - start +1) < 4){
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += arr[i];
            }
            return sum;
        }
        int len = end - start +1;
        int q1 = start + len / 4;
        int q2 = start + len /2;
        int q3 = start + 3*len /4;

        return getby4(arr, start, q1 - 1) + getby4(arr, q1, q2 -1)+ getby4(arr, q2 ,q3 -1) + getby4(arr, q3 , end);
    }
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 1,1 ,1,1,1,3,3,3,3,4,4,4,4};

        System.out.println(getby4(numbers,  0, numbers.length -1));
    }
}

