package SEN.Week06;

public class Question1 {
    public static void main(String[] args) {
        String text="FATIHSULTANMEHMETVAKIFUNIVERSITESI";
        char mostChar='\0';
        int max=0;

       for(int i=0;i<text.length();i++){
           char c=text.charAt(i);
           int count=0;
           for(int j=i;j<text.length();j++){
               if(text.charAt(j)==c){
                   count++;
               }
           }
           if(count>max){
               max=count;
               mostChar=c;
           }
       }
        System.out.println(mostChar+","+max);
    }
}
