package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;

/* renamed from: com.bytedance.android.live.broadcast.preview.ar */
final /* synthetic */ class C3528ar implements Runnable {

    /* renamed from: a */
    private final C3514al f10085a;

    C3528ar(C3514al alVar) {
        this.f10085a = alVar;
    }

    public final void run() {
        this.f10085a.mo8352a(C8710m.valueOf((String) C4525b.f12314J.mo10345a()));
        ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).dnsOptimizer().mo9576a(true);
    }
}
