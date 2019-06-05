// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of listener registration in the ProviderSettings class.

package com.sap.backend.flightinfo.base;

import com.sap.cloud.server.odata.*;

class RegisterListeners {
    private static EntityListener airportListener;
    private static EntityListener flightListener;

    public static void withServlet(com.sap.backend.flightinfo.MainServlet servlet) {
        com.sap.backend.flightinfo.proxy.FlightinfoService service = (com.sap.backend.flightinfo.proxy.FlightinfoService)servlet.getDataService();
        airportListener = new com.sap.backend.flightinfo.listener.AirportListener(servlet, service);
        flightListener = new com.sap.backend.flightinfo.listener.FlightListener(servlet, service);
        servlet.registerEntityListener(com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.airport, airportListener);
        servlet.registerEntityListener(com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.flight, flightListener);
    }
}
