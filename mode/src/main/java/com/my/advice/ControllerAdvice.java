package com.my.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import com.my.exception.AddException;
import com.my.exception.FindException;
import com.my.exception.RemoveException;

@RestControllerAdvice
public class ControllerAdvice {

	@ExceptionHandler(FindException.class)
	@ResponseBody
	public ResponseEntity<?> findExceptionHandler(FindException e){
		System.out.println("--------FindException ControllerAdvice----------");
		e.printStackTrace();
		Map<String,String> map = new HashMap();
		map.put("msg", e.getMessage());
		return new ResponseEntity<>(map,HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(AddException.class)
	@ResponseBody
	public ResponseEntity<?> addExceptionHandler(AddException e){
		System.out.println("--------AddException ControllerAdvice----------");
		return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(RemoveException.class)
	@ResponseBody
	public ResponseEntity<?> RemoveExceptionHandler(RemoveException e){
		System.out.println("--------RemoveException ControllerAdvice----------");
		return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(MaxUploadSizeExceededException.class)
	@ResponseBody
	public ResponseEntity<?> exceptMaxUploadSize(MaxUploadSizeExceededException e){
		HttpHeaders headers = new HttpHeaders();//컨트롤러가 아니기때문에 get,map 으로 응답 형식 지정불가, 헤더로 직접 지정
		headers.add("Content-Type", "application/json;charset=utf-8");//text/html;charset=uff-8
		headers.add("Access-Control-Allow-Origin", "http://192.168.0.23:5500");
		headers.add("Access-Control-Allow-Credentials", "http://192.168.0.23:5500");//쿠키허용
		return new ResponseEntity<>("파일크기가 너무 큽니다",headers,HttpStatus.BAD_REQUEST);

	
	}

}
