package store.pacade;

import java.util.List;

import domain.Bucketlist;

public interface BucketlistStore {
	
	int insertBucketlist(Bucketlist bucketlist);
	int updateBucketlist(Bucketlist bucketlist);
	int deleteBucketlist(int bucketlistId);
	List<Bucketlist> selectAll();
	Bucketlist selectBucketlistByBucketlistId(int bucketlistId);
	List<Bucketlist> selectBucketlistByConnChain(List<String> connChains);
}
