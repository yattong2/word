package com.my.diary.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Diary {
	private int diary_num;
	private String user_id;
	private String diary_user_name;
	private String diary_title;
	private String diary_content;
	private String diary_date;
}
