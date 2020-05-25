package com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.feed.experiment.DetectorNoticeToastEnableExperiment;
import com.p683ss.android.ugc.aweme.feed.netdetector.C30550b;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar.c */
final /* synthetic */ class C30577c implements Runnable {

    /* renamed from: a */
    private final C305761 f79868a;

    /* renamed from: b */
    private final Boolean f79869b;

    C30577c(C305761 r1, Boolean bool) {
        this.f79868a = r1;
        this.f79869b = bool;
    }

    public final void run() {
        C305761 r0 = this.f79868a;
        Boolean bool = this.f79869b;
        if (C30575b.this.f79862a != null && !C30575b.this.f79862a.isFinishing() && C30575b.this.f79863b != null) {
            if (!bool.booleanValue()) {
                C30575b.this.mo62761b();
            } else if (DetectorNoticeToastEnableExperiment.enableDetector) {
                C10691a.m21542b((Context) C30575b.this.f79862a, (int) R.string.a21).mo19066a();
            } else {
                if (C30575b.this.f79864c == null) {
                    C30575b.this.f79864c = new FeedTopNoticeView(C30575b.this.f79862a);
                    if (C30575b.this.f79863b instanceof FrameLayout) {
                        ((FrameLayout) C30575b.this.f79863b).addView(C30575b.this.f79864c);
                    }
                }
                C30575b bVar = C30575b.this;
                if (bVar.f79864c != null) {
                    FeedTopNoticeView feedTopNoticeView = bVar.f79864c;
                    if (C30550b.m71531b()) {
                        FrameLayout frameLayout = feedTopNoticeView.f79860a;
                        C52711k.m112236a((Object) frameLayout, C42311c.f106865i);
                        frameLayout.setVisibility(0);
                    }
                }
            }
        }
    }
}
