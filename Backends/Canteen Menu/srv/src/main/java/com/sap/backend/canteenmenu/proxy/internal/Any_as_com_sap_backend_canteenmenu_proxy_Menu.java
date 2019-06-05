//# xsc 19.4.0-0adeb1-20190425

package com.sap.backend.canteenmenu.proxy.internal;

public abstract class Any_as_com_sap_backend_canteenmenu_proxy_Menu
{
    public static com.sap.backend.canteenmenu.proxy.Menu cast(final Object value)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:721:32 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:88:16 => /usr/sap/ljs/xs-temp/xs-home/templates/Any.as.xs:7:12
        if (value instanceof com.sap.backend.canteenmenu.proxy.Menu)
        {
            final com.sap.backend.canteenmenu.proxy.Menu var_value = ((com.sap.backend.canteenmenu.proxy.Menu)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.sap.backend.canteenmenu.proxy.Menu");
        }
    }
}
