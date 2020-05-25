package com.p683ss.android.ugc.aweme.homepage.p1801ui;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.view.MainTabStrip;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.d */
public final class C32999d {

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.d$a */
    public static final class C33000a implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ ViewTreeObserver f85720a;

        /* renamed from: b */
        final /* synthetic */ ViewTreeObserver f85721b;

        /* renamed from: c */
        final /* synthetic */ MainTabStrip f85722c;

        /* renamed from: d */
        final /* synthetic */ View f85723d;

        public final void onGlobalLayout() {
            Boolean bool;
            if (this.f85721b.isAlive()) {
                MainTabStrip mainTabStrip = this.f85722c;
                if (mainTabStrip != null) {
                    bool = Boolean.valueOf(mainTabStrip.mo69965a(this.f85723d));
                } else {
                    bool = null;
                }
                if (bool.booleanValue()) {
                    this.f85720a.removeOnGlobalLayoutListener(this);
                }
            }
        }

        public C33000a(ViewTreeObserver viewTreeObserver, ViewTreeObserver viewTreeObserver2, MainTabStrip mainTabStrip, View view) {
            this.f85720a = viewTreeObserver;
            this.f85721b = viewTreeObserver2;
            this.f85722c = mainTabStrip;
            this.f85723d = view;
        }
    }
}
