package SEN.Week06;

public class Question2 {
    public static void main(String[] args) {
        String text="FATIHSULTANMEHMETVAKIFUNIVERSITESI";
        int [] arr=new int[26];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            arr[c-65]++;
        }
        int max=0;
        char mostChar='\0';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
                mostChar=(char) (i+65);
            }
        }
        System.out.println(mostChar+", "+max);
    }
}
