package com.p683ss.android.ugc.asve.recorder;

import p2628d.p2639f.p2641b.C52718r;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;

/* renamed from: com.ss.android.ugc.asve.recorder.l */
final /* synthetic */ class C20529l extends C52718r {
    C20529l(VERecorderImpl vERecorderImpl) {
        super(vERecorderImpl);
    }

    public final String getName() {
        return "cameraController";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(VERecorderImpl.class);
    }

    public final String getSignature() {
        return "getCameraController()Lcom/ss/android/ugc/asve/recorder/camera/ICameraController;";
    }

    public final Object get() {
        return ((VERecorderImpl) this.receiver).mo43253b();
    }
}
