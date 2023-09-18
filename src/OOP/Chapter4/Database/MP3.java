package OOP.Chapter4.Database;

public class MP3 extends Item {
    private String artist;
    private int numberOfTracks;

    public MP3(String title, int playingTime, boolean gotIt, String comment, String artist, int numberOfTracks) {
        super(title, playingTime, gotIt, comment);
        this.artist = artist;
        this.numberOfTracks = numberOfTracks;
    }

    @Override
    public void print() {
        System.out.println("MP3 by " + artist);
        super.print();
    }

    @Override
    public String toString() {
        return super.toString() + " I am an MP3";
    }
}
