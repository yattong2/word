package com.my.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.account.dao.AccountDao;
import com.my.account.vo.AccountVO;

@Service
public class AccountService {
	
	@Autowired
	private AccountDao dao;
	
	public int login(AccountVO aVo) throws Exception { // 컨트롤러에 예외를 떠넘기겠다
		int chk = dao.login(aVo);
		return chk;
	}

	public int signup(AccountVO aVo) throws Exception {
		int chk = dao.signup(aVo);
		return chk;
	}

	public int dup_id(String user_id) throws Exception {
		// TODO Auto-generated method stub
		int chk = dao.dup_id(user_id);
		return chk;
	}

}
