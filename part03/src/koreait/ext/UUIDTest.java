package koreait.ext;

import java.util.UUID;

public class UUIDTest {

	public static void main(String[] args) {
		String uuid;
		// 16진수 32자리 + 하이픈 기호4개로 만들어지는 랜덤문자열
		for (int i = 0; i < 10; i++) {
			uuid = UUID.randomUUID().toString();
			System.out.println(uuid.replace("-", ""));
		}
		
		for (int i = 0; i < 10; i++) {
			uuid = UUID.randomUUID().toString();
			System.out.println(uuid.replace("-", "").substring(0, 12));
		}
		
		/* git 토큰값 : 토큰인증
		 * 웹사이트에서 회원가입시 비밀번호 설정. (패스워드인증)비밀번호는 서버에서 어떻게 관리가 될까요?
		 *     -> 해싱 (복호화가 안되는 함수) 함수를이용해서 문자열에서 대한 식별값을 만들어내고 저장한다.
		 *     -> 비밀번호 1234라고치면 그것에대한 해싱함수 값을 저장한다. 로그인시 1234를 입력하면 그에대한 해싱함수와 저장된 해싱함수랑 비교해서 확인한다.
		 *     -> 대표적인 해시함수 sha256(알고리즘 명) (자바에서 직접구현 MessageDigest 클래스 사용)
		 * 암호화 : 평문    <->  암호문 (공개키와 개인키를 이용) 
		 */
		
	}

}
