package com.my.diary.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.diary.service.DiaryService;
import com.my.diary.vo.DiaryVO;

@RestController
@RequestMapping("/diary")
public class DiaryController {
	
	@Autowired
	DiaryService diaryService;
	
	@GetMapping("/")
	public ResponseEntity<?> diaryDetail(String diary_num) throws Exception {
		
		DiaryVO dVo =  diaryService.diaryDetail(diary_num);
		
		return ResponseEntity.ok().body(dVo);
	}
	@GetMapping("/list")
	public ResponseEntity<?> diarylist(String user_id) throws Exception {
		
		List<DiaryVO> dlist =  diaryService.diarylist(user_id);
		
		return ResponseEntity.ok().body(dlist);
	}
	
	@PostMapping("/insert")
	public ResponseEntity<?> insertDiary(DiaryVO dVo) throws Exception {
		boolean flag = false;
		
		int chk = diaryService.insertDiary(dVo);
		
		 if(chk>0) { flag = true; }
		
		return ResponseEntity.ok().body(flag);
		
	}
	
	@PostMapping("/update")
	public ResponseEntity<?> updatetDiary(DiaryVO dVo) throws Exception {
		boolean flag = false;
		
//		int chk = diaryService.updatetDiary(dVo);
		
//		if(chk>0) { flag = true; }
		
		return ResponseEntity.ok().body(flag);
		
	}
	
	@PostMapping("/insert")
	public ResponseEntity<?> deletetDiary(String diary_num) throws Exception {
		boolean flag = false;
		
		int chk = diaryService.deletetDiary(diary_num);
		
		if(chk>0) { flag = true; }
		
		return ResponseEntity.ok().body(flag);
		
	}
	
}
