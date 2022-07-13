class Accounting2 {
    // 공급가액
	public double valueOfSupply;
	// 부가가치세율
	public double vatRate = 0.1;

	public double getVAT() {
		return valueOfSupply * vatRate;
	}
	
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
}

public class AccountingApp2 {
	public static void main(String[] args) {
        Accounting2 a1 = new Accounting2();
        a1.valueOfSupply = 10000.0;
        Accounting2 a2 = new Accounting2();
        a2.valueOfSupply = 20000.0;

        System.out.println("Value of supply : " + a1.valueOfSupply);
		System.out.println("VAT : " + a1.getVAT());
		System.out.println("Total : " + a1.getTotal());

        System.out.println("Value of supply : " + a2.valueOfSupply);
		System.out.println("VAT : " + a2.getVAT());
		System.out.println("Total : " + a2.getTotal());

	}

}