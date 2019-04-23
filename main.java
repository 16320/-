import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int halfRowSize=n-2;
		for(int i =1;i<=halfRowSize;i++) {
			if(i % 2 != 0) {
				System.out.println(String.format("%s\\ /%s",repeatStr("*",halfRowSize),repeatStr("*",halfRowSize)));
			}else {
				System.out.println(String.format("%s\\ /%s",repeatStr("-",halfRowSize),repeatStr("-",halfRowSize)));
			}
			
		}
		System.out.println(String.format("%2 @ %2", repeatStr(" ",halfRowSize),repeatStr(" ",halfRowSize)));
		for(int i =1;i<=halfRowSize;i++) {
			if(i % 2 != 0) {
				System.out.println(String.format("%s\\ /%s",repeatStr("*",halfRowSize),repeatStr("*",halfRowSize)));
			}else {
				System.out.println(String.format("%s\\ /%s",repeatStr("-",halfRowSize),repeatStr("-",halfRowSize)));
			}
			
		}

	}
	static String repeatStr(String strToRepeat,int count) {
		String text="";
		for(int i =0;i<count;i++) {
			text +=strToRepeat;
		}
		return text;
	}



	}


