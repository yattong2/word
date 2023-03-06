package com.my.diary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.diary.dao.DiaryDAO;
import com.my.diary.vo.DiaryVO;

@Service
public class DiaryService {
	
	@Autowired
	private DiaryDAO dao;
	

	public DiaryVO diaryDetail(String diary_num) throws Exception {
		// TODO Auto-generated method stub
		return dao.diaryDetail(diary_num);
	}


	public int insertDiary(DiaryVO dVo) throws Exception {
		// TODO Auto-generated method stub
		int chk = dao.insertDiary(dVo);
		return chk;
	}


	public List<DiaryVO> diarylist(String user_id) throws Exception {
		// TODO Auto-generated method stub
		return dao.diarylist(user_id);
	}


	public int deletetDiary(String diary_num) throws Exception {
		// TODO Auto-generated method stub
		return dao.deletetDiary(diary_num);
	}

}
