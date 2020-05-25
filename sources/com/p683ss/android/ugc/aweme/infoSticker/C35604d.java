package com.p683ss.android.ugc.aweme.infoSticker;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.d */
final /* synthetic */ class C35604d implements C0199s {

    /* renamed from: a */
    private final C35586b f91510a;

    C35604d(C35586b bVar) {
        this.f91510a = bVar;
    }

    public final void onChanged(Object obj) {
        C35586b bVar = this.f91510a;
        C37721a aVar = (C37721a) obj;
        if (aVar != null && C355881.f91460a[aVar.f96126b.ordinal()] == 1) {
            bVar.mo73981a((AVChallenge) aVar.f96125a);
        }
    }
}
