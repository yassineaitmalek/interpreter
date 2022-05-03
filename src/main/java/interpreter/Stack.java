package interpreter;
import java.util.ArrayList;

public class Stack extends ArrayList<String> {
	
	private static final long serialVersionUID = 1L;

	public String get_str() {
		
		return this.get( this.size() - 1 );
		
	}
	
	public void add_str(String str) {
		
		this.add(str);
		
	}
	
	public String pop_str() {
		
		String poped_out = this.get_str();
		this.remove( this.size() - 1 );
		return poped_out;
		
	}
}
