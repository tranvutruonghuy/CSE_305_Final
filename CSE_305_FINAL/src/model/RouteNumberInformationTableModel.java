package model;

import java.util.*;

import javax.swing.table.AbstractTableModel;

//2
public class RouteNumberInformationTableModel extends AbstractTableModel {

    private String[] columnHeaders = {"Route Number", "Departure Station", "Destination Station", "Departure Time"};
    private List<Object[]> listOfRows = new ArrayList<>();

    public RouteNumberInformationTableModel(HashMap<Integer, List<BusStop>> hm) {
        List<Integer> hmKeys = new ArrayList<>(hm.keySet());
        for (int i = 0; i < hmKeys.size(); i++) {
            int routeNum = hmKeys.get(i);
            List<BusStop> list = hm.get(routeNum);
            for (int j = 0; j < list.size(); j++) {
//                Object[] row = { routeNum, list.get(j).getBusStopName(),
//                        list.get((j + 1) % list.size()).getBusStopName(), list.get(j).getTimeByRouteNum(routeNum) };
                Object[] row = {routeNum, list.get(j).getBusStopName(),
                    list.get(j).findDestinationNameByRouteNum(routeNum), list.get(j).getTimeByRouteNum(routeNum)};
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
