//package com.knowit.LoginAndRegistration.service;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.knowit.LoginAndRegistration.entities.Login;
//import com.knowit.LoginAndRegistration.repository.LoginRepository;
//
//@Service
//public class LogineService {
//
//	@Autowired
//	LoginRepository loginRepository;
//
//	public Login getLogin(String email, String pwd) {
//		Login l;
//		Optional<Login> ol = loginRepository.getLogin(email, pwd);
//		try {
//			l = ol.get();
//		} 
//		catch (Exception e) {
//			l = null;
//		}
//
//		return l;
//	}
//
//	public Login getById(Integer loginId) {
//		return loginRepository.findById(loginId).get();
//	}
//
//	public Login save(Login l) {
//		return loginRepository.save(l);
//	}
//}
package com.knowit.LoginAndRegistration.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knowit.LoginAndRegistration.entities.Login;
import com.knowit.LoginAndRegistration.repository.LoginRepository;

@Service
public class LogineService {

	@Autowired
	LoginRepository loginRepository;

	public Login getLogin(String email, String pwd) {
		//Login l;
		Optional<Login> ol = loginRepository.getLogin(email, pwd);
		if (ol.isPresent()) {
	        return ol.get();
	    } else {
	        return null; // Log or handle this case
	    }

		
	}

	public Login getById(Integer loginId) {
		return loginRepository.findById(loginId).get();
	}

	public Login save(Login l) {
		return loginRepository.save(l);
	}
}
