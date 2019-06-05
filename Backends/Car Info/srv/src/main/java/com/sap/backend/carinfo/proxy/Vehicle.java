//# xsc 19.4.0-0adeb1-20190425

package com.sap.backend.carinfo.proxy;

public class Vehicle
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property description = com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.vehicle.getProperty("description");

    public static final com.sap.cloud.server.odata.Property reg = com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.vehicle.getProperty("reg");

    public static final com.sap.cloud.server.odata.Property startDate = com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.vehicle.getProperty("startDate");

    public static final com.sap.cloud.server.odata.Property startOdo = com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.vehicle.getProperty("startOdo");

    public static final com.sap.cloud.server.odata.Property vehicleID = com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.vehicle.getProperty("VehicleID");

    public static final com.sap.cloud.server.odata.Property hasReadings = com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.vehicle.getProperty("hasReadings");

    public Vehicle()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:186:5
        this(true);
    }

    public Vehicle(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:186:5
        super(withDefaults, com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.vehicle);
    }

    public com.sap.backend.carinfo.proxy.Vehicle copy()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:171:5
        return com.sap.backend.carinfo.proxy.internal.Any_as_com_sap_backend_carinfo_proxy_Vehicle.cast(this.copyEntity());
    }

    public String getDescription()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:211:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.backend.carinfo.proxy.Vehicle.description));
    }

    public com.sap.backend.carinfo.proxy.Vehicle getOld()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:166:5
        return com.sap.backend.carinfo.proxy.internal.Any_as_com_sap_backend_carinfo_proxy_Vehicle.cast(this.getOldEntity());
    }

    public String getReg()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:224:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.sap.backend.carinfo.proxy.Vehicle.reg));
    }

    public com.sap.cloud.server.odata.LocalDateTime getStartDate()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:237:5
        return com.sap.cloud.server.odata.LocalDateTime.castRequired(this.getDataValue(com.sap.backend.carinfo.proxy.Vehicle.startDate));
    }

    public java.math.BigDecimal getStartOdo()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:250:5
        return com.sap.cloud.server.odata.DecimalValue.unwrap(this.getDataValue(com.sap.backend.carinfo.proxy.Vehicle.startOdo));
    }

    public long getVehicleID()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:263:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.sap.backend.carinfo.proxy.Vehicle.vehicleID));
    }

    public com.sap.backend.carinfo.proxy.ReadingList hasReadings()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:276:5
        return com.sap.backend.carinfo.proxy.ReadingList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.sap.backend.carinfo.proxy.Vehicle.hasReadings)));
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:159:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long vehicleID)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:176:12
        return new com.sap.cloud.server.odata.EntityKey().with("VehicleID", com.sap.cloud.server.odata.LongValue.of(vehicleID));
    }

    public static com.sap.backend.carinfo.proxy.VehicleList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:181:12
        return com.sap.backend.carinfo.proxy.VehicleList.share(from);
    }

    public void setDescription(final String value)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:216:5
        this.setDataValue(com.sap.backend.carinfo.proxy.Vehicle.description, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setReadings(final com.sap.backend.carinfo.proxy.ReadingList value)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:281:5
        com.sap.backend.carinfo.proxy.Vehicle.hasReadings.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }

    public void setReg(final String value)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:229:5
        this.setDataValue(com.sap.backend.carinfo.proxy.Vehicle.reg, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setStartDate(final com.sap.cloud.server.odata.LocalDateTime value)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:242:5
        this.setDataValue(com.sap.backend.carinfo.proxy.Vehicle.startDate, value);
    }

    public void setStartOdo(final java.math.BigDecimal value)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:255:5
        this.setDataValue(com.sap.backend.carinfo.proxy.Vehicle.startOdo, com.sap.cloud.server.odata.DecimalValue.of(value));
    }

    public void setVehicleID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:268:5
        this.setDataValue(com.sap.backend.carinfo.proxy.Vehicle.vehicleID, com.sap.cloud.server.odata.LongValue.of(value));
    }
}
