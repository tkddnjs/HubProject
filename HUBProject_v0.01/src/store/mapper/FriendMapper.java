package store.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import domain.Friend;

public interface FriendMapper {
	
	int insertFriend(Friend friend);
	int deleteFriend(Friend friend);
	
	// 추가
	int updateFriendConfirm(Friend friend);
	List<Friend> selectRequestedFriends(String userId);
	//
	
	List<Friend> selectAll(String userId);
	List<Friend> selectFriendsByConnChain(@Param("userId")String userId, @Param("connChain")String connChain);
	List<Friend> selectFriendsByRelation(Friend friend);
}
