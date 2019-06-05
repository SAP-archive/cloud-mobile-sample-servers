//# xsc 19.4.0-0adeb1-20190425

package com.sap.backend.canteenmenu.proxy;

public class Menu
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property canteenID = com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.menu.getProperty("CanteenID");

    public static final com.sap.cloud.server.odata.Property dessert = com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.menu.getProperty("Dessert");

    public static final com.sap.cloud.server.odata.Property mainDish = com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.menu.getProperty("MainDish");

    public static final com.sap.cloud.server.odata.Property menuID = com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.menu.getProperty("MenuID");

    public static final com.sap.cloud.server.odata.Property sides = com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.menu.getProperty("Sides");

    public static final com.sap.cloud.server.odata.Property soup = com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.menu.getProperty("Soup");

    public static final com.sap.cloud.server.odata.Property vegan = com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.menu.getProperty("Vegan");

    public static final com.sap.cloud.server.odata.Property vegetarian = com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.menu.getProperty("Vegetarian");

    public static final com.sap.cloud.server.odata.Property dateOfLunch = com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.menu.getProperty("dateOfLunch");

    public static final com.sap.cloud.server.odata.Property kcalForMain = com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.menu.getProperty("kcalForMain");

    public static final com.sap.cloud.server.odata.Property canteen = com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.menu.getProperty("Canteen");

    public Menu()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:141:5
        this(true);
    }

    public Menu(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:141:5
        super(withDefaults, com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntityTypes.menu);
    }

    public com.sap.backend.canteenmenu.proxy.Menu copy()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:126:5
        return com.sap.backend.canteenmenu.proxy.internal.Any_as_com_sap_backend_canteenmenu_proxy_Menu.cast(this.copyEntity());
    }

    public com.sap.backend.canteenmenu.proxy.Canteen getCanteen()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:306:5
        return com.sap.backend.canteenmenu.proxy.internal.Any_as_com_sap_backend_canteenmenu_proxy_Canteen.cast(this.getDataValue(com.sap.backend.canteenmenu.proxy.Menu.canteen));
    }

    public long getCanteenID()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:176:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.backend.canteenmenu.proxy.Menu.canteenID));
    }

    public com.sap.cloud.server.odata.LocalDateTime getDateOfLunch()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:280:5
        return com.sap.cloud.server.odata.LocalDateTime.castRequired(this.getDataValue(com.sap.backend.canteenmenu.proxy.Menu.dateOfLunch));
    }

    public String getDessert()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:189:5
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.backend.canteenmenu.proxy.Menu.dessert));
    }

    public Integer getKcalForMain()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:293:5
        return com.sap.cloud.server.odata.IntValue.toNullable(this.getDataValue(com.sap.backend.canteenmenu.proxy.Menu.kcalForMain));
    }

    public String getMainDish()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:202:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.backend.canteenmenu.proxy.Menu.mainDish));
    }

    public long getMenuID()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:215:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.backend.canteenmenu.proxy.Menu.menuID));
    }

    public com.sap.backend.canteenmenu.proxy.Menu getOld()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:121:5
        return com.sap.backend.canteenmenu.proxy.internal.Any_as_com_sap_backend_canteenmenu_proxy_Menu.cast(this.getOldEntity());
    }

    public String getSides()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:228:5
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.backend.canteenmenu.proxy.Menu.sides));
    }

    public String getSoup()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:241:5
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.backend.canteenmenu.proxy.Menu.soup));
    }

    public Boolean getVegan()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:254:5
        return com.sap.cloud.server.odata.BooleanValue.toNullable(this.getDataValue(com.sap.backend.canteenmenu.proxy.Menu.vegan));
    }

    public Boolean getVegetarian()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:267:5
        return com.sap.cloud.server.odata.BooleanValue.toNullable(this.getDataValue(com.sap.backend.canteenmenu.proxy.Menu.vegetarian));
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:114:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long menuID)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:131:12
        return new com.sap.cloud.server.odata.EntityKey().with("MenuID", com.sap.cloud.server.odata.LongValue.of(menuID));
    }

    public static com.sap.backend.canteenmenu.proxy.MenuList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:136:12
        return com.sap.backend.canteenmenu.proxy.MenuList.share(from);
    }

    public void setCanteen(final com.sap.backend.canteenmenu.proxy.Canteen value)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:311:5
        this.setDataValue(com.sap.backend.canteenmenu.proxy.Menu.canteen, value);
    }

    public void setCanteenID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:181:5
        this.setDataValue(com.sap.backend.canteenmenu.proxy.Menu.canteenID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setDateOfLunch(final com.sap.cloud.server.odata.LocalDateTime value)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:285:5
        this.setDataValue(com.sap.backend.canteenmenu.proxy.Menu.dateOfLunch, value);
    }

    public void setDessert(final String value)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:194:5
        this.setDataValue(com.sap.backend.canteenmenu.proxy.Menu.dessert, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setKcalForMain(final Integer value)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:298:5
        this.setDataValue(com.sap.backend.canteenmenu.proxy.Menu.kcalForMain, com.sap.cloud.server.odata.IntValue.ofNullable(value));
    }

    public void setMainDish(final String value)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:207:5
        this.setDataValue(com.sap.backend.canteenmenu.proxy.Menu.mainDish, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setMenuID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:220:5
        this.setDataValue(com.sap.backend.canteenmenu.proxy.Menu.menuID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setSides(final String value)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:233:5
        this.setDataValue(com.sap.backend.canteenmenu.proxy.Menu.sides, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setSoup(final String value)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:246:5
        this.setDataValue(com.sap.backend.canteenmenu.proxy.Menu.soup, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setVegan(final Boolean value)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:259:5
        this.setDataValue(com.sap.backend.canteenmenu.proxy.Menu.vegan, com.sap.cloud.server.odata.BooleanValue.ofNullable(value));
    }

    public void setVegetarian(final Boolean value)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:272:5
        this.setDataValue(com.sap.backend.canteenmenu.proxy.Menu.vegetarian, com.sap.cloud.server.odata.BooleanValue.ofNullable(value));
    }
}
