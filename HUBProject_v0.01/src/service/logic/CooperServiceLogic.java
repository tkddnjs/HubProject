package service.logic;

import java.util.List;

import domain.Cooper;
import service.pacade.CooperService;
import store.logic.CooperStoreLogic;
import store.pacade.CooperStore;

public class CooperServiceLogic implements CooperService {

	private CooperStore store;
	
	public CooperServiceLogic(){
		store = new CooperStoreLogic();
	}
	
	@Override
	public int registerCooper(Cooper cooper) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyCooper(Cooper cooper) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeCooper(int coId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Cooper> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cooper findCooperByCoId(int coId) {
		// TODO Auto-generated method stub
		return null;
	}

}
