package Lab01;



public class Reverser {

	private String input;
	private StringBuffer output;
	private StackCharacter stc;
	
	
	public Reverser(String input) {
		
		this.input = input;
		stc = new StackCharacter(input.length());
		output = new StringBuffer();
	}
	
	public StringBuffer reverse() {
		
		char[] array = this.input.toCharArray();
		
		for(char c : array) {
			stc.push(c);
		}
		
		while(!stc.isEmpty()) {
			output.append(stc.pop());
		}
		
		return this.output;
		
		
	}
}
