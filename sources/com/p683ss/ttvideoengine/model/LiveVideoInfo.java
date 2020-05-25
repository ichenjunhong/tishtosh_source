package com.p683ss.ttvideoengine.model;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.model.LiveVideoInfo */
public class LiveVideoInfo {
    public String mBackupUrl;
    public String mMainUrl;
    public String[] mURLs;

    public void extractFields(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        this.mMainUrl = jSONObject.optString("main_play_url");
        if (!TextUtils.isEmpty(this.mMainUrl)) {
            arrayList.add(this.mMainUrl);
        }
        this.mBackupUrl = jSONObject.optString("backup_play_url");
        if (!TextUtils.isEmpty(this.mBackupUrl)) {
            arrayList.add(this.mBackupUrl);
        }
        this.mURLs = new String[arrayList.size()];
        arrayList.toArray(this.mURLs);
    }
}
