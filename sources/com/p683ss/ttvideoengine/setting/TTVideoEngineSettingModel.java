package com.p683ss.ttvideoengine.setting;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.setting.TTVideoEngineSettingModel */
public class TTVideoEngineSettingModel {
    public static String bufferTimeoutKey = "buffer_timeout";
    public static String videoSettingKey = "com.video.ttvideosetting";
    public int mBufferTimeOut;
    private Context mContext;
    private SharedPreferences mSp = getSharedPreferences(this.mContext);

    public void loadData() {
        this.mBufferTimeOut = this.mSp.getInt(bufferTimeoutKey, 30);
    }

    private SharedPreferences getSharedPreferences(Context context) {
        return C35807d.m80935a(context, videoSettingKey, 0);
    }

    public void saveData(Editor editor) {
        editor.putInt(bufferTimeoutKey, this.mBufferTimeOut);
    }

    public TTVideoEngineSettingModel(Context context) throws JSONException {
        this.mContext = context.getApplicationContext();
        loadData();
    }

    public void tryUpdateSetting(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean z = false;
            int settingIntValue = getSettingIntValue(jSONObject, bufferTimeoutKey);
            if (settingIntValue >= 0 && settingIntValue != this.mBufferTimeOut) {
                z = true;
                this.mBufferTimeOut = settingIntValue;
            }
            if (z) {
                Editor edit = this.mSp.edit();
                saveData(edit);
                edit.apply();
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean getSettingBooleanValue(JSONObject jSONObject, String str) {
        return jSONObject.optBoolean(str);
    }

    /* access modifiers changed from: protected */
    public int getSettingIntValue(JSONObject jSONObject, String str) {
        return jSONObject.optInt(str, -1);
    }

    /* access modifiers changed from: protected */
    public long getSettingLongValue(JSONObject jSONObject, String str) {
        return jSONObject.optLong(str, -1);
    }

    /* access modifiers changed from: protected */
    public String getSettingStringValue(JSONObject jSONObject, String str) {
        return jSONObject.optString(str);
    }

    /* access modifiers changed from: protected */
    public int getSettingIntValue(JSONObject jSONObject, String str, int i) {
        return jSONObject.optInt(str, i);
    }
}
