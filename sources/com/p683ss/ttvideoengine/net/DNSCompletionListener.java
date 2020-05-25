package com.p683ss.ttvideoengine.net;

import com.p683ss.ttvideoengine.utils.Error;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.net.DNSCompletionListener */
public interface DNSCompletionListener {
    void onCancelled();

    void onCompletion(JSONObject jSONObject, Error error);

    void onRetry(Error error);
}
