package enumDemo;

import java.util.ArrayList;

public class InvoiceTracker {
	private ArrayList<Invoice> invoices;
	
	public InvoiceTracker() {
		invoices = new ArrayList<Invoice>();		
	}
	
	public void addPaidInvoice(double balance) {
		Invoice invoice = new Invoice(Invoice.Status.PAID, balance);
		invoices.add(invoice);
	}
	
	public void printInvoices() {
		System.out.println("Invoices");
		for (Invoice invoice : invoices) {
			System.out.println(invoice);
			if (invoice.getStatus() == Invoice.Status.PAID) {
				System.out.println("Thank you for your payment!");
			}
		}
	}
	public static void main(String[] args) {
		InvoiceTracker tracker = new InvoiceTracker();
		tracker.addPaidInvoice(5000);
		tracker.printInvoices();

		

	}

}
