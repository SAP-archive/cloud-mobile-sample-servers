//# xsc 19.4.0-0adeb1-20190425

package com.sap.backend.flightinfo.proxy.internal;

public abstract class FlightinfoServiceFactory
{
    public static void registerAll()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:431:12
        com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.airport.registerFactory(new com.sap.backend.flightinfo.proxy.internal.FlightinfoServiceFactory.CreateAirport());
        com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.flight.registerFactory(new com.sap.backend.flightinfo.proxy.internal.FlightinfoServiceFactory.CreateFlight());
    }

    public static class CreateAirport
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:451:9
            return new com.sap.backend.flightinfo.proxy.Airport(false);
        }
    }

    public static class CreateFlight
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:461:9
            return new com.sap.backend.flightinfo.proxy.Flight(false);
        }
    }
}
