package com.gm.HelloWorld;

import java.io.Serializable;

public class PostResponse implements Serializable {

	private static final long serialVersionUID = 4650826482958276540L;

	private int addition;
	
	private int subtract;
	
	private PostResponse2 product;
	
	private double quotient;

	public int getAddition() {
		return addition;
	}

	public void setAddition(int addition) {
		this.addition = addition;
	}

	public int getSubtract() {
		return subtract;
	}

	public void setSubtract(int subtract) {
		this.subtract = subtract;
	}

	public double getQuotient() {
		return quotient;
	}

	public void setQuotient(double quotient) {
		this.quotient = quotient;
	}

	public PostResponse2 getProduct() {
		return product;
	}

	public void setProduct(PostResponse2 product) {
		this.product = product;
	}
	
	

	
}

