//# xsc 19.4.0-0adeb1-20190425

package com.sap.backend.carinfo.proxy;

public class VehicleList
    extends com.sap.cloud.server.odata.ListBase
    implements java.lang.Iterable<com.sap.backend.carinfo.proxy.Vehicle>
{
    public static final com.sap.backend.carinfo.proxy.VehicleList empty = new com.sap.backend.carinfo.proxy.VehicleList(java.lang.Integer.MIN_VALUE);

    public VehicleList()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:13:5
        this(4);
    }

    public VehicleList(final int capacity)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:13:5
        super(capacity);
    }

    public void add(final com.sap.backend.carinfo.proxy.Vehicle item)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:50:5
        this.getUntypedList().add(this.validate(((Object)item)));
    }

    public void addAll(final com.sap.backend.carinfo.proxy.VehicleList list)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:59:5
        this.getUntypedList().addAll(list.getUntypedList());
    }

    public com.sap.backend.carinfo.proxy.VehicleList addThis(final com.sap.backend.carinfo.proxy.Vehicle item)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:70:5
        this.add(item);
        return this;
    }

    public com.sap.backend.carinfo.proxy.VehicleList copy()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:78:5
        return this.slice(0);
    }

    public com.sap.backend.carinfo.proxy.Vehicle first()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:86:5
        return com.sap.backend.carinfo.proxy.internal.Any_as_com_sap_backend_carinfo_proxy_Vehicle.cast(this.getUntypedList().first());
    }

    public static com.sap.backend.carinfo.proxy.VehicleList from(final java.util.List<com.sap.backend.carinfo.proxy.Vehicle> list)
    {
        return VehicleList.share(new com.sap.cloud.server.odata.core.GenericList<com.sap.backend.carinfo.proxy.Vehicle>(list).toAnyList());
    }

    public com.sap.backend.carinfo.proxy.Vehicle get(final int index)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:96:5
        return com.sap.backend.carinfo.proxy.internal.Any_as_com_sap_backend_carinfo_proxy_Vehicle.cast(this.getUntypedList().get(index));
    }

    public boolean includes(final com.sap.backend.carinfo.proxy.Vehicle item)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:104:5
        return this.indexOf(item) != -1;
    }

    public int indexOf(final com.sap.backend.carinfo.proxy.Vehicle item)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:113:5
        return this.indexOf(item, 0);
    }

    public int indexOf(final com.sap.backend.carinfo.proxy.Vehicle item, final int start)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:113:5
        return this.getUntypedList().indexOf(((Object)item), start);
    }

    public void insertAll(final int index, final com.sap.backend.carinfo.proxy.VehicleList list)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:135:5
        this.getUntypedList().insertAll(index, list.getUntypedList());
    }

    public void insertAt(final int index, final com.sap.backend.carinfo.proxy.Vehicle item)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:124:5
        this.getUntypedList().insertAt(index, ((Object)item));
    }

    public java.util.Iterator<com.sap.backend.carinfo.proxy.Vehicle> iterator()
    {
        return this.toGeneric().iterator();
    }

    public com.sap.backend.carinfo.proxy.Vehicle last()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:143:5
        return com.sap.backend.carinfo.proxy.internal.Any_as_com_sap_backend_carinfo_proxy_Vehicle.cast(this.getUntypedList().last());
    }

    public int lastIndexOf(final com.sap.backend.carinfo.proxy.Vehicle item)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:152:5
        return this.lastIndexOf(item, 2147483647);
    }

    public int lastIndexOf(final com.sap.backend.carinfo.proxy.Vehicle item, final int start)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:152:5
        return this.getUntypedList().lastIndexOf(((Object)item), start);
    }

    public void set(final int index, final com.sap.backend.carinfo.proxy.Vehicle item)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:162:5
        this.getUntypedList().set(index, ((Object)item));
    }

    public static com.sap.backend.carinfo.proxy.VehicleList share(final com.sap.cloud.server.odata.ListBase list)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:24:12
        final com.sap.cloud.server.odata.core.UntypedList items = list.getUntypedList();
        final int n = items.length();
        final com.sap.backend.carinfo.proxy.VehicleList result = new com.sap.backend.carinfo.proxy.VehicleList(n);
        boolean replace = false;
        {
            int i = 0;
            for (; (i < n); i++)
            {
                final Object item = items.get(i);
                if (item instanceof com.sap.backend.carinfo.proxy.Vehicle)
                {
                    final com.sap.backend.carinfo.proxy.Vehicle var_item = ((com.sap.backend.carinfo.proxy.Vehicle)item);
                    result.add(var_item);
                }
                else
                {
                    replace = true;
                }
            }
        }
        result.shareWith(list, replace);
        return result;
    }

    public com.sap.backend.carinfo.proxy.Vehicle single()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:171:5
        return com.sap.backend.carinfo.proxy.internal.Any_as_com_sap_backend_carinfo_proxy_Vehicle.cast(this.getUntypedList().single());
    }

    public com.sap.backend.carinfo.proxy.VehicleList slice(final int start)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:180:5
        return this.slice(start, 2147483647);
    }

    public com.sap.backend.carinfo.proxy.VehicleList slice(final int start, final int end)
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:691:35 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:180:5
        final com.sap.cloud.server.odata.core.UntypedList list = this.getUntypedList();
        final int var_start = list.startRange(start);
        final int var_end = list.endRange(end);
        final com.sap.backend.carinfo.proxy.VehicleList result = new com.sap.backend.carinfo.proxy.VehicleList(var_end - var_start);
        result.getUntypedList().addRange(list, var_start, var_end);
        return result;
    }

    @java.lang.Override public com.sap.cloud.server.odata.ListBase toDynamic()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:693:5
        return this.toEntityList();
    }

    public com.sap.cloud.server.odata.EntityValueList toEntityList()
    {
        //# /usr/sap/ljs/xs-temp/b55cc4d5-dbe8-4f6d-9682-c7da7a8dfd02/output/target/tmp/proxy-com.sap.backend.carinfo.csdl.xs:698:5
        return com.sap.cloud.server.odata.EntityValueList.share(this).withItemType(com.sap.backend.carinfo.proxy.CarinfoServiceMetadata.EntityTypes.vehicle);
    }

    public java.util.List<com.sap.backend.carinfo.proxy.Vehicle> toGeneric()
    {
        return new com.sap.cloud.server.odata.core.GenericList<com.sap.backend.carinfo.proxy.Vehicle>(this);
    }
}
