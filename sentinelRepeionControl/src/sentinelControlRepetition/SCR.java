package sentinelControlRepetition;
import java.util.Scanner; 

public class SCR {
private String courseName;
    public SCR (String name) {
  	courseName = name; 
}
    public void setName(String name) {
    	 courseName = name;
    }
    public String getName() {
    	return courseName;
    }
    public void displayMsg() {
    	System.out.printf("welcome to grade book for \n%s!\n\n", getName());
    	}
    	
    public void dAverage() {
    	Scanner input = new Scanner(System.in);
        int total, counter, grade;
        double average;
        counter = 0;
        total=0;
        grade =0;
    while(grade != -1) {
    	total = total + grade;
    	counter = counter + 1;
    	System.out.print("Enter grade or -1 to quit");
    	grade = input.nextInt(); 
        }
    	
    	if(counter != 0)
    	{
    		average = (double)total / counter;
    		System.out.printf("\nTotal number of %d grades entered is %d\n", counter, total);
    		System.out.printf("Class average is %.2f\n", average);
    	}
    	
    	else 
    		System.out.println("No grades were entered");
    	}
    
    
    }
    
