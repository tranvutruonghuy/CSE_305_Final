package model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

// 1
public class AllRoutesFromAToBTableModel extends AbstractTableModel {
    private String[] columnHeaders = { "Total Stations", "Departure Time", "Departure Station", "Transfer Stations",
            "Destination Station" };
    private List<Object[]> listOfRows = new ArrayList<>();

    public AllRoutesFromAToBTableModel(List<List<BusStop>> getAllRoutesFromAToB) {
        for (List<BusStop> routeFromAtoB : getAllRoutesFromAToB) {
            String transferStations = "";

            for (int i = 1; i < routeFromAtoB.size() - 1; i++) {
                transferStations += routeFromAtoB.get(i).getBusStopName() + "  ";       
            }
            Object[] row = { routeFromAtoB.size(),
                    routeFromAtoB.get(0)
                            .getTimeByRouteNum(routeFromAtoB.get(0).findRouteNumByDestinationBusNum(routeFromAtoB.get(1).getBusStopNumber())),
                    routeFromAtoB.get(0).getBusStopName(), transferStations,
                    routeFromAtoB.get(routeFromAtoB.size() - 1).getBusStopName() };
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
