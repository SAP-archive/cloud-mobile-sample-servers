//# xsc 19.4.0-0adeb1-20190425

package com.sap.backend.carinfo.proxy;

public abstract class CarinfoServiceMetadata
{
    public static final com.sap.cloud.server.odata.csdl.CsdlDocument document = com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.resolve();

    private static com.sap.cloud.server.odata.csdl.CsdlDocument resolve()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:331:12
        com.sap.backend.carinfo.proxy.internal.CarinfoServiceFactory.registerAll();
        com.sap.backend.carinfo.proxy.internal.CarinfoServiceMetadataParser.parsed.setGeneratedProxies(true);
        return com.sap.backend.carinfo.proxy.internal.CarinfoServiceMetadataParser.parsed;
    }

    public abstract static class EntityTypes
    {
        public static final com.sap.cloud.server.odata.EntityType reading = com.sap.backend.carinfo.proxy.internal.CarinfoServiceMetadataParser.parsed.getEntityType("com.sap.backend.carinfo.Reading");

        public static final com.sap.cloud.server.odata.EntityType vehicle = com.sap.backend.carinfo.proxy.internal.CarinfoServiceMetadataParser.parsed.getEntityType("com.sap.backend.carinfo.Vehicle");
    }

    public abstract static class EntitySets
    {
        public static final com.sap.cloud.server.odata.EntitySet readingSet = com.sap.backend.carinfo.proxy.internal.CarinfoServiceMetadataParser.parsed.getEntitySet("ReadingSet");

        public static final com.sap.cloud.server.odata.EntitySet vehicleSet = com.sap.backend.carinfo.proxy.internal.CarinfoServiceMetadataParser.parsed.getEntitySet("VehicleSet");
    }
}
