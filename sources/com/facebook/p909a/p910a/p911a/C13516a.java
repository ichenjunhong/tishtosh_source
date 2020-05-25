package com.facebook.p909a.p910a.p911a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.a.a.a */
public final class C13516a {

    /* renamed from: a */
    public final String f35271a;

    /* renamed from: b */
    public final C13518b f35272b;

    /* renamed from: c */
    public final C13517a f35273c;

    /* renamed from: d */
    public final String f35274d;

    /* renamed from: e */
    public final String f35275e;

    /* renamed from: f */
    public final String f35276f;

    /* renamed from: g */
    public final String f35277g;

    /* renamed from: h */
    private final List<C13520c> f35278h;

    /* renamed from: i */
    private final List<C13519b> f35279i;

    /* renamed from: com.facebook.a.a.a.a$a */
    public enum C13517a {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    /* renamed from: com.facebook.a.a.a.a$b */
    public enum C13518b {
        MANUAL,
        INFERENCE
    }

    /* renamed from: a */
    public final List<C13520c> mo25342a() {
        return Collections.unmodifiableList(this.f35278h);
    }

    /* renamed from: b */
    public final List<C13519b> mo25343b() {
        return Collections.unmodifiableList(this.f35279i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010 A[Catch:{ IllegalArgumentException | JSONException -> 0x001e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.facebook.p909a.p910a.p911a.C13516a> m27327a(org.json.JSONArray r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            if (r4 == 0) goto L_0x000d
            int r2 = r4.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            if (r1 >= r2) goto L_0x001e
            org.json.JSONObject r3 = r4.getJSONObject(r1)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            com.facebook.a.a.a.a r3 = m27326a(r3)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            r0.add(r3)     // Catch:{ IllegalArgumentException | JSONException -> 0x001e }
            int r1 = r1 + 1
            goto L_0x000e
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p909a.p910a.p911a.C13516a.m27327a(org.json.JSONArray):java.util.List");
    }

    /* renamed from: a */
    private static C13516a m27326a(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        String string = jSONObject.getString("event_name");
        C13518b valueOf = C13518b.valueOf(jSONObject.getString("method").toUpperCase(Locale.ENGLISH));
        C13517a valueOf2 = C13517a.valueOf(jSONObject.getString("event_type").toUpperCase(Locale.ENGLISH));
        String string2 = jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray(LeakCanaryFileProvider.f132050j);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new C13520c(jSONArray.getJSONObject(i)));
        }
        String optString = jSONObject.optString("path_type", "absolute");
        JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                arrayList2.add(new C13519b(optJSONArray.getJSONObject(i2)));
            }
        }
        C13516a aVar = new C13516a(string, valueOf, valueOf2, string2, arrayList, arrayList2, jSONObject.optString("component_id"), optString, jSONObject.optString("activity_name"));
        return aVar;
    }

    private C13516a(String str, C13518b bVar, C13517a aVar, String str2, List<C13520c> list, List<C13519b> list2, String str3, String str4, String str5) {
        this.f35271a = str;
        this.f35272b = bVar;
        this.f35273c = aVar;
        this.f35274d = str2;
        this.f35278h = list;
        this.f35279i = list2;
        this.f35275e = str3;
        this.f35276f = str4;
        this.f35277g = str5;
    }
}
