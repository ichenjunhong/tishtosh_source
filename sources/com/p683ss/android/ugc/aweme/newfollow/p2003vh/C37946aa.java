package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.utils.C47856en;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.aa */
public final class C37946aa extends C38014y {
    /* renamed from: g */
    public final void mo64784g() {
        if (VERSION.SDK_INT >= 21) {
            mo77432ai().setOutlineProvider(new C47856en((int) C9432q.m18687b(mo64749N(), 2.0f)));
            mo77432ai().setClipToOutline(true);
        }
        super.mo64784g();
    }

    /* renamed from: a */
    public final void mo64756a(View view) {
        ViewStub viewStub;
        View view2;
        ViewStub viewStub2;
        View view3;
        ViewStub viewStub3;
        View view4 = null;
        if (view != null) {
            viewStub = (ViewStub) view.findViewById(R.id.cu2);
        } else {
            viewStub = null;
        }
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.a4k);
        }
        if (viewStub != null) {
            view2 = viewStub.inflate();
        } else {
            view2 = null;
        }
        mo64757a(view2, 4.0f);
        if (view != null) {
            viewStub2 = (ViewStub) view.findViewById(R.id.ctu);
        } else {
            viewStub2 = null;
        }
        if (viewStub2 != null) {
            viewStub2.setLayoutResource(R.layout.ba0);
        }
        if (viewStub2 != null) {
            view3 = viewStub2.inflate();
        } else {
            view3 = null;
        }
        mo64757a(view3, 12.0f);
        if (view != null) {
            viewStub3 = (ViewStub) view.findViewById(R.id.ctz);
        } else {
            viewStub3 = null;
        }
        if (viewStub3 != null) {
            viewStub3.setLayoutResource(R.layout.a3h);
        }
        if (viewStub3 != null) {
            view4 = viewStub3.inflate();
        }
        mo64759a(view4, 16.0f, 16.0f, 0.0f, 0.0f);
    }

    /* renamed from: a */
    public final void mo77421a(int i, int i2) {
        LayoutParams layoutParams;
        FrameLayout ai = mo77432ai();
        if (ai != null) {
            layoutParams = ai.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (i > i2) {
                layoutParams2.width = (int) C9432q.m18687b(mo64749N(), 267.0f);
                layoutParams2.height = (int) C9432q.m18687b(mo64749N(), 150.0f);
            } else {
                layoutParams2.width = (int) C9432q.m18687b(mo64749N(), 150.0f);
                layoutParams2.height = (int) C9432q.m18687b(mo64749N(), 267.0f);
            }
            mo77432ai().setLayoutParams(layoutParams2);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public C37946aa(FollowFeedLayout followFeedLayout, C31755b bVar, C31848j jVar, C31754a aVar) {
        C52711k.m112240b(followFeedLayout, "view");
        C52711k.m112240b(bVar, "provider");
        C52711k.m112240b(jVar, "scrollStateManager");
        C52711k.m112240b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, aVar);
    }
}
