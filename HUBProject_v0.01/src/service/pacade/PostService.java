package service.pacade;

import java.util.List;

import domain.Post;

public interface PostService {

	int sendPost(Post post);
	int removePost(int postId);
	List<Post> findAll(String userId);
	Post findPost(String userId, String toUserId);
	Post findPostByTransmit(String userId, String transmit);
}
