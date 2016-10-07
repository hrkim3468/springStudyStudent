package kr.or.javacafe.study;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import kr.or.javacafe.study.dao.UserDao;
import kr.or.javacafe.study.domain.User;

import org.junit.Test;


public class UserGetTest {

	@Test
	public void test() throws ClassNotFoundException, SQLException {
		
		UserDao dao = new UserDao();
		
		// 조회
		User user = dao.get("1");
		System.out.println(user.getName());
		
		assertEquals("홍길동", user.getName());
	}

	
}
