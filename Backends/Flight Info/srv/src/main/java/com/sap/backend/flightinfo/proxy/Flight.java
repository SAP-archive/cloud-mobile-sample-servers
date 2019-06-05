//# xsc 19.4.0-0adeb1-20190425

package com.sap.backend.flightinfo.proxy;

public class Flight
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property flightID = com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.flight.getProperty("FlightID");

    public static final com.sap.cloud.server.odata.Property aircraftReg = com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.flight.getProperty("aircraftReg");

    public static final com.sap.cloud.server.odata.Property aircraftType = com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.flight.getProperty("aircraftType");

    public static final com.sap.cloud.server.odata.Property arrival = com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.flight.getProperty("arrival");

    public static final com.sap.cloud.server.odata.Property code = com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.flight.getProperty("code");

    public static final com.sap.cloud.server.odata.Property departure = com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.flight.getProperty("departure");

    public static final com.sap.cloud.server.odata.Property duration = com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.flight.getProperty("duration");

    public static final com.sap.cloud.server.odata.Property fromAirportID = com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.flight.getProperty("fromAirportID");

    public static final com.sap.cloud.server.odata.Property remarks = com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.flight.getProperty("remarks");

    public static final com.sap.cloud.server.odata.Property toAirportID = com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.flight.getProperty("toAirportID");

    public static final com.sap.cloud.server.odata.Property destination = com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.flight.getProperty("destination");

    public static final com.sap.cloud.server.odata.Property origin = com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.flight.getProperty("origin");

    public Flight()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:186:5
        this(true);
    }

    public Flight(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:186:5
        super(withDefaults, com.sap.backend.flightinfo.proxy.FlightinfoServiceMetadata.EntityTypes.flight);
    }

    public com.sap.backend.flightinfo.proxy.Flight copy()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:171:5
        return com.sap.backend.flightinfo.proxy.internal.Any_as_com_sap_backend_flightinfo_proxy_Flight.cast(this.copyEntity());
    }

    public String getAircraftReg()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:236:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.backend.flightinfo.proxy.Flight.aircraftReg));
    }

    public String getAircraftType()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:249:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.backend.flightinfo.proxy.Flight.aircraftType));
    }

    public com.sap.cloud.server.odata.LocalDateTime getArrival()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:262:5
        return com.sap.cloud.server.odata.LocalDateTime.castRequired(this.getDataValue(com.sap.backend.flightinfo.proxy.Flight.arrival));
    }

    public String getCode()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:275:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.backend.flightinfo.proxy.Flight.code));
    }

    public com.sap.cloud.server.odata.LocalDateTime getDeparture()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:288:5
        return com.sap.cloud.server.odata.LocalDateTime.castRequired(this.getDataValue(com.sap.backend.flightinfo.proxy.Flight.departure));
    }

    public com.sap.backend.flightinfo.proxy.Airport getDestination()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:353:5
        return com.sap.backend.flightinfo.proxy.internal.Any_as_com_sap_backend_flightinfo_proxy_Airport.cast(this.getDataValue(com.sap.backend.flightinfo.proxy.Flight.destination));
    }

    public String getDuration()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:301:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.backend.flightinfo.proxy.Flight.duration));
    }

    public long getFlightID()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:223:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.backend.flightinfo.proxy.Flight.flightID));
    }

    public long getFromAirportID()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:314:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.backend.flightinfo.proxy.Flight.fromAirportID));
    }

    public com.sap.backend.flightinfo.proxy.Flight getOld()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:166:5
        return com.sap.backend.flightinfo.proxy.internal.Any_as_com_sap_backend_flightinfo_proxy_Flight.cast(this.getOldEntity());
    }

    public com.sap.backend.flightinfo.proxy.Airport getOrigin()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:366:5
        return com.sap.backend.flightinfo.proxy.internal.Any_as_com_sap_backend_flightinfo_proxy_Airport.cast(this.getDataValue(com.sap.backend.flightinfo.proxy.Flight.origin));
    }

    public String getRemarks()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:327:5
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.sap.backend.flightinfo.proxy.Flight.remarks));
    }

    public long getToAirportID()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:340:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.backend.flightinfo.proxy.Flight.toAirportID));
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:159:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long flightID)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:176:12
        return new com.sap.cloud.server.odata.EntityKey().with("FlightID", com.sap.cloud.server.odata.LongValue.of(flightID));
    }

    public static com.sap.backend.flightinfo.proxy.FlightList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:181:12
        return com.sap.backend.flightinfo.proxy.FlightList.share(from);
    }

    public void setAircraftReg(final String value)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:241:5
        this.setDataValue(com.sap.backend.flightinfo.proxy.Flight.aircraftReg, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setAircraftType(final String value)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:254:5
        this.setDataValue(com.sap.backend.flightinfo.proxy.Flight.aircraftType, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setArrival(final com.sap.cloud.server.odata.LocalDateTime value)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:267:5
        this.setDataValue(com.sap.backend.flightinfo.proxy.Flight.arrival, value);
    }

    public void setCode(final String value)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:280:5
        this.setDataValue(com.sap.backend.flightinfo.proxy.Flight.code, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setDeparture(final com.sap.cloud.server.odata.LocalDateTime value)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:293:5
        this.setDataValue(com.sap.backend.flightinfo.proxy.Flight.departure, value);
    }

    public void setDestination(final com.sap.backend.flightinfo.proxy.Airport value)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:358:5
        this.setDataValue(com.sap.backend.flightinfo.proxy.Flight.destination, value);
    }

    public void setDuration(final String value)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:306:5
        this.setDataValue(com.sap.backend.flightinfo.proxy.Flight.duration, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setFlightID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:228:5
        this.setDataValue(com.sap.backend.flightinfo.proxy.Flight.flightID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setFromAirportID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:319:5
        this.setDataValue(com.sap.backend.flightinfo.proxy.Flight.fromAirportID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setOrigin(final com.sap.backend.flightinfo.proxy.Airport value)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:371:5
        this.setDataValue(com.sap.backend.flightinfo.proxy.Flight.origin, value);
    }

    public void setRemarks(final String value)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:332:5
        this.setDataValue(com.sap.backend.flightinfo.proxy.Flight.remarks, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setToAirportID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/50ef5d7c-7ee5-4613-a2f9-d703b9c6fdee/output/target/tmp/proxy-com.sap.backend.flightinfo.csdl.xs:345:5
        this.setDataValue(com.sap.backend.flightinfo.proxy.Flight.toAirportID, com.sap.cloud.server.odata.LongValue.of(value));
    }
}
