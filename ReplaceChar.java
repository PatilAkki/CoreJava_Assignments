package Assignment_6_Sept;

public class ReplaceChar {

	public static void main(String[] args) {
		String str = "Halo";
		char[] st = new char[str.length()];
		for(int i = 0; i<str.length(); i++)
		{
			char temp = str.charAt(i);
			if(temp == 'a')
			{
				st[i] = 'e';
			}
			else
			{
				st[i] = str.charAt(i);
			}
		}
		
		System.out.println(st);

	}

}
