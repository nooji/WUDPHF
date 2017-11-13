package cs356.assignment2;

import java.util.ArrayList;
import java.util.List;

public class SingleUser implements User {
	private static int userCounter = 0;
	private String id = null;
	// list of users followed by this.user
	private List<User> follows;
	// list of users who follows this.user
	private List<User> followers;
	private List<String> newsFeed;

	private ProfileViewPanel userPanel;

	public SingleUser(String id) {
		this.id = id;
		follows = new ArrayList<User>();
		followers = new ArrayList<User>();
		newsFeed = new ArrayList<String>();
		++userCounter;
	}

	public String toString() {
		return this.id;
	}

	/***************************************************************
	 * Add string to newsfeed
	 **************************************************************/
	public void addToNewsFeed(String message) {
		this.newsFeed.add(message);
	}

	/**************************************************************
	 * follow inputed user
	 *************************************************************/
	public void addFollows(User user) {
		this.follows.add(user);
	}

	/**************************************************************
	 * add user to list of users following this.user
	 *************************************************************/
	public void addFollowed(User u) {
		// TODO Auto-generated method stub
		this.followers.add(u);
	}

	/**************************************************************
	 * getter for newsFeed
	 *************************************************************/
	public List<String> getNewsFeed() {
		return newsFeed;
	}

	/**************************************************************
	 * getter for who this.user are following
	 *************************************************************/
	public List<User> getFollowing() {
		return follows;
	}

	/**************************************************************
	 * getter for who follows this.user
	 *************************************************************/
	public List<User> getFollower() {
		return followers;
	}

	/**************************************************************
	 * getter for all users
	 *************************************************************/
	public static String getTotalUsers() {
		String result = Integer.toString(userCounter);
		return result;
	}

	/**************************************************************
	 * getter for user panel
	 *************************************************************/
	public ProfileViewPanel getUserPanel() {
		return this.userPanel;
	}

	/**************************************************************
	 * getter for user ID
	 *************************************************************/
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	/**************************************************************
	 * set user panel
	 *************************************************************/
	public void setUserPanel(ProfileViewPanel userPanel) {
		this.userPanel = userPanel;
	}

}
