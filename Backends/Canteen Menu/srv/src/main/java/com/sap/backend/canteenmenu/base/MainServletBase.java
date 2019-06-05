// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place your customizations in the MainServlet class in the parent folder.

package com.sap.backend.canteenmenu.base;

import com.sap.cloud.server.odata.*;

public abstract class MainServletBase extends DataServlet {
    private static final long serialVersionUID = 1L;

    public InMemoryDatabase provider;

    public com.sap.backend.canteenmenu.proxy.CanteenmenuService service;

    public org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(com.sap.backend.canteenmenu.LogSettings.LOGGER_NAME);

    public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException {
        super.init(config);
        this.setTraceRequests(logger.isDebugEnabled() | com.sap.backend.canteenmenu.LogSettings.LOG_DEBUG | com.sap.backend.canteenmenu.LogSettings.LOG_TRACE);
        this.setTraceWithData(logger.isTraceEnabled() | com.sap.backend.canteenmenu.LogSettings.LOG_TRACE);
        this.setPrettyTracing(com.sap.backend.canteenmenu.LogSettings.PRETTY_TRACING);
        this.setDefaultPageSize(1000);
        this.setMaximumGraphSize(10000);
        this.setAllowNestedPaging(false);
        this.setAllowNonPatchUpdates(false);
        this.setTrackChangesByDefault(false);
        this.setRequiresAuthentication(false);
        this.setSupportsRepeatability(true);
        this.setSupportsTransaction(false);
        provider = new InMemoryDatabase("CanteenmenuService");
        com.sap.backend.canteenmenu.ProviderSettings.init((com.sap.backend.canteenmenu.MainServlet)this);
        com.sap.backend.canteenmenu.ProviderSettings.init(provider);
        service = new com.sap.backend.canteenmenu.proxy.CanteenmenuService(provider);
        RegisterHandlers.withServlet((com.sap.backend.canteenmenu.MainServlet)this);
        RegisterListeners.withServlet((com.sap.backend.canteenmenu.MainServlet)this);
        service.getMetadata().addRepeatability();
        service.getMetadata().inheritAnnotations();
        provider.createSchema();
        this.loadInitialData(com.sap.backend.canteenmenu.TestSettings.TEST_MODE);
        logger.info("Started " + service.getName());
    }

    public void destroy() {
        logger.info("Stopped " + service.getName());
    }

    public DataService getDataService() {
        return service;
    }
}
