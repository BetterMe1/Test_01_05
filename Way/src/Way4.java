import java.util.Scanner;

//�����������������Լ������С������
public class Way4 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("����������������");
		int m=in.nextInt();
		int n=in.nextInt();
		int q=in.nextInt();
		int max=0,min= 0;
		int Max=0,Max2=0,Min= 0;//�������Լ������С������
		//��m,n �����Լ������С������
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
		//��max��q�����Լ��
		int l=q;
		if(q>max)//��q��Ϊ������Ľ�Сֵ
		{
		int t=max;
		max=q;
		q=t;
		}
		for(int i=1;i<=q;i++)
		{
		if(q%i==0&max%i==0)
		Max=i;
		}
		//��min��q����С������
		if(l>min)//��l��Ϊ������Ľ�Сֵ
		{
		int t=l;
		l=min;
		min=t;
		}
		for(int i=1;i<=l;i++)
		{
		if(l%i==0&min%i==0)
		Max2=i;
		}
		Min=l*min/Max2;
		System.out.println("���Լ��Ϊ:"+Max+",��С������Ϊ��"+Min);
		}
}