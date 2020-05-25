package com.bytedance.android.livesdk.feed.p341i;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.bytedance.android.livesdk.feed.i.q */
final /* synthetic */ class C6994q implements OnTouchListener {

    /* renamed from: a */
    private final C6989p f19110a;

    C6994q(C6989p pVar) {
        this.f19110a = pVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C6989p pVar = this.f19110a;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            pVar.f19098b.getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            pVar.f19098b.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }
}
