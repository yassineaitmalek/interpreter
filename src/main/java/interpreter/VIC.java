package interpreter;
import java.util.ArrayList;


public class VIC extends ArrayList<Instruction> {
	
	private static final long serialVersionUID = 1L;

	public void add_inst(Instruction inst) {
		this.add(inst);
	}
	
	public Instruction get_inst(int index) {
		return this.get(index);
	}
}
