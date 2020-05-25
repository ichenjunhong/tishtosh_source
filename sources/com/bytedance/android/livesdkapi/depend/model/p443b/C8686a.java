package com.bytedance.android.livesdkapi.depend.model.p443b;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.b.a */
public class C8686a {

    /* renamed from: a */
    public long f23732a;

    /* renamed from: b */
    public long f23733b;

    /* renamed from: c */
    public String f23734c;

    /* renamed from: d */
    public String f23735d;
    @C17952c(mo34828a = "follow_status")

    /* renamed from: e */
    public int f23736e;

    /* renamed from: f */
    public C8687a f23737f = C8687a.Default;

    /* renamed from: g */
    public boolean f23738g;

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.b.a$a */
    public enum C8687a {
        Default,
        FromWeb
    }

    /* renamed from: a */
    public final int mo15140a() {
        if (this.f23736e < 0 || this.f23736e > 2) {
            this.f23736e = 0;
        }
        return this.f23736e;
    }
}
