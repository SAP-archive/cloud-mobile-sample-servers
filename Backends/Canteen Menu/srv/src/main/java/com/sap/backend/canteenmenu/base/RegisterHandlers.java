// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of handler registration in the ProviderSettings class.

package com.sap.backend.canteenmenu.base;

import com.sap.cloud.server.odata.*;

class RegisterHandlers {
    private static EntityHandler handler_Canteen;
    private static EntityHandler handler_Menu;

    public static void withServlet(com.sap.backend.canteenmenu.MainServlet servlet) {
        com.sap.backend.canteenmenu.proxy.CanteenmenuService service = (com.sap.backend.canteenmenu.proxy.CanteenmenuService)servlet.getDataService();
        handler_Canteen = new com.sap.backend.canteenmenu.handler.CanteenHandler(servlet, service);
        handler_Menu = new com.sap.backend.canteenmenu.handler.MenuHandler(servlet, service);
        servlet.registerEntityHandler(com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.canteen, handler_Canteen);
        servlet.registerEntityHandler(com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.menu, handler_Menu);
    }
}
