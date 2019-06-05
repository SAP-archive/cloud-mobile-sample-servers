//# xsc 19.4.0-0adeb1-20190425

package com.sap.backend.carinfo.proxy.internal;

public abstract class CarinfoServiceFactory
{
    public static void registerAll()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:341:12
        com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.reading.registerFactory(new com.sap.backend.carinfo.proxy.internal.CarinfoServiceFactory.CreateReading());
        com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.vehicle.registerFactory(new com.sap.backend.carinfo.proxy.internal.CarinfoServiceFactory.CreateVehicle());
    }

    public static class CreateReading
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:361:9
            return new com.sap.backend.carinfo.proxy.Reading(false);
        }
    }

    public static class CreateVehicle
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:371:9
            return new com.sap.backend.carinfo.proxy.Vehicle(false);
        }
    }
}
