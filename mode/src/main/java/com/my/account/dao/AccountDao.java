package com.my.account.dao;

import com.my.account.vo.AccountVO;

public interface AccountDao {


	int login(AccountVO aVo) throws Exception;

	int signup(AccountVO aVo) throws Exception;

	int dup_id(String user_id) throws Exception;

}
