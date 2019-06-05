//# xsc 19.4.0-0adeb1-20190425

package com.sap.backend.flightinfo.proxy;

public class Airport
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property airportID = com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.airport.getProperty("AirportID");

    public static final com.sap.cloud.server.odata.Property iataCode = com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.airport.getProperty("iataCode");

    public static final com.sap.cloud.server.odata.Property latitude = com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.airport.getProperty("latitude");

    public static final com.sap.cloud.server.odata.Property longitude = com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.airport.getProperty("longitude");

    public static final com.sap.cloud.server.odata.Property name = com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.airport.getProperty("name");

    public static final com.sap.cloud.server.odata.Property arrivingFlights = com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.airport.getProperty("arrivingFlights");

    public static final com.sap.cloud.server.odata.Property departingFlights = com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.airport.getProperty("departingFlights");

    public Airport()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:35:5
        this(true);
    }

    public Airport(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:35:5
        super(withDefaults, com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.airport);
    }

    public com.sap.backend.flightinfo.proxy.Airport copy()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:20:5
        return com.sap.backend.flightinfo.proxy.internal.Any_as_com_sap_backend_flightinfo_proxy_Airport.cast(this.copyEntity());
    }

    public long getAirportID()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:62:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.backend.flightinfo.proxy.Airport.airportID));
    }

    public com.sap.backend.flightinfo.proxy.FlightList getArrivingFlights()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:127:5
        return com.sap.backend.flightinfo.proxy.FlightList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.sap.backend.flightinfo.proxy.Airport.arrivingFlights)));
    }

    public com.sap.backend.flightinfo.proxy.FlightList getDepartingFlights()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:140:5
        return com.sap.backend.flightinfo.proxy.FlightList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.sap.backend.flightinfo.proxy.Airport.departingFlights)));
    }

    public String getIataCode()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:75:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.backend.flightinfo.proxy.Airport.iataCode));
    }

    public java.math.BigDecimal getLatitude()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:88:5
        return com.sap.cloud.server.odata.DecimalValue.unwrap(this.getDataValue(com.sap.backend.flightinfo.proxy.Airport.latitude));
    }

    public java.math.BigDecimal getLongitude()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:101:5
        return com.sap.cloud.server.odata.DecimalValue.unwrap(this.getDataValue(com.sap.backend.flightinfo.proxy.Airport.longitude));
    }

    public String getName()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:114:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.backend.flightinfo.proxy.Airport.name));
    }

    public com.sap.backend.flightinfo.proxy.Airport getOld()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:15:5
        return com.sap.backend.flightinfo.proxy.internal.Any_as_com_sap_backend_flightinfo_proxy_Airport.cast(this.getOldEntity());
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:8:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long airportID)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:25:12
        return new com.sap.cloud.server.odata.EntityKey().with("AirportID", com.sap.cloud.server.odata.LongValue.of(airportID));
    }

    public static com.sap.backend.flightinfo.proxy.AirportList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:30:12
        return com.sap.backend.flightinfo.proxy.AirportList.share(from);
    }

    public void setAirportID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:67:5
        this.setDataValue(com.sap.backend.flightinfo.proxy.Airport.airportID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setArrivingFlights(final com.sap.backend.flightinfo.proxy.FlightList value)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:132:5
        com.sap.backend.flightinfo.proxy.Airport.arrivingFlights.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }

    public void setDepartingFlights(final com.sap.backend.flightinfo.proxy.FlightList value)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:145:5
        com.sap.backend.flightinfo.proxy.Airport.departingFlights.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }

    public void setIataCode(final String value)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:80:5
        this.setDataValue(com.sap.backend.flightinfo.proxy.Airport.iataCode, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setLatitude(final java.math.BigDecimal value)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:93:5
        this.setDataValue(com.sap.backend.flightinfo.proxy.Airport.latitude, com.sap.cloud.server.odata.DecimalValue.of(value));
    }

    public void setLongitude(final java.math.BigDecimal value)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:106:5
        this.setDataValue(com.sap.backend.flightinfo.proxy.Airport.longitude, com.sap.cloud.server.odata.DecimalValue.of(value));
    }

    public void setName(final String value)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:119:5
        this.setDataValue(com.sap.backend.flightinfo.proxy.Airport.name, com.sap.cloud.server.odata.StringValue.of(value));
    }
}
