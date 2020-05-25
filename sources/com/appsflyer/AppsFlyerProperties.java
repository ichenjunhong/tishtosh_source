package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerProperties {

    /* renamed from: ˏ */
    private static AppsFlyerProperties f7764 = new AppsFlyerProperties();

    /* renamed from: ʼ */
    private boolean f7765 = false;

    /* renamed from: ˊ */
    private String f7766;

    /* renamed from: ˋ */
    private Map<String, Object> f7767 = new HashMap();

    /* renamed from: ˎ */
    public boolean f7768;

    /* renamed from: ॱ */
    public boolean f7769;

    public static AppsFlyerProperties getInstance() {
        return f7764;
    }

    /* access modifiers changed from: protected */
    public void setFirstLaunchCalled() {
        this.f7768 = true;
    }

    /* access modifiers changed from: protected */
    public void setOnReceiveCalled() {
        this.f7769 = true;
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean("disableLogs", false);
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean("disableOtherSdk", false);
    }

    private AppsFlyerProperties() {
    }

    public Object getObject(String str) {
        return this.f7767.get(str);
    }

    /* access modifiers changed from: protected */
    public void setReferrer(String str) {
        set("AF_REFERRER", str);
        this.f7766 = str;
    }

    public String getString(String str) {
        return (String) this.f7767.get(str);
    }

    public String getReferrer(Context context) {
        if (this.f7766 != null) {
            return this.f7766;
        }
        if (getString("AF_REFERRER") != null) {
            return getString("AF_REFERRER");
        }
        if (context == null) {
            return null;
        }
        return C35807d.m80935a(context, "appsflyer-data", 0).getString("referrer", null);
    }

    public void saveProperties(SharedPreferences sharedPreferences) {
        String jSONObject = new JSONObject(this.f7767).toString();
        Editor edit = sharedPreferences.edit();
        edit.putString("savedProperties", jSONObject);
        if (VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    public void loadProperties(Context context) {
        if (!this.f7765) {
            String string = C35807d.m80935a(context, "appsflyer-data", 0).getString("savedProperties", null);
            if (string != null) {
                AFLogger.afDebugLog("Loading properties..");
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    Iterator keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String str = (String) keys.next();
                        if (this.f7767.get(str) == null) {
                            this.f7767.put(str, jSONObject.getString(str));
                        }
                    }
                    this.f7765 = true;
                } catch (JSONException e) {
                    AFLogger.afErrorLog("Failed loading properties", e);
                }
                StringBuilder sb = new StringBuilder("Done loading properties: ");
                sb.append(this.f7765);
                AFLogger.afDebugLog(sb.toString());
            }
        }
    }

    public void set(String str, String str2) {
        this.f7767.put(str, str2);
    }

    public boolean getBoolean(String str, boolean z) {
        String string = getString(str);
        if (string == null) {
            return z;
        }
        return Boolean.valueOf(string).booleanValue();
    }

    public int getInt(String str, int i) {
        String string = getString(str);
        if (string == null) {
            return i;
        }
        return Integer.valueOf(string).intValue();
    }

    public long getLong(String str, long j) {
        String string = getString(str);
        if (string == null) {
            return j;
        }
        return Long.valueOf(string).longValue();
    }

    public void set(String str, int i) {
        this.f7767.put(str, Integer.toString(i));
    }

    public void set(String str, long j) {
        this.f7767.put(str, Long.toString(j));
    }

    public void set(String str, boolean z) {
        this.f7767.put(str, Boolean.toString(z));
    }
}
