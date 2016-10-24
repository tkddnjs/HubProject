package store.pacade;

import java.util.List;

import domain.Friend;

public interface FriendStore {
	
	int insertFriend(Friend friend);
	int deleteFriend(Friend friend);
	
	//추가
	int updateFriendConfirm(Friend friend);
	List<Friend> selectRequestedFriends(String userId);
	//
	
	List<Friend> selectAll(String userId);
	List<Friend> selectFriendsByConnChain(String userId, String connChain);
	List<Friend> selectFriendsByRelation(Friend friend);
}
