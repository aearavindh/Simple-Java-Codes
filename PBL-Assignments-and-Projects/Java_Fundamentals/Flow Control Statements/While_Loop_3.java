package Flow_Control_Statements;

public class While_Loop_3 {

	public static void main(String[] args) {

		int i = 1, ok = 0;
		while (ok < 5) {
			if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
				ok++;
			}
			i++;

		}

	}

}
