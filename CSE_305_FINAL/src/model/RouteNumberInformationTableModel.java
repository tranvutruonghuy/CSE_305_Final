package model;

import java.util.*;

import javax.swing.table.AbstractTableModel;

public class RouteNumberInformationTableModel extends AbstractTableModel {
    private static final String Set = null;
    private String[] columnHeaders = { "Route Number", "From", "To", "Time" };
    private List<Object[]> listOfRows = new ArrayList<>();

    public RouteNumberInformationTableModel(HashMap<Integer, List<BusStop>> hm) {
        List<Integer> hmKeys = new ArrayList<>(hm.keySet());
        for (int i = 0; i < hmKeys.size(); i++) {
            int routeNum = hmKeys.get(i);
            List<BusStop> list = hm.get(routeNum);
            for (int j = 0; j < list.size(); j++) {
                Object[] row = { routeNum, list.get(i).getBusStopName(),
                        list.get((i + 1) % list.size()).getBusStopName(), list.get(i).getTimeByRouteNum(routeNum) };
                listOfRows.add(row);
            }
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
