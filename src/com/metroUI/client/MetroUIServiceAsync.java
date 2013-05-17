package com.metroUI.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MetroUIServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
