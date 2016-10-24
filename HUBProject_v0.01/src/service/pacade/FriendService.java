package service.pacade;

import java.util.List;

import domain.Friend;

public interface FriendService {

	int registerFriend(Friend friend);
	int removeFriend(Friend friend);
	
	// 추가
	int confirmFriend(Friend friend);
	List<Friend> findRequestedFriends(String userId);
	public boolean checkRequest(String userId, String friendId);
	// 
	
	List<Friend> findAll(String userId);
	List<Friend> findFriendsByConnChain(String userId, String connChain);
	List<Friend> findFriendsByRelation(Friend friend);
}
