package com.bytedance.android.livesdk.p267a;

import com.bytedance.android.livesdk.p267a.C4489d.C4490a;
import com.bytedance.android.livesdk.p267a.p268a.C4476a;
import com.bytedance.android.livesdk.p267a.p268a.C4479c;
import com.bytedance.android.livesdk.p267a.p268a.C4480d;
import com.bytedance.android.livesdk.p267a.p268a.C4482e;
import com.bytedance.android.livesdk.p267a.p268a.C4486f;

/* renamed from: com.bytedance.android.livesdk.a.b */
public class C4487b {

    /* renamed from: a */
    private static C4487b f12255a;

    /* renamed from: b */
    private C4473a f12256b = new C4473a();

    /* renamed from: a */
    public static C4487b m10802a() {
        if (f12255a == null) {
            synchronized (C4487b.class) {
                if (f12255a == null) {
                    f12255a = new C4487b();
                }
            }
        }
        return f12255a;
    }

    private C4487b() {
        m10803a((C4489d) new C4486f());
        m10803a((C4489d) new C4476a());
        m10803a((C4489d) new C4479c());
        m10803a((C4489d) new C4480d());
        m10803a((C4489d) new C4482e());
    }

    /* renamed from: a */
    private void m10803a(C4489d dVar) {
        this.f12256b.mo10282a(dVar);
    }

    /* renamed from: a */
    public final void mo10287a(String str) {
        mo10288a(str, null);
    }

    /* renamed from: a */
    public final void mo10288a(String str, C4490a aVar) {
        try {
            this.f12256b.mo10283a(str, aVar);
        } catch (Exception unused) {
        }
    }
}
