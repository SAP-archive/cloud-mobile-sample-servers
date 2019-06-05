// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of handler registration in the ProviderSettings class.

package com.sap.backend.flightinfo.base;

import com.sap.cloud.server.odata.*;

class RegisterHandlers {
    private static EntityHandler handler_Airport;
    private static EntityHandler handler_Flight;

    public static void withServlet(com.sap.backend.flightinfo.MainServlet servlet) {
        com.sap.backend.flightinfo.proxy.FlightinfoService service = (com.sap.backend.flightinfo.proxy.FlightinfoService)servlet.getDataService();
        handler_Airport = new com.sap.backend.flightinfo.handler.AirportHandler(servlet, service);
        handler_Flight = new com.sap.backend.flightinfo.handler.FlightHandler(servlet, service);
        servlet.registerEntityHandler(com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.airport, handler_Airport);
        servlet.registerEntityHandler(com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.flight, handler_Flight);
    }
}
