// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of listener registration in the ProviderSettings class.

package com.sap.backend.canteenmenu.base;

import com.sap.cloud.server.odata.*;

class RegisterListeners {
    private static EntityListener canteenListener;
    private static EntityListener menuListener;

    public static void withServlet(com.sap.backend.canteenmenu.MainServlet servlet) {
        com.sap.backend.canteenmenu.proxy.CanteenmenuService service = (com.sap.backend.canteenmenu.proxy.CanteenmenuService)servlet.getDataService();
        canteenListener = new com.sap.backend.canteenmenu.listener.CanteenListener(servlet, service);
        menuListener = new com.sap.backend.canteenmenu.listener.MenuListener(servlet, service);
        servlet.registerEntityListener(com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.canteen, canteenListener);
        servlet.registerEntityListener(com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.menu, menuListener);
    }
}
