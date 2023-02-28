package com.my.member.dao;

import com.my.exception.AddException;
import com.my.exception.FindException;
import com.my.member.vo.Member;

public interface MemberDAO {
	public void add(Member vo) throws AddException;
	
	public Member selectById(String userId) throws FindException;
}
