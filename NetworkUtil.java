package a.b.util;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

/**
 * Created with IntelliJ IDEA.
 * User: BS Moon 
 * Date: 13. 7. 30
 * Time: 오후 3:13
 * To change this template use File | Settings | File Templates.
 */
public class NetworkUtil {

    
    public static String getLocalIpAddress()
    {
        try {
            for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements();) {
                NetworkInterface intf = en.nextElement();
                for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements();) {
                    InetAddress inetAddress = enumIpAddr.nextElement();
                    if (!inetAddress.isLoopbackAddress()) {
                    	return inetAddress.getHostAddress().toString();
                    }
                }
            }
        } catch (SocketException e) {
        }
        return null;
    }
    
  
    public static String getLocalIpWindows(){
    	
    	InetAddress ia = null;
    	try {
            ia = InetAddress.getLocalHost();
        } catch (UnknownHostException ee) {}
    	//System.out.println("ip = " + ia.getHostAddress());  
        //System.out.println("name = " + ia.getHostName());  
        return ia.getHostAddress();
    	
    }
   
    
    
}
