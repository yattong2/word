package com.my.file.vo;

import lombok.Data;

@Data
public class File {
	private int file_idx;
	private int diary_num;
	private String file_name;
	private String file_path;
	private String reg_date;
}
