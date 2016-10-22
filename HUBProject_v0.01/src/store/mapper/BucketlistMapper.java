package store.mapper;

import java.util.List;

import domain.Bucketlist;

public interface BucketlistMapper {
	
	int nextBucketlistId();
	int insertBucketlistConn(Bucketlist bucketlist, String connChain);
	
	int insertBucketlist(Bucketlist bucketlist);
	int updateBucketlist(Bucketlist bucketlist);
	int deleteBucketlist(int bucketlistId);
	List<Bucketlist> selectAll(String userId);
	Bucketlist selectBucketlistByBucketlistId(int bucketlistId);
	List<Bucketlist> selectBucketlistsByConnChains(List<String> connChains);
	
	
	List<String> selectConnChainsByBucketlistId(int bucketlistId);
}
