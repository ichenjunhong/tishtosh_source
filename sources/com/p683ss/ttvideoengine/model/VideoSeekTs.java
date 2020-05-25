package com.p683ss.ttvideoengine.model;

import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.model.VideoSeekTs */
public class VideoSeekTs {
    public float mEnding = -1.0f;
    private float mEndingVer2 = -1.0f;
    public float mOpening = -1.0f;
    private float mOpeningVer2 = -1.0f;
    private int mVersion = 1;

    public void setVersion(int i) {
        this.mVersion = i;
    }

    public float getValueFloat(int i) {
        if (this.mVersion == 1) {
            switch (i) {
                case 0:
                    return this.mOpening;
                case 1:
                    return this.mEnding;
                default:
                    return -1.0f;
            }
        } else {
            switch (i) {
                case 0:
                    return this.mOpeningVer2;
                case 1:
                    return this.mEndingVer2;
                default:
                    return -1.0f;
            }
        }
    }

    public void extractFields(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.has("opening") || jSONObject.has("ending")) {
                this.mVersion = 1;
                try {
                    this.mOpening = (float) jSONObject.optDouble("opening");
                    this.mEnding = (float) jSONObject.optDouble("ending");
                } catch (Exception e) {
                    TTVideoEngineLog.m110645d(e);
                }
            } else {
                if (jSONObject.has("Ending") || jSONObject.has("Opening")) {
                    this.mVersion = 2;
                    try {
                        this.mOpeningVer2 = (float) jSONObject.optDouble("Opening");
                        this.mEndingVer2 = (float) jSONObject.optDouble("Ending");
                    } catch (Exception e2) {
                        TTVideoEngineLog.m110645d(e2);
                    }
                }
            }
        }
    }
}
