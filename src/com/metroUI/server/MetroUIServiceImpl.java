package com.metroUI.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.metroUI.client.MetroUIService;

public class MetroUIServiceImpl extends RemoteServiceServlet implements MetroUIService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}