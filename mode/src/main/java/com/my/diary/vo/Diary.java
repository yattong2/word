package com.my.diary.vo;

import lombok.Data;

@Data
public class Diary {
	private int diary_num;
	private String user_id;
	private String diary_user_name;
	private String diary_title;
	private String diary_content;
	private String diary_date;
}
