/*Write a java program to add n strings in a vector array. Input new string and check whether it is present in the vector.
If it is present delete it otherwise add it to the vector.  */

import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		Vector<String> vec = new Vector<String>();
		int on = 1;
		while (on == 1) {
			System.out.printf("Enter the string: ");
		String input = sc.next();
			if (vec.indexOf(input) == -1) {
				vec.add(input);
			} else {
				vec.remove(vec.indexOf(input));
			}
			for (int i = 0; i < vec.size(); i++) {
				System.out.printf("%s ", vec.get(i));
			}
            System.out.printf("\n");
			System.out.printf("Enter 1 to continue: ");
			on = sc.nextInt();
		}

		sc.close();
	}
}