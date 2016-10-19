package store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import domain.Friend;
import store.factory.SqlSessionFactoryProvider;
import store.pacade.FriendStore;

public class FriendStoreLogic implements FriendStore {

	private SqlSessionFactory factory;
	
	public FriendStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}
	
	@Override
	public int insertFriend(Friend friend) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteFriend(String friendId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Friend> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Friend> selectFriendsByConnChains(List<String> connChains) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Friend> selectFriendsByRelation(String relation) {
		// TODO Auto-generated method stub
		return null;
	}

}
