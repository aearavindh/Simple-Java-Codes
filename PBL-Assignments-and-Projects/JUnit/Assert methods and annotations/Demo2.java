package Assert_methods_and_annotations;

public class Demo2 {

	public boolean palindromeCheck(String s) {
		int len = s.length();
		String rev ="";
		for(int i=len-1;i>=0;i--)
			rev = rev+s.charAt(i);
		if(s.equals(rev))
			return true;
		else
			return false;
	}
}
