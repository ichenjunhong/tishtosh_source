package com.p683ss.android.ugc.aweme.main.guide;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.main.C36605dw;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.main.guide.e */
public final class C36660e {

    /* renamed from: a */
    public static boolean f93806a;

    /* renamed from: b */
    boolean f93807b;

    /* renamed from: c */
    View f93808c;

    /* renamed from: d */
    AnimationImageView f93809d;

    /* renamed from: e */
    private boolean f93810e;

    /* renamed from: c */
    private static boolean m82576c() {
        return C36605dw.m82471a().getBoolean("shouldShowScrollToFeedFollowGuideMT", true);
    }

    /* renamed from: a */
    public final boolean mo75774a() {
        if (m82576c() && this.f93810e) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m82575b() {
        if (this.f93808c != null) {
            this.f93809d = (AnimationImageView) this.f93808c.findViewById(R.id.b15);
            try {
                if (C47918gj.m103682a(this.f93808c.getContext())) {
                    ((TextView) this.f93808c.findViewById(R.id.aow)).setText(R.string.bc8);
                    this.f93809d.setScaleX(-1.0f);
                }
            } catch (Exception unused) {
            }
            if (this.f93809d != null && !f93806a) {
                this.f93809d.setRepeatCount(3);
                this.f93809d.setAnimation("right_pic.json");
                this.f93809d.setProgress(0.0f);
                this.f93809d.mo6654b();
                f93806a = true;
                C36605dw.m82473b(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo75772a(ViewGroup viewGroup) {
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.eyn);
        if (viewStub != null) {
            viewStub.setOnInflateListener(new C36661f(this));
            if (!this.f93807b) {
                this.f93808c = viewStub.inflate();
                m82575b();
                C47718bf.m103288a(new C36659d(true));
                this.f93808c.postDelayed(new C36662g(this), 5200);
            }
        }
    }

    /* renamed from: a */
    public final void mo75773a(Aweme aweme) {
        boolean z = true;
        if (aweme == null || aweme.getAuthor() == null || !(aweme.getAuthor().getFollowStatus() == 1 || aweme.getAuthor().getFollowStatus() == 2)) {
            z = false;
        }
        this.f93810e = z;
    }
}
