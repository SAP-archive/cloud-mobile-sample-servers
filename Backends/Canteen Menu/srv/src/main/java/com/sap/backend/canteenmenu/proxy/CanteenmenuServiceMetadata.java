//# xsc 19.4.0-0adeb1-20190425

package com.sap.backend.canteenmenu.proxy;

public abstract class CanteenmenuServiceMetadata
{
    public static final com.sap.cloud.server.odata.csdl.CsdlDocument document = com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.resolve();

    private static com.sap.cloud.server.odata.csdl.CsdlDocument resolve()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:361:12
        com.sap.backend.canteenmenu.proxy.internal.CanteenmenuServiceFactory.registerAll();
        com.sap.backend.canteenmenu.proxy.internal.CanteenmenuServiceMetadataParser.parsed.setGeneratedProxies(true);
        return com.sap.backend.canteenmenu.proxy.internal.CanteenmenuServiceMetadataParser.parsed;
    }

    public abstract static class EntityTypes
    {
        public static final com.sap.cloud.server.odata.EntityType canteen = com.sap.backend.canteenmenu.proxy.internal.CanteenmenuServiceMetadataParser.parsed.getEntityType("com.sap.backend.canteenmenu.Canteen");

        public static final com.sap.cloud.server.odata.EntityType menu = com.sap.backend.canteenmenu.proxy.internal.CanteenmenuServiceMetadataParser.parsed.getEntityType("com.sap.backend.canteenmenu.Menu");
    }

    public abstract static class EntitySets
    {
        public static final com.sap.cloud.server.odata.EntitySet canteenSet = com.sap.backend.canteenmenu.proxy.internal.CanteenmenuServiceMetadataParser.parsed.getEntitySet("CanteenSet");

        public static final com.sap.cloud.server.odata.EntitySet menuSet = com.sap.backend.canteenmenu.proxy.internal.CanteenmenuServiceMetadataParser.parsed.getEntitySet("MenuSet");
    }
}
