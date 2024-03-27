package assignments;

public class VoteEligibility {
	public static void main(String[] args) {
	int age=16;
	int eligibleAge=18;
	boolean isEligible;
	if(age>=eligibleAge) {
		isEligible=true;
		System.out.println("You are eligible to vote");
		
	}
	else {
		System.out.println("You are not eligible to vote");
	}

}
}
