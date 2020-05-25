package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.C17971f;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AggregationSdk */
public class AggregationSdk implements Serializable {
    @C17952c(mo34828a = "common_data")
    private Object commonData;

    public JSONObject getCommonData() {
        try {
            return new JSONObject(new C17971f().mo34889b(this.commonData));
        } catch (JSONException unused) {
            return null;
        }
    }
}
