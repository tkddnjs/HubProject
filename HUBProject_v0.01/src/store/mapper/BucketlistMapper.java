package store.mapper;

import java.util.List;

import domain.Bucketlist;

public interface BucketlistMapper {
	
	int insertBucketlist(Bucketlist bucketlist);
	int updateBucketlist(Bucketlist bucketlist);
	int deleteBucketlist(int bucketlistId);
	List<Bucketlist> selectAll();
	Bucketlist selectBucketlistByBucketlistId(int bucketlistId);
	List<Bucketlist> selectBucketlistByConnChain(List<String> connChains);
}
