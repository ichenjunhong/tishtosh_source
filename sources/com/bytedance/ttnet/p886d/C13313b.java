package com.bytedance.ttnet.p886d;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9415i;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.d.b */
public final class C13313b {

    /* renamed from: d */
    private static final Object f34732d = new Object();

    /* renamed from: a */
    public Context f34733a;

    /* renamed from: b */
    public C13312a f34734b;

    /* renamed from: c */
    private boolean f34735c = true;

    /* renamed from: a */
    public final void mo24921a() {
        String str;
        if (this.f34735c) {
            String string = C35807d.m80935a(this.f34733a, "ttnet_tnc_config", 0).getString("tnc_config_str", null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    C13312a b = m26809b(new JSONObject(string));
                    if (b != null) {
                        this.f34734b = b;
                    }
                    if (C9415i.m18635b()) {
                        StringBuilder sb = new StringBuilder("loadLocalConfig: ");
                        if (b == null) {
                            str = TEVideoRecorder.FACE_BEAUTY_NULL;
                        } else {
                            str = b.toString();
                        }
                        sb.append(str);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public static C13312a m26809b(JSONObject jSONObject) {
        boolean z;
        try {
            C13312a aVar = new C13312a();
            boolean z2 = true;
            if (jSONObject.has("local_enable")) {
                if (jSONObject.getInt("local_enable") == 0) {
                    z = false;
                } else {
                    z = true;
                }
                aVar.f34719a = z;
            }
            if (jSONObject.has("probe_enable")) {
                if (jSONObject.getInt("probe_enable") == 0) {
                    z2 = false;
                }
                aVar.f34720b = z2;
            }
            if (jSONObject.has("local_host_filter")) {
                JSONArray jSONArray = jSONObject.getJSONArray("local_host_filter");
                HashMap hashMap = new HashMap();
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(string, Integer.valueOf(0));
                        }
                    }
                }
                aVar.f34721c = hashMap;
            } else {
                aVar.f34721c = null;
            }
            if (jSONObject.has("host_replace_map")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("host_replace_map");
                HashMap hashMap2 = new HashMap();
                if (jSONObject2.length() > 0) {
                    Iterator keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String str = (String) keys.next();
                        String string2 = jSONObject2.getString(str);
                        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(string2)) {
                            hashMap2.put(str, string2);
                        }
                    }
                }
                aVar.f34722d = hashMap2;
            } else {
                aVar.f34722d = null;
            }
            aVar.f34723e = jSONObject.optInt("req_to_cnt", aVar.f34723e);
            aVar.f34724f = jSONObject.optInt("req_to_api_cnt", aVar.f34724f);
            aVar.f34725g = jSONObject.optInt("req_to_ip_cnt", aVar.f34725g);
            aVar.f34726h = jSONObject.optInt("req_err_cnt", aVar.f34726h);
            aVar.f34727i = jSONObject.optInt("req_err_api_cnt", aVar.f34727i);
            aVar.f34728j = jSONObject.optInt("req_err_ip_cnt", aVar.f34728j);
            aVar.f34729k = jSONObject.optInt("update_interval", aVar.f34729k);
            aVar.f34730l = jSONObject.optInt("update_random_range", aVar.f34730l);
            aVar.f34731m = jSONObject.optString("http_code_black", aVar.f34731m);
            return aVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011a, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r10.f34734b = new com.bytedance.ttnet.p886d.C13312a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0125, code lost:
        monitor-enter(f34732d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r10.f34733a, "ttnet_tnc_config", 0).edit().putString("tnc_config_str", r0).apply();
        com.bytedance.ttnet.p887e.C13330e.m26851a(r10.f34733a, 4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0147, code lost:
        monitor-enter(f34732d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r10.f34733a, "ttnet_tnc_config", 0).edit().putString("tnc_config_str", r0).apply();
        com.bytedance.ttnet.p887e.C13330e.m26851a(r10.f34733a, 4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0163, code lost:
        throw r11;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x011c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24922a(org.json.JSONObject r11) {
        /*
            r10 = this;
            boolean r0 = r10.f34735c
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.String r0 = ""
            r1 = 4
            r2 = 0
            java.lang.String r3 = "ttnet_url_dispatcher_enabled"
            int r3 = r11.optInt(r3, r2)     // Catch:{ Throwable -> 0x011c }
            if (r3 <= 0) goto L_0x0013
            r3 = 1
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            java.lang.String r4 = "ttnet_dispatch_actions"
            org.json.JSONArray r4 = r11.optJSONArray(r4)     // Catch:{ Throwable -> 0x011c }
            r5 = 0
            boolean r6 = com.bytedance.ttnet.C13303d.f34699b     // Catch:{ Throwable -> 0x011c }
            if (r6 == 0) goto L_0x008a
            if (r3 == 0) goto L_0x008a
            if (r4 == 0) goto L_0x008a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Throwable -> 0x011c }
            r3.<init>()     // Catch:{ Throwable -> 0x011c }
            r6 = 0
        L_0x0029:
            int r7 = r4.length()     // Catch:{ Throwable -> 0x011c }
            if (r6 >= r7) goto L_0x0057
            java.lang.Object r7 = r4.get(r6)     // Catch:{ Throwable -> 0x011c }
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ Throwable -> 0x011c }
            java.lang.String r8 = "param"
            org.json.JSONObject r7 = r7.getJSONObject(r8)     // Catch:{ Throwable -> 0x011c }
            java.lang.String r8 = "service_name"
            java.lang.String r9 = ""
            java.lang.String r8 = r7.optString(r8, r9)     // Catch:{ Throwable -> 0x011c }
            java.lang.String r9 = "idc_selection"
            boolean r8 = r8.equals(r9)     // Catch:{ Throwable -> 0x011c }
            if (r8 == 0) goto L_0x0054
            java.lang.String r8 = "strategy_info"
            org.json.JSONObject r7 = r7.getJSONObject(r8)     // Catch:{ Throwable -> 0x011c }
            r3.add(r7)     // Catch:{ Throwable -> 0x011c }
        L_0x0054:
            int r6 = r6 + 1
            goto L_0x0029
        L_0x0057:
            boolean r4 = r3.isEmpty()     // Catch:{ Throwable -> 0x011c }
            if (r4 != 0) goto L_0x008a
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x011c }
            r5.<init>()     // Catch:{ Throwable -> 0x011c }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x011c }
        L_0x0066:
            boolean r4 = r3.hasNext()     // Catch:{ Throwable -> 0x011c }
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r3.next()     // Catch:{ Throwable -> 0x011c }
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch:{ Throwable -> 0x011c }
            java.util.Iterator r6 = r4.keys()     // Catch:{ Throwable -> 0x011c }
        L_0x0076:
            boolean r7 = r6.hasNext()     // Catch:{ Throwable -> 0x011c }
            if (r7 == 0) goto L_0x0066
            java.lang.Object r7 = r6.next()     // Catch:{ Throwable -> 0x011c }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x011c }
            java.lang.String r8 = r4.getString(r7)     // Catch:{ Throwable -> 0x011c }
            r5.put(r7, r8)     // Catch:{ Throwable -> 0x011c }
            goto L_0x0076
        L_0x008a:
            java.lang.String r3 = "tnc_config"
            org.json.JSONObject r11 = r11.optJSONObject(r3)     // Catch:{ Throwable -> 0x011c }
            if (r11 != 0) goto L_0x009d
            if (r5 == 0) goto L_0x0095
            goto L_0x009d
        L_0x0095:
            org.json.JSONException r11 = new org.json.JSONException     // Catch:{ Throwable -> 0x011c }
            java.lang.String r3 = "tnc config is null"
            r11.<init>(r3)     // Catch:{ Throwable -> 0x011c }
            throw r11     // Catch:{ Throwable -> 0x011c }
        L_0x009d:
            if (r11 != 0) goto L_0x00aa
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Throwable -> 0x011c }
            r11.<init>()     // Catch:{ Throwable -> 0x011c }
            java.lang.String r3 = "host_replace_map"
            r11.put(r3, r5)     // Catch:{ Throwable -> 0x011c }
            goto L_0x00b1
        L_0x00aa:
            if (r5 == 0) goto L_0x00b1
            java.lang.String r3 = "host_replace_map"
            r11.put(r3, r5)     // Catch:{ Throwable -> 0x011c }
        L_0x00b1:
            com.bytedance.ttnet.d.a r3 = m26809b(r11)     // Catch:{ Throwable -> 0x011c }
            boolean r4 = com.bytedance.common.utility.C9415i.m18635b()     // Catch:{ Throwable -> 0x011c }
            if (r4 == 0) goto L_0x00ce
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x011c }
            java.lang.String r5 = "handleConfigChanged, newConfig: "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x011c }
            if (r3 != 0) goto L_0x00c7
            java.lang.String r5 = "null"
            goto L_0x00cb
        L_0x00c7:
            java.lang.String r5 = r3.toString()     // Catch:{ Throwable -> 0x011c }
        L_0x00cb:
            r4.append(r5)     // Catch:{ Throwable -> 0x011c }
        L_0x00ce:
            if (r3 != 0) goto L_0x00f2
            java.lang.Object r4 = f34732d
            monitor-enter(r4)
            android.content.Context r11 = r10.f34733a     // Catch:{ all -> 0x00ef }
            java.lang.String r3 = "ttnet_tnc_config"
            android.content.SharedPreferences r11 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r11, r3, r2)     // Catch:{ all -> 0x00ef }
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = "tnc_config_str"
            android.content.SharedPreferences$Editor r11 = r11.putString(r2, r0)     // Catch:{ all -> 0x00ef }
            r11.apply()     // Catch:{ all -> 0x00ef }
            android.content.Context r11 = r10.f34733a     // Catch:{ all -> 0x00ef }
            com.bytedance.ttnet.p887e.C13330e.m26851a(r11, r1, r0)     // Catch:{ all -> 0x00ef }
            monitor-exit(r4)     // Catch:{ all -> 0x00ef }
            return
        L_0x00ef:
            r11 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00ef }
            throw r11
        L_0x00f2:
            r10.f34734b = r3     // Catch:{ Throwable -> 0x011c }
            java.lang.String r11 = r11.toString()     // Catch:{ Throwable -> 0x011c }
            java.lang.Object r3 = f34732d
            monitor-enter(r3)
            android.content.Context r0 = r10.f34733a     // Catch:{ all -> 0x0117 }
            java.lang.String r4 = "ttnet_tnc_config"
            android.content.SharedPreferences r0 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r0, r4, r2)     // Catch:{ all -> 0x0117 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0117 }
            java.lang.String r2 = "tnc_config_str"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r11)     // Catch:{ all -> 0x0117 }
            r0.apply()     // Catch:{ all -> 0x0117 }
            android.content.Context r0 = r10.f34733a     // Catch:{ all -> 0x0117 }
            com.bytedance.ttnet.p887e.C13330e.m26851a(r0, r1, r11)     // Catch:{ all -> 0x0117 }
            monitor-exit(r3)     // Catch:{ all -> 0x0117 }
            goto L_0x0141
        L_0x0117:
            r11 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0117 }
            throw r11
        L_0x011a:
            r11 = move-exception
            goto L_0x0145
        L_0x011c:
            com.bytedance.ttnet.d.a r11 = new com.bytedance.ttnet.d.a     // Catch:{ all -> 0x011a }
            r11.<init>()     // Catch:{ all -> 0x011a }
            r10.f34734b = r11     // Catch:{ all -> 0x011a }
            java.lang.Object r11 = f34732d
            monitor-enter(r11)
            android.content.Context r3 = r10.f34733a     // Catch:{ all -> 0x0142 }
            java.lang.String r4 = "ttnet_tnc_config"
            android.content.SharedPreferences r2 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r3, r4, r2)     // Catch:{ all -> 0x0142 }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x0142 }
            java.lang.String r3 = "tnc_config_str"
            android.content.SharedPreferences$Editor r2 = r2.putString(r3, r0)     // Catch:{ all -> 0x0142 }
            r2.apply()     // Catch:{ all -> 0x0142 }
            android.content.Context r2 = r10.f34733a     // Catch:{ all -> 0x0142 }
            com.bytedance.ttnet.p887e.C13330e.m26851a(r2, r1, r0)     // Catch:{ all -> 0x0142 }
            monitor-exit(r11)     // Catch:{ all -> 0x0142 }
        L_0x0141:
            return
        L_0x0142:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0142 }
            throw r0
        L_0x0145:
            java.lang.Object r3 = f34732d
            monitor-enter(r3)
            android.content.Context r4 = r10.f34733a     // Catch:{ all -> 0x0164 }
            java.lang.String r5 = "ttnet_tnc_config"
            android.content.SharedPreferences r2 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r4, r5, r2)     // Catch:{ all -> 0x0164 }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x0164 }
            java.lang.String r4 = "tnc_config_str"
            android.content.SharedPreferences$Editor r2 = r2.putString(r4, r0)     // Catch:{ all -> 0x0164 }
            r2.apply()     // Catch:{ all -> 0x0164 }
            android.content.Context r2 = r10.f34733a     // Catch:{ all -> 0x0164 }
            com.bytedance.ttnet.p887e.C13330e.m26851a(r2, r1, r0)     // Catch:{ all -> 0x0164 }
            monitor-exit(r3)     // Catch:{ all -> 0x0164 }
            throw r11
        L_0x0164:
            r11 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0164 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p886d.C13313b.mo24922a(org.json.JSONObject):void");
    }

    public C13313b(Context context, boolean z) {
        this.f34733a = context;
        this.f34735c = z;
        this.f34734b = new C13312a();
    }
}
