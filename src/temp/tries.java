package temp;

public class tries {

    public static void main(String[] args) {
        //writeNumbers(10);
    }
    public static void writeNumbers(int n){
        System.out.print("writeNumbers"+n+"(");

        if (n==0){System.out.print("0"); return;}

        writeNumbers(n-1);
        System.out.print(")");
    }

}
