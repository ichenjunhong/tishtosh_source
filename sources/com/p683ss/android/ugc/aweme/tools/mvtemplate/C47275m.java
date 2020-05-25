package com.p683ss.android.ugc.aweme.tools.mvtemplate;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.m */
final /* synthetic */ class C47275m implements OnTouchListener {

    /* renamed from: a */
    private final MvTemplateView f119359a;

    C47275m(MvTemplateView mvTemplateView) {
        this.f119359a = mvTemplateView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f119359a.f119208n.dispatchTouchEvent(motionEvent);
    }
}
