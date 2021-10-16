package com.coupon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User u = userRepo.findByEmail(username);
		System.out.println(" hhh "+u.getEmail()+u.getFirst_name()+u.getId()+" "+" 999 "+u.getRole().toString());
		if(u!=null) {
			System.out.println("User found!!"+username );
		}
		
	
		return new org.springframework.security.core.userdetails.User(u.getEmail(), u.getPassword(),u.getRole());
	}

}
