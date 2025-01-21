package Sheet2;

import java.io.PrintWriter;

public class Notes_pw {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);
		pw.println("line1");
		pw.print("line2");
		int age =21;
		pw.printf("age is %d", age);
		System.out.println();
		pw.close();
	}

}
