package service.logic;

import java.util.List;

import domain.Bucketlist;
import domain.Cooper;
import domain.User;
import service.pacade.ListService;
import store.logic.BucketlistStoreLogic;
import store.logic.CooperStoreLogic;
import store.logic.UserStoreLogic;
import store.pacade.BucketlistStore;
import store.pacade.CooperStore;
import store.pacade.UserStore;

public class ListServiceLogic implements ListService {

	private UserStore uStore;
	private BucketlistStore bStore;
	private CooperStore cStore;
	
	public ListServiceLogic() {
		uStore = new UserStoreLogic();
		bStore = new BucketlistStoreLogic();
		cStore = new CooperStoreLogic();
	}
	
	@Override
	public List<User> findUsersByConnChains(List<String> connChains) {
		return uStore.selectUsersByConnChains(connChains);
	}

	@Override
	public List<Bucketlist> findBucketlistsByConnChains(List<String> connChains) {
		return bStore.selectBucketlistsByConnChains(connChains);
	}

	@Override
	public List<Cooper> findCoopersByConnChains(List<String> connChains) {
		return cStore.selectCoopersByConnChains(connChains);
	}

}
