package com.bytedance.android.live.broadcast.viewmodel;

import com.bytedance.android.live.network.response.C4177d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.viewmodel.a */
final /* synthetic */ class C3646a implements C1710e {

    /* renamed from: a */
    private final StartLiveBannerViewModel f10379a;

    C3646a(StartLiveBannerViewModel startLiveBannerViewModel) {
        this.f10379a = startLiveBannerViewModel;
    }

    public final void accept(Object obj) {
        this.f10379a.f10378a.postValue(((C4177d) obj).data);
    }
}
