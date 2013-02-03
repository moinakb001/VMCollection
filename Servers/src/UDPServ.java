import java.io.*;
import java.net.*;
public class UDPServ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DatagramSocket s=new DatagramSocket();
byte[] recbytes=new byte[1024*50];
byte[] send=new byte[1024*50];
while(true){
DatagramPacket p=new DatagramPacket(recbytes,recbytes.length);
s.recieve(p);
System.out.println("Got :"+(new String(p.getData())));

}


	}

}
