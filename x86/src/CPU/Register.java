package CPU;

public class Register {
	String name;
	int value=0x00000000;
	Flags f;
	
public Register(String name, Flags flags ) {
	// TODO Auto-generated constructor stub
	this.name=name;
	this.f=flags;
}
public String toString() {
	// TODO Auto-generated method stub
	StringBuffer sb=new StringBuffer(Long.toHexString(value));
	for (; sb.length() < 8; ) {
		sb.append("0");
	}
	return name+"-"+"0x"+sb;
}

	
	


}
