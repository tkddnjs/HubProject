package store.logic;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import domain.User;
import store.pacade.UserStore;

public class UserStoreLogicTest {

	private UserStore store;
	
	
	@Before
	public void init(){
		store = new UserStoreLogic(); 
	}
	/*
	@Test
	public void testInsertUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteUser() {
		fail("Not yet implemented");
	}*/

//	@Test
//	public void testSelectUser() {
//		User user = store.selectUser("bookstore");
//		
//		
//		assertNotNull(user);
//		assertEquals("bookstore", user.getUserId());
//		//assertEquals("111", store.selectUser(user.getPw()));
//	}

	@Test
	public void testSelectUsersByConnChains() {
		List<String> connChains = new ArrayList<>();
		connChains.add("asdf");
		
		List<User> users = store.selectUsersByConnChains(connChains);
		
		assertEquals(2, users.size());
		assertEquals("김유저", users.get(0).getUserId());
		assertEquals("박유저", users.get(1).getUserId());
	}

}
