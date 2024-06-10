package utils;

import java.util.ArrayList;
import java.util.List;
import model.BusStop;
import model.Route;

public class HandleBusGraphTool {
    public static void resetVisitStatus(List<BusStop> busStopList) {
        for (BusStop bs : busStopList) {
            bs.setVisited(false);
        }
    }

    public static void dfs(BusStop a, BusStop b, List<List<BusStop>> allRoutes, List<BusStop> route) {
        route.add(a);
        a.setVisited(true);
        if (a.getBusStopNumber() == b.getBusStopNumber()) {
            List<BusStop> newRoute = new ArrayList<>();
            newRoute.addAll(route);
            allRoutes.add(newRoute);
        } else {
            for (Route e : a.getAdjacentBusStopList()) {
                if (!e.getEndBusStop().isVisited()) {
                    dfs(e.getEndBusStop(), b, allRoutes, route);
                }
            }
        }
        a.setVisited(false);
        route.remove(route.size()-1);
    }
}
