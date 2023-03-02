package com.my.reply.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor

public class Reply {
	private int reply_num;
	private String user_id;
	private int diary_num;
	private String reply_user_name;
	private String reply_content;
	private String reply_date;
}
