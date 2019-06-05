package com.sap.backend.carinfo.listener;

import com.sap.cloud.server.odata.*;

public class VehicleListener extends com.sap.cloud.server.odata.DefaultEntityListener {
    private com.sap.backend.carinfo.MainServlet servlet;
    private com.sap.backend.carinfo.proxy.CarinfoService service;

    public VehicleListener(com.sap.backend.carinfo.MainServlet servlet, com.sap.backend.carinfo.proxy.CarinfoService service) {
        super();
        this.servlet = servlet;
        this.service = service;
    }

    @Override public void beforeQuery(DataQuery query) {
    }

    public void beforeSave(EntityValue entityValue) {
        com.sap.backend.carinfo.proxy.Vehicle entity = (com.sap.backend.carinfo.proxy.Vehicle)entityValue;
        // Shared code for beforeCreate / beforeUpdate.
    }

    @Override public void beforeCreate(EntityValue entityValue) {
        com.sap.backend.carinfo.proxy.Vehicle entity = (com.sap.backend.carinfo.proxy.Vehicle)entityValue;
        beforeSave(entity);
    }

    @Override public void beforeUpdate(EntityValue entityValue) {
        com.sap.backend.carinfo.proxy.Vehicle entity = (com.sap.backend.carinfo.proxy.Vehicle)entityValue;
        beforeSave(entity);
    }

    @Override public void beforeDelete(EntityValue entityValue) {
        com.sap.backend.carinfo.proxy.Vehicle entity = (com.sap.backend.carinfo.proxy.Vehicle)entityValue;
    }

    public void afterSave(EntityValue entityValue) {
        // Shared code for afterCreate / afterUpdate.
        com.sap.backend.carinfo.proxy.Vehicle entity = (com.sap.backend.carinfo.proxy.Vehicle)entityValue;
    }

    @Override public void afterCreate(EntityValue entityValue) {
        com.sap.backend.carinfo.proxy.Vehicle entity = (com.sap.backend.carinfo.proxy.Vehicle)entityValue;
        afterSave(entity);
    }

    @Override public void afterUpdate(EntityValue entityValue) {
        com.sap.backend.carinfo.proxy.Vehicle entity = (com.sap.backend.carinfo.proxy.Vehicle)entityValue;
        afterSave(entity);
    }

    @Override public void afterDelete(EntityValue entityValue) {
        com.sap.backend.carinfo.proxy.Vehicle entity = (com.sap.backend.carinfo.proxy.Vehicle)entityValue;
    }
}
