package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20679g.C20680a;
import java.lang.ref.WeakReference;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.t */
public final class C20645t extends C20680a {

    /* renamed from: a */
    private final WeakReference<C52671b<RecorderConcatResult, C52860x>> f56497a;

    public C20645t(C52671b<? super RecorderConcatResult, C52860x> bVar) {
        C52711k.m112240b(bVar, "listener");
        this.f56497a = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public final void mo43779a(RecorderConcatResult recorderConcatResult) {
        C52711k.m112240b(recorderConcatResult, "result");
        C52671b bVar = (C52671b) this.f56497a.get();
        if (bVar != null) {
            bVar.invoke(recorderConcatResult);
        }
    }
}
