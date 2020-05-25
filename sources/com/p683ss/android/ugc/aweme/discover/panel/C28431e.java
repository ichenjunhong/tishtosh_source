package com.p683ss.android.ugc.aweme.discover.panel;

import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.view.View;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoShowTypeExperiment;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.p683ss.android.ugc.aweme.poi.nearby.p2063a.C39145a;
import com.p683ss.android.ugc.aweme.poi.nearby.p2063a.C39147c;
import com.p683ss.android.ugc.aweme.profile.p2090ui.WrapStaggeredGridLayoutManager;

/* renamed from: com.ss.android.ugc.aweme.discover.panel.e */
public final class C28431e extends C28428b {
    /* renamed from: i */
    public final boolean mo58031i() {
        return true;
    }

    /* renamed from: b */
    public final C1332i mo58026b() {
        WrapStaggeredGridLayoutManager wrapStaggeredGridLayoutManager = new WrapStaggeredGridLayoutManager(2, 1);
        wrapStaggeredGridLayoutManager.mo4731b(0);
        return wrapStaggeredGridLayoutManager;
    }

    /* renamed from: c */
    public final C1331h mo58028c() {
        if (this.f74707k == 15 && C10181b.m20511a().mo18168a(VideoShowTypeExperiment.class, true, "video_search_show_style", 31744, 0) == 3) {
            return new C39145a(8, 8);
        }
        return new C39147c(8);
    }

    /* renamed from: a */
    public final void mo55784a(View view, Bundle bundle) {
        super.mo55784a(view, bundle);
    }

    public C28431e(String str, C24579d dVar, C30462o oVar, int i) {
        super(str, dVar, oVar, i);
    }
}
