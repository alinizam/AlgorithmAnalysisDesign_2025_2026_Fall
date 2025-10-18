package SEN.Week04;

public class Example02_2 {
    public static int sumofArray(int[] array, int left, int right) {
            // Base case: one element
            if (left == right) {
                return array[left];
            }

            // If subarray size <= 4, sum directly
            if (right - left <= 3) {
                int[] small = new int[right - left + 1];
                for (int i = 0; i < small.length; i++) {
                    small[i] = array[left + i];
                }
                return getTotal4int(small);
            }

            int len = right - left + 1;
            int quarter = len / 4;

            // Divide into 4 parts
            int total1 = sumofArray(array, left, left + quarter - 1);
            int total2 = sumofArray(array, left + quarter, left + 2 * quarter - 1);
            int total3 = sumofArray(array, left + 2 * quarter, left + 3 * quarter - 1);
            int total4 = sumofArray(array, left + 3 * quarter, right);

            int[] temp = { total1, total2, total3, total4 };
            return getTotal4int(temp);
        }

        static int getTotal4int(int[] temp) {
            int sum = 0;
            for (int i : temp) {
                sum += i;
            }
            return sum;
        }

        public static void main(String[] args) {
            int arr[] = { 1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,1,1,1,1,1 };
            System.out.println(sumofArray(arr, 0, arr.length - 1));
        }
    }

