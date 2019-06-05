//# xsc 19.4.0-0adeb1-20190425

package com.sap.backend.carinfo.proxy.internal;

public abstract class Any_as_com_sap_backend_carinfo_proxy_Reading
{
    public static com.sap.backend.carinfo.proxy.Reading cast(final Object value)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:677:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:88:16 => /usr/sap/ljs/xs-temp/xs-home/templates/Any.as.xs:7:12
        if (value instanceof com.sap.backend.carinfo.proxy.Reading)
        {
            final com.sap.backend.carinfo.proxy.Reading var_value = ((com.sap.backend.carinfo.proxy.Reading)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.sap.backend.carinfo.proxy.Reading");
        }
    }
}
