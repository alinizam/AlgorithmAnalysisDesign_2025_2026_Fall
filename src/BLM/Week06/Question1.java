package BLM.Week06;

public class Question1 {
    public static void main(String[] args) {
        String str="FATIHSULTANMEHMETVAKIFUNIVERSITESI";
        char mostChar='\0';
        int maxCount=0;
        for(int j=0;j<str.length();j++){
            char c=str.charAt(j);
            boolean seenBefore=false;
            for(int k=0;k<j;k++){
                if(c==str.charAt(k)){
                    seenBefore=true;
                }
            }
            if(seenBefore) continue;
            int count=0;
            for(int k=j;k<str.length();k++){
                if(c==str.charAt(k)){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount=count;
                mostChar=c;
            }
        }
        System.out.println(mostChar+", "+maxCount);
    }
}
