package com.my.account.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.account.vo.AccountVO;

@Repository
public class AccountDaoOracle implements AccountDao {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	@Override
	public int login(AccountVO aVo) throws Exception {
		SqlSession session = null;
		int chk = 0;
		try {
			session = sqlSessionFactory.openSession();
			chk = session.selectOne("AccountMapper.login",aVo);
			//커밋알아서 해줘서 필요없음 session.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session !=null) {
				session.close(); //디비와의 연결 끊는게아니라 커넥션 풀에 다시 돌려준다
			}
		}
		
		return chk;
	}

	@Override
	public int signup(AccountVO aVo) throws Exception {
		SqlSession session = null;
		int chk = 0;
		try {
			session = sqlSessionFactory.openSession();
			chk = session.insert("AccountMapper.signup",aVo);
			//커밋알아서 해줘서 필요없음 session.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session !=null) {
				session.close(); //디비와의 연결 끊는게아니라 커넥션 풀에 다시 돌려준다
			}
		}
		
		return chk;
	}

	@Override
	public int dup_id(String user_id) throws Exception {
		// TODO Auto-generated method stub
		SqlSession session = null;
		int chk = 0;
		try {
			session = sqlSessionFactory.openSession();
			chk = session.selectOne("AccountMapper.dup_id",user_id);
			//커밋알아서 해줘서 필요없음 session.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session !=null) {
				session.close(); //디비와의 연결 끊는게아니라 커넥션 풀에 다시 돌려준다
			}
		}
		
		return chk;
	}

}
