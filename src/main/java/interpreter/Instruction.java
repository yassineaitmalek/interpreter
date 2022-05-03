package interpreter;

public class Instruction {

	private Operation op;
	private String opd;

	public Instruction(Operation op, String opd) {
		super();
		this.op = op;
		this.opd = opd;
	}

	public Instruction(Operation op) {
		super();
		this.op = op;
	}

	public Instruction() {
		super();
	}

	/**
	 * @return the op
	 */
	public Operation getOp() {
		return op;
	}

	/**
	 * @param op the op to set
	 */
	public void setOp(Operation op) {
		this.op = op;
	}

	/**
	 * @return the opd
	 */
	public String getOpd() {
		return opd;
	}

	/**
	 * @param opd the opd to set
	 */
	public void setOpd(String opd) {
		this.opd = opd;
	}

}
