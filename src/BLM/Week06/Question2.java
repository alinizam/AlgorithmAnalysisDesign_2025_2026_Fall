package BLM.Week06;

public class Question2 {
    public static void main(String[] args) {
        String str="FATIHSULTANMEHMETVAKIFUNIVERSITESI";
        int [] freq=new int[26];

        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            freq[c-65]++;
        }
        int max=0;
        char mostChar='\0';
        for(int k=0;k<freq.length;k++){
           if(freq[k]>max){
               max=freq[k];
               mostChar=(char) (k+65);
           }
        }
        System.out.println(mostChar+","+max);
    }

}
