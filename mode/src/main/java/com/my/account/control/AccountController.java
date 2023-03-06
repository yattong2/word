package com.my.account.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.account.service.AccountService;
import com.my.account.vo.AccountVO;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@PostMapping("/login")
	public ResponseEntity<?> login(AccountVO aVo) throws Exception {
		boolean isLogin = false;
		
		int chk = accountService.login(aVo);
		
		if(chk>0) {
			isLogin = true;
		}
		
		return ResponseEntity.ok().body(isLogin);
		
	}
	
	@PostMapping("/dup_id")
	public ResponseEntity<?> dup_id(String user_id) throws Exception {
		boolean dup_id = true;
		int chk = accountService.dup_id(user_id);
		if(chk==0) {
			dup_id = false;
		}
		
		return ResponseEntity.ok().body(dup_id);
		
	}
	
	@PostMapping("/signup")
	public ResponseEntity<?> signup(AccountVO aVo) throws Exception {
		
		int chk = accountService.signup(aVo);
		/*
		 * 데이터 삽입 실패 했을때 어떻게 예외처리를 하는게 좋을까?
		 * if(chk>0) { isLogin = true; }
		 */
		
		return ResponseEntity.ok().body(aVo);
		
	}
	

}
