package OOP.Chapter3.Notebook;

import java.util.ArrayList;
import java.util.HashSet;

public class Notebook {
    private ArrayList<String> notes = new ArrayList<String>();

    public static void main(String[] args) {
        Value value = new Value();
        value.set(10);
        System.out.println(value);

        ArrayList<String> a = new ArrayList<String>();
        a.add("first");
        a.add("second");
        a.add("third");

        System.out.println(a);
        System.out.println("----------");

        HashSet<String> set = new HashSet<String>();
        set.add("first");
        set.add("second");
        set.add("first");
        System.out.println(set);
        // Value[] a = new Value[10];
        // for (int i = 0; i < a.length; i++) {
        // a[i] = new Value();
        // a[i].set(i);
        // }

        // for (Value v : a) {
        // System.out.println(v.get());
        // v.set(0);
        // }

        // for (Value v : a) {
        // System.out.println(v.get());
        // }
        // int[] ia = new int[10];
        // String[] a = new String[10];

        // for (int i = 0; i < a.length; i++) {
        // a[i] = "" + i;
        // }

        // System.out.println(a[0].length());
        // System.out.println(ia[0] + 2);
        // Notebook notebook = new Notebook();
        // notebook.add("first");
        // notebook.add("second");
        // notebook.add("second", 1);
        // System.out.println(notebook.getSize());
        // System.out.println(notebook.getNote(0));
        // System.out.println(notebook.getNote(1));
        // notebook.removeNote(1);
        // String[] a = notebook.list();
        // for (String s : a) {
        // System.out.println(s);
        // }
    }

    public void add(String s) {
        notes.add(s);
    }

    public void add(String s, int location) {
        notes.add(location, s);
    }

    public int getSize() {
        return notes.size();
    }

    public String getNote(int index) {
        return notes.get(index);
    }

    public void removeNote(int index) {
        notes.remove(index);
    }

    public String[] list() {
        String[] a = new String[notes.size()];
        // for (int i = 0; i < a.length; i++) {
        // a[i] = notes.get(i);
        // }
        // return a;
        notes.toArray(a);
        return a;
    }
}

class Value {
    private int i;

    public void set(int i) {
        this.i = i;
    }

    public int get() {
        return i;
    }

    public String toString() {
        return "" + i;
    }
}
