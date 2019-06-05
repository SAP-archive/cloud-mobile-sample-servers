package com.sap.backend.canteenmenu;

@javax.servlet.annotation.WebServlet(
    loadOnStartup = 0,
    urlPatterns = "/*")
public class MainServlet extends com.sap.backend.canteenmenu.base.MainServletBase {
    private static final long serialVersionUID = 1L;

    public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException {
        // For customization, see also: LogSettings, ProviderSettings, TestSettings.
        super.init(config);
    }
}
