package com.sap.backend.canteenmenu.listener;

import com.sap.cloud.server.odata.*;

public class MenuListener extends com.sap.cloud.server.odata.DefaultEntityListener {
    private com.sap.backend.canteenmenu.MainServlet servlet;
    private com.sap.backend.canteenmenu.proxy.CanteenmenuService service;

    public MenuListener(com.sap.backend.canteenmenu.MainServlet servlet, com.sap.backend.canteenmenu.proxy.CanteenmenuService service) {
        super();
        this.servlet = servlet;
        this.service = service;
    }

    @Override public void beforeQuery(DataQuery query) {
    }

    public void beforeSave(EntityValue entityValue) {
        com.sap.backend.canteenmenu.proxy.Menu entity = (com.sap.backend.canteenmenu.proxy.Menu)entityValue;
        // Shared code for beforeCreate / beforeUpdate.
    }

    @Override public void beforeCreate(EntityValue entityValue) {
        com.sap.backend.canteenmenu.proxy.Menu entity = (com.sap.backend.canteenmenu.proxy.Menu)entityValue;
        beforeSave(entity);
    }

    @Override public void beforeUpdate(EntityValue entityValue) {
        com.sap.backend.canteenmenu.proxy.Menu entity = (com.sap.backend.canteenmenu.proxy.Menu)entityValue;
        beforeSave(entity);
    }

    @Override public void beforeDelete(EntityValue entityValue) {
        com.sap.backend.canteenmenu.proxy.Menu entity = (com.sap.backend.canteenmenu.proxy.Menu)entityValue;
    }

    public void afterSave(EntityValue entityValue) {
        // Shared code for afterCreate / afterUpdate.
        com.sap.backend.canteenmenu.proxy.Menu entity = (com.sap.backend.canteenmenu.proxy.Menu)entityValue;
    }

    @Override public void afterCreate(EntityValue entityValue) {
        com.sap.backend.canteenmenu.proxy.Menu entity = (com.sap.backend.canteenmenu.proxy.Menu)entityValue;
        afterSave(entity);
    }

    @Override public void afterUpdate(EntityValue entityValue) {
        com.sap.backend.canteenmenu.proxy.Menu entity = (com.sap.backend.canteenmenu.proxy.Menu)entityValue;
        afterSave(entity);
    }

    @Override public void afterDelete(EntityValue entityValue) {
        com.sap.backend.canteenmenu.proxy.Menu entity = (com.sap.backend.canteenmenu.proxy.Menu)entityValue;
    }
}
