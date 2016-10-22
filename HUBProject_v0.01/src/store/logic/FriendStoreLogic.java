package store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import domain.Friend;
import store.factory.SqlSessionFactoryProvider;
import store.mapper.FriendMapper;
import store.pacade.FriendStore;

public class FriendStoreLogic implements FriendStore {

	private SqlSessionFactory factory;

	public FriendStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}

	@Override
	public int insertFriend(Friend friend) {
		SqlSession session = factory.openSession();
		int result = 0;
		try {
			FriendMapper mapper = session.getMapper(FriendMapper.class);
			result = mapper.insertFriend(friend);
			if (result > 0) {
				session.commit();
			} else {
				session.rollback();
			}
		} finally {
			session.close();
		}
		return result;
	}

	@Override
	public int deleteFriend(Friend friend) {
		SqlSession session = factory.openSession();
		int result = 0;
		try {
			FriendMapper mapper = session.getMapper(FriendMapper.class);
			result = mapper.deleteFriend(friend);
			if (result > 0) {
				session.commit();
			} else {
				session.rollback();
			}
		} finally {
			session.close();
		}
		return result;
	}

	@Override
	public List<Friend> selectAll(Friend friend) {
		SqlSession session = factory.openSession();

		try {
			FriendMapper mapper = session.getMapper(FriendMapper.class);
			return mapper.selectAll(friend);
		} finally {
			session.close();
		}
	}

	@Override
	public List<Friend> selectFriendsByConnChains(Friend friend, List<String> connChains) {
		SqlSession session = factory.openSession();

		try {
			FriendMapper mapper = session.getMapper(FriendMapper.class);
			return mapper.selectFriendsByConnChains(friend, connChains);
		} finally {
			session.close();
		}
	}

	@Override
	public List<Friend> selectFriendsByRelation(Friend friend) {
		SqlSession session = factory.openSession();

		try {
			FriendMapper mapper = session.getMapper(FriendMapper.class);
			return mapper.selectFriendsByRelation(friend);
		} finally {
			session.close();
		}
	}

}
