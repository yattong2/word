package com.my.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.exception.AddException;
import com.my.exception.FindException;
import com.my.member.vo.Member;

@Repository
public class MemberDAOOracle implements MemberDAO {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	@Override
	public void add(Member vo) throws AddException {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			session.insert("com.my.member.MemberMapper.insertMember", vo);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public Member selectById(String userId) throws FindException {

		return null;
	}

}
