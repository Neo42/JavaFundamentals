package OOP.Chapter7.CourseTable;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class CourseData implements TableModel {

    private String[] titles = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };
    private String[][] courses = new String[8][7];

    public CourseData() {
        for (int i = 0; i < courses.length; i++) {
            for (int j = 0; j < courses[i].length; j++) {
                courses[i][j] = "";
            }
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return titles[columnIndex];
    }

    @Override
    public int getRowCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return courses[rowIndex][columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        courses[rowIndex][columnIndex] = (String) aValue;
    }

}
