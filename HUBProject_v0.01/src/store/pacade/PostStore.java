package store.pacade;

import java.util.List;

import domain.Post;

public interface PostStore {
	
	int insertPost(Post post);
	int deletePost(int postId);
	List<Post> selectAll();
	List<Post> selectPost(String userId, String friendId);
	List<Post> selectSendPost(String userId);
	List<Post> selectReceivePost(String userId);
}
