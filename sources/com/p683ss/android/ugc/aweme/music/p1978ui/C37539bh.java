package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.music.ui.bh */
public final class C37539bh {
    /* renamed from: a */
    public static JSONObject m83960a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (TextUtils.equals("log_pb", str)) {
                        jSONObject.put(str, new JSONObject((String) map.get(str)));
                    } else {
                        jSONObject.put(str, map.get(str));
                    }
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }
}
