import java.util.Scanner;

//����������
//�����������������Լ������С�������ķ�����
public class Way3 {
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
		int a=m;int b=n;
		if(n%m==0){
			max=m;
			min=n;
		}
		int c;
		while((c=n%m)!=0){
			n=m;
			m=c;
		}
		//��������
		if(m==1){
			max=m;
			min=a*b;
		}
		if(b%a!=0&&m!=1){
			int i=2;
			while(b*i%a!=0){
				i=i+1;
			}
			min=b*i;
			max=b*a/min;
			
		}
		System.out.println("���Լ��Ϊ:"+max+",��С������Ϊ��"+min);
		}
}
