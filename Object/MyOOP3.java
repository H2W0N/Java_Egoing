public class MyOOP3 {
    public static void main(String[] args) {
        // 인스턴스화
        Print2 p1 = new Print2();
        p1.delimiter = "-----";
        p1.A();
        p1.B();

        Print2 p2 = new Print2();
        p2.delimiter = "******";
        p2.A();
        p2.B();
    }
}
