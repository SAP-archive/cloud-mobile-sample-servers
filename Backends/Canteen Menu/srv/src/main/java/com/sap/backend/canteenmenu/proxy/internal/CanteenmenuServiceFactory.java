//# xsc 19.4.0-0adeb1-20190425

package com.sap.backend.canteenmenu.proxy.internal;

public abstract class CanteenmenuServiceFactory
{
    public static void registerAll()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:371:12
        com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.canteen.registerFactory(new com.sap.backend.canteenmenu.proxy.internal.CanteenmenuServiceFactory.CreateCanteen());
        com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.menu.registerFactory(new com.sap.backend.canteenmenu.proxy.internal.CanteenmenuServiceFactory.CreateMenu());
    }

    public static class CreateCanteen
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:391:9
            return new com.sap.backend.canteenmenu.proxy.Canteen(false);
        }
    }

    public static class CreateMenu
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:401:9
            return new com.sap.backend.canteenmenu.proxy.Menu(false);
        }
    }
}
