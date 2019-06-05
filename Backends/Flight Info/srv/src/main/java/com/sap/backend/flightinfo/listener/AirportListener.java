package com.sap.backend.flightinfo.listener;

import com.sap.cloud.server.odata.*;

public class AirportListener extends com.sap.cloud.server.odata.DefaultEntityListener {
    private com.sap.backend.flightinfo.MainServlet servlet;
    private com.sap.backend.flightinfo.proxy.FlightinfoService service;

    public AirportListener(com.sap.backend.flightinfo.MainServlet servlet, com.sap.backend.flightinfo.proxy.FlightinfoService service) {
        super();
        this.servlet = servlet;
        this.service = service;
    }

    @Override public void beforeQuery(DataQuery query) {
    }

    public void beforeSave(EntityValue entityValue) {
        com.sap.backend.flightinfo.proxy.Airport entity = (com.sap.backend.flightinfo.proxy.Airport)entityValue;
        // Shared code for beforeCreate / beforeUpdate.
    }

    @Override public void beforeCreate(EntityValue entityValue) {
        com.sap.backend.flightinfo.proxy.Airport entity = (com.sap.backend.flightinfo.proxy.Airport)entityValue;
        beforeSave(entity);
    }

    @Override public void beforeUpdate(EntityValue entityValue) {
        com.sap.backend.flightinfo.proxy.Airport entity = (com.sap.backend.flightinfo.proxy.Airport)entityValue;
        beforeSave(entity);
    }

    @Override public void beforeDelete(EntityValue entityValue) {
        com.sap.backend.flightinfo.proxy.Airport entity = (com.sap.backend.flightinfo.proxy.Airport)entityValue;
    }

    public void afterSave(EntityValue entityValue) {
        // Shared code for afterCreate / afterUpdate.
        com.sap.backend.flightinfo.proxy.Airport entity = (com.sap.backend.flightinfo.proxy.Airport)entityValue;
    }

    @Override public void afterCreate(EntityValue entityValue) {
        com.sap.backend.flightinfo.proxy.Airport entity = (com.sap.backend.flightinfo.proxy.Airport)entityValue;
        afterSave(entity);
    }

    @Override public void afterUpdate(EntityValue entityValue) {
        com.sap.backend.flightinfo.proxy.Airport entity = (com.sap.backend.flightinfo.proxy.Airport)entityValue;
        afterSave(entity);
    }

    @Override public void afterDelete(EntityValue entityValue) {
        com.sap.backend.flightinfo.proxy.Airport entity = (com.sap.backend.flightinfo.proxy.Airport)entityValue;
    }
}
