package com.p683ss.ttuploader;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.TTVideoUploaderAbstractListener */
public abstract class TTVideoUploaderAbstractListener {
    public void onEventLog(JSONObject jSONObject) {
    }

    public void onEventLogMap(Map<String, String> map) {
    }

    public boolean switchNetType(int i) {
        return false;
    }
}
