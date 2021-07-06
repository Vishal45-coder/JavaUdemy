package Inheritance;

class C{
    int i, j;
    C(int a, int b) {
    i = a;
    j = b;
    }
    // display i and j
    void show() {
    System.out.println("i and j: " + i + " " + j);
    }
    }
    class D extends C {
    int k;
    D(int a, int b, int c) {
    super(a, b);
    k = c;
    }
    // display k – this overrides show() in A
    void show() {
        super.show();
    System.out.println("k: " + k);
    }
    }
public class Override_1 {
    public static void main(String args[]) {
    D subOb = new D(1, 2, 3);
    subOb.show(); // this calls show() in B
    }
    }