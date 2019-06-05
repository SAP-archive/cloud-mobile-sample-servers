//# xsc 19.4.0-0adeb1-20190425

package com.sap.backend.canteenmenu.proxy;

public class Canteen
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property canteenID = com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.canteen.getProperty("CanteenID");

    public static final com.sap.cloud.server.odata.Property location = com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.canteen.getProperty("Location");

    public static final com.sap.cloud.server.odata.Property name = com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.canteen.getProperty("Name");

    public static final com.sap.cloud.server.odata.Property menues = com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.canteen.getProperty("menues");

    public Canteen()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:35:5
        this(true);
    }

    public Canteen(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:35:5
        super(withDefaults, com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.canteen);
    }

    public com.sap.backend.canteenmenu.proxy.Canteen copy()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:20:5
        return com.sap.backend.canteenmenu.proxy.internal.Any_as_com_sap_backend_canteenmenu_proxy_Canteen.cast(this.copyEntity());
    }

    public long getCanteenID()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:56:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.backend.canteenmenu.proxy.Canteen.canteenID));
    }

    public String getLocation()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:69:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.backend.canteenmenu.proxy.Canteen.location));
    }

    public com.sap.backend.canteenmenu.proxy.MenuList getMenues()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:95:5
        return com.sap.backend.canteenmenu.proxy.MenuList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.sap.backend.canteenmenu.proxy.Canteen.menues)));
    }

    public String getName()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:82:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.backend.canteenmenu.proxy.Canteen.name));
    }

    public com.sap.backend.canteenmenu.proxy.Canteen getOld()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:15:5
        return com.sap.backend.canteenmenu.proxy.internal.Any_as_com_sap_backend_canteenmenu_proxy_Canteen.cast(this.getOldEntity());
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:8:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long canteenID)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:25:12
        return new com.sap.cloud.server.odata.EntityKey().with("CanteenID", com.sap.cloud.server.odata.LongValue.of(canteenID));
    }

    public static com.sap.backend.canteenmenu.proxy.CanteenList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:30:12
        return com.sap.backend.canteenmenu.proxy.CanteenList.share(from);
    }

    public void setCanteenID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:61:5
        this.setDataValue(com.sap.backend.canteenmenu.proxy.Canteen.canteenID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setLocation(final String value)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:74:5
        this.setDataValue(com.sap.backend.canteenmenu.proxy.Canteen.location, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setMenues(final com.sap.backend.canteenmenu.proxy.MenuList value)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:100:5
        com.sap.backend.canteenmenu.proxy.Canteen.menues.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }

    public void setName(final String value)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:87:5
        this.setDataValue(com.sap.backend.canteenmenu.proxy.Canteen.name, com.sap.cloud.server.odata.StringValue.of(value));
    }
}
