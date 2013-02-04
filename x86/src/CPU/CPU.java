package CPU;

import Memory.Memory;

public class CPU {
	Flags flags=new Flags(0);
	Register eax=new Register("eax", flags), ebx=new Register("ebx", flags), ecx=new Register("ecx", flags), edx=new Register("edx", flags),edi=new Register("edi", flags),esi=new Register("esi", flags),ebp=new Register("ebp", flags),esp=new Register("esp", flags), eip=new Register("eip", flags);

	Memory memory;
	public CPU(Memory memory) throws NotEnoughMemoryException {
		// TODO Auto-generated constructor stub
		this.memory=memory;



	}	
	public Register[] getRegisters(){
		return new Register[]{eax,ebx,ecx,edx};
	}
	public void process_epi(){
		boolean istwo=false;
		byte opcode = memory.read8(eip.value);
		if(opcode==15){
			eip.value++;
			opcode=memory.read8(eip.value);
			istwo=true;
		}
		if(!istwo){
			byte without=(byte) (opcode&0xFC);
			if(without==0){
				
				byte b=memory.read8(eip.value);
						eip.value++;
				switch (without) {
				case 0:
					
					break;
				case 1:

					break;
				case 2:

					break;
				case 3:

					break;


				}
			}
		}else{

		}

	}
	public Register[] procmodrm(byte b){
		byte mod= (byte) (((byte)b)>>>((byte)4));
		byte reg=(byte) ((b>>>3)&7);
		byte rm=(byte) (b&7);
		Register r=get_register(reg);
		
		
	
	}
	public Register get_register(byte b){
		switch (b) {
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



}
