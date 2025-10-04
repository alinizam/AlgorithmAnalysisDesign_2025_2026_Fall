package BLM.Week02;

public class Example01 {
    static void writeNumber(int n){
        //Non recursive part
        if (n==0){
            System.out.print("WriteNumber(0)");
            return;}
        //REcursive Part
       System.out.print("writeNumber"+n+"(");
        writeNumber(n-1);
        System.out.print(")");
        System.out.print(n);
    }

    public static void main(String[] args) {
        writeNumber(5);
    }
}
