//# xsc 19.4.0-0adeb1-20190425

package com.sap.backend.carinfo.proxy.internal;

public abstract class CarinfoServiceMetadataParser
{
    public static final int options = (com.sap.cloud.server.odata.csdl.CsdlOption.ALLOW_CASE_CONFLICTS | com.sap.cloud.server.odata.csdl.CsdlOption.DISABLE_FACET_WARNINGS | com.sap.cloud.server.odata.csdl.CsdlOption.DISABLE_NAME_VALIDATION | com.sap.cloud.server.odata.csdl.CsdlOption.PROCESS_MIXED_VERSIONS | com.sap.cloud.server.odata.csdl.CsdlOption.RETAIN_ORIGINAL_TEXT | com.sap.cloud.server.odata.csdl.CsdlOption.IGNORE_UNDEFINED_TERMS);

    public static final com.sap.cloud.server.odata.csdl.CsdlDocument parsed = com.sap.backend.carinfo.proxy.internal.CarinfoServiceMetadataParser.parse();

    public static com.sap.cloud.server.odata.csdl.CsdlDocument parse()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:301:12
        final com.sap.cloud.server.odata.csdl.CsdlParser parser = new com.sap.cloud.server.odata.csdl.CsdlParser();
        parser.setLogWarnings(false);
        parser.setCsdlOptions(com.sap.backend.carinfo.proxy.internal.CarinfoServiceMetadataParser.options);
        final com.sap.cloud.server.odata.csdl.CsdlDocument metadata = parser.parseInProxy(com.sap.backend.carinfo.proxy.internal.CarinfoServiceMetadataText.XML, "com.sap.backend.carinfo");
        metadata.setProxyVersion("19.4.0-0adeb1-20190425");
        return metadata;
    }
}
