class Cal4 {
    int v1, v2;
    Cal4(int v1, int v2) {
        System.out.println("Cal4 init!!");
        this.v1 = v1; this.v2 = v2;
    }
    public int sum() {
        return this.v1 + v2;
    }
}

class Cal5 extends Cal4 {
    Cal5(int v1, int v2) {
        super(v1, v2);
        System.out.println("Cal5 init!!");
    }
    public int minus() {
        return this.v1 - v2;
    }
}

public class InheritanceApp2 {
    public static void main(String[] args) {
        Cal4 c4 = new Cal4(2,1);
        Cal5 c5 = new Cal5(2,1);
        System.out.println(c5.sum());
        System.out.println(c5.minus());
    }
}