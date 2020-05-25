package com.bytedance.p753k.p758b.p761c;

import com.bytedance.android.livesdk.feed.p334c.C6856b;
import com.bytedance.android.livesdk.feed.p334c.C6857c;
import com.bytedance.android.livesdk.feed.p334c.C6858d;
import com.bytedance.android.livesdk.feed.tab.p349b.C7128p;
import com.bytedance.android.livesdkapi.service.C8861d;
import com.bytedance.p753k.p754a.p757c.C12114a;
import com.bytedance.p753k.p758b.p759a.C12119d;

/* renamed from: com.bytedance.k.b.c.a */
public final class C12124a implements C12114a {

    /* renamed from: a */
    private static volatile C12114a f32047a;

    private C12124a() {
    }

    /* renamed from: a */
    public final void mo22892a() {
        C7128p.m14812d().mo13183b().mo6505a(C6857c.f18796a, C6858d.f18797a);
    }

    /* renamed from: b */
    public static C12114a m24552b() {
        if (f32047a == null) {
            synchronized (C12119d.class) {
                if (f32047a == null) {
                    f32047a = new C12124a();
                }
            }
        }
        return f32047a;
    }

    /* renamed from: a */
    public final void mo22893a(C8861d dVar) {
        C6856b.m14398a(dVar);
    }
}
