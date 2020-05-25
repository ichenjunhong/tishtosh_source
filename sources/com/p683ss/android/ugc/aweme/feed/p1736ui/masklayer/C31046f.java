package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer.f */
final /* synthetic */ class C31046f implements OnTouchListener {

    /* renamed from: a */
    private final C31043d f81292a;

    C31046f(C31043d dVar) {
        this.f81292a = dVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C31043d dVar = this.f81292a;
        if (motionEvent.getAction() == 0) {
            C31043d.m72641a(view, 100, 0.92f);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            C31043d.m72641a(view, 60, 1.0f);
        }
        return false;
    }
}
