package com.bytedance.android.live.broadcast;

import android.support.p030v4.app.C0654k;
import android.widget.FrameLayout;
import com.bytedance.android.live.broadcast.widget.C3772g;
import com.bytedance.android.live.broadcast.widget.VideoWidget2;

/* renamed from: com.bytedance.android.live.broadcast.i */
final /* synthetic */ class C3447i implements Runnable {

    /* renamed from: a */
    private final C3134c f9863a;

    C3447i(C3134c cVar) {
        this.f9863a = cVar;
    }

    public final void run() {
        C3134c cVar = this.f9863a;
        if (cVar.f9130d != null) {
            ((C3772g) cVar.f9144r).mo9105f();
            if (cVar.f9130d != null && (cVar.f9144r instanceof VideoWidget2)) {
                VideoWidget2 videoWidget2 = (VideoWidget2) cVar.f9144r;
                FrameLayout e = cVar.f9130d.mo9590e();
                C0654k childFragmentManager = cVar.f9130d.getChildFragmentManager();
                videoWidget2.f10586y = e;
                videoWidget2.f10587z = childFragmentManager;
            }
        }
    }
}
