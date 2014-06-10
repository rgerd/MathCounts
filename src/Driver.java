import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Driver 
{
	public static void main (String[] args)
	{
		
		 
		BinaryOperator b=new BinaryOperator();
		
		  PrintWriter output=null;
		  try{
			File f=new File("output.txt");
		output=new PrintWriter(new FileWriter(f));
		for(int i=0;i<10;i++){
			int r=Utilities.getRandomNumberInRange(1, 4);
			if(r==1)
		output.println(b.add(Utilities.getRandomNumberInRange(1, 100),Utilities.getRandomNumberInRange(1, 100))+"\n");
			if(r==2)
				output.println(b.subtract(Utilities.getRandomNumberInRange(1, 100),Utilities.getRandomNumberInRange(1, 100))+"\n");
			if(r==3)
				output.println(b.divide(Utilities.getRandomNumberInRange(1, 100),Utilities.getRandomNumberInRange(1, 100))+"\n");
			if(r==4)
				output.println(b.multiply(Utilities.getRandomNumberInRange(1, 100),Utilities.getRandomNumberInRange(1, 100))+"\n");
		}
		}catch(IOException e) {
		e.printStackTrace();
		}finally{
		output.close();
		}
		
	}
}
