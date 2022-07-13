class Print3 {
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
