package com.p683ss.ttvideoengine.model;

import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.model.VideoAdaptiveInfo */
public class VideoAdaptiveInfo {
    private String mAdaptiveType;
    private String mBackupPlayUrl;
    private String mMainPlayUrl;

    public void extractFields(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mAdaptiveType = jSONObject.optString("AdaptiveType");
            this.mMainPlayUrl = jSONObject.optString("MainPlayUrl");
            this.mBackupPlayUrl = jSONObject.optString("BackupPlayUrl");
        }
    }

    public String getValueStr(int i) {
        if (i == 215) {
            return this.mAdaptiveType;
        }
        switch (i) {
            case 108:
                return this.mMainPlayUrl;
            case 109:
                return this.mBackupPlayUrl;
            default:
                return "";
        }
    }
}
