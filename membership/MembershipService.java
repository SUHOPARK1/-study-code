package membership;

public interface MembershipService  {
	
	public void joinMembership(MembershipDTO membership);
	public MembershipDTO login(MembershipDTO membership);
	public void modifyPassword(MembershipDTO membership);
	public void membershipWithdrawal(MembershipDTO membership);
	public boolean idCheck(String id);
	public MembershipDTO myPage(MembershipDTO membership);
	public MembershipDTO[] listMembers();
	public MembershipDTO idSearch(String id);
	public MembershipDTO[] nameSearch(String name);
	public int totalMembers();
	
}
