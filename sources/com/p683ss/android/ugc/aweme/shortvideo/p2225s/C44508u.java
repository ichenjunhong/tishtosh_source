package com.p683ss.android.ugc.aweme.shortvideo.p2225s;

import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.C43907k;
import com.p683ss.android.ugc.aweme.shortvideo.C44334o;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p683ss.android.ugc.tools.utils.C50203g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.s.u */
public final class C44508u extends C44468a {
    public final String toString() {
        return "SerialPublisher";
    }

    /* renamed from: e */
    public final void mo90366e() {
        C50203g.m108361b("SerialPublisher can't support prePublish");
    }

    /* renamed from: f */
    public final void mo90367f() {
        mo90355a(false);
    }

    /* renamed from: g */
    public final void mo90368g() {
        mo90351a();
        mo90357b();
    }

    /* renamed from: c */
    public final void mo90361c(VideoCreation videoCreation) {
        mo90352a(videoCreation);
    }

    /* renamed from: d */
    public final void mo90364d(VideoCreation videoCreation) {
        mo90358b(videoCreation);
    }

    public C44508u(C43907k kVar, int i, int i2, int i3, String str, boolean z, C44334o<C42421al> oVar) {
        C52711k.m112240b(kVar, "futureFactory");
        C52711k.m112240b(oVar, "callbacks");
        super(kVar, i, i2, i3, str, z, oVar);
    }
}
