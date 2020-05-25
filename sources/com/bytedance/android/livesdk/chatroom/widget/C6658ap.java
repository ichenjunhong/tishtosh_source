package com.bytedance.android.livesdk.chatroom.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.ap */
final /* synthetic */ class C6658ap implements OnTouchListener {

    /* renamed from: a */
    private final MTSlideUpGuideView f18165a;

    C6658ap(MTSlideUpGuideView mTSlideUpGuideView) {
        this.f18165a = mTSlideUpGuideView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f18165a.mo12746b();
        return false;
    }
}
