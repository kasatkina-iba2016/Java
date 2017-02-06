
public class Station {

songCopy numberSong;
	
	void setCopySong (songCopy ns)
	{
		numberSong=ns;
	}
	
	void nextSong()
	{
		if (numberSong instanceof Song1)
			setCopySong(new Song2());
		
		else if (numberSong instanceof Song2)
			setCopySong(new Song3());
	}
	void song()
	{
		numberSong.song();
	}
}
