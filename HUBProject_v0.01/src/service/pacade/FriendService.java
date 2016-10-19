package service.pacade;

import java.util.List;

import domain.Friend;

public interface FriendService {

	int registerFriend(Friend friend);
	int removeFriend(String friendId);
	List<Friend> findAll();
	List<Friend> findFriendsByConnChains(List<String> connChains);
	List<Friend> findFriendsByRelation(String relation);
}
