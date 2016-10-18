package service.pacade;

import domain.Bucketlist;
import domain.User;

public interface ListService {

	User findUserByConnChain(String connChain);
	Bucketlist findBucketlistByConnChain(String connChain);
}
