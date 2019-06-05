//# xsc 19.4.0-0adeb1-20190425

package com.sap.backend.flightinfo.proxy;

public class FlightinfoService
    extends com.sap.cloud.server.odata.DataService
{
    public FlightinfoService()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:484:5
        this(null);
    }

    public FlightinfoService(final com.sap.cloud.server.odata.DataServiceProvider provider)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:484:5
        super(com.sap.cloud.server.odata.MetadataOnlyProvider.newIfNull(provider, "FlightinfoService"));
        this.getProvider().setMetadata(com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.document);
    }

    public com.sap.backend.flightinfo.proxy.Airport getAirport(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:496:5
        return this.getAirport(query, null, null);
    }

    public com.sap.backend.flightinfo.proxy.Airport getAirport(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:496:5
        return this.getAirport(query, headers, null);
    }

    public com.sap.backend.flightinfo.proxy.Airport getAirport(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:496:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.backend.flightinfo.proxy.internal.Any_as_com_sap_backend_flightinfo_proxy_Airport.cast(this.executeQuery(query.fromDefault(com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntitySets.airportSet), var_headers, var_options).getRequiredEntity());
    }

    public com.sap.backend.flightinfo.proxy.AirportList getAirportSet()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:511:5
        return this.getAirportSet(null, null, null);
    }

    public com.sap.backend.flightinfo.proxy.AirportList getAirportSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:511:5
        return this.getAirportSet(query, null, null);
    }

    public com.sap.backend.flightinfo.proxy.AirportList getAirportSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:511:5
        return this.getAirportSet(query, headers, null);
    }

    public com.sap.backend.flightinfo.proxy.AirportList getAirportSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:511:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.backend.flightinfo.proxy.Airport.list(this.executeQuery(var_query.fromDefault(com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntitySets.airportSet), var_headers, var_options).getEntityList());
    }

    public com.sap.backend.flightinfo.proxy.Airport getAirportWithKey(final long airportID)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:504:5
        return this.getAirportWithKey(airportID, null, null, null);
    }

    public com.sap.backend.flightinfo.proxy.Airport getAirportWithKey(final long airportID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:504:5
        return this.getAirportWithKey(airportID, query, null, null);
    }

    public com.sap.backend.flightinfo.proxy.Airport getAirportWithKey(final long airportID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:504:5
        return this.getAirportWithKey(airportID, query, headers, null);
    }

    public com.sap.backend.flightinfo.proxy.Airport getAirportWithKey(final long airportID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:504:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getAirport(var_query.withKey(com.sap.backend.flightinfo.proxy.Airport.key(airportID)), headers, options);
    }

    public com.sap.backend.flightinfo.proxy.Flight getFlight(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:631:5
        return this.getFlight(query, null, null);
    }

    public com.sap.backend.flightinfo.proxy.Flight getFlight(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:631:5
        return this.getFlight(query, headers, null);
    }

    public com.sap.backend.flightinfo.proxy.Flight getFlight(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:631:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.backend.flightinfo.proxy.internal.Any_as_com_sap_backend_flightinfo_proxy_Flight.cast(this.executeQuery(query.fromDefault(com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntitySets.flightSet), var_headers, var_options).getRequiredEntity());
    }

    public com.sap.backend.flightinfo.proxy.FlightList getFlightSet()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:646:5
        return this.getFlightSet(null, null, null);
    }

    public com.sap.backend.flightinfo.proxy.FlightList getFlightSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:646:5
        return this.getFlightSet(query, null, null);
    }

    public com.sap.backend.flightinfo.proxy.FlightList getFlightSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:646:5
        return this.getFlightSet(query, headers, null);
    }

    public com.sap.backend.flightinfo.proxy.FlightList getFlightSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:646:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.sap.backend.flightinfo.proxy.Flight.list(this.executeQuery(var_query.fromDefault(com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntitySets.flightSet), var_headers, var_options).getEntityList());
    }

    public com.sap.backend.flightinfo.proxy.Flight getFlightWithKey(final long flightID)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:639:5
        return this.getFlightWithKey(flightID, null, null, null);
    }

    public com.sap.backend.flightinfo.proxy.Flight getFlightWithKey(final long flightID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:639:5
        return this.getFlightWithKey(flightID, query, null, null);
    }

    public com.sap.backend.flightinfo.proxy.Flight getFlightWithKey(final long flightID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:639:5
        return this.getFlightWithKey(flightID, query, headers, null);
    }

    public com.sap.backend.flightinfo.proxy.Flight getFlightWithKey(final long flightID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:639:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getFlight(var_query.withKey(com.sap.backend.flightinfo.proxy.Flight.key(flightID)), headers, options);
    }

    @java.lang.Override public void refreshMetadata()
    {
        synchronized (this)
        {
            //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:490:19
            com.sap.cloud.server.odata.ProxyInternal.noRefreshMetadata();
        }
    }
}
