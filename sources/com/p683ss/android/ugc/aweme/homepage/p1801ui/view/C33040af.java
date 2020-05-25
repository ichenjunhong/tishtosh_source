package com.p683ss.android.ugc.aweme.homepage.p1801ui.view;

import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.af */
final /* synthetic */ class C33040af implements Runnable {

    /* renamed from: a */
    private final C330232 f85831a;

    /* renamed from: b */
    private final int f85832b;

    /* renamed from: c */
    private final View f85833c;

    C33040af(C330232 r1, int i, View view) {
        this.f85831a = r1;
        this.f85832b = i;
        this.f85833c = view;
    }

    public final void run() {
        C330232 r0 = this.f85831a;
        int i = this.f85832b;
        View view = this.f85833c;
        MainTabStrip.this.mo69960a(i, 0, 0.0f);
        MainTabStrip.this.mo69960a(i, 1, 0.0f);
        MainTabStrip.this.mo69960a(i, 2, 0.0f);
        MainTabStrip.this.mo69959a(i, 0.0f, view);
    }
}
