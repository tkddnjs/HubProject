package service.pacade;

import domain.Bucketlist;
import domain.User;

public interface ListService {

	User findUsersByConnChain(String connChain);
	Bucketlist findBucketlistsByConnChain(String connChain);
}
