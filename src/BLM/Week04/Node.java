package BLM.Week04;

public class Node {
    Node left;
    Node right;
    int value;
    Node(int value) {
        this.value = value;
    }
    void visit(){
        System.out.println(value + " visited");
    }
}
