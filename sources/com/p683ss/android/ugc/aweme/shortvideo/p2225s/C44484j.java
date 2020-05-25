package com.p683ss.android.ugc.aweme.shortvideo.p2225s;

import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.C43907k;
import com.p683ss.android.ugc.aweme.shortvideo.C44334o;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.s.j */
public final class C44484j extends C44468a {

    /* renamed from: j */
    private volatile boolean f112506j;

    /* renamed from: k */
    private volatile boolean f112507k;

    public final String toString() {
        return "PreUploadPublisher";
    }

    /* renamed from: e */
    public final void mo90366e() {
        mo90355a(false);
        mo90351a();
    }

    /* renamed from: f */
    public final void mo90367f() {
        this.f112506j = true;
        mo90355a(false);
    }

    /* renamed from: g */
    public final synchronized void mo90368g() {
        this.f112507k = true;
        mo90351a();
        if (this.f112506j) {
            mo90357b();
        }
    }

    /* renamed from: c */
    public final void mo90361c(VideoCreation videoCreation) {
        mo90352a(videoCreation);
    }

    /* renamed from: d */
    public final void mo90364d(VideoCreation videoCreation) {
        if (this.f112506j && this.f112507k) {
            mo90358b(videoCreation);
        }
    }

    public C44484j(C43907k kVar, int i, int i2, int i3, String str, boolean z, C44334o<C42421al> oVar) {
        C52711k.m112240b(kVar, "futureFactory");
        C52711k.m112240b(oVar, "callbacks");
        super(kVar, i, i2, i3, str, z, oVar);
    }
}
