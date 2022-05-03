package interpreter;
import java.util.HashMap;

public class Memory extends HashMap <Integer,String>{
	
	private static final long serialVersionUID = 1L;


	public void add_m(Integer adr,String val) {
		
		this.put(adr, val);
		
	}
	
	
	public String get_m(Integer adr) {
		
		return this.get(adr);
		
	}
}
