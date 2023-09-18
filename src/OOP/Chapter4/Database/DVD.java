package OOP.Chapter4.Database;

public class DVD extends Item {
    private String director;

    public DVD(String title, String director, int playingTime, String comment) {
        super(title, playingTime, false, comment);
        this.setTitle("b");
        this.director = director;
    }

    public static void main(String[] args) {

    }

    public void print() {
        System.out.println("DVD:");
        super.print();
        System.out.print(director);
    }
}