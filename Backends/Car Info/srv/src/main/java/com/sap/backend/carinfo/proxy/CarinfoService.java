//# xsc 19.4.0-0adeb1-20190425

package com.sap.backend.carinfo.proxy;

public class CarinfoService
    extends com.sap.cloud.server.odata.DataService
{
    public CarinfoService()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:394:5
        this(null);
    }

    public CarinfoService(final com.sap.cloud.server.odata.DataServiceProvider provider)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:394:5
        super(com.sap.cloud.server.odata.MetadataOnlyProvider.newIfNull(provider, "CarinfoService"));
        this.getProvider().setMetadata(com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.document);
    }

    public com.sap.backend.carinfo.proxy.Reading getReading(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:406:5
        return this.getReading(query, null, null);
    }

    public com.sap.backend.carinfo.proxy.Reading getReading(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:406:5
        return this.getReading(query, headers, null);
    }

    public com.sap.backend.carinfo.proxy.Reading getReading(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:406:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.backend.carinfo.proxy.internal.Any_as_com_sap_backend_carinfo_proxy_Reading.cast(this.executeQuery(query.fromDefault(com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntitySets.readingSet), var_headers, var_options).getRequiredEntity());
    }

    public com.sap.backend.carinfo.proxy.ReadingList getReadingSet()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:421:5
        return this.getReadingSet(null, null, null);
    }

    public com.sap.backend.carinfo.proxy.ReadingList getReadingSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:421:5
        return this.getReadingSet(query, null, null);
    }

    public com.sap.backend.carinfo.proxy.ReadingList getReadingSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:421:5
        return this.getReadingSet(query, headers, null);
    }

    public com.sap.backend.carinfo.proxy.ReadingList getReadingSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:421:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.backend.carinfo.proxy.Reading.list(this.executeQuery(var_query.fromDefault(com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntitySets.readingSet), var_headers, var_options).getEntityList());
    }

    public com.sap.backend.carinfo.proxy.Reading getReadingWithKey(final long readingID)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:414:5
        return this.getReadingWithKey(readingID, null, null, null);
    }

    public com.sap.backend.carinfo.proxy.Reading getReadingWithKey(final long readingID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:414:5
        return this.getReadingWithKey(readingID, query, null, null);
    }

    public com.sap.backend.carinfo.proxy.Reading getReadingWithKey(final long readingID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:414:5
        return this.getReadingWithKey(readingID, query, headers, null);
    }

    public com.sap.backend.carinfo.proxy.Reading getReadingWithKey(final long readingID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:414:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getReading(var_query.withKey(com.sap.backend.carinfo.proxy.Reading.key(readingID)), headers, options);
    }

    public com.sap.backend.carinfo.proxy.Vehicle getVehicle(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:541:5
        return this.getVehicle(query, null, null);
    }

    public com.sap.backend.carinfo.proxy.Vehicle getVehicle(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:541:5
        return this.getVehicle(query, headers, null);
    }

    public com.sap.backend.carinfo.proxy.Vehicle getVehicle(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:541:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.backend.carinfo.proxy.internal.Any_as_com_sap_backend_carinfo_proxy_Vehicle.cast(this.executeQuery(query.fromDefault(com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntitySets.vehicleSet), var_headers, var_options).getRequiredEntity());
    }

    public com.sap.backend.carinfo.proxy.VehicleList getVehicleSet()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:556:5
        return this.getVehicleSet(null, null, null);
    }

    public com.sap.backend.carinfo.proxy.VehicleList getVehicleSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:556:5
        return this.getVehicleSet(query, null, null);
    }

    public com.sap.backend.carinfo.proxy.VehicleList getVehicleSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:556:5
        return this.getVehicleSet(query, headers, null);
    }

    public com.sap.backend.carinfo.proxy.VehicleList getVehicleSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:556:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.backend.carinfo.proxy.Vehicle.list(this.executeQuery(var_query.fromDefault(com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntitySets.vehicleSet), var_headers, var_options).getEntityList());
    }

    public com.sap.backend.carinfo.proxy.Vehicle getVehicleWithKey(final long vehicleID)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:549:5
        return this.getVehicleWithKey(vehicleID, null, null, null);
    }

    public com.sap.backend.carinfo.proxy.Vehicle getVehicleWithKey(final long vehicleID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:549:5
        return this.getVehicleWithKey(vehicleID, query, null, null);
    }

    public com.sap.backend.carinfo.proxy.Vehicle getVehicleWithKey(final long vehicleID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:549:5
        return this.getVehicleWithKey(vehicleID, query, headers, null);
    }

    public com.sap.backend.carinfo.proxy.Vehicle getVehicleWithKey(final long vehicleID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:549:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getVehicle(var_query.withKey(com.sap.backend.carinfo.proxy.Vehicle.key(vehicleID)), headers, options);
    }

    @java.lang.Override public void refreshMetadata()
    {
        synchronized (this)
        {
            //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:400:19
            com.sap.cloud.server.odata.ProxyInternal.noRefreshMetadata();
        }
    }
}
