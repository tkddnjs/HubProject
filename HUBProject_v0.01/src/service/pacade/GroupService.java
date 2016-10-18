package service.pacade;

import java.util.List;

import domain.Group;

public interface GroupService {
	
	int registerGroup(Group group);
	int modifyGroup(Group group);
	int removeGroup(int groupId);
	int joinGroup(int groupId, String userId);
	int exitGroup(int groupId, String userId);
	List<Group> findAll();
	List<Group> findGroupByGroupId(int groupId);
	List<Group> findGroupByUserId(String userId);
	List<Group> findGroupByConnChain(List<String> connChain);
	List<Group> findGroupByGroupName(String groupName);
	List<Group> findGroupByLocal(String local);
}
