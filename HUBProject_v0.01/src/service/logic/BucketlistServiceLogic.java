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
		return store.insertBucketlist(bucketlist);
	}

	@Override
	public int modifyBucketlist(Bucketlist bucketlist) {
		return store.updateBucketlist(bucketlist);
	}

	@Override
	public int removeBucketlist(int bucketlistId) {
		return store.deleteBucketlist(bucketlistId);
	}

	@Override
	public Bucketlist findBucketlistByBucketlistId(int bucketlistId) {
		return store.selectBucketlistByBucketlistId(bucketlistId);
	}

	@Override
	public List<Bucketlist> findAll() {
		return store.selectAll();
	}

}
