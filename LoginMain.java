package min.map.member.login.view;

import java.util.Scanner;

import min.map.member.command.MemberCommand;
import min.map.member.login.service.LoginService;

public class LoginMain {
	public static void main(String[] args) {

		boolean isStop = false;
		Scanner scanner = new Scanner(System.in);
		LoginService loginService = new LoginService();
		do {
			System.out.println();
			System.out.println("로그인 화면입니다.");
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.print("아이디 : ");
			String id = scanner.next();

			System.out.print("비밀번호 : ");
			String passwd = scanner.next();
			// 메소드를 호출하여 로그인을 확인한다.
			MemberCommand memberCommand = loginService.login(id, passwd);
			if (memberCommand == null) {
				System.out.println("아이디나 비밀번호가 일치하지 않습니다.");
			} else {
				System.out.println("로그인 사용자 정보");
				System.out.println(memberCommand);
				isStop = true;
			}

		} while (isStop);
		scanner.close();
	}

}