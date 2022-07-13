class Print3 {
    // 생성자는 초기에 주입해야 하는 값이 있을때 사용
    // this는 클래스가 인스턴스화 되었을때 인스턴스를 가리키는것
    public String delimiter = "";
    // public Print3(String _delimiter) {
    //     delimiter = _delimiter;
    // }
    public Print3(String delimiter) {
        this.delimiter = delimiter;
    }

    public void A() {
        // System.out.println(delimiter);
        System.out.println(this.delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    public void B() {
        // System.out.println(delimiter);
        System.out.println(this.delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}
