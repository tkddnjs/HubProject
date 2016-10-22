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
	public List<Friend> findAll(Friend friend) {
		return store.selectAll(friend);
	}

	@Override
	public List<Friend> findFriendsByConnChains(Friend friend, List<String> connChains) {
		return store.selectFriendsByConnChains(friend, connChains);
	}

	@Override
	public List<Friend> findFriendsByRelation(Friend friend) {
		return store.selectFriendsByRelation(friend);
	}

}
