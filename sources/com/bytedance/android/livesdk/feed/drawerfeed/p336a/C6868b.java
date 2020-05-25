package com.bytedance.android.livesdk.feed.drawerfeed.p336a;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.a.b */
final /* synthetic */ class C6868b implements OnTouchListener {

    /* renamed from: a */
    private final C6867a f18825a;

    C6868b(C6867a aVar) {
        this.f18825a = aVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C6867a aVar = this.f18825a;
        int action = motionEvent.getAction();
        if (action == 0) {
            aVar.f18811b.removeCallbacks(aVar.f18813d);
        } else if (action == 3 || action == 1) {
            aVar.f18811b.postDelayed(aVar.f18813d, 5000);
        }
        return false;
    }
}
