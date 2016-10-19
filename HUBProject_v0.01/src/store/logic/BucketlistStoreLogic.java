package store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import domain.Bucketlist;
import store.factory.SqlSessionFactoryProvider;
import store.pacade.BucketlistStore;

public class BucketlistStoreLogic implements BucketlistStore {

	private SqlSessionFactory factory;
	
	public BucketlistStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}
	
	@Override
	public int insertBucketlist(Bucketlist bucketlist) {
		SqlSession session = factory.openSession();

		return 0;
	}

	@Override
	public int updateBucketlist(Bucketlist bucketlist) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBucketlist(int bucketlistId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Bucketlist> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bucketlist selectBucketlistByBucketlistId(int bucketlistId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bucketlist> selectBucketlistsByConnChains(List<String> connChains) {
		// TODO Auto-generated method stub
		return null;
	}

}
