// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of handler registration in the ProviderSettings class.

package com.sap.backend.carinfo.base;

import com.sap.cloud.server.odata.*;

class RegisterHandlers {
    private static EntityHandler handler_Reading;
    private static EntityHandler handler_Vehicle;

    public static void withServlet(com.sap.backend.carinfo.MainServlet servlet) {
        com.sap.backend.carinfo.proxy.CarinfoService service = (com.sap.backend.carinfo.proxy.CarinfoService)servlet.getDataService();
        handler_Reading = new com.sap.backend.carinfo.handler.ReadingHandler(servlet, service);
        handler_Vehicle = new com.sap.backend.carinfo.handler.VehicleHandler(servlet, service);
        servlet.registerEntityHandler(com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.reading, handler_Reading);
        servlet.registerEntityHandler(com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.vehicle, handler_Vehicle);
    }
}
