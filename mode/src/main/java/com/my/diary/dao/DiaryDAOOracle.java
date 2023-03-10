package com.my.diary.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.account.vo.AccountVO;
import com.my.diary.vo.DiaryVO;

@Repository
public class DiaryDAOOracle implements DiaryDAO {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	@Override
	public List<DiaryVO> diarylist(String user_id) throws Exception {
		// TODO Auto-generated method stub
		SqlSession session = null;
		List<DiaryVO> dlist = null;
		try {
			session = sqlSessionFactory.openSession();
			dlist = session.selectList("DiaryMapper.diaryList",user_id);
			//커밋알아서 해줘서 필요없음 session.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session !=null) {
				session.close(); //디비와의 연결 끊는게아니라 커넥션 풀에 다시 돌려준다
			}
		}
		
		return dlist;
	}


	@Override
	public DiaryVO diaryDetail(String diary_num) throws Exception {
		// TODO Auto-generated method stub
		SqlSession session = null;
		DiaryVO dVo = new DiaryVO();
		try {
			session = sqlSessionFactory.openSession();
			dVo =  (DiaryVO) session.selectList("DiaryMapper.diaryDetail",diary_num);
			//커밋알아서 해줘서 필요없음 session.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session !=null) {
				session.close(); //디비와의 연결 끊는게아니라 커넥션 풀에 다시 돌려준다
			}
		}
		return dVo;
		
	}


	@Override
	public int insertDiary(DiaryVO dVo) throws Exception {
		// TODO Auto-generated method stub
		SqlSession session = null;
		int chk = 0;
		try {
			session = sqlSessionFactory.openSession();
			chk = session.insert("DiaryMapper.insertDiary",dVo);
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
	public int deletetDiary(String diary_num) throws Exception {
		// TODO Auto-generated method stub
		SqlSession session = null;
		int chk = 0;
		try {
			session = sqlSessionFactory.openSession();
			chk = session.delete("DiaryMapper.deletetDiary",diary_num);
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
