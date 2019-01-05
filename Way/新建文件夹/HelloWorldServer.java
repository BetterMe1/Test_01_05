import sample.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.CORBA.portable.*;
import org.omg.PortableServer.*;
class HelloWorldServant extends HelloWorldPOA{   //对象实现类
public String sayHello(){
return "\nHello World!\n";
}
}
public class HelloWorldServer{                  //服务程序
public static void main(String args[]){
try{
//初始化ORB
ORB orb = ORB.init(args, null);
//取根POA的引用
org.omg.CORBA.Object poaobj = orb.resolve_initial_references ("RootPOA");
org.omg.PortableServer.POA rootPOA = org.omg.PortableServer.POAHelper.narrow(poaobj);
org.omg.PortableServer.POAManager manager = rootPOA.the_POAManager();
//创建伺服对象 
HelloWorldServant objRef = new HelloWorldServant();
HelloWorld obj = objRef._this(orb);
//绑定命名服务 
NamingContext ncRef = NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));
NameComponent nc = new NameComponent("Hello", ""); 
NameComponent path[] = {nc}; 
ncRef.rebind(path, obj);
//激活POA管理器 
manager.activate();
//等待处理客户程序的请求
System.out.println("HelloWorld is running!");
orb.run();
}catch (Exception e) { 
System.err.println("ERROR: " + e); 
e.printStackTrace(System.out); 
}
}
}