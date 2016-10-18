package store.mapper;

import java.util.List;

import domain.User;

public interface UserMapper {

	int insertUser(User user);
	int updateUser(User user);
	int deleteUser(String userId);
	User selectUserByUserId(String userId);
	List<User> selectUserByConnChain(List<String> connChains);
}
