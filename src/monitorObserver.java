
public class monitorObserver implements Observer{

	
	public void handleEvent(int temperature) {
		System.out.println("Температура процессора изменилась. Температура = "+temperature+" C");
		
	}

}
