package temp;

public class t2 {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            System.out.print(n);
            n = n & (n - 1); // Remove the rightmost set bit
            System.out.println("-" + n);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 13;
        int setBits = countSetBits(number);
        System.out.println("Number of set bits in " + number + " = " + setBits);
    }
}
