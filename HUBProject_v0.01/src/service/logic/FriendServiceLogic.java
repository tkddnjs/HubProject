package service.logic;

import java.util.List;

import domain.Friend;
import service.pacade.FriendService;
import store.logic.FriendStoreLogic;
import store.pacade.FriendStore;

public class FriendServiceLogic implements FriendService {

	private FriendStore store;
	
	public FriendServiceLogic() {
		store = new FriendStoreLogic();
	}
	
	@Override
	public int registerFriend(Friend friend) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeFriend(String friendId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Friend> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Friend> findFriendsByConnChain(String connChain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Friend> findFriendsByRelation(String relation) {
		// TODO Auto-generated method stub
		return null;
	}

}
