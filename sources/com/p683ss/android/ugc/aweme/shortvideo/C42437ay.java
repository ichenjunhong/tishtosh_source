package com.p683ss.android.ugc.aweme.shortvideo;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ay */
public final class C42437ay {

    /* renamed from: a */
    private HashMap<String, Object> f107328a = new HashMap<>();

    /* renamed from: a */
    public static C42437ay m93202a() {
        return new C42437ay();
    }

    /* renamed from: b */
    public final synchronized JSONObject mo86522b() {
        try {
        } catch (Exception unused) {
            return null;
        }
        return new JSONObject(this.f107328a);
    }

    /* renamed from: a */
    public final C42437ay mo86517a(String str, Boolean bool) {
        this.f107328a.put(str, bool);
        return this;
    }

    /* renamed from: a */
    public final C42437ay mo86518a(String str, Float f) {
        this.f107328a.put(str, f);
        return this;
    }

    /* renamed from: a */
    public final C42437ay mo86519a(String str, Integer num) {
        this.f107328a.put(str, num);
        return this;
    }

    /* renamed from: a */
    public final C42437ay mo86520a(String str, Long l) {
        this.f107328a.put(str, l);
        return this;
    }

    /* renamed from: a */
    public final C42437ay mo86521a(String str, String str2) {
        this.f107328a.put(str, str2);
        return this;
    }
}
