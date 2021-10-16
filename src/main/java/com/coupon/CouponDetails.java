package com.coupon;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CouponDetails {

	@Id
	private String CouponCode;
	private int discount;
	public String getCouponCode() {
		return CouponCode;
	}
	public void setCouponCode(String couponCode) {
		CouponCode = couponCode;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public CouponDetails(String couponCode, int discount) {
		super();
		CouponCode = couponCode;
		this.discount = discount;
	}
	public CouponDetails() {
		super();
	}
	
	
	
}
