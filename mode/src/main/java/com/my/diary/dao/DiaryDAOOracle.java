package com.my.diary.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DiaryDAOOracle implements DiaryDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

}

