package membership;

public class MembershipController {
	private MembershipService membershipService;

	public MembershipController() {
		membershipService = new MembershipServiceImpl();
	}

	public void postJoinMembership(MembershipDTO membership) {
		membershipService.joinMembership(membership);
	}

	public MembershipDTO postLogin(MembershipDTO membership) {
		return membershipService.login(membership);
	}

	public void putModifyPassword(MembershipDTO membership) {
		membershipService.modifyPassword(membership);
	}

	public void deleteMembershipWithdrawal(MembershipDTO membership) {
		membershipService.membershipWithdrawal(membership);
	}

	public boolean getIdCheck(String id) {
		return membershipService.idCheck(id);
	}

	public MembershipDTO getMyPage(MembershipDTO membership) {
		return membershipService.myPage(membership);
	}

	public MembershipDTO[] getListMembers() {
		return membershipService.listMembers();
	}

	public MembershipDTO getIdSearch(String id) {
		return membershipService.idSearch(id);
	}

	public MembershipDTO[] getNameSearch(String name) {
		return membershipService.nameSearch(name);
	}

	public int getTotalMembers() {
		return membershipService.totalMembers();
	}
}
