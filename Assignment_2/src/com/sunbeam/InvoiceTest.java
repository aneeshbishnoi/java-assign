package com.sunbeam;

class Invoice {
	private String part_number;
	private String part_desc;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String part_number,String part_desc,int quantity,double pricePerItem){
		this.part_number=part_number;
		this.part_desc=part_desc;
		setQuantity(quantity);
		setPricePerItem(pricePerItem);
		
		
	}

	public String getPart_number() {
		return part_number;
	}

	public void setPart_number(String part_number) {
		this.part_number = part_number;
	}

	public String getPart_desc() {
		return part_desc;
	}

	public void setPart_desc(String part_desc) {
		this.part_desc = part_desc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = (quantity>0)?quantity:0;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = (pricePerItem>0.0)? pricePerItem:0.0;
	}
	public double getInvoiceAmount() {
		return quantity*pricePerItem;
	}
}
	
public class InvoiceTest{
		public static void main(String[] args) {
			Invoice inv1=new Invoice("A101", "Hammer", 5, 12.99);
			System.out.println("Invoice 1 for positive value");
			System.out.println("Part Number: "+inv1.getPart_number());
			System.out.println("Part Description: "+inv1.getPart_desc());
			System.out.println("Part Quantity: "+inv1.getQuantity());
			System.out.println("Part Per Item: "+inv1.getPricePerItem());
			System.out.println("Total Amount: "+inv1.getInvoiceAmount());
			
			Invoice inv2=new Invoice("A101", "Hammer", -5, -12.99);
			System.out.println("Invoice 2 for negative value");
			System.out.println("Part Number: "+inv2.getPart_number());
			System.out.println("Part Description: "+inv2.getPart_desc());
			System.out.println("Part Quantity: "+inv2.getQuantity());
			System.out.println("Part Per Item: "+inv2.getPricePerItem());
			System.out.println("Total Amount: "+inv2.getInvoiceAmount());
			
		}
	}
	



