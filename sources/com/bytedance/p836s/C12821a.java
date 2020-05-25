package com.bytedance.p836s;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.C2240a;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.s.a */
public final class C12821a {

    /* renamed from: a */
    public static String f33563a = "TTVideofetchSettingTime";

    /* renamed from: b */
    public static String f33564b = "TTVideoSettingFetchQuery";

    /* renamed from: g */
    public static String f33565g = "setting_config";

    /* renamed from: h */
    public static String f33566h = "fetchSettingInterval";

    /* renamed from: i */
    private static C12821a f33567i;

    /* renamed from: c */
    public HashMap<String, Object> f33568c;

    /* renamed from: d */
    public int f33569d;

    /* renamed from: e */
    public Context f33570e;

    /* renamed from: f */
    public boolean f33571f;

    /* renamed from: b */
    public final void mo24289b() {
        new Timer().schedule(new TimerTask() {
            public final void run() {
                C12821a.this.mo24288a();
            }
        }, 5000);
    }

    /* renamed from: a */
    public final void mo24288a() {
        final String str;
        if (this.f33569d > 10) {
            this.f33569d = 0;
            return;
        }
        this.f33569d++;
        final HashMap hashMap = new HashMap();
        if (this.f33568c != null && !this.f33568c.isEmpty()) {
            Object obj = this.f33568c.get(f33564b);
            if (obj != null && (obj instanceof Map)) {
                hashMap = (HashMap) obj;
            }
        }
        if (hashMap.containsKey("region")) {
            String str2 = (String) hashMap.get("region");
            if (str2.equalsIgnoreCase("us-east-1")) {
                str = C12826d.f33587c;
            } else if (str2.equalsIgnoreCase("ap-singapore-1")) {
                str = C12826d.f33588d;
            } else if (str2.equalsIgnoreCase("cn-north-1")) {
                str = C12826d.f33589e;
            } else {
                return;
            }
            hashMap.put("caller_name", C12826d.m25731a());
            hashMap.put("device_platform", "android");
            hashMap.put("os_version", C12826d.m25737b());
            hashMap.put("app", Integer.valueOf(1));
            if (hashMap.get("device_brand") == null) {
                hashMap.put("device_brand", C12826d.m25738c());
            }
            if (hashMap.get("device_type") == null) {
                hashMap.put("device_type", C12826d.m25739d().toLowerCase());
            }
            if (this.f33571f) {
                hashMap.put("debug", Integer.valueOf(1));
            }
            new Thread(new Runnable() {
                public final void run() {
                    String str = "?";
                    for (Entry entry : hashMap.entrySet()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(entry.getKey());
                        sb.append("=");
                        sb.append(entry.getValue());
                        sb.append("&");
                        str = sb.toString();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C2240a.m6772a("%s/service/settings/v2/", new Object[]{str}));
                    sb2.append(str);
                    String a = C12826d.m25734a(sb2.toString());
                    if (a == null || a.isEmpty()) {
                        C12821a.this.mo24289b();
                        return;
                    }
                    Context applicationContext = C12821a.this.f33570e.getApplicationContext();
                    String str2 = C12821a.f33563a;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (str2 != null && !str2.isEmpty()) {
                        Editor edit = C12826d.m25730a(applicationContext).edit();
                        edit.putLong(str2, currentTimeMillis);
                        edit.commit();
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(a);
                        if (C12821a.this.f33571f) {
                            String str3 = C12826d.f33585a;
                            StringBuilder sb3 = new StringBuilder("videoSetting respone");
                            sb3.append(a);
                            C12826d.m25736a(str3, sb3.toString());
                        }
                        JSONObject jSONObject2 = (JSONObject) jSONObject.get("data");
                        if (jSONObject2 != null) {
                            if (!jSONObject2.isNull("app")) {
                                JSONObject jSONObject3 = jSONObject2.getJSONObject("app");
                                if (jSONObject3 == null) {
                                    C12821a.this.mo24289b();
                                    return;
                                }
                                C12825c a2 = C12825c.m25728a(C12821a.this.f33570e);
                                if (!jSONObject3.isNull(C12821a.f33565g)) {
                                    C12826d.m25735a(C12821a.this.f33570e, C12821a.f33565g, jSONObject3.getJSONObject(C12821a.f33565g).toString());
                                }
                                a2.f33581e.writeLock().lock();
                                a2.f33579b = jSONObject3;
                                if (a2.f33584h) {
                                    C12826d.m25735a(a2.f33578a, C12825c.f33576d, jSONObject3.toString());
                                }
                                a2.f33581e.writeLock().unlock();
                                a2.mo24293a(0);
                                return;
                            }
                        }
                        C12821a.this.mo24289b();
                    } catch (JSONException unused) {
                    }
                }
            }).start();
        }
    }

    private C12821a(Context context) {
        this.f33570e = context;
    }

    /* renamed from: a */
    public static synchronized C12821a m25725a(Context context) {
        C12821a aVar;
        synchronized (C12821a.class) {
            if (f33567i == null) {
                f33567i = new C12821a(context);
            }
            aVar = f33567i;
        }
        return aVar;
    }
}
