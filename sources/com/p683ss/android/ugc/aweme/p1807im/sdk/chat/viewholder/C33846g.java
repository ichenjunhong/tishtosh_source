package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.g */
final /* synthetic */ class C33846g implements OnTouchListener {

    /* renamed from: a */
    private final C33805c f87807a;

    /* renamed from: b */
    private final OnTouchListener f87808b;

    C33846g(C33805c cVar, OnTouchListener onTouchListener) {
        this.f87807a = cVar;
        this.f87808b = onTouchListener;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C33805c cVar = this.f87807a;
        OnTouchListener onTouchListener = this.f87808b;
        if (onTouchListener != null) {
            z = onTouchListener.onTouch(view, motionEvent);
            if (z) {
                return true;
            }
        } else {
            z = false;
        }
        if (cVar.f87717t != null) {
            z = cVar.f87717t.onTouchEvent(motionEvent);
        }
        return z;
    }
}
