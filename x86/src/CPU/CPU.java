package CPU;

public class CPU {
Flags flags=new Flags(0);
Register eax=new Register("eax", flags), ebx=new Register("ebx", flags), ecx=new Register("ecx", flags), edx=new Register("edx", flags),edi=new Register("edi", flags),esi=Register("esi", flags),ebp=Register("ebp", flags),esp=Register("esp", flags), eip=Register("eip", flags);

Memory memory;
public CPU(Memory memory) throws NotEnoughMemoryException {
	// TODO Auto-generated constructor stub
	this.memory=memory;
	
	
	
}	
public Register[] getRegisters(){
	return new Register[]{eax,ebx,ecx,edx};
}
public void process_epi(){
	if()
		if(!isTwoBit){
			for (int i = 0; i < immediate.length; i++) {
				
			}
		}
	}
	public void add(byte opcode, boolean isTwoBit,byte mod, byte sib, byte[] displacement, byte[] immediate){
		if((opcode&1)==1){
			if((opcode&0x10b)!=0){
				
			}else {
				
			}
		}else {
			if((opcode&0x10b)!=0){
				
			}else {
				
			}
		}
	}
	
}
