import java.util.Scanner;

//大数翻倍法
//计算两个整数的最大公约数、最小公倍数的方法三
public class Way3 {
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
		//两数互质
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
		System.out.println("最大公约数为:"+max+",最小公倍数为："+min);
		}
}
