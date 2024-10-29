package model.entities;

public class Invoice {
	private Double tax;
	private Double basicPayment;
	
	public Invoice() {
		
	}

	public Invoice(Double basicPayment, Double tax) {
		this.tax = tax;
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	} 
	
	public Double getTotalPayment () {
		return getBasicPayment() + getTax();
	}
}