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
		
		Friend temp = new Friend();
		temp.setFriendId(friend.getUserId());
		temp.setUserId(friend.getFriendId());
		if(friend.getRelation() != 3){
			temp.setRelation(3-friend.getRelation());
		} else {
			temp.setRelation(friend.getRelation());
		}
		
		try {
			FriendMapper mapper = session.getMapper(FriendMapper.class);
			result = mapper.insertFriend(friend);
			result *= mapper.insertFriend(temp);
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
	public int updateFriendConfirm(Friend friend) {
		SqlSession session = factory.openSession();
		int result = 0;
		try {
			FriendMapper mapper = session.getMapper(FriendMapper.class);
			result = mapper.updateFriendConfirm(friend);
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
	public List<Friend> selectAll(String userId) {
		SqlSession session = factory.openSession();

		try {
			FriendMapper mapper = session.getMapper(FriendMapper.class);
			return mapper.selectAll(userId);
		} finally {
			session.close();
		}
	}

	@Override
	public List<Friend> selectFriendsByConnChain(String userId, String connChain) {
		SqlSession session = factory.openSession();

		try {
			FriendMapper mapper = session.getMapper(FriendMapper.class);
			return mapper.selectFriendsByConnChain(userId, connChain);
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
