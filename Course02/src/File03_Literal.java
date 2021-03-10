
public class File03_Literal {

	public static void main(String[] args) {
		/*
		 *  ���ͷ� (Literal)
		 *  	�� ���α׷����� ����/ó���� ���� ���� �ƴ� �ڵ� �� ���� ǥ���� ��
		 *  
		 *  ���ͷ��� ���� (Literal Type)
		 *  	���� ���ͷ�
		 *  	�Ǽ� ���ͷ�
		 *  	���� ���ͷ�
		 *  	�� ���ͷ�
		 *  	���ڿ� ���ͷ�
		 *  	null ���ͷ�
		 */
		
		// ���� ���ͷ�
		//	 �� ���� ���ͷ��� int������ ������ �Ǿ�����.
		//	 �� ���ͷ��� int�� ������ ��� ���̸�, long Ÿ���� ���ͷ��� �ۼ��ؾ� �Ѵ�.
		//	( ���ͷ� �ڿ� L(�빮��) �Ǵ� l(�ҹ���) �� �ۼ��Ѵ�.
		//	Example) int integer = 2200000000;
		long integer = 2200000000L;
		
		// ���� ���ͷ��� ����
		
		//	�� 16���� ���ͷ� : 0~9, a~f ���� 16���� ���ڷ� �̷���� ��
		//		: �ϳ��� ���ڷ� 4bit�� ��� ǥ���� �� �ִ�.
		int hexNumber = 0x0FFFFFFF;
		System.out.println("hexNumber: " + hexNumber);
		
		//	�� 10���� ���ͷ� : 0~9 ���� 10���� ���ڷ� �̷���� ��
		int decNumber = 011111111111;
		System.out.println("decNumber: " + decNumber);
		
		//	�� 8���� ���ͷ� : 0~7 ���� 8���� ���ڷ� �̷���� ��
		//		: �ϳ��� ���ڷ� 3bit�� ��� ǥ���� �� �ִ�.
		int octalNumber = 0777;
		System.out.println("octalNumber: " + octalNumber);
		
		//	�� 2���� ���ͷ� :  0,1 �� �̷���� ��
		int binaryNumber = 0b1111;
		System.out.println("binaryNumber: " + binaryNumber);
	}

}
