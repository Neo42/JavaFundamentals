package OOP.Chapter7.CourseTable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CourseTable {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTable table = new JTable(new CourseData());
        JScrollPane pane = new JScrollPane(table);
        frame.add(pane);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
