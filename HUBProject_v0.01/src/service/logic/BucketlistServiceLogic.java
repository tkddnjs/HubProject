package service.logic;

import java.util.List;

import domain.Bucketlist;
import service.pacade.BucketlistService;
import store.logic.BucketlistStoreLogic;
import store.pacade.BucketlistStore;

public class BucketlistServiceLogic implements BucketlistService {

	private BucketlistStore store;
	
	public BucketlistServiceLogic() {
		store = new BucketlistStoreLogic();
	}
	
	@Override
	public int registerBucketlist(Bucketlist bucketlist) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyBucketlist(Bucketlist bucketlist) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeBucketlist(int bucketlistId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Bucketlist findBucketlistByBucketlistId(int bucketlistId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bucketlist> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
