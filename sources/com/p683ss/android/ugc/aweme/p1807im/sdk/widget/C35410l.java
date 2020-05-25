package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32464b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.l */
final /* synthetic */ class C35410l implements Runnable {

    /* renamed from: a */
    private final C35405k f91024a;

    /* renamed from: b */
    private final TextView f91025b;

    C35410l(C35405k kVar, TextView textView) {
        this.f91024a = kVar;
        this.f91025b = textView;
    }

    public final void run() {
        C35405k kVar = this.f91024a;
        TextView textView = this.f91025b;
        if (textView.getWidth() > C32464b.m75163a(kVar.getContext(), 90.0f)) {
            LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = C32464b.m75163a(C11010c.m22280a(), 90.0f);
            textView.setLayoutParams(layoutParams);
        }
    }
}
