package service.logic;

import domain.User;
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkAdmin(String userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkId(String userId) {
		// TODO Auto-generated method stub
		return false;
	}

}
