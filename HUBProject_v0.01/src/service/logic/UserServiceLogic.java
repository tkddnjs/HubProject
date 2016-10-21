package service.logic;

import java.util.ArrayList;
import java.util.List;

import domain.User;
import jdk.nashorn.internal.ir.RuntimeNode.Request;
import service.pacade.UserService;
import store.logic.UserStoreLogic;
import store.pacade.UserStore;

public class UserServiceLogic implements UserService {

	private UserStore store;
	
	public UserServiceLogic() {
		store = new UserStoreLogic();
	}
	
	@Override
	public int registerUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeUser(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User findUserByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(User user) {
		boolean temp = false;		
		
		String userId = new String();
		userId=user.getUserId();
		
		User u = store.selectUser(userId);
		
		if(u.getUserId().equals(user.getUserId())){
			temp = true;
			return temp;
		}
		
		
		return temp;
	}

	@Override
	public boolean checkAdmin(String userId) {
		boolean temp = false;
		
		User user = store.selectUser(userId);
				
		
		if(user.isAdmin()){
			temp = true;
			return temp;
		}
		
		return temp;
	}

	@Override
	public boolean checkId(String userId) {
		
		
		
		
		
		
		return false;
	}

}
