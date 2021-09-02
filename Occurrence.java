
public class Occurrence {
  
static int countOccurrences(String data, String word) 
{
    // split the string by spaces in a
    String a[] = data.split(" ");
  
    // search for pattern in a
    int count = 0;
    for (int i = 0; i < a.length; i++) 
    {
    // if match found increase count
    if (word.equals(a[i]))
        count++;
    }
  
    return count;
}
  
public static void main(String args[]) 
{
    String data = "Java is Object oriented. Java is platform independent.Java is simple.";
    String word = "Java";
    System.out.println(countOccurrences(data, word));
}
}