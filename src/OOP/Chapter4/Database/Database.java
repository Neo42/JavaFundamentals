package OOP.Chapter4.Database;

import java.util.ArrayList;

public class Database {
    private ArrayList<Item> listItem = new ArrayList<Item>();
    // private ArrayList<CD> listCD = new ArrayList<CD>();
    // private ArrayList<DVD> listDVD = new ArrayList<DVD>();

    public static void main(String[] args) {
        Item item = new Item("a", 0, true, "...");
        CD cd = new CD("a", "a", 0, 0, "...");
        item = cd;
        item.print();
        System.out.println(item.getClass().getName());
        CD cc = (CD) item; // Type Narrowing
        Database database = new Database();
        database.add(new CD("abc", "abc", 4, 60, "..."));
        database.add(new CD("def", "def", 4, 60, "..."));
        database.add(new DVD("xxx", "aaa", 60, "..."));
        database.add(new VideoGame("ddd", 10, true, "...", 4));
        database.add(new MP3("fff", 60, false, "...", "xxx", 4));
        database.list();
    }

    public void add(Item item) {
        listItem.add(item);
    }

    // public void add(CD cd) {
    // listCD.add(cd);
    // }

    // public void add(DVD dvd) {
    // listDVD.add(dvd);
    // }

    public void list() {
        for (Item item : listItem) {
            item.print();
            System.out.println();
        }
        // for (CD cd : listCD) {
        // cd.print();
        // }

        // for (DVD dvd : listDVD) {
        // dvd.print();
        // }
    }
}
