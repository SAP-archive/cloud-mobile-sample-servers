package com.sap.backend.flightinfo.handler;

import com.sap.cloud.server.odata.*;

public class FlightHandler extends com.sap.cloud.server.odata.DefaultEntityHandler {
    private com.sap.backend.flightinfo.MainServlet servlet;
    private com.sap.backend.flightinfo.proxy.FlightinfoService service;

    
    public FlightHandler(com.sap.backend.flightinfo.MainServlet servlet, com.sap.backend.flightinfo.proxy.FlightinfoService service) {
        super(servlet, service);
        this.servlet = servlet;
        this.service = service;
    }

    @Override public DataValue executeQuery(DataQuery query) {
        return service.executeQuery(query).getResult();
    }

    @Override public void createEntity(EntityValue entityValue) {
        com.sap.backend.flightinfo.proxy.Flight entity = (com.sap.backend.flightinfo.proxy.Flight)entityValue;
        service.createEntity(entity);
    }

    @Override public void updateEntity(EntityValue entityValue) {
        com.sap.backend.flightinfo.proxy.Flight entity = (com.sap.backend.flightinfo.proxy.Flight)entityValue;
        service.updateEntity(entity);
    }

    @Override public void deleteEntity(EntityValue entityValue) {
        com.sap.backend.flightinfo.proxy.Flight entity = (com.sap.backend.flightinfo.proxy.Flight)entityValue;
        service.deleteEntity(entity);
    }
}
