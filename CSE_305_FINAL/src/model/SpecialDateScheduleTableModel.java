package model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class SpecialDateScheduleTableModel extends AbstractTableModel {
    private String[] columnHeaders = { "Festival's Name", "Date", "Pick Up Location", "Drop Location", "Route Number" };
    private List<Object[]> listOfRows = new ArrayList<>();

    public SpecialDateScheduleTableModel(List<SpecialEvent> specialEventList) {
        for (SpecialEvent e : specialEventList) {
            Object[] row = { e.getName(), e.getDate().toString(), e.getPickupAndDropLocation()[0].getBusStopName(),
                    e.getPickupAndDropLocation()[1].getBusStopName(), e.getRouteNum() };
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
