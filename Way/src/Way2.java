import java.util.Scanner;

//辗转相除法
//计算两个整数的最大公约数、最小公倍数的方法二
public class Way2{
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.print("请输入两个整数：");
       int m=in.nextInt();
       int n=in.nextInt();
       int z=m*n;//计算此时的m*n
       int max=0,min= 0;//定义最大公约数、最小公倍数
       if(m>n)//将m记为两数间的较小值
    	   {
    	   int t=m;
    	   m=n;
    	   n=t;
    	   }
       int r=n%m;
       while(m!=0)
       {   r=n%m;
    	   n=m;
    	   m=r;
       }
       max=n;
       min=z/n;
       System.out.println("最大公约数为:"+max+",最小公倍数为："+min);
       }
}