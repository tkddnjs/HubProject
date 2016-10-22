package store.pacade;

import java.util.List;

import domain.Friend;

public interface FriendStore {
	
//	int nextFriendId();
	int insertFriend(Friend friend);
	int deleteFriend(Friend friend);
	List<Friend> selectAll(Friend friend);
	List<Friend> selectFriendsByConnChains(Friend friend, List<String> connChains);
	List<Friend> selectFriendsByRelation(Friend friend);
}
