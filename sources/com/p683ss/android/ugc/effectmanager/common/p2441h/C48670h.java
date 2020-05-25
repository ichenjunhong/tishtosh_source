package com.p683ss.android.ugc.effectmanager.common.p2441h;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.effectmanager.common.h.h */
public final class C48670h {

    /* renamed from: a */
    public HashMap<String, Object> f122309a = new HashMap<>();

    /* renamed from: a */
    public static C48670h m105314a() {
        return new C48670h();
    }

    /* renamed from: b */
    public final synchronized JSONObject mo96256b() {
        try {
        } catch (Exception unused) {
            return null;
        }
        return new JSONObject(this.f122309a);
    }

    /* renamed from: a */
    public final C48670h mo96253a(String str, Integer num) {
        this.f122309a.put(str, num);
        return this;
    }

    /* renamed from: a */
    public final C48670h mo96254a(String str, Long l) {
        this.f122309a.put(str, l);
        return this;
    }

    /* renamed from: a */
    public final C48670h mo96255a(String str, String str2) {
        this.f122309a.put(str, str2);
        return this;
    }
}
