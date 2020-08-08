package Lab01;

public class main {
	
	public static void main(String[] args) {
		
		StackCharacter stackC = new StackCharacter(6);
		
		// input : a b c d e f
		stackC.push('a');
		stackC.push('b');
		stackC.push('c');
		stackC.push('d');
		stackC.push('e');
		stackC.push('f');
		
		//output : f e d c b a
		while(!stackC.isEmpty())
			System.out.print(stackC.pop() + " ");
		System.out.println();
		
		//check for correctly parenthesized
		StackCharacter stackP = new StackCharacter(15);
		int open = 0;
		
//		stackP.push('3');
//		stackP.push('+');
//		stackP.push('(');
//		stackP.push('(');
//		stackP.push('6');
//		stackP.push('*');
//		stackP.push('2');
//		stackP.push(')');
//		stackP.push('-');
//		stackP.push('3');
//		stackP.push(')');
		
		stackP.push('5');
		stackP.push('*');
		stackP.push('6');
		stackP.push('+');
		stackP.push('(');
		stackP.push('2');
		stackP.push('-');
		stackP.push('5');

		
		while(!stackP.isEmpty()) {
			char c = stackP.pop();
			
			if(c == ')')
				++open;
			else if(c == '(')
				--open;
			if(open < 0) {
				System.out.println("Invalid");
				System.exit(0);
			}
		}
		if (open == 0)
			System.out.println("valid");
		else
			System.out.println("Invalid");
		
		
		
	}
}
