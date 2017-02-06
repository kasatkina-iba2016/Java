
public class Computer {

	Power power=new Power();
	DVDrom dvd=new DVDrom();
	HDD hdd=new HDD();
	
	void process()
	{
	 power.on();
	 dvd.load();
	 hdd.addO(new monitorObserver());
	 hdd.setData(50);
	 hdd.copyFromDVD(dvd);
	 songCopy so=new Song1();
	 Station stat=new Station();
	 stat.setCopySong(so);
		
		for (int i=0; i<3; i++)
		{
		stat.song();
		stat.nextSong();
		}
	 hdd.setData(40);
	 power.off();
	}
}
