import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] s = scan.nextLine().split(" ");
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < s.length; i++) {
			a.add(a.size(), s[i]);
		}

		while (true) {
			String[] input = scan.nextLine().split(" ");
			
			if (input[0].equalsIgnoreCase("push")) {
				a.add(input[1]);
			}
			else if(input[0].equalsIgnoreCase("pop")) {
				int c = Counter(a.size());
				System.out.println(a.get(c));
				a.remove(c);
			}
			else if(input[0].equalsIgnoreCase("shift")) {
				int temp = 0;
				int c = Counter(a.size());
				temp = Integer.parseInt(a.get(0));
				a.set(0, a.get(c));
				a.remove(c);
				a.add(Integer.toString(temp));
			}
			else  if (input[0].equalsIgnoreCase("remove") && Integer.parseInt(input[1]) < a.size()) {
				a.remove(Integer.parseInt(input[1]));
			} 
			else if (input[0].equalsIgnoreCase("addMany") && Integer.parseInt(input[1]) < a.size()) {
				for(int i = input.length - 1; i >= 2; i--) {
					a.add(Integer.parseInt(input[1]), input[i]);
				}
			}
			else if (input[0].equalsIgnoreCase("print")) {
				for (int i = a.size() - 1; i >= 0; i--) {
					System.out.print(a.get(i));
					if(i != 0) {
						System.out.print(", ");
					}
				}
				break;
			}
		}

	}
	
	public static int Counter(int num) {
		int counter = 0;
		for(int i = 0; i < num - 1; i++) {
			counter++;
		}
		return counter;
	}

}