import java.util.Scanner;

//շת�����
//�����������������Լ������С�������ķ�����
public class Way2{
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.print("����������������");
       int m=in.nextInt();
       int n=in.nextInt();
       int z=m*n;//�����ʱ��m*n
       int max=0,min= 0;//�������Լ������С������
       if(m>n)//��m��Ϊ������Ľ�Сֵ
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
       System.out.println("���Լ��Ϊ:"+max+",��С������Ϊ��"+min);
       }
}