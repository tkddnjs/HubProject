package store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import domain.Post;
import store.factory.SqlSessionFactoryProvider;
import store.pacade.PostStore;

public class PostStoreLogic implements PostStore {

	private SqlSessionFactory factory;
	
	public PostStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}
	
	@Override
	public int insertPost(Post post) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletePost(int postId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Post> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> selectPosts(String userId, String friendId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> selectSendPosts(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> selectReceivePosts(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
