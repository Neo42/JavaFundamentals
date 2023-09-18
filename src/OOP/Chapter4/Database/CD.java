package OOP.Chapter4.Database;

public class CD extends Item {
    private String artist;
    private int numOfTracks;

    public CD(String title, String artist, int numOfTracks, int playingTime, String comment) {
        super(title, playingTime, false, comment);
        this.artist = artist;
        this.numOfTracks = numOfTracks;
    }

    @Override
    public boolean equals(Object obj) {
        CD cc = (CD) obj;
        return artist.equals(cc.artist);
    }

    @Override
    public String toString() {
        return "CD [artist=" + artist + ", numOfTracks=" + numOfTracks + ", toString()=" + super.toString() + "]";
    }

    public static void main(String[] args) {
        CD cd = new CD("a", "b", 2, 2, "...");
        CD cd1 = new CD("a", "b", 2, 2, "...");
        System.out.println(cd.equals(cd1));
        // cd.print();
        // String s = "aa" + cd;
        // System.out.println(s);
    }
}
