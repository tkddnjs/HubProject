package store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import domain.Cooper;
import store.factory.SqlSessionFactoryProvider;
import store.mapper.CooperMapper;
import store.pacade.CooperStore;

public class CooperStoreLogic implements CooperStore {

	private SqlSessionFactory factory;
	
	public CooperStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}
	
	@Override
	public int insertCooper(Cooper cooper) {
		SqlSession session = factory.openSession();
		int result = 0;
		try {
			CooperMapper mapper = session.getMapper(CooperMapper.class);
			result = mapper.insertCooper(cooper);
			if(result > 0){
				session.commit();
			} else {
				session.rollback();
			}
		} finally {
			session.close();
		}
		return result;
	}

	@Override
	public int updateCooper(Cooper cooper) {
		SqlSession session = factory.openSession();
		int result = 0;
		try {
			CooperMapper mapper = session.getMapper(CooperMapper.class);
			result = mapper.updateCooper(cooper);
			if(result > 0){
				session.commit();
			} else {
				session.rollback();
			}
		} finally {
			session.close();
		}
		return result;
	}

	@Override
	public int deleteCooper(int coId) {
		SqlSession session = factory.openSession();
		int result = 0;
		try {
			CooperMapper mapper = session.getMapper(CooperMapper.class);
			result = mapper.deleteCooper(coId);
			if(result > 0){
				session.commit();
			} else {
				session.rollback();
			}
		} finally {
			session.close();
		}
		return result;
	}

	@Override
	public List<Cooper> selectAll() {
		SqlSession session = factory.openSession();
		try {
			CooperMapper mapper = session.getMapper(CooperMapper.class);
			return mapper.selectAll();
		} finally {
			session.close();
		}
	}

	@Override
	public Cooper selectCooperByCoId(int coId) {
		SqlSession session = factory.openSession();
		try {
			CooperMapper mapper = session.getMapper(CooperMapper.class);
			return mapper.selectCooperByCoId(coId);
		} finally {
			session.close();
		}
	}

	@Override
	public List<Cooper> selectCoopersByConnChains(List<String> connChains) {
		SqlSession session = factory.openSession();
		try {
			CooperMapper mapper = session.getMapper(CooperMapper.class);
			return mapper.selectCoopersByConnChains(connChains);
		} finally {
			session.close();
		}
	}

}
