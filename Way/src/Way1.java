import java.util.Scanner;

//�����������������Լ������С�������ķ���һ
public class Way1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("����������������");
		int m=in.nextInt();
		int n=in.nextInt();
		int max=0,min= 0;//�������Լ������С������
		if(m>n)//��m��Ϊ������Ľ�Сֵ
		{
		int t=m;
		m=n;
		n=t;
		}
		for(int i=1;i<=m;i++)
		{
		if(m%i==0&n%i==0)
		max=i;
		}
		min=m*n/max;
		System.out.println("���Լ��Ϊ:"+max+",��С������Ϊ��"+min);
		}
}
