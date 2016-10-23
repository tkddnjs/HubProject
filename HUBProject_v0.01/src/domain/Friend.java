package domain;

public class Friend {
	private String userId;
	private String friendId;
//	private String relation;
	private int relation;
	private boolean confirm;

	public Friend() {
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFriendId() {
		return friendId;
	}

	public void setFriendId(String friendId) {
		this.friendId = friendId;
	}

//	public String getRelation() {
//		return relation;
//	}
//
//	public void setRelation(String relation) {
//		this.relation = relation;
//	}
	
	public int getRelation(){
		return relation;
	}
	
	public void setRelation(int relation) {
		this.relation = relation;
	}
	
	public boolean getConfirm(){
		return confirm;
	}

	public void setConfirm(boolean confirm){
		this.confirm = confirm;
	}
}
