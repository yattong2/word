package com.my.diary.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class DiaryVO {
	
	private String diary_num;
	private String user_id;
	private String diary_title;
	private String diary_content;
	private String diary_date;

}
