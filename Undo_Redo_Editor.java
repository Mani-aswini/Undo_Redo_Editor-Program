import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine(); // consume newline
		String[] ops = new String[N];
		for (int i = 0; i < N; i++) {
			ops[i] = sc.nextLine();
		}
		System.out.println(textEditor(ops));
	}
	public static String textEditor (String[] ops) {
		Stack doc = new Stack();
		Stack redo = new Stack();
		for(int i = 0 ; i < ops.length; i++) {
			if(ops[i].equals("UNDO")) {
				if(!doc.isEmpty()) {
					redo.push (doc.pop());
				}
			} else if (ops[i].equals("REDO")) {
				if(!redo.isEmpty()) {
					doc.push(redo.pop());
				}
			} else {
				doc.push(ops[i]);
				redo.clear();
			}
		}
		if(doc.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Object x:doc) {
				System.out.print(x + ");
			}
		}
		return "";
	}
}
