package SEN.Week02;

public class Example01 {
    public static void main(String[] args) {
        writeNumber(30000);
    }
    static void writeNumber(int n){
        if (n==0){
            System.out.print ("writeNumber(n)");
            return;
        }

        writeNumber(n-1);

        System.out.println(n);
    }
    static void writeNumber1(int n){
        if (n==0){
            System.out.print ("writeNumber(0)");
            return;
        }
        System.out.print("writeNumber"+n+"(");
        writeNumber(n-1);
        System.out.print(")");

        //System.out.println(n);

    }
}

