package com.p683ss.android.ugc.awemepushlib.p2408c;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.c.c */
public final class C48434c {

    /* renamed from: a */
    public HashMap<String, Object> f121798a = new HashMap<>();

    /* renamed from: a */
    public static C48434c m104801a() {
        return new C48434c();
    }

    /* renamed from: b */
    public final synchronized JSONObject mo95908b() {
        try {
        } catch (Exception unused) {
            return null;
        }
        return new JSONObject(this.f121798a);
    }

    /* renamed from: a */
    public final C48434c mo95906a(String str, Long l) {
        this.f121798a.put(str, l);
        return this;
    }

    /* renamed from: a */
    public final C48434c mo95907a(String str, String str2) {
        this.f121798a.put(str, str2);
        return this;
    }
}
