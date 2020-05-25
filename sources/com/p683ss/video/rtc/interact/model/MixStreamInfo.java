package com.p683ss.video.rtc.interact.model;

import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.video.rtc.interact.model.MixStreamInfo */
public class MixStreamInfo {
    public JSONObject mAppData;
    public List<Region> mRegions;

    public JSONObject getAppData() {
        return this.mAppData;
    }

    public List<Region> getRegions() {
        return this.mRegions;
    }

    public MixStreamInfo setAppData(JSONObject jSONObject) {
        this.mAppData = jSONObject;
        return this;
    }

    public MixStreamInfo setRegions(List<Region> list) {
        this.mRegions = list;
        return this;
    }
}
