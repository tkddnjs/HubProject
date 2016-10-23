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
		return store.insertFriend(friend);
	}

	@Override
	public int removeFriend(Friend friend) {
		return store.deleteFriend(friend);
	}

	@Override
	public int confirmFriend(Friend friend) {
		return store.updateFriendConfirm(friend);
	}
	
	@Override
	public List<Friend> findAll(String userId) {
		return store.selectAll(userId);
	}

	@Override
	public List<Friend> findFriendsByConnChain(String userId, String connChain) {
		return store.selectFriendsByConnChain(userId, connChain);
	}

	@Override
	public List<Friend> findFriendsByRelation(Friend friend) {
		return store.selectFriendsByRelation(friend);
	}


}
