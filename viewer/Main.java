package viewer;

import java.util.Scanner;
import membership.MembershipDTO;
import membership.MembershipController;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MembershipController membershipController = new MembershipController(); 
		MembershipDTO mem = new MembershipDTO();	
		while(true) {
			System.out.println("1.회원가입 2.로그인 3.비밀번호 수정"
					+ " 4.회원탈퇴 5.아이디 중복체크 6.마이페이지 7.회원목록"
					+ " 8.아이디검색 9.이름검색 10.전체 회원수");
			switch (scanner.next()) {
			case "1":
				System.out.println("아이디, 비번 ,이름");
				mem.setUserid(scanner.next());
				mem.setPassword(scanner.next());
				mem.setName(scanner.next());
				membershipController.postJoinMembership(mem);
				break;
			case "2":
				System.out.println("아이디, 비번");
				mem.setUserid(scanner.next());
				mem.setPassword(scanner.next());
				membershipController.postLogin(mem);				
				break;			
			case "3":
				System.out.println("아이디, 변경할 비번 ");
				mem.setUserid(scanner.next());
				mem.setPassword(scanner.next());
				membershipController.putModifyPassword(mem);
				break;
				
			case "4":
				System.out.println("아이디, 변경할 비번 ");
				mem.setUserid(scanner.next());
				mem.setPassword(scanner.next());
				membershipController.deleteMembershipWithdrawal(mem);				
				break;
				
			case "5":
				System.out.println("아이디");
				boolean exist = membershipController.getIdCheck(scanner.next());				
				break;
							
			case "6":
				System.out.println("아이디,비번 ");
				mem.setUserid(scanner.next());
				mem.setPassword(scanner.next());
				MembershipDTO mypage = membershipController.getMyPage(mem);
				break;
				
			case "7":
				MembershipDTO[] list = membershipController.getListMembers();				
				break;
				
			case "8":
				System.out.println("아이디");
				MembershipDTO idSearch = membershipController.getIdSearch(scanner.next());
				break;
				
			case "9":
				System.out.println("이름");
				MembershipDTO[] nameSearch = membershipController.getNameSearch(scanner.next());				
				break;
				
			case "10":
				int count = membershipController.getTotalMembers();				
				break;
						
				
			case "0":
				System.out.println("시스템 종료");
				return;

			}
			
		}
		
		
		
		
	}
}
