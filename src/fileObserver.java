import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class fileObserver implements Observer{

	
	public void handleEvent(int temperature) {
		File f;
		try{
			f=File.createTempFile("Cosmoss", ".temp",new File("D:/"));
			PrintWriter pw=new PrintWriter(f);
			pw.print("Температура процессора изменилась. Температура = "+temperature+" C");
			pw.println();
			pw.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
			
	}

}
