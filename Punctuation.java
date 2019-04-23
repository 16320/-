
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] comb = scan.nextLine().split("");
		String[] nums = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		String[] lowLetters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
				"r", "s", "t", "u", "v", "w", "x", "y", "z" };
		String[] upLetters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		String[] symbols = { "!", "#", "%", "&", "(", ")", "*", ".", ",", "-", "?", ":", "@", "_", "[", "]", "{", "}" };
		for (int i = 0; i < comb.length; i++) {
			boolean skip = false;
			for (int j = 0; j < nums.length; j++) {
				if (comb[i].equals(nums[j])) {
					comb[i] = Integer.toString(Integer.parseInt(comb[i]) * 2);
					skip = true;
					break;
				}
			}
			if(skip) {
				continue;
			}
			for (int j = 0; j < lowLetters.length; j++) {
				if (comb[i].equals(lowLetters[j])) {
					comb[i] = upLetters[j];
					skip = true;
					break;
				}
			}
			if(skip) {
				continue;
			}
			for (int j = 0; j < upLetters.length; j++) {
				if (comb[i].equals(upLetters[j])) {
					comb[i] = lowLetters[j];
					skip = true;
					break;
				}
			}
			if(skip) {
				continue;
			}
			for (int j = 0; j < symbols.length; j++) {
				if (comb[i].equals(symbols[j])) {
					comb[i] = ".";
					skip = true;
					break;
				}
			}
			if(skip) {
				continue;
			}
			
			comb[i] = " ";
		}
		for (int i = comb.length - 1; i >= 0; i--) {
			System.out.print(comb[i]);
		}

	}

}

