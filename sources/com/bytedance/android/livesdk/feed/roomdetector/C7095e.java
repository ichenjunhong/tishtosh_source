package com.bytedance.android.livesdk.feed.roomdetector;

import com.bytedance.android.livesdk.feed.roomdetector.C7089a.C7090a;
import com.bytedance.android.livesdk.feed.roomdetector.C7091b.C7092a;

/* renamed from: com.bytedance.android.livesdk.feed.roomdetector.e */
public final class C7095e implements C7089a, C7092a {

    /* renamed from: a */
    private C7091b f19306a;

    /* renamed from: b */
    private C7090a f19307b;

    /* renamed from: b */
    public final void mo13223b() {
        this.f19306a.mo13224a();
    }

    /* renamed from: a */
    public final void mo13222a() {
        C7091b bVar = this.f19306a;
        if (!bVar.f19296b) {
            bVar.f19296b = true;
            bVar.mo13225b();
        }
    }

    /* renamed from: c */
    public final boolean mo13228c() {
        if (this.f19307b == null || !this.f19307b.mo12943a()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo13229d() {
        if (this.f19307b != null) {
            this.f19307b.mo12944b();
        }
    }

    /* renamed from: e */
    public final void mo13230e() {
        if (this.f19307b != null) {
            this.f19307b.mo12945c();
        }
    }

    /* renamed from: a */
    public final void mo13226a(int i) {
        if (this.f19307b != null) {
            this.f19307b.mo12941a(i);
        }
    }

    /* renamed from: a */
    public final void mo13227a(long j, long j2) {
        if (this.f19307b != null) {
            this.f19307b.mo12942a(j, j2);
        }
    }

    public C7095e(long j, long j2, boolean z, C7090a aVar) {
        C7091b bVar = new C7091b(j, j2, "", true, this);
        this.f19306a = bVar;
        this.f19307b = aVar;
    }
}
