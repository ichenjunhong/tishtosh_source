package com.bytedance.android.livesdk.feed.banner;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.bytedance.android.livesdk.feed.banner.c */
final /* synthetic */ class C6846c implements OnTouchListener {

    /* renamed from: a */
    private final C6843b f18782a;

    C6846c(C6843b bVar) {
        this.f18782a = bVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C6843b bVar = this.f18782a;
        int action = motionEvent.getAction();
        if (action == 0) {
            bVar.f18762b.removeCallbacks(bVar.f18764d);
        } else if (action == 3 || action == 1) {
            bVar.f18762b.postDelayed(bVar.f18764d, 5000);
        }
        return false;
    }
}
