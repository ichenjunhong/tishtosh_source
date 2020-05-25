package com.p683ss.android.ugc.aweme.account.p1273f;

import com.bytedance.sdk.account.p877l.C13207b;
import com.p683ss.android.account.C18492b.C18493a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.f.b */
public final class C20969b {

    /* renamed from: e */
    public static final C20970a f57076e = new C20970a(null);

    /* renamed from: a */
    public C13207b f57077a;

    /* renamed from: b */
    public String f57078b;

    /* renamed from: c */
    public boolean f57079c = true;

    /* renamed from: d */
    public JSONObject f57080d;

    /* renamed from: com.ss.android.ugc.aweme.account.f.b$a */
    public static final class C20970a {
        private C20970a() {
        }

        public /* synthetic */ C20970a(C52707g gVar) {
            this();
        }
    }

    public C20969b(String str, boolean z, JSONObject jSONObject) {
        C52711k.m112240b(jSONObject, "userData");
        this.f57078b = str;
        this.f57080d = jSONObject;
        new C18493a();
        this.f57077a = C18493a.m44735b(this.f57080d);
    }
}
