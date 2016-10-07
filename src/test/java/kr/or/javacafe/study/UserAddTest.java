package kr.or.javacafe.study;

import java.sql.SQLException;

import kr.or.javacafe.study.dao.UserDao;
import kr.or.javacafe.study.domain.User;

import org.junit.Test;


public class UserAddTest {

	@Test
	public void test() throws ClassNotFoundException, SQLException {
		
		UserDao dao = new UserDao();

		// 저장
		User user = new User();
		user.setId("1");
		user.setName("홍길동");
		user.setPassword("1234");
		
		dao.add(user);
	}

	
}
