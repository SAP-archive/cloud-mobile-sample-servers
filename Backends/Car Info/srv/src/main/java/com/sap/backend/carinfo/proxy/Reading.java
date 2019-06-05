//# xsc 19.4.0-0adeb1-20190425

package com.sap.backend.carinfo.proxy;

public class Reading
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property readingID = com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.reading.getProperty("ReadingID");

    public static final com.sap.cloud.server.odata.Property vehicleID = com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.reading.getProperty("VehicleID");

    public static final com.sap.cloud.server.odata.Property fillCost = com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.reading.getProperty("fillCost");

    public static final com.sap.cloud.server.odata.Property fillDate = com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.reading.getProperty("fillDate");

    public static final com.sap.cloud.server.odata.Property fillFuel = com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.reading.getProperty("fillFuel");

    public static final com.sap.cloud.server.odata.Property odometer = com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.reading.getProperty("odometer");

    public static final com.sap.cloud.server.odata.Property vehicle = com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.reading.getProperty("Vehicle");

    public Reading()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:35:5
        this(true);
    }

    public Reading(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:35:5
        super(withDefaults, com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.reading);
    }

    public com.sap.backend.carinfo.proxy.Reading copy()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:20:5
        return com.sap.backend.carinfo.proxy.internal.Any_as_com_sap_backend_carinfo_proxy_Reading.cast(this.copyEntity());
    }

    public java.math.BigDecimal getFillCost()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:88:5
        return com.sap.cloud.server.odata.DecimalValue.unwrap(this.getDataValue(com.sap.backend.carinfo.proxy.Reading.fillCost));
    }

    public com.sap.cloud.server.odata.LocalDateTime getFillDate()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:101:5
        return com.sap.cloud.server.odata.LocalDateTime.castRequired(this.getDataValue(com.sap.backend.carinfo.proxy.Reading.fillDate));
    }

    public java.math.BigDecimal getFillFuel()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:114:5
        return com.sap.cloud.server.odata.DecimalValue.unwrap(this.getDataValue(com.sap.backend.carinfo.proxy.Reading.fillFuel));
    }

    public java.math.BigDecimal getOdometer()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:127:5
        return com.sap.cloud.server.odata.DecimalValue.unwrap(this.getDataValue(com.sap.backend.carinfo.proxy.Reading.odometer));
    }

    public com.sap.backend.carinfo.proxy.Reading getOld()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:15:5
        return com.sap.backend.carinfo.proxy.internal.Any_as_com_sap_backend_carinfo_proxy_Reading.cast(this.getOldEntity());
    }

    public long getReadingID()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:62:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.backend.carinfo.proxy.Reading.readingID));
    }

    public com.sap.backend.carinfo.proxy.Vehicle getVehicle()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:140:5
        return com.sap.backend.carinfo.proxy.internal.Any_as_com_sap_backend_carinfo_proxy_Vehicle.cast(this.getDataValue(com.sap.backend.carinfo.proxy.Reading.vehicle));
    }

    public long getVehicleID()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:75:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.backend.carinfo.proxy.Reading.vehicleID));
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:8:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long readingID)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:25:12
        return new com.sap.cloud.server.odata.EntityKey().with("ReadingID", com.sap.cloud.server.odata.LongValue.of(readingID));
    }

    public static com.sap.backend.carinfo.proxy.ReadingList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:30:12
        return com.sap.backend.carinfo.proxy.ReadingList.share(from);
    }

    public void setFillCost(final java.math.BigDecimal value)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:93:5
        this.setDataValue(com.sap.backend.carinfo.proxy.Reading.fillCost, com.sap.cloud.server.odata.DecimalValue.of(value));
    }

    public void setFillDate(final com.sap.cloud.server.odata.LocalDateTime value)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:106:5
        this.setDataValue(com.sap.backend.carinfo.proxy.Reading.fillDate, value);
    }

    public void setFillFuel(final java.math.BigDecimal value)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:119:5
        this.setDataValue(com.sap.backend.carinfo.proxy.Reading.fillFuel, com.sap.cloud.server.odata.DecimalValue.of(value));
    }

    public void setOdometer(final java.math.BigDecimal value)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:132:5
        this.setDataValue(com.sap.backend.carinfo.proxy.Reading.odometer, com.sap.cloud.server.odata.DecimalValue.of(value));
    }

    public void setReadingID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:67:5
        this.setDataValue(com.sap.backend.carinfo.proxy.Reading.readingID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setVehicle(final com.sap.backend.carinfo.proxy.Vehicle value)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:145:5
        this.setDataValue(com.sap.backend.carinfo.proxy.Reading.vehicle, value);
    }

    public void setVehicleID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:80:5
        this.setDataValue(com.sap.backend.carinfo.proxy.Reading.vehicleID, com.sap.cloud.server.odata.LongValue.of(value));
    }
}
