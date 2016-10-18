package service.logic;

import java.util.List;

import domain.Group;
import service.pacade.GroupService;
import store.logic.GroupStoreLogic;
import store.pacade.GroupStore;

public class GroupServiceLogic implements GroupService {

	private GroupStore store;
	
	public GroupServiceLogic() {
		store = new GroupStoreLogic();
	}
	
	@Override
	public int registerGroup(Group group) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyGroup(Group group) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeGroup(int groupId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int joinGroup(int groupId, String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int exitGroup(int groupId, String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Group> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Group> findGroupByGroupId(int groupId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Group> findGroupByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Group> findGroupByConnChain(List<String> connChain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Group> findGroupByGroupName(String groupName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Group> findGroupByLocal(String local) {
		// TODO Auto-generated method stub
		return null;
	}

}
