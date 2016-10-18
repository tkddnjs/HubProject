package service.pacade;

import java.util.List;

import domain.Friend;

public interface FriendService {

	int registerFriend(Friend friend);
	int removeFriend(String friendId);
	List<Friend> findAll();
	List<Friend> findFriendsByConnChain(String connChain);
	List<Friend> findFriendsByRelation(String relation);
}
