package model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

// 3
public class AssociatedRouteOfABusSop extends AbstractTableModel {
    private String[] columnHeaders = { "Route Number", "Departure Station", "Destination Station", "Departure Time" };
    private List<Object[]> listOfRows = new ArrayList<>();

    public AssociatedRouteOfABusSop(List<BusStop> associatedRoutesByBusNumber) {
        for (Route r : associatedRoutesByBusNumber.get(0).getAdjacentBusStopList()) {
            Object[] row = { r.getRouteNum(), associatedRoutesByBusNumber.get(0).getBusStopName(),
                    r.getEndBusStop().getBusStopName(),
                    associatedRoutesByBusNumber.get(0).getTimeByRouteNum(r.getRouteNum()) };
            listOfRows.add(row);
        }
        for (int i = 1; i < associatedRoutesByBusNumber.size(); i++) {
            int routeNum = associatedRoutesByBusNumber.get(i)
                    .findRouteNumByDestinationBusNum(associatedRoutesByBusNumber.get(0).getBusStopNumber());
            Object[] row = { routeNum, associatedRoutesByBusNumber.get(i).getBusStopName(),
                    associatedRoutesByBusNumber.get(0).getBusStopName(),
                    associatedRoutesByBusNumber.get(i).getTimeByRouteNum(routeNum) };
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
