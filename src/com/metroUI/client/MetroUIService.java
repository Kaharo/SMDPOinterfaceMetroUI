package com.metroUI.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("MetroUIService")
public interface MetroUIService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use MetroUIService.App.getInstance() to access static instance of MetroUIServiceAsync
     */
    public static class App {
        private static MetroUIServiceAsync ourInstance = GWT.create(MetroUIService.class);

        public static synchronized MetroUIServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
