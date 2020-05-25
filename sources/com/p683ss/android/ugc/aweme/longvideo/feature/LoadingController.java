package com.p683ss.android.ugc.aweme.longvideo.feature;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideo.feature.LoadingController */
public final class LoadingController implements C0183j, C38871j {

    /* renamed from: a */
    public final FragmentActivity f93091a;

    /* renamed from: b */
    public final LineProgressBar f93092b;

    /* renamed from: a */
    public final void mo53523a(float f) {
    }

    /* renamed from: a */
    public final void mo53526a(C50118g gVar) {
    }

    /* renamed from: a */
    public final void mo53527a(String str) {
    }

    /* renamed from: a */
    public final void mo53528a(String str, boolean z) {
    }

    /* renamed from: a */
    public final void mo53529a(boolean z) {
    }

    /* renamed from: b */
    public final void mo53530b(C50112d dVar) {
    }

    /* renamed from: c */
    public final void mo53533c(String str) {
    }

    /* renamed from: d */
    public final void mo53534d(String str) {
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        LineProgressBar lineProgressBar = this.f93092b;
        if (lineProgressBar != null) {
            lineProgressBar.mo64036c();
        }
    }

    /* renamed from: a */
    public final void mo53524a(C50112d dVar) {
        LineProgressBar lineProgressBar = this.f93092b;
        if (lineProgressBar != null) {
            lineProgressBar.mo64035b();
        }
    }

    /* renamed from: b */
    public final void mo53531b(String str) {
        LineProgressBar lineProgressBar = this.f93092b;
        if (lineProgressBar != null) {
            lineProgressBar.mo64035b();
        }
    }

    /* renamed from: e */
    public final void mo53535e(String str) {
        LineProgressBar lineProgressBar = this.f93092b;
        if (lineProgressBar != null) {
            lineProgressBar.mo64034a();
        }
    }

    /* renamed from: a */
    public final void mo53525a(C50117f fVar) {
        LineProgressBar lineProgressBar = this.f93092b;
        if (lineProgressBar != null) {
            lineProgressBar.mo64035b();
        }
    }

    /* renamed from: b */
    public final void mo53532b(boolean z) {
        if (z) {
            LineProgressBar lineProgressBar = this.f93092b;
            if (lineProgressBar != null) {
                lineProgressBar.mo64034a();
            }
        } else {
            LineProgressBar lineProgressBar2 = this.f93092b;
            if (lineProgressBar2 != null) {
                lineProgressBar2.mo64035b();
            }
        }
    }

    public LoadingController(FragmentActivity fragmentActivity, LineProgressBar lineProgressBar) {
        C52711k.m112240b(fragmentActivity, "activity");
        this.f93091a = fragmentActivity;
        this.f93092b = lineProgressBar;
        this.f93091a.getLifecycle().mo324a(this);
        LineProgressBar lineProgressBar2 = this.f93092b;
        if (lineProgressBar2 != null) {
            lineProgressBar2.mo64034a();
        }
    }
}
