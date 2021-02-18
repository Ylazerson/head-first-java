
import java.util.*;
import java.io.*;

public class Jukebox5
{
    ArrayList<Song> songList = new ArrayList<Song>();
    
    public static void main(String[] args) 
    {
        new Jukebox5().go();
    }

    class ArtistCompare implements Comparator<Song> 
    {
        public int compare(Song one, Song two) 
        {
            return one.getArtist().compareTo(two.getArtist());
        }
    }
    
    public void go() 
    {
        getSongs();

        System.out.println("Print without sort");
        System.out.println(songList);
        System.out.println(" ");

        System.out.println("Print with sort based on Song.compareTo()");
        Collections.sort(songList);
        System.out.println(songList);
        System.out.println(" ");
        
        System.out.println("Print with sort by artist based inner class ArtistCompare implements Comparator<Song>)");
        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList, artistCompare);        
        System.out.println(songList);
        System.out.println(" ");
    }
    
    void getSongs() 
    {
        try 
        {
            File file = new File("SongList2.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) 
            {
                addSong(line);
            }
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace(); 
        }
    }
    
    void addSong(String lineToParse) 
    {
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}
