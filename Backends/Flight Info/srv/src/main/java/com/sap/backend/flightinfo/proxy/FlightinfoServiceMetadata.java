//# xsc 19.4.0-0adeb1-20190425

package com.sap.backend.flightinfo.proxy;

public abstract class FlightinfoServiceMetadata
{
    public static final com.sap.cloud.server.odata.csdl.CsdlDocument document = com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.resolve();

    private static com.sap.cloud.server.odata.csdl.CsdlDocument resolve()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:421:12
        com.sap.backend.flightinfo.proxy.internal.FlightinfoServiceFactory.registerAll();
        com.sap.backend.flightinfo.proxy.internal.FlightinfoServiceMetadataParser.parsed.setGeneratedProxies(true);
        return com.sap.backend.flightinfo.proxy.internal.FlightinfoServiceMetadataParser.parsed;
    }

    public abstract static class EntityTypes
    {
        public static final com.sap.cloud.server.odata.EntityType airport = com.sap.backend.flightinfo.proxy.internal.FlightinfoServiceMetadataParser.parsed.getEntityType("com.sap.backend.flightinfo.Airport");

        public static final com.sap.cloud.server.odata.EntityType flight = com.sap.backend.flightinfo.proxy.internal.FlightinfoServiceMetadataParser.parsed.getEntityType("com.sap.backend.flightinfo.Flight");
    }

    public abstract static class EntitySets
    {
        public static final com.sap.cloud.server.odata.EntitySet airportSet = com.sap.backend.flightinfo.proxy.internal.FlightinfoServiceMetadataParser.parsed.getEntitySet("AirportSet");

        public static final com.sap.cloud.server.odata.EntitySet flightSet = com.sap.backend.flightinfo.proxy.internal.FlightinfoServiceMetadataParser.parsed.getEntitySet("FlightSet");
    }
}
