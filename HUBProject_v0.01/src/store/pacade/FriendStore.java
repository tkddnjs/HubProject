package store.pacade;

import java.util.List;

import domain.Friend;

public interface FriendStore {

	int insertFriend(Friend friend);
	int deleteFriend(String friendId);
	List<Friend> selectAll();
	List<Friend> selectFriendsByConnChains(List<String> connChains);
	List<Friend> selectFriendsByRelation(String relation);
}
