package com.p683ss.android.ugc.asve.recorder.view;

import android.content.Context;
import android.view.MotionEvent;
import com.p683ss.android.ugc.asve.recorder.C20420b;
import com.p683ss.android.ugc.asve.recorder.camera.p1247b.C20458a;
import com.p683ss.android.ugc.asve.recorder.reaction.p1249a.C20532a;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.recorder.view.b */
public final class C20564b implements C20566d {

    /* renamed from: a */
    public final C20569g f56369a;

    /* renamed from: b */
    private C20566d f56370b;

    /* renamed from: a */
    public final void mo43403a(boolean z) {
        this.f56370b.mo43403a(z);
    }

    /* renamed from: a */
    public final void mo43402a(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "event");
        this.f56370b.mo43402a(motionEvent);
    }

    public C20564b(Context context, ASCameraView aSCameraView, C20420b bVar) {
        C20566d dVar;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aSCameraView, "rootView");
        C52711k.m112240b(bVar, "recorder");
        if (C20565c.f56371a[bVar.f55979a.ordinal()] != 1) {
            dVar = new C20458a(context, aSCameraView, bVar);
        } else {
            C20532a aVar = new C20532a(context, aSCameraView, bVar.mo43258f(), bVar.mo43253b(), aSCameraView.getReactionViewHelper$tools_asve_release());
            dVar = aVar;
        }
        this.f56370b = dVar;
        C20566d dVar2 = this.f56370b;
        if (dVar2 != null) {
            this.f56369a = (C20569g) dVar2;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.asve.recorder.view.GestureDispatcher");
    }
}
