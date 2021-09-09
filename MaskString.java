package Assignment_6_Sept;

public class MaskString {

	public static void main(String[] args) {
		String str = " SABBIR POONAWALA";
		String[] arr = str.split(" ");
		int n = arr.length;
		String Pr = "";
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<arr[i].length(); j++)
			{
				if(j>1 && j<arr[i].length())
				{
					Pr += "X";
				}
				else
				{
					char a = arr[i].charAt(j);
					Pr += a;
				}
			}
			Pr+=" ";
		}
		System.out.println(Pr);
	}

}
