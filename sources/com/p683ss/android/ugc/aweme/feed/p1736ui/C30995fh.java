package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.view.animation.ScaleAnimation;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C30130ag;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.fh */
final /* synthetic */ class C30995fh implements Runnable {

    /* renamed from: a */
    private final C309757 f81166a;

    /* renamed from: b */
    private final boolean f81167b;

    /* renamed from: c */
    private final String f81168c;

    /* renamed from: d */
    private final Aweme f81169d;

    /* renamed from: e */
    private final boolean f81170e;

    C30995fh(C309757 r1, boolean z, String str, Aweme aweme, boolean z2) {
        this.f81166a = r1;
        this.f81167b = z;
        this.f81168c = str;
        this.f81169d = aweme;
        this.f81170e = z2;
    }

    public final void run() {
        Drawable drawable;
        C309757 r0 = this.f81166a;
        boolean z = this.f81167b;
        String str = this.f81168c;
        Aweme aweme = this.f81169d;
        boolean z2 = this.f81170e;
        if (z) {
            C23794bh.m58394h().mo70341a(C30966et.this.f79017j, C30966et.this.f81100p, 4);
            C26890h.m65011a("share_highlight", C23089d.m56640a().mo47829a("enter_from", str).mo47829a("group_id", C23198ae.m56877m(aweme)).mo47829a("author_id", C23198ae.m56846a(aweme)).mo47829a("show_content", C30130ag.m70703c()).f61491a);
        } else {
            if (z2) {
                drawable = C0726c.m2091a(C30966et.this.f79017j, (int) R.drawable.csb);
                C30966et.this.f81101q.setVisibility(8);
            } else {
                drawable = C41979aq.m91947b().getFirstShareIcon((Activity) C30966et.this.f79017j);
            }
            if (drawable != null) {
                C30966et.this.f81100p.setImageDrawable(drawable);
                C26890h.m65011a("share_highlight", C23089d.m56640a().mo47829a("enter_from", str).mo47829a("group_id", C23198ae.m56877m(aweme)).mo47829a("author_id", C23198ae.m56846a(aweme)).mo47829a("show_content", C30130ag.m70703c()).f61491a);
            }
        }
        C30966et.this.f81102r.animate().scaleX(1.02f).scaleY(1.02f).setDuration(150).withEndAction(new Runnable() {
            public final void run() {
                C30966et.this.f81102r.animate().scaleX(0.95f).scaleY(0.95f).setDuration(150).withEndAction(new Runnable() {
                    public final void run() {
                        ScaleAnimation scaleAnimation = new ScaleAnimation(0.95f, 1.02f, 0.95f, 1.02f, 1, 0.5f, 1, 0.5f);
                        scaleAnimation.setDuration(600);
                        scaleAnimation.setRepeatMode(2);
                        scaleAnimation.setRepeatCount(-1);
                        C30966et.this.f81102r.startAnimation(scaleAnimation);
                    }
                }).start();
            }
        }).start();
    }
}
