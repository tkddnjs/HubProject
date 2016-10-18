package store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import domain.Cooper;
import store.factory.SqlSessionFactoryProvider;
import store.pacade.CooperStore;

public class CooperStoreLogic implements CooperStore {

	private SqlSessionFactory factory;
	
	public CooperStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}
	
	@Override
	public int insertCooper(Cooper cooper) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCooper(Cooper cooper) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCooper(int coId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Cooper> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cooper selectCooperByCoId(int coId) {
		// TODO Auto-generated method stub
		return null;
	}

}
