package com.clc.sample.java.fundamentals;

import java.util.Date;



public class TestImmutablity {

	public static void main(String[] args) {

	Product p1 = new Product(1,"laptop",52000.2, new Vendor(111,"lenovo"),new Date(1111, 12, 22));
		System.out.println(p1);
		//v1. -- discard..
		//p1.getvendor().set-- discard..
		//d1 --discard
		//p1.getDate().setDate(--) -- not possible to discard..
		p1.getDate().setMonth(1);
		System.out.println(p1);
		
		
		/*
		Product p1 = new Product(1,"AAA",15023.4); //value cannot be change you can change the ref..
		p1 = new Product(2,"BBB",25023.4);

		final Product p3= new Product(1,"AAA",15023.4); //value or ref cannot be changed
		*/
	}
	
}	

/**
 * final -- primitive -- ref--NAP --value -- Cannot be change -- Immutable
 * final Object -- ref-- Cannot be Changed -- value -- can be -- mutable objects
 * String -Obj -- Immutable -- in point ref..
 * 			final String -- ref -- cannot be changed...value -- string immutability property will not allow you change the value....... Immutable
 * 
 * userdefined --- then what steps to follow
 * 		-- make same changes as product class in your vendor class
 * 			-- class final
 * 			--fields private final
 * 			--then remove setters
 * 	-- product gettter madhe new Vender object banava and existing vendor object chya
 * 			values new object madhe add kr and return new obj cha ref..
 * 			so if someone tries to modify the objects..changes will happen in new object not in product's date obje..i mean original vendor obj..
 * 
 * 
 * systemdefined objects --- then what steps to follow
 * 			-- product gettter madhe new Date object banava and existing date object chya
 * 			values new object madhe add kr and return new obj cha ref..
 * 			so if someone tries to mofify the objects..changes will happen in new object not in product's date obje..i mean original date obj..
 * 
 * class with -- primitives or String only -- just final private
 * class with -- user defined mutable object -- private final -- + removes setters and private final inside that class too
 * class with -- system defined mutable objects.. -- inside domain class getter create new object and return ref with copied contents..
 * 
 * final -- class / fields
 * removes setters
 *
 *
 * dc
 *  
 * nc
 * pc
 * 
 * 
 * 
 * 
 * 
 * @author Yogesh
 *
 */


final class Product{
	final private int productId;//immutable
	final private String productName;//immutable
	final private double productPrice;//immutable
	final private Vendor vendor;//userdefined..ref..immutable...value mutable -- removed setter and applied final to fields
	final private Date date; //system defined..ref immutable...value mutable..
	
	
	public Date getDate() {
	return new Date(date.getYear(),date.getMonth(),date.getDay());
	}
	public Vendor getVendor() {
		return vendor;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	
	public double getProductPrice() {
		return productPrice;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName="
				+ productName + ", productPrice=" + productPrice + ", vendor="
				+ vendor + ", date=" + date + "]";
	}
	public Product(int productId, String productName, double productPrice,Vendor v,Date dt) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.vendor = v;
		this.date=dt;
	}

	
}


class Vendor{
	final private int vendorId;
	final private String vendorName;
	public int getVendorId() {
		return vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName
				+ "]";
	}
	public Vendor(int vendorId, String vendorName) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
	}
	
	
	
}