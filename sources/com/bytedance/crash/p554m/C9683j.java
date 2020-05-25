package com.bytedance.crash.p554m;

import org.json.JSONObject;

/* renamed from: com.bytedance.crash.m.j */
public final class C9683j {

    /* renamed from: a */
    public final int f26408a;

    /* renamed from: b */
    public String f26409b;

    /* renamed from: c */
    public JSONObject f26410c;

    /* renamed from: a */
    public final boolean mo17529a() {
        if (this.f26408a == 0) {
            return true;
        }
        return false;
    }

    public C9683j(int i) {
        this.f26408a = i;
    }

    public C9683j(int i, String str) {
        this.f26408a = i;
        this.f26409b = str;
    }

    public C9683j(int i, Throwable th) {
        this.f26408a = i;
        this.f26409b = th.getMessage();
    }

    public C9683j(int i, JSONObject jSONObject) {
        this.f26408a = 0;
        this.f26410c = jSONObject;
    }
}
