package com.bytedance.ies.ugc.aweme.ttsetting.model;

import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

public final class TTSettingDataResponse {
    private TTSettingData ttSettingData;
    private JSONObject ttSettingDataJSONObject;

    public final TTSettingData getTtSettingData() {
        return this.ttSettingData;
    }

    public final JSONObject getTtSettingDataJSONObject() {
        return this.ttSettingDataJSONObject;
    }

    public final void setTtSettingData(TTSettingData tTSettingData) {
        this.ttSettingData = tTSettingData;
    }

    public final void setTtSettingDataJSONObject(JSONObject jSONObject) {
        this.ttSettingDataJSONObject = jSONObject;
    }

    public TTSettingDataResponse(TTSettingData tTSettingData, JSONObject jSONObject) {
        C52711k.m112240b(tTSettingData, "ttSettingData");
        C52711k.m112240b(jSONObject, "ttSettingDataJSONObject");
        this.ttSettingData = tTSettingData;
        this.ttSettingDataJSONObject = jSONObject;
    }
}
