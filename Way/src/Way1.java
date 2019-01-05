import java.util.Scanner;

//计算两个整数的最大公约数、最小公倍数的方法一
public class Way1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("请输入两个整数：");
		int m=in.nextInt();
		int n=in.nextInt();
		int max=0,min= 0;//定义最大公约数、最小公倍数
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
		System.out.println("最大公约数为:"+max+",最小公倍数为："+min);
		}
}
