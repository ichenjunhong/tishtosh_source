package com.bytedance.p582g.p583a.p584a;

import com.bytedance.apm.C8936b;
import com.bytedance.apm.C8936b.C89467;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p480f.p481a.C9015b;
import com.bytedance.apm.p480f.p482b.C9019a;
import com.bytedance.apm.p497o.C9149b;
import org.json.JSONObject;

/* renamed from: com.bytedance.g.a.a.d */
public final class C9951d {
    /* renamed from: a */
    public static boolean m20000a(String str) {
        return ApmDelegate.m17947a().mo16431a(str);
    }

    /* renamed from: a */
    public static void m19997a(String str, JSONObject jSONObject) {
        C8936b.m17655a(str, jSONObject);
    }

    /* renamed from: a */
    public static void m19996a(String str, int i, JSONObject jSONObject) {
        C8936b.m17651a(str, i, jSONObject);
    }

    /* renamed from: a */
    public static void m19998a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        C8936b.m17656a(str, jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public static void m19999a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C8936b.m17657a(str, jSONObject, jSONObject2, jSONObject3);
    }

    /* renamed from: a */
    public static void m19995a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        C8936b.m17650a(j, j2, str, str2, str3, i, jSONObject);
    }

    /* renamed from: b */
    public static void m20001b(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        JSONObject a = C8936b.m17649a(jSONObject);
        C9149b a2 = C9149b.m18170a();
        C89467 r0 = new Runnable(j, j2, str, str2, str3, i, a) {

            /* renamed from: a */
            final /* synthetic */ long f24322a;

            /* renamed from: b */
            final /* synthetic */ long f24323b;

            /* renamed from: c */
            final /* synthetic */ String f24324c;

            /* renamed from: d */
            final /* synthetic */ String f24325d;

            /* renamed from: e */
            final /* synthetic */ String f24326e;

            /* renamed from: f */
            final /* synthetic */ int f24327f;

            /* renamed from: g */
            final /* synthetic */ JSONObject f24328g;

            public final void run() {
                C9015b a = C9015b.m17827a();
                C9019a aVar = new C9019a("api_error", this.f24322a, this.f24323b, this.f24324c, this.f24325d, this.f24326e, this.f24327f, this.f24328g);
                a.mo16336a(aVar);
            }

            {
                this.f24322a = r1;
                this.f24323b = r3;
                this.f24324c = r5;
                this.f24325d = r6;
                this.f24326e = r7;
                this.f24327f = r8;
                this.f24328g = r9;
            }
        };
        a2.mo16524a((Runnable) r0);
    }
}
