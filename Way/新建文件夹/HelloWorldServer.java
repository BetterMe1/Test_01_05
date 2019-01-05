import sample.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.CORBA.portable.*;
import org.omg.PortableServer.*;
class HelloWorldServant extends HelloWorldPOA{   //����ʵ����
public String sayHello(){
return "\nHello World!\n";
}
}
public class HelloWorldServer{                  //�������
public static void main(String args[]){
try{
//��ʼ��ORB
ORB orb = ORB.init(args, null);
//ȡ��POA������
org.omg.CORBA.Object poaobj = orb.resolve_initial_references ("RootPOA");
org.omg.PortableServer.POA rootPOA = org.omg.PortableServer.POAHelper.narrow(poaobj);
org.omg.PortableServer.POAManager manager = rootPOA.the_POAManager();
//�����ŷ����� 
HelloWorldServant objRef = new HelloWorldServant();
HelloWorld obj = objRef._this(orb);
//���������� 
NamingContext ncRef = NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));
NameComponent nc = new NameComponent("Hello", ""); 
NameComponent path[] = {nc}; 
ncRef.rebind(path, obj);
//����POA������ 
manager.activate();
//�ȴ�����ͻ����������
System.out.println("HelloWorld is running!");
orb.run();
}catch (Exception e) { 
System.err.println("ERROR: " + e); 
e.printStackTrace(System.out); 
}
}
}