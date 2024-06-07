package model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

// 4
public class BusStopNearByTableModel extends AbstractTableModel {
    private String[] columnHeaders = { "Route Number", "Departure Station", "Destination Station", "Departure Time" };
    private List<Object[]> listOfRows = new ArrayList<>();

    public BusStopNearByTableModel(List<BusStop> busStopNearby, int routeNum) {
        for (BusStop bs : busStopNearby) {
            Object[] row = { routeNum, bs.getBusStopName(), bs.findDestinationNameByRouteNum(routeNum),
                    bs.getTimeByRouteNum(routeNum) };
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
