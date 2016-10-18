package store.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import domain.Post;

public interface PostMapper {
	
	int insertPost(Post post);
	int deletePost(int postId);
	List<Post> selectAll(String userId);
	List<Post> selectPostByFriendId(@Param("userId")String userId, @Param("friendId")String friendId);
	List<Post> selectSendPost(String userId);
	List<Post> selectReceivePost(String userId);
}
