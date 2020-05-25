package com.p683ss.android.ugc.aweme.homepage.p1801ui.view;

import android.widget.PopupWindow.OnDismissListener;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.v */
final /* synthetic */ class C33082v implements OnDismissListener {

    /* renamed from: a */
    private final MainTabStrip f85901a;

    /* renamed from: b */
    private final CircleImageView f85902b;

    /* renamed from: c */
    private final CircleImageView f85903c;

    /* renamed from: d */
    private final CircleImageView f85904d;

    C33082v(MainTabStrip mainTabStrip, CircleImageView circleImageView, CircleImageView circleImageView2, CircleImageView circleImageView3) {
        this.f85901a = mainTabStrip;
        this.f85902b = circleImageView;
        this.f85903c = circleImageView2;
        this.f85904d = circleImageView3;
    }

    public final void onDismiss() {
        MainTabStrip mainTabStrip = this.f85901a;
        CircleImageView circleImageView = this.f85902b;
        CircleImageView circleImageView2 = this.f85903c;
        CircleImageView circleImageView3 = this.f85904d;
        mainTabStrip.f85786j.setVisibility(0);
        MainTabStrip.m75958a(circleImageView, circleImageView2, circleImageView3);
        mainTabStrip.post(new C33083w(mainTabStrip));
    }
}
