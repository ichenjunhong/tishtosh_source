package com.p683ss.android.ugc.aweme.tools.mvtemplate.p2370d;

import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.d.b */
final /* synthetic */ class C47260b implements Runnable {

    /* renamed from: a */
    private final C47259a f119341a;

    /* renamed from: b */
    private final ViewGroup f119342b;

    C47260b(C47259a aVar, ViewGroup viewGroup) {
        this.f119341a = aVar;
        this.f119342b = viewGroup;
    }

    public final void run() {
        C47259a aVar = this.f119341a;
        ViewGroup viewGroup = this.f119342b;
        if (viewGroup != null) {
            int b = (C43303dy.m94971b(aVar.f119332c.getContext()) - aVar.f119332c.getMeasuredWidth()) / 2;
            LayoutParams layoutParams = (LayoutParams) viewGroup.getLayoutParams();
            layoutParams.leftMargin = b;
            layoutParams.rightMargin = b;
            viewGroup.setLayoutParams(layoutParams);
        }
    }
}
