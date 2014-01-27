package CPU;

import Memory.Memory;

public class CPU {
	Flags flags=new Flags(0);
	Register eax=new Register("eax", flags), ebx=new Register("ebx", flags), ecx=new Register("ecx", flags), edx=new Register("edx", flags),edi=new Register("edi", flags),esi=new Register("esi", flags),ebp=new Register("ebp", flags),esp=new Register("esp", flags), eip=new Register("eip", flags);
	Register[] general=new Register[]{eax,ebx,ecx,edx,edi,esi,esp,eip};
	Register[] debug=new Register[]{};
	Memory memory;
	public CPU(Memory memory) throws NotEnoughMemoryException {
		// TODO Auto-generated constructor stub
		this.memory=memory;
		


	}
	public void step(){
		byte currbyte=memory.read8(eip.value);
		/*switch (currbyte) {
		case value:
			
			break;

		default:
			break;
		}*/
	}
	public void parseOpcode(){
		byte currbyte=memory.read8(eip.value);
		eip.value++;
		switch (currbyte) {
		case 0:
		
			currbyte=memory.read8(eip.value);
			eip.value++;
			if((currbyte>>6)==3){
				Register src=get_register((byte) (currbyte>>(byte)3));
				Register dest=get_register(currbyte);
			}
			
			break;

		default:
			break;
		}
	}
	public Register get_register(byte b){
		switch (b&7) {
		case 0:
			return eax;
		case 1:
			return ecx;
	
		case 2:
			return edx;
	
		case 3:
			return ebx;
		
		case 4:
			return esp;
		case 5:
			return ebp;
		case 6:
			return esi;
		case 7:
			return edi;
			
		
		}
		return eax;
	}
	public Register[] getRegisters() {
		// TODO Auto-generated method stub
		return general;
	}



}
