package model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

// 7
public class ComplaintBoxTableModel extends AbstractTableModel {
    private String[] columnHeaders = { "Bus name", "Date", "Complaint details" };
    private List<Object[]> listOfRows = new ArrayList<>();

    public ComplaintBoxTableModel(List<String[]> complaintBoxList) {
        for (String[] s : complaintBoxList) {
            Object[] row = { s[0], s[1], s[2]};
            listOfRows.add(row);
        }
    }

    @Override
    public int getRowCount() {
        return listOfRows.size();
    }

    @Override
    public int getColumnCount() {
        return columnHeaders.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return listOfRows.get(rowIndex)[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columnHeaders[column];
    }

}
