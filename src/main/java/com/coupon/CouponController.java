package com.coupon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CouponController {

	@Autowired
	private CouponService ps;
	
	@GetMapping("/getCouponDetails/{cc}")
	public CouponDetails getCouponDetails(@PathVariable String cc) {
		return ps.getCouponDetails(cc);
	}
	
	
	@GetMapping("/createCoupon/{name}/{discount}")
	public void createCoupon(@PathVariable String name, @PathVariable int discount) {
		ps.createCouponDetails(name, discount);
	}
	
}
