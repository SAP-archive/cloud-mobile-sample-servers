// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place your customizations in the MainServlet class in the parent folder.

package com.sap.backend.carinfo.base;

import com.sap.cloud.server.odata.*;

public abstract class MainServletBase extends DataServlet {
    private static final long serialVersionUID = 1L;

    public InMemoryDatabase provider;

    public com.sap.backend.carinfo.proxy.CarinfoService service;

    public org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(com.sap.backend.carinfo.LogSettings.LOGGER_NAME);

    public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException {
        super.init(config);
        this.setTraceRequests(logger.isDebugEnabled() | com.sap.backend.carinfo.LogSettings.LOG_DEBUG | com.sap.backend.carinfo.LogSettings.LOG_TRACE);
        this.setTraceWithData(logger.isTraceEnabled() | com.sap.backend.carinfo.LogSettings.LOG_TRACE);
        this.setPrettyTracing(com.sap.backend.carinfo.LogSettings.PRETTY_TRACING);
        this.setDefaultPageSize(1000);
        this.setMaximumGraphSize(10000);
        this.setAllowNestedPaging(false);
        this.setAllowNonPatchUpdates(false);
        this.setTrackChangesByDefault(false);
        this.setRequiresAuthentication(false);
        this.setSupportsRepeatability(true);
        this.setSupportsTransaction(false);
        provider = new InMemoryDatabase("CarinfoService");
        com.sap.backend.carinfo.ProviderSettings.init((com.sap.backend.carinfo.MainServlet)this);
        com.sap.backend.carinfo.ProviderSettings.init(provider);
        service = new com.sap.backend.carinfo.proxy.CarinfoService(provider);
        RegisterHandlers.withServlet((com.sap.backend.carinfo.MainServlet)this);
        RegisterListeners.withServlet((com.sap.backend.carinfo.MainServlet)this);
        service.getMetadata().addRepeatability();
        service.getMetadata().inheritAnnotations();
        provider.createSchema();
        this.loadInitialData(com.sap.backend.carinfo.TestSettings.TEST_MODE);
        logger.info("Started " + service.getName());
    }

    public void destroy() {
        logger.info("Stopped " + service.getName());
    }

    public DataService getDataService() {
        return service;
    }
}
