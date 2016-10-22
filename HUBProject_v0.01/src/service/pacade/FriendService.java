package service.pacade;

import java.util.List;

import domain.Friend;

public interface FriendService {

	int registerFriend(Friend friend);
	int removeFriend(Friend friend);
	List<Friend> findAll(Friend friend);
	List<Friend> findFriendsByConnChains(Friend friend, List<String> connChains);
	List<Friend> findFriendsByRelation(Friend friend);
}
