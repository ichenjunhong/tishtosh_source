package com.bytedance.android.live.core.setting;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.widget.Toast;
import com.C2240a;
import com.bytedance.android.live.base.p192sp.TTLiveSettingUtil;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.setting.i */
public final class C4088i {

    /* renamed from: a */
    static final SharedPreferences f11245a;

    /* renamed from: b */
    static Map<String, JSONObject> f11246b = new HashMap();

    /* renamed from: c */
    static Map<String, Map<String, Object>> f11247c = new HashMap();

    /* renamed from: b */
    private static boolean m10209b() {
        return C4098q.m10218a();
    }

    /* renamed from: a */
    public static Context m10204a() {
        if (C4116c.m10249a(IHostContext.class) == null) {
            return null;
        }
        return ((IHostContext) C4116c.m10249a(IHostContext.class)).context();
    }

    static {
        SharedPreferences sharedPreferences;
        if (m10204a() == null) {
            sharedPreferences = null;
        } else {
            sharedPreferences = C35807d.m80935a(m10204a(), "ttlive_sdk_shared_pref_cache", 4);
        }
        f11245a = sharedPreferences;
        try {
            f11246b.put("key_ttlive_sdk_setting", new JSONObject(f11245a.getString("key_ttlive_sdk_setting", "")));
        } catch (Exception unused) {
            f11246b.put("key_ttlive_sdk_setting", new JSONObject());
        }
        try {
            f11246b.put("TT_APP_SETTING", new JSONObject(f11245a.getString("TT_APP_SETTING", "")));
        } catch (Exception unused2) {
            f11246b.put("TT_APP_SETTING", new JSONObject());
        }
        try {
            f11246b.put("TT_USER_SETTING", new JSONObject(f11245a.getString("TT_USER_SETTING", "")));
        } catch (Exception unused3) {
            f11246b.put("TT_USER_SETTING", new JSONObject());
        }
        TTLiveSettingUtil.update.mo6545f(C4089j.f11248a);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        f11247c.clear();
        f11247c.put("key_ttlive_sdk_setting", hashMap);
        f11247c.put("TT_APP_SETTING", hashMap2);
        f11247c.put("TT_USER_SETTING", hashMap3);
    }

    /* renamed from: a */
    public static String m10206a(String str, C4097p pVar) {
        if (f11246b.containsKey(str) && !((JSONObject) f11246b.get(str)).isNull(pVar.f11267a)) {
            try {
                return String.valueOf(((JSONObject) f11246b.get(str)).get(pVar.f11267a));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m10207a(C4097p pVar, String str) {
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (pVar.f11271e == Boolean.class) {
                        f11245a.edit().putBoolean(pVar.f11267a, Boolean.valueOf(Boolean.parseBoolean(str)).booleanValue()).apply();
                    } else if (pVar.f11271e == Integer.class) {
                        f11245a.edit().putInt(pVar.f11267a, Integer.parseInt(str)).apply();
                    } else if (pVar.f11271e == Long.class) {
                        f11245a.edit().putLong(pVar.f11267a, Long.parseLong(str)).apply();
                    } else if (pVar.f11271e == Float.class) {
                        f11245a.edit().putFloat(pVar.f11267a, Float.parseFloat(str)).apply();
                    } else if (pVar.f11271e == Double.class) {
                        f11245a.edit().putString(pVar.f11267a, String.valueOf((double) Long.parseLong(str))).apply();
                    } else if (pVar.f11271e == String.class) {
                        f11245a.edit().putString(pVar.f11267a, str).apply();
                    } else {
                        f11245a.edit().putString(pVar.f11267a, str).apply();
                        f11247c.remove(pVar.f11267a);
                    }
                    return true;
                }
            } catch (NumberFormatException unused) {
                Toast makeText = Toast.makeText(m10204a(), C2240a.m6773a(Locale.US, "Illegal value of %s : %s", new Object[]{pVar.f11267a, String.valueOf(str)}), 0);
                if (VERSION.SDK_INT == 25) {
                    C47905fy.m103630a(makeText);
                }
                makeText.show();
                return false;
            }
        }
        f11245a.edit().remove(pVar.f11267a).apply();
        f11247c.remove(pVar.f11267a);
        return true;
    }

    /* renamed from: a */
    private static double m10203a(String str, String str2, double d) {
        if (m10209b() && f11245a.contains(str2)) {
            try {
                return Double.parseDouble(f11245a.getString(str2, String.valueOf(d)));
            } catch (Exception unused) {
                return d;
            }
        } else if (f11246b.get(str) == null) {
            return d;
        } else {
            return ((JSONObject) f11246b.get(str)).optDouble(str2, d);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002d */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035 A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038 A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064 A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070 A[Catch:{ Exception -> 0x007c }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T m10208b(java.lang.String r2, java.lang.String r3, java.lang.reflect.Type r4, T r5) {
        /*
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r0 = f11247c     // Catch:{ Exception -> 0x007c }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x007c }
            if (r0 != 0) goto L_0x0012
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r0 = f11247c     // Catch:{ Exception -> 0x007c }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Exception -> 0x007c }
            r1.<init>()     // Catch:{ Exception -> 0x007c }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x007c }
        L_0x0012:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r0 = f11247c     // Catch:{ Exception -> 0x007c }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x007c }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x007c }
            boolean r0 = r0.containsKey(r3)     // Catch:{ Exception -> 0x007c }
            if (r0 == 0) goto L_0x002d
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r0 = f11247c     // Catch:{ Exception -> 0x002d }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x002d }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x002d }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x002d }
            return r0
        L_0x002d:
            java.util.Map<java.lang.String, org.json.JSONObject> r0 = f11246b     // Catch:{ Exception -> 0x007c }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x007c }
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = ""
            goto L_0x0046
        L_0x0038:
            java.util.Map<java.lang.String, org.json.JSONObject> r0 = f11246b     // Catch:{ Exception -> 0x007c }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x007c }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ Exception -> 0x007c }
            java.lang.String r1 = ""
            java.lang.String r0 = r0.optString(r3, r1)     // Catch:{ Exception -> 0x007c }
        L_0x0046:
            boolean r1 = m10209b()     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x005a
            android.content.SharedPreferences r1 = f11245a     // Catch:{ Exception -> 0x007c }
            boolean r1 = r1.contains(r3)     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x005a
            android.content.SharedPreferences r1 = f11245a     // Catch:{ Exception -> 0x007c }
            java.lang.String r0 = r1.getString(r3, r0)     // Catch:{ Exception -> 0x007c }
        L_0x005a:
            com.google.gson.f r1 = com.bytedance.android.live.core.setting.C4098q.m10222c()     // Catch:{ Exception -> 0x007c }
            java.lang.Object r4 = r1.mo34885a(r0, r4)     // Catch:{ Exception -> 0x007c }
            if (r4 != 0) goto L_0x0070
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r4 = f11247c     // Catch:{ Exception -> 0x007c }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ Exception -> 0x007c }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ Exception -> 0x007c }
            r4.remove(r3)     // Catch:{ Exception -> 0x007c }
            return r5
        L_0x0070:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r0 = f11247c     // Catch:{ Exception -> 0x007c }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x007c }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x007c }
            r0.put(r3, r4)     // Catch:{ Exception -> 0x007c }
            return r4
        L_0x007c:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r4 = f11247c
            java.lang.Object r4 = r4.get(r2)
            if (r4 == 0) goto L_0x0090
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r4 = f11247c
            java.lang.Object r2 = r4.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            r2.remove(r3)
        L_0x0090:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.setting.C4088i.m10208b(java.lang.String, java.lang.String, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public static <T> T m10205a(String str, String str2, Type type, T t) {
        if (type == Boolean.class) {
            boolean booleanValue = ((Boolean) t).booleanValue();
            if (!m10209b() || !f11245a.contains(str2)) {
                JSONObject jSONObject = (JSONObject) f11246b.get(str);
                if (jSONObject != null) {
                    booleanValue = jSONObject.optBoolean(str2);
                }
            } else {
                booleanValue = f11245a.getBoolean(str2, booleanValue);
            }
            return Boolean.valueOf(booleanValue);
        } else if (type == Integer.class || type == Short.class) {
            int intValue = ((Integer) t).intValue();
            if (m10209b() && f11245a.contains(str2)) {
                intValue = f11245a.getInt(str2, intValue);
            } else if (f11246b.get(str) != null) {
                intValue = ((JSONObject) f11246b.get(str)).optInt(str2, intValue);
            }
            return Integer.valueOf(intValue);
        } else if (type == Float.class) {
            float floatValue = ((Float) t).floatValue();
            if (m10209b() && f11245a.contains(str2)) {
                floatValue = f11245a.getFloat(str2, floatValue);
            } else if (f11246b.get(str) != null) {
                floatValue = (float) ((JSONObject) f11246b.get(str)).optDouble(str2, (double) floatValue);
            }
            return Float.valueOf(floatValue);
        } else if (type == Long.class) {
            long longValue = ((Long) t).longValue();
            if (m10209b() && f11245a.contains(str2)) {
                longValue = f11245a.getLong(str2, longValue);
            } else if (f11246b.get(str) != null) {
                longValue = ((JSONObject) f11246b.get(str)).optLong(str2, longValue);
            }
            return Long.valueOf(longValue);
        } else if (type == Double.class) {
            return Double.valueOf(m10203a(str, str2, ((Double) t).doubleValue()));
        } else {
            if (type != String.class) {
                return m10208b(str, str2, type, t);
            }
            T t2 = (String) t;
            if (m10209b() && f11245a.contains(str2)) {
                return f11245a.getString(str2, t2);
            }
            if (f11246b.get(str) == null) {
                return t2;
            }
            return ((JSONObject) f11246b.get(str)).optString(str2, t2);
        }
    }
}
