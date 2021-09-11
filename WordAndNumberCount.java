package Assignment_07_09_21;

	import java.io.FileReader;
	import java.io.StreamTokenizer;

	public class WordAndNumberCount {

		
			 public static void main(String[] args) throws Exception {
				    int wordCount = 0, numberCount = 0;

				    StreamTokenizer sTokenizer = new StreamTokenizer(new FileReader("C:\\Users\\patil.akshay\\Documents\\workspace-spring-tool-suite-4-4.7.1.RELEASE\\Average\\src\\Assignment_07_09_21\\AksFile.txt"));

				    while (sTokenizer.nextToken() != StreamTokenizer.TT_EOF) {
				      if (sTokenizer.ttype == StreamTokenizer.TT_WORD)
				        wordCount++;
				      else if (sTokenizer.ttype == StreamTokenizer.TT_NUMBER)
				        numberCount++;
				    }

				    System.out.println("Number of words in file: " + wordCount);
				    System.out.println("Number of numbers in file: " + numberCount);

				  
		}

	}

