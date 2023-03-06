package com.my.diary.dao;

import java.util.List;

import com.my.diary.vo.DiaryVO;

public interface DiaryDAO {

	DiaryVO diaryDetail(String diary_num) throws Exception;

	int insertDiary(DiaryVO dVo) throws Exception;

	List<DiaryVO> diarylist(String user_id) throws Exception;

	int deletetDiary(String diary_num) throws Exception;


}
