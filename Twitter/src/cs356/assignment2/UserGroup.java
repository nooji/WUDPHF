package cs356.assignment2;

import java.util.ArrayList;

public class UserGroup implements User {
	private String id = "";
	private ArrayList<User> usersInGroup;
	private ArrayList<User> groupsInGroup;
	private static int groupCounter = 0;

	/*******************************************************************************
	 * Name : UserGroup() Parameters : String Preconditions : none
	 * Postconditions : constructor Return : none
	 ******************************************************************************/
	public UserGroup(String id) {
		this.id = id;
		usersInGroup = new ArrayList<User>();
		groupsInGroup = new ArrayList<User>();
		++groupCounter;
	}

	/*******************************************************************************
	 * Name : add() Parameters : User Preconditions : none Postconditions : add
	 * user to group Return : void
	 ******************************************************************************/
	public void add(User user) {
		usersInGroup.add(user);
	}

	/*******************************************************************************
	 * Name : addGroup() Parameters : UserGroup Preconditions : none
	 * Postconditions : add group Return : void
	 ******************************************************************************/
	public void addGroup(UserGroup group) {
		groupsInGroup.add(group);
	}

	/*******************************************************************************
	 * Name : getGroupCounter() Parameters : none Preconditions : none
	 * Postconditions : get group counter Return : String
	 ******************************************************************************/
	public static String getGroupCounter() {
		String result = Integer.toString(groupCounter);
		return result;
	}

	/*******************************************************************************
	 * Name : getId() Parameters : none Preconditions : none Postconditions :
	 * get ID Return : String
	 ******************************************************************************/
	public String getId() {
		return id;
	}

	/*******************************************************************************
	 * Name : toString() Parameters : none Preconditions : none Postconditions :
	 * get group name Return : String
	 ******************************************************************************/
	public String toString() {
		return id + " Group";
	}

	@Override
	public ArrayList<User> getFollowing() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<User> getFollower() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> getNewsFeed() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFollows(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addFollowed(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addToNewsFeed(String s) {
		// TODO Auto-generated method stub

	}

	public ProfileViewPanel getUserPanel() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setUserPanel(ProfileViewPanel userViewPanel) {
		// TODO Auto-generated method stub

	}
}
