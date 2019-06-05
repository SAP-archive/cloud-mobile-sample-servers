package com.sap.backend.canteenmenu.handler;

import com.sap.cloud.server.odata.*;

public class MenuHandler extends com.sap.cloud.server.odata.DefaultEntityHandler {
    private com.sap.backend.canteenmenu.MainServlet servlet;
    private com.sap.backend.canteenmenu.proxy.CanteenmenuService service;

    
    public MenuHandler(com.sap.backend.canteenmenu.MainServlet servlet, com.sap.backend.canteenmenu.proxy.CanteenmenuService service) {
        super(servlet, service);
        this.servlet = servlet;
        this.service = service;
    }

    @Override public DataValue executeQuery(DataQuery query) {
        return service.executeQuery(query).getResult();
    }

    @Override public void createEntity(EntityValue entityValue) {
        com.sap.backend.canteenmenu.proxy.Menu entity = (com.sap.backend.canteenmenu.proxy.Menu)entityValue;
        service.createEntity(entity);
    }

    @Override public void updateEntity(EntityValue entityValue) {
        com.sap.backend.canteenmenu.proxy.Menu entity = (com.sap.backend.canteenmenu.proxy.Menu)entityValue;
        service.updateEntity(entity);
    }

    @Override public void deleteEntity(EntityValue entityValue) {
        com.sap.backend.canteenmenu.proxy.Menu entity = (com.sap.backend.canteenmenu.proxy.Menu)entityValue;
        service.deleteEntity(entity);
    }
}
