package store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import domain.User;
import store.factory.SqlSessionFactoryProvider;
import store.pacade.UserStore;

public class UserStoreLogic implements UserStore {
	
	private SqlSessionFactory factory;
	
	public UserStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}
	
	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User selectUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectUserByConnChain(List<String> connChains) {
		// TODO Auto-generated method stub
		return null;
	}

}
