package com.bytedance.android.live.broadcast.preview.p219a.p220a;

import com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.livesdkapi.C8747h;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;

/* renamed from: com.bytedance.android.live.broadcast.preview.a.a.f */
public final class C3502f implements C8747h {

    /* renamed from: a */
    public StartLiveEventViewModel f9989a;

    /* renamed from: b */
    public StartLiveViewModel f9990b;

    /* renamed from: c */
    private C8710m f9991c = C8710m.VIDEO;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r0 == null) goto L_0x0017;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8890a(com.bytedance.android.livesdkapi.C8747h.C8748a r4) {
        /*
            r3 = this;
            java.lang.String r0 = "chain"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r3.f9990b
            if (r0 == 0) goto L_0x0017
            android.arch.lifecycle.r r0 = r0.mo8876d()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.livesdkapi.depend.model.live.m r0 = (com.bytedance.android.livesdkapi.depend.model.live.C8710m) r0
            if (r0 != 0) goto L_0x0019
        L_0x0017:
            com.bytedance.android.livesdkapi.depend.model.live.m r0 = com.bytedance.android.livesdkapi.depend.model.live.C8710m.VIDEO
        L_0x0019:
            r3.f9991c = r0
            com.bytedance.android.livesdkapi.depend.model.live.m r0 = r3.f9991c
            boolean r0 = r0.isStreamingBackground
            if (r0 == 0) goto L_0x0057
            java.lang.Class<com.bytedance.android.live.room.l> r0 = com.bytedance.android.live.room.C4193l.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.p245d.C4116c.m10249a(r0)
            java.lang.String r1 = "ServiceManager.getServic…IRoomService::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.bytedance.android.live.room.l r0 = (com.bytedance.android.live.room.C4193l) r0
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.getCurrentRoom()
            if (r0 == 0) goto L_0x0057
            boolean r1 = r0.isScreenshot
            if (r1 == 0) goto L_0x003e
            com.bytedance.android.livesdkapi.depend.model.live.m r1 = r3.f9991c
            com.bytedance.android.livesdkapi.depend.model.live.m r2 = com.bytedance.android.livesdkapi.depend.model.live.C8710m.SCREEN_RECORD
            if (r1 == r2) goto L_0x0048
        L_0x003e:
            boolean r1 = r0.isThirdParty
            if (r1 == 0) goto L_0x0057
            com.bytedance.android.livesdkapi.depend.model.live.m r1 = r3.f9991c
            com.bytedance.android.livesdkapi.depend.model.live.m r2 = com.bytedance.android.livesdkapi.depend.model.live.C8710m.THIRD_PARTY
            if (r1 != r2) goto L_0x0057
        L_0x0048:
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r4 = r3.f9990b
            if (r4 == 0) goto L_0x0056
            android.arch.lifecycle.r r4 = r4.mo8885m()
            if (r4 == 0) goto L_0x0056
            r4.postValue(r0)
            return
        L_0x0056:
            return
        L_0x0057:
            r4.mo8888a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.p219a.p220a.C3502f.mo8890a(com.bytedance.android.livesdkapi.h$a):void");
    }
}
