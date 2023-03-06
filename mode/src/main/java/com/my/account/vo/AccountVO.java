package com.my.account.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class AccountVO {
	
	private String user_id;
	private String user_pw;
	private String user_name;
	private String user_email;
	private String user_call;
	private String user_profile;
	private String user_birth;

}
