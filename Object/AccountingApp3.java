class Accounting3 {
    // 공급가액
	public double valueOfSupply;
	// 부가가치세율
	public double vatRate = 0.1;
    public Accounting3(double valueOfSupply) {
        this.valueOfSupply = valueOfSupply;
    }
	public double getVAT() {
		return valueOfSupply * vatRate;
	}
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
}

public class AccountingApp3 {
	public static void main(String[] args) {
        Accounting3 a1 = new Accounting3(10000.0);
        Accounting3 a2 = new Accounting3(20000.0);

        System.out.println("Value of supply : " + a1.valueOfSupply);
		System.out.println("VAT : " + a1.getVAT());
		System.out.println("Total : " + a1.getTotal());

        System.out.println("Value of supply : " + a2.valueOfSupply);
		System.out.println("VAT : " + a2.getVAT());
		System.out.println("Total : " + a2.getTotal());

	}

}