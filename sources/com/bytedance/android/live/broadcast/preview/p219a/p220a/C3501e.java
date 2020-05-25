package com.bytedance.android.live.broadcast.preview.p219a.p220a;

import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.livesdkapi.C8747h;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;

/* renamed from: com.bytedance.android.live.broadcast.preview.a.a.e */
public final class C3501e implements C8747h {

    /* renamed from: a */
    public StartLiveEventViewModel f9985a;

    /* renamed from: b */
    public StartLiveViewModel f9986b;

    /* renamed from: c */
    private Game f9987c;

    /* renamed from: d */
    private C8710m f9988d;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r0 == null) goto L_0x0017;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8890a(com.bytedance.android.livesdkapi.C8747h.C8748a r3) {
        /*
            r2 = this;
            java.lang.String r0 = "chain"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r2.f9986b
            if (r0 == 0) goto L_0x0017
            android.arch.lifecycle.r r0 = r0.mo8876d()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.livesdkapi.depend.model.live.m r0 = (com.bytedance.android.livesdkapi.depend.model.live.C8710m) r0
            if (r0 != 0) goto L_0x0019
        L_0x0017:
            com.bytedance.android.livesdkapi.depend.model.live.m r0 = com.bytedance.android.livesdkapi.depend.model.live.C8710m.VIDEO
        L_0x0019:
            r2.f9988d = r0
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r2.f9986b
            if (r0 == 0) goto L_0x002c
            android.arch.lifecycle.r r0 = r0.mo8878f()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.live.broadcast.api.model.Game r0 = (com.bytedance.android.live.broadcast.api.model.Game) r0
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            r2.f9987c = r0
            com.bytedance.android.livesdkapi.depend.model.live.m r0 = r2.f9988d
            com.bytedance.android.livesdkapi.depend.model.live.m r1 = com.bytedance.android.livesdkapi.depend.model.live.C8710m.SCREEN_RECORD
            if (r0 != r1) goto L_0x0058
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L_0x003c
            return
        L_0x003c:
            com.bytedance.android.live.broadcast.api.model.Game r0 = r2.f9987c
            if (r0 != 0) goto L_0x0058
            com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel r3 = r2.f9985a
            if (r3 == 0) goto L_0x0057
            d.f r3 = r3.f9909b
            java.lang.Object r3 = r3.getValue()
            com.bytedance.ies.sdk.widgets.NextLiveData r3 = (com.bytedance.ies.sdk.widgets.NextLiveData) r3
            if (r3 == 0) goto L_0x0057
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.postValue(r0)
            return
        L_0x0057:
            return
        L_0x0058:
            r3.mo8888a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.p219a.p220a.C3501e.mo8890a(com.bytedance.android.livesdkapi.h$a):void");
    }
}
