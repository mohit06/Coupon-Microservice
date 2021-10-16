package com.coupon;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponService {

	@Autowired
	private CouponRepository cr;
	
	public CouponDetails getCouponDetails(String coupon) {
		
		Optional<CouponDetails> cc = cr.findById(coupon);
		return cc.get();
		
	}
	
    public void createCouponDetails(String coupon, int disc) {
		
		CouponDetails cd  = new CouponDetails(coupon,disc);
		cr.save(cd);
		System.out.println("Coupon created successfully!!");
		
	}
	
	
}
