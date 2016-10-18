package service.pacade;

import domain.User;

public interface UserService {

	int registerUser(User user);
	int modifyUser(User user);
	int removeUser(String userId);
	User findUserByUserId(String userId);
	boolean login(User user);
	boolean checkAdmin(String userId);
	boolean checkId(String userId);
}
