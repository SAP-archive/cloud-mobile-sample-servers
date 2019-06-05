//# xsc 19.4.0-0adeb1-20190425

package com.sap.backend.canteenmenu.proxy;

public class CanteenmenuService
    extends com.sap.cloud.server.odata.DataService
{
    public CanteenmenuService()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:424:5
        this(null);
    }

    public CanteenmenuService(final com.sap.cloud.server.odata.DataServiceProvider provider)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:424:5
        super(com.sap.cloud.server.odata.MetadataOnlyProvider.newIfNull(provider, "CanteenmenuService"));
        this.getProvider().setMetadata(com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.document);
    }

    public com.sap.backend.canteenmenu.proxy.Canteen getCanteen(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:436:5
        return this.getCanteen(query, null, null);
    }

    public com.sap.backend.canteenmenu.proxy.Canteen getCanteen(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:436:5
        return this.getCanteen(query, headers, null);
    }

    public com.sap.backend.canteenmenu.proxy.Canteen getCanteen(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:436:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.backend.canteenmenu.proxy.internal.Any_as_com_sap_backend_canteenmenu_proxy_Canteen.cast(this.executeQuery(query.fromDefault(com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntitySets.canteenSet), var_headers, var_options).getRequiredEntity());
    }

    public com.sap.backend.canteenmenu.proxy.CanteenList getCanteenSet()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:451:5
        return this.getCanteenSet(null, null, null);
    }

    public com.sap.backend.canteenmenu.proxy.CanteenList getCanteenSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:451:5
        return this.getCanteenSet(query, null, null);
    }

    public com.sap.backend.canteenmenu.proxy.CanteenList getCanteenSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:451:5
        return this.getCanteenSet(query, headers, null);
    }

    public com.sap.backend.canteenmenu.proxy.CanteenList getCanteenSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:451:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.backend.canteenmenu.proxy.Canteen.list(this.executeQuery(var_query.fromDefault(com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntitySets.canteenSet), var_headers, var_options).getEntityList());
    }

    public com.sap.backend.canteenmenu.proxy.Canteen getCanteenWithKey(final long canteenID)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:444:5
        return this.getCanteenWithKey(canteenID, null, null, null);
    }

    public com.sap.backend.canteenmenu.proxy.Canteen getCanteenWithKey(final long canteenID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:444:5
        return this.getCanteenWithKey(canteenID, query, null, null);
    }

    public com.sap.backend.canteenmenu.proxy.Canteen getCanteenWithKey(final long canteenID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:444:5
        return this.getCanteenWithKey(canteenID, query, headers, null);
    }

    public com.sap.backend.canteenmenu.proxy.Canteen getCanteenWithKey(final long canteenID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:444:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getCanteen(var_query.withKey(com.sap.backend.canteenmenu.proxy.Canteen.key(canteenID)), headers, options);
    }

    public com.sap.backend.canteenmenu.proxy.Menu getMenu(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:571:5
        return this.getMenu(query, null, null);
    }

    public com.sap.backend.canteenmenu.proxy.Menu getMenu(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:571:5
        return this.getMenu(query, headers, null);
    }

    public com.sap.backend.canteenmenu.proxy.Menu getMenu(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:571:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.backend.canteenmenu.proxy.internal.Any_as_com_sap_backend_canteenmenu_proxy_Menu.cast(this.executeQuery(query.fromDefault(com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntitySets.menuSet), var_headers, var_options).getRequiredEntity());
    }

    public com.sap.backend.canteenmenu.proxy.MenuList getMenuSet()
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:586:5
        return this.getMenuSet(null, null, null);
    }

    public com.sap.backend.canteenmenu.proxy.MenuList getMenuSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:586:5
        return this.getMenuSet(query, null, null);
    }

    public com.sap.backend.canteenmenu.proxy.MenuList getMenuSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:586:5
        return this.getMenuSet(query, headers, null);
    }

    public com.sap.backend.canteenmenu.proxy.MenuList getMenuSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:586:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.backend.canteenmenu.proxy.Menu.list(this.executeQuery(var_query.fromDefault(com.sap.backend.canteenmenu.proxy.CanteenmenuServiceMetadata.EntitySets.menuSet), var_headers, var_options).getEntityList());
    }

    public com.sap.backend.canteenmenu.proxy.Menu getMenuWithKey(final long menuID)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:579:5
        return this.getMenuWithKey(menuID, null, null, null);
    }

    public com.sap.backend.canteenmenu.proxy.Menu getMenuWithKey(final long menuID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:579:5
        return this.getMenuWithKey(menuID, query, null, null);
    }

    public com.sap.backend.canteenmenu.proxy.Menu getMenuWithKey(final long menuID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:579:5
        return this.getMenuWithKey(menuID, query, headers, null);
    }

    public com.sap.backend.canteenmenu.proxy.Menu getMenuWithKey(final long menuID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:579:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getMenu(var_query.withKey(com.sap.backend.canteenmenu.proxy.Menu.key(menuID)), headers, options);
    }

    @java.lang.Override public void refreshMetadata()
    {
        synchronized (this)
        {
            //# /usr/sap/ljs/xs-temp/184692b7-95f0-4b17-85f6-346a53248e54/output/target/tmp/proxy-com.sap.backend.canteenmenu.csdl.xs:430:19
            com.sap.cloud.server.odata.ProxyInternal.noRefreshMetadata();
        }
    }
}
