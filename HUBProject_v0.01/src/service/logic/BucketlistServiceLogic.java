package service.logic;

import java.util.List;

import domain.Bucketlist;
import service.pacade.BucketlistService;
import store.logic.BucketlistStoreLogic;
import store.logic.ConnChainStoreLogic;
import store.pacade.BucketlistStore;
import store.pacade.ConnChainStore;

public class BucketlistServiceLogic implements BucketlistService {

	private BucketlistStore store;
	private ConnChainStore ccStore;
	
	public BucketlistServiceLogic() {
		store = new BucketlistStoreLogic();
		ccStore = new ConnChainStoreLogic();
	}
	
	@Override
	public int registerBucketlist(Bucketlist bucketlist) {
		int result = 1;
		
		bucketlist.setBucketlistId(store.nextBucketlistId());
		for(String connChain : bucketlist.getConnChains()){
			result *= ccStore.insertConnChain(connChain);
		}
		result *= store.insertBucketlist(bucketlist);
		result *= store.insertBucketlistConn(bucketlist);
		
		return result;
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
	public List<Bucketlist> findAll(String userId) {
		return store.selectAll(userId);
	}

}
