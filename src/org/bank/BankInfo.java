package org.bank;

public class BankInfo extends AxisBank {

	private void saving() {
		System.out.println("Saving A/C No : 1122337739393839393");
	}

	private void fixed() {
		System.out.println("Fixed A/C NO : 1111182828282828");
	
	}
	
	
	public static void main(String[] args) {
		BankInfo bi = new BankInfo ();
				bi.saving();
				bi.fixed();
				bi.deposit();
	}
}
