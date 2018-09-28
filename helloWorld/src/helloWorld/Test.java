package helloWorld;
import java.util.Date;
import java.net.InetAddress; 
import java.net.UnknownHostException; 
public class Test {

	public static void main(String[] args) throws 
	 UnknownHostException {
	
		System.out.println("helloWorld");
		  Date date = new Date();
	        System.out.println(date.toString());
	        InetAddress IP=InetAddress.getLocalHost();
	        System.out.println("IP of my system is := "+IP.getHostAddress());

	}

}
