
public class Avg_percentage {

	public static void main(String[] args) {
		
		 int score[] = { 60, 70, 75, 80, 90};
		 
	       //calculate sum of all array elements
	       int sum = 0;
	       for(int i=0; i < score.length ; i++)
	       {
	           sum = sum + score[i];
	       }
	       
	       //calculate average value
	        double average = sum / score.length;
	        System.out.println("Average value of the array elements is : " + average); 
	        
	      //calculate percentage value
	        double percentage = (sum * 100) / 500;
	        System.out.println("Percentage value of the array elements is : " + percentage);

	}

}
