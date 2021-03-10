
public class File02_Output {

	public static void main(String[] args) {
		/*
		 *  ��� (Output)
		 *   ���α׷� ���ο��� �ܺη� �����Ͱ� ���޵Ǿ����� ����
		 *   ex) �����, ����Ŀ, ���� ����, �޽��� ���� �� ...
		 *   
		 *  ǥ�� ��� : System.out
		 *   
		 *  ����Ϳ� ����ϴ� ���
		 *   1. System.out.println() : �� �ٿ� ���ڿ��� ��� 
		 *   2. System.out.print()  : ���ڿ��� ���, ������ ���� �ʴ´�.
		 *   3. System.out.printf() : ���� �����ڸ� �̿��Ͽ� ���ڿ��� ���
		 *   
		 *  ���ڿ�(String)�� '���ϱ� (+)'�� ����
		 *    ���ڿ��� ��� Ÿ�԰� ���ϱⰡ ����
		 *    ���ϱ� �����ڸ� �������� ���� ��� ���� �ϳ��� ���ڿ��� ��������.
		 *    �̶� ������ ��� ���� Ÿ�� : '���ڿ� (String)' 
		 */
		
		System.out.println("2" + "2");
		System.out.println("2" + 2);
		System.out.println("2" + 2.01);
		System.out.println("2" + true);
		System.out.println(2 + "2");
		System.out.println("2 + 2 = " + (2+2));
	
		String name = "Ljy";
		int age = 22;
		System.out.println("name : " + name  + ", age : " + age);
		
		name = "Lee";
		age = 20;
		System.out.println("name : " + name + ", age : " + age);
		
		/*
		 *  ���ڿ� ����
		 *   �̷¼� ���ó�� �����͸� ������ �ϼ��Ǵ� ���ڿ�
		 *   System.out.printf(���ڿ� ����, ���ڿ� ���Ŀ� ������ �����͵�)
		 *   ���ڿ� ���� ���� �����Ͱ� ���ԵǱ� ���� ���� �˸��� ���� ����
		 *   �� ���� ������ : %�� �����ϸ� ���Ե� �������� Ÿ�԰� ���� �ۼ��ȴ�.
		 *   
		 * ���ϴ� ���ڿ� ���� �� name : 000, age : 00
		 * String strFormat  = "name : 000, age : 00";
		 */
		String strFormat = "name : %-5s, age : %d\n";
		System.out.printf(strFormat, name, age);
		
		name = "Jeonni";
		age = 22;
		System.out.printf(strFormat, name, age);
		
		// String Ŭ���� ���� format �޴����� �̿��ؼ� ���ڿ� ������ ���� ���ڿ��� ���� �� �ִ�.
		String str = String.format(strFormat, name, age);
		System.out.println(str);
		
	}
}
