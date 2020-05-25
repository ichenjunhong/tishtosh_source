package com.p683ss.android.ugc.aweme.services;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.services.IAVMobService */
public interface IAVMobService {
    void onEventV3(String str, Map<String, String> map);

    void onEventV3(String str, JSONObject jSONObject);
}
