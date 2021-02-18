
import java.util.*;
import java.io.*;

public class Jukebox7
{
    ArrayList<Song> songList = new ArrayList<Song>();
    
    public static void main(String[] args) {
        new Jukebox7().go();
    }
    
    public void go() 
    {
        getSongs();

        System.out.println("Print without sort");
        System.out.println(" ");
        System.out.println(songList);
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Print with sort");
        System.out.println(" ");
        Collections.sort(songList);
        System.out.println(songList);
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("Print using HashSet which removes dupes");
        System.out.println(" ");
        HashSet<Song> songSet = new HashSet<Song>();
        songSet.addAll(songList);
        System.out.println(songSet);
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Print using TreeSet which removes dupes and sorts");
        System.out.println(" ");
        TreeSet<Song> songTreeSet = new TreeSet<Song>();
        songTreeSet.addAll(songList);
        System.out.println(songTreeSet);
        System.out.println(" ");
        System.out.println(" ");

    }
    
    void getSongs() {
        try {
            File file = new File("SongList2.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) { ex.printStackTrace(); }
    }
    
    void addSong(String lineToParse) {
        String[]tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}

