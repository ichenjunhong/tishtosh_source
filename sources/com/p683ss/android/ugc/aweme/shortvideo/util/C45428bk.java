package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bk */
public final class C45428bk {
    /* renamed from: a */
    public static void m99000a(final View view, final float f) {
        if (view != null) {
            view.setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        C45427bj.m98998a(view, 1.0f, f);
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        C45427bj.m98998a(view, f, 1.0f);
                    }
                    return false;
                }
            });
        }
    }
}
