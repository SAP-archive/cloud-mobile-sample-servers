// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of listener registration in the ProviderSettings class.

package com.sap.backend.carinfo.base;

import com.sap.cloud.server.odata.*;

class RegisterListeners {
    private static EntityListener readingListener;
    private static EntityListener vehicleListener;

    public static void withServlet(com.sap.backend.carinfo.MainServlet servlet) {
        com.sap.backend.carinfo.proxy.CarinfoService service = (com.sap.backend.carinfo.proxy.CarinfoService)servlet.getDataService();
        readingListener = new com.sap.backend.carinfo.listener.ReadingListener(servlet, service);
        vehicleListener = new com.sap.backend.carinfo.listener.VehicleListener(servlet, service);
        servlet.registerEntityListener(com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.reading, readingListener);
        servlet.registerEntityListener(com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.vehicle, vehicleListener);
    }
}
