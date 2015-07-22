package CPU;

public class Flags {
	 int eflags=0;
public Flags(int eflags) {
	// TODO Auto-generated constructor stub
	this.eflags=eflags;
}
public void setFlag(int orig, boolean b){
	
	
		eflags=(eflags|((b?1:0)<<orig));
	
}
public boolean getFlag(int pos){
	return (eflags&(1<<pos))!=0;
	
}
}
