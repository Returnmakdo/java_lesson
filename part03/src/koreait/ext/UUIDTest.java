package koreait.ext;

import java.util.UUID;

public class UUIDTest {

	public static void main(String[] args) {
		String uuid;
		// 16���� 32�ڸ� + ������ ��ȣ4���� ��������� �������ڿ�
		for (int i = 0; i < 10; i++) {
			uuid = UUID.randomUUID().toString();
			System.out.println(uuid.replace("-", ""));
		}
		
		for (int i = 0; i < 10; i++) {
			uuid = UUID.randomUUID().toString();
			System.out.println(uuid.replace("-", "").substring(0, 12));
		}
		
		/* git ��ū�� : ��ū����
		 * ������Ʈ���� ȸ�����Խ� ��й�ȣ ����. (�н���������)��й�ȣ�� �������� ��� ������ �ɱ��?
		 *     -> �ؽ� (��ȣȭ�� �ȵǴ� �Լ�) �Լ����̿��ؼ� ���ڿ����� ���� �ĺ����� ������ �����Ѵ�.
		 *     -> ��й�ȣ 1234���ġ�� �װͿ����� �ؽ��Լ� ���� �����Ѵ�. �α��ν� 1234�� �Է��ϸ� �׿����� �ؽ��Լ��� ����� �ؽ��Լ��� ���ؼ� Ȯ���Ѵ�.
		 *     -> ��ǥ���� �ؽ��Լ� sha256(�˰��� ��) (�ڹٿ��� �������� MessageDigest Ŭ���� ���)
		 * ��ȣȭ : ��    <->  ��ȣ�� (����Ű�� ����Ű�� �̿�) 
		 */
		
	}

}
