package com.sap.backend.carinfo.handler;

import com.sap.cloud.server.odata.*;

public class VehicleHandler extends com.sap.cloud.server.odata.DefaultEntityHandler {
    private com.sap.backend.carinfo.MainServlet servlet;
    private com.sap.backend.carinfo.proxy.CarinfoService service;

    
    public VehicleHandler(com.sap.backend.carinfo.MainServlet servlet, com.sap.backend.carinfo.proxy.CarinfoService service) {
        super(servlet, service);
        this.servlet = servlet;
        this.service = service;
    }

    @Override public DataValue executeQuery(DataQuery query) {
        return service.executeQuery(query).getResult();
    }

    @Override public void createEntity(EntityValue entityValue) {
        com.sap.backend.carinfo.proxy.Vehicle entity = (com.sap.backend.carinfo.proxy.Vehicle)entityValue;
        service.createEntity(entity);
    }

    @Override public void updateEntity(EntityValue entityValue) {
        com.sap.backend.carinfo.proxy.Vehicle entity = (com.sap.backend.carinfo.proxy.Vehicle)entityValue;
        service.updateEntity(entity);
    }

    @Override public void deleteEntity(EntityValue entityValue) {
        com.sap.backend.carinfo.proxy.Vehicle entity = (com.sap.backend.carinfo.proxy.Vehicle)entityValue;
        service.deleteEntity(entity);
    }
}
