package service.logic;

import java.util.List;

import domain.Post;
import service.pacade.PostService;
import store.logic.PostStoreLogic;
import store.pacade.PostStore;

public class PostServiceLogic implements PostService {

	private PostStore store;
	
	public PostServiceLogic(){
		store = new PostStoreLogic();
	}
	
	@Override
	public int sendPost(Post post) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removePost(int postId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Post> findAll(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> findPosts(String userId, String toUserId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> findPostsByTransmit(String userId, String transmit) {
		// TODO Auto-generated method stub
		return null;
	}

}
