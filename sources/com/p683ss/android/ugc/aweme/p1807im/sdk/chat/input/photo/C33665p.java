package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.p */
final /* synthetic */ class C33665p implements OnTouchListener {

    /* renamed from: a */
    private final C33640a f87292a;

    C33665p(C33640a aVar) {
        this.f87292a = aVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C33640a aVar = this.f87292a;
        if (motionEvent.getY() >= 0.0f) {
            return false;
        }
        if (!aVar.f87237h) {
            aVar.mo71103a(false);
        }
        return true;
    }
}
