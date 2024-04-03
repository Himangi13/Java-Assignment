package sampleprograms;

import java.util.ArrayList;
import java.util.List;

public class FriendFinderQ3 {

	public static void main(String[] args) {
		List<FriendshipCriteria<String, String>> friends = new ArrayList<>();
		friends.add(new FriendshipCriteria<>("Emma", "LA"));
		friends.add(new FriendshipCriteria<>("Cole", "Toronto"));
		friends.add(new FriendshipCriteria<>("Jackie", "Sydney"));

		String targetLocation = "Toronto"; // Example: Find friends in this location

		for (FriendshipCriteria<String, String> friend : friends) {
			if (friend.getAttribute().equalsIgnoreCase(targetLocation)) {
				System.out.println(friend.getName() + " is a friend.");
			}
		}
	}

}
