import java.util.ArrayList;
import java.util.List;

public class HDD implements Observed{

	int temperature;
	List<Observer> observers=new ArrayList<>();
	
	public void setData(int t) {
		temperature=t;
		notifyO();
	}
	public void copyFromDVD (DVDrom dvd)
	{
		if (dvd.hasData())
			System.out.println("Происходит копирование данных с диска...");
		else System.out.println("Вставьте диск");
	}
	
	public void addO(Observer o) {
		observers.add(o);
		
	}
	
	public void remooveO(Observer o) {
		observers.remove(o);
		
	}
	
	public void notifyO() {
	   for (Observer o: observers)
	   {
		   o.handleEvent(temperature);
	   }
		
	}
	
	
}
