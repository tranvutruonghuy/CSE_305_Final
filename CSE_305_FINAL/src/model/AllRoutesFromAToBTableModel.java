package model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class AllRoutesFromAToBTableModel extends AbstractTableModel {
    private String[] columnHeaders = { "From", "To", "Route Number", "Time" };
    private List<Object[]> listOfRows = new ArrayList<>();

    public AllRoutesFromAToBTableModel(List<List<BusStop>> allRoute) {

    }

    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRowCount'");
    }

    @Override
    public int getColumnCount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getColumnCount'");
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getValueAt'");
    }

    @Override
    public String getColumnName(int column) {
        // TODO Auto-generated method stub
        return super.getColumnName(column);
    }

}
