import java.util.Scanner;

//计算三个整数的最大公约数、最小公倍数
public class Way4 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("请输入三个整数：");
		int m=in.nextInt();
		int n=in.nextInt();
		int q=in.nextInt();
		int max=0,min= 0;
		int Max=0,Max2=0,Min= 0;//定义最大公约数、最小公倍数
		//求m,n 的最大公约数、最小公倍数
		if(m>n)//将m记为两数间的较小值
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
		//求max和q的最大公约数
		int l=q;
		if(q>max)//将q记为两数间的较小值
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
		//求min和q的最小公倍数
		if(l>min)//将l记为两数间的较小值
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
		System.out.println("最大公约数为:"+Max+",最小公倍数为："+Min);
		}
}