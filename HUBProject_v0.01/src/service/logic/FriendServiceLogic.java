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
	public int removeFriend(String friendId) {
		return store.deleteFriend(friendId);
	}

	@Override
	public List<Friend> findAll() {
		return store.selectAll();
	}

	@Override
	public List<Friend> findFriendsByConnChains(List<String> connChains) {
		return store.selectFriendsByConnChains(connChains);
	}

	@Override
	public List<Friend> findFriendsByRelation(String relation) {
		return store.selectFriendsByRelation(relation);
	}

}
