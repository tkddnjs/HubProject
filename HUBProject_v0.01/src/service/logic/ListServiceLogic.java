package service.logic;

import domain.Bucketlist;
import domain.User;
import service.pacade.ListService;
import store.logic.BucketlistStoreLogic;
import store.logic.UserStoreLogic;
import store.pacade.BucketlistStore;
import store.pacade.UserStore;

public class ListServiceLogic implements ListService {

	private UserStore uStore;
	private BucketlistStore bStore;
	
	public ListServiceLogic() {
		uStore = new UserStoreLogic();
		bStore = new BucketlistStoreLogic();
	}
	
	@Override
	public User findUsersByConnChain(String connChain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bucketlist findBucketlistsByConnChain(String connChain) {
		// TODO Auto-generated method stub
		return null;
	}

}
