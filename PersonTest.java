class Person
{
	// ����һ��ʵ������
	public String name;
	// ����һ�������
	public static int eyeNum;
}
public class PersonTest
{
	public static void main(String[] args)
	{
		// ��һ������ʹ��Person�࣬�����Զ���ʼ������eyeNum������ʼ�����ã����0
		System.out.println("Person��eyeNum�����ֵ:"
			+ Person.eyeNum);
		// ����Person����
		Person p = new Person();
		// ͨ��Person���������p������Person����nameʵ������
		// ��ͨ��ʵ������eyeNum�����
		System.out.println("p������name����ֵ�ǣ�" + p.name
			+ " p�����eyeNum����ֵ�ǣ�" + p.eyeNum);
		// ֱ��Ϊnameʵ��������ֵ
		p.name = "�����";
		// ͨ��p����eyeNum���������Ȼ�Ƿ���Person��eyeNum�����
		p.eyeNum = 2;
		// �ٴ�ͨ��Person����������nameʵ��������eyeNum�����
		System.out.println("p������name����ֵ�ǣ�" + p.name
			+ " p�����eyeNum����ֵ�ǣ�" + p.eyeNum);
		// ǰ��ͨ��p�޸���Person��eyeNum���˴���Person.eyeNum�����2
		System.out.println("Person��eyeNum�����ֵ:" + Person.eyeNum);
		Person p2 = new Person();
		// p2���ʵ�eyeNum�������Ȼ����Person��ģ������Ȼ���2
		System.out.println("p2�����eyeNum�����ֵ:" + p2.eyeNum);
	}
}