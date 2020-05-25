package com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b;

import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import com.p683ss.android.ugc.asve.recorder.C20420b;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.b.w */
final /* synthetic */ class C45044w implements Runnable {

    /* renamed from: a */
    private final C45017b f114083a;

    C45044w(C45017b bVar) {
        this.f114083a = bVar;
    }

    public final void run() {
        C45017b bVar = this.f114083a;
        if (bVar.f114040r != null) {
            ASCameraView aSCameraView = bVar.f114040r;
            C45035n nVar = new C45035n(bVar);
            C52711k.m112240b(nVar, "callback");
            C20420b bVar2 = aSCameraView.f56318e;
            if (bVar2 == null) {
                C52711k.m112237a("recorder");
            }
            bVar2.mo43256d().mo43462a((OnARTextContentCallback) nVar);
        }
    }
}
