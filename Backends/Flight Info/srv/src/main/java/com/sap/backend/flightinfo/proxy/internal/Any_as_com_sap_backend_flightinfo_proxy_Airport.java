//# xsc 19.4.0-0adeb1-20190425

package com.sap.backend.flightinfo.proxy.internal;

public abstract class Any_as_com_sap_backend_flightinfo_proxy_Airport
{
    public static com.sap.backend.flightinfo.proxy.Airport cast(final Object value)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:767:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:88:16 => /usr/sap/ljs/xs-temp/xs-home/templates/Any.as.xs:7:12
        if (value instanceof com.sap.backend.flightinfo.proxy.Airport)
        {
            final com.sap.backend.flightinfo.proxy.Airport var_value = ((com.sap.backend.flightinfo.proxy.Airport)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.sap.backend.flightinfo.proxy.Airport");
        }
    }
}
