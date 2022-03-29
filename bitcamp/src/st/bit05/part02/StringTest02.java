package st.bit05.part02;

/*
*	FileName : StringTest02.java
*
*    1.  String.class  :   immutable (������ ���ڿ� Object Modeling)
*    2.  StringBuffer.class  : mutable (������ ���ڿ� Object Modeling)
*         StringBuilder.class  : mutable (������ ���ڿ� Object Modeling)
*         
*         ==> StringBuilder / StringBuffer �� ������ ���ڿ��� �ٷ��, API �� ����
*         ==> �������� StringBuiler �� ����ȭ(synchronize :: Thread �н� �� �ٽ� ���)
*                 �� �������� �ʾ� StringBuffer ���� �ӵ��鿡�� ���� ������ ����.
*/
public class  StringTest02{

	///Main method
	public static void main(String[] args)	{

		//String.class �̿� ���ڿ� ����
		String s1 = "ȫ";
		String s2 = "��";
		String s3 = "��";
		s1 = s1+s2;
		s1 = s1+s3;
		
		//������StringBuffer / StringBuiler ��� ���ڿ� ����
		StringBuffer sb = new StringBuffer("ȫ");
		//StringBuilder sb = new StringBuilder("ȫ");
		sb.append(s2);
		sb.append(s3);

		System.out.println(s1);
		//System.out.println(s1.toString());
		System.out.println(sb);
		//System.out.println(sb.toString());

		//��°���� �����ϰ� ȫ�浿
		//������ String, ������ StringBuffer�� ����������
		//ó���ϴ� ������ garbage �߻� �� �������� �߻�����

	}//end of main

}//end of class