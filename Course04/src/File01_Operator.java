
public class File01_Operator {

	public static void main(String[] args) {
		// ������ (Operator)
		//	: ǥ���Ŀ� ���� �����͸� �����ϱ� ���� ���� (��ȣ)
		//	: �����ڴ� �ǿ����ڵ��� Ÿ���� �ݵ�� ��ġ��Ų��.
		//	: �׸��� �� ��� ���� ���� Ÿ������ ���´�.
		
		
		// 1. ��� ������
		//  ���ϱ� ���� ���ϱ� ������ ������
		int num1 = 10;
		int num2 = 3;
		int result = 0;
		
		// ���ϱ� ����
		result = num1 + num2;
		System.out.printf("%d + %d = %d\n", num1, num2, result);
		
		// ���� ����
		result = num1 - num2;
		System.out.printf("%d - %d = %d\n",num1, num2, result);
		
		// ���ϱ� ����
		result = num1 * num2;
		System.out.printf("%d * %d = %d\n",num1, num2, result);
		
		// ������ ����
		result = num1 / num2;
		System.out.printf("%d / %d = %d\n",num1, num2, result);
		
		// ������ ����
		result = num1 % num2;
		System.out.printf("%d % %d = %d\n", num1, num2, result);
		
		// ���ڿ� ���� ������ %�� ����Ϸ��� '%%' �� �ۼ��ؾ� �Ѵ�.
		System.out.printf("%d %% %d = %d\n", num1, num2, result);
		
		// ������ ���� �����ڵ��� Ȱ��
		// 1. ��� Ȯ���� ����
		//     n�� ��� : n���� ������ �������� �ڿ���
		//                     : n���� ������ �������� 0�� �ڿ���
		// 2. Ư�� ���� �ݺ��� �����ϴ�.
		// 3. �������� ���� ��ȯ�� �� �� �ִ�.
		
		// �����⸦ ���� �� �Ǽ� ���¸� ��� ���� ���
		// �� �ڷ��� ��ȯ
		double dbNum1 = 10.0;
		double dbNum2 = 3.0;
		double dbResult = dbNum1 / dbNum2;
		System.out.printf("%f / %f = %f\n", dbNum1, dbNum2, dbResult);
		
		dbResult = dbNum1/ dbNum2;
		// dbResult = �Ǽ� / ����;
		// �����Ϸ��� �������� �ǿ����ڵ��� Ÿ���� ��ġ��Ų��. �� �� ��ȯ
		System.out.printf("%f / %d = %f\n", dbNum1, num2, dbResult);
		
		// �� ��ȯ
		// �⺻ �ڷ��� �������� Ÿ���� �ٸ� Ÿ������ ��ȯ
		
		// * �ڵ� ����ȯ
		//  �ڵ����� �� ��ȯ�� �̷������ ����ȯ
		//
		//  - ����
		// 1. �������� Ÿ���� ���߱� ����
		// 2. �ڷ����� ũ�Ⱑ ���� Ÿ�Կ��� ū Ÿ������ �ٲ��.
		// ex)
		double db = 10;
		// �������� Ÿ���� ���߱� ���ؼ� �� ��ȯ�� �ϴµ� ũ�Ⱑ ���� int �� >> double ������ ��ȯ�Ѵ�.
		// int intN = 10.0;
		// �� double ���� int ������ �ڵ����� �� ��ȯ�� �̷��� �� ����.
		
		// * ���� ����ȯ
		// ������ �� ��ȯ�� �̷������ �� ��ȯ
		//
		// - ����
		// 1. �ڷ����� ũ�Ⱑ ū Ÿ�Կ��� ���� Ÿ������ ��ȯ�ϱ� ����
		// 2. �������� �ǿ������� Ÿ���� �̹� ������ ���¿��� �ٸ� Ÿ������ ��ȯ�ϱ� ����
		//
		// - ���
		//  �ĺ��� �տ� �Ұ�ȣ�� �Բ� ��ȯ�� Ÿ���� �ۼ��Ѵ�.
		dbResult = (double)10 / num2;
		dbResult = 10.0 / num2;
		dbResult = 10.0 / 3;
		dbResult = 10.0 / 3.0;
		dbResult = 3.33333;
		System.out.printf("%d / %d = %f\n", num1, num2, dbResult);
	}

}
