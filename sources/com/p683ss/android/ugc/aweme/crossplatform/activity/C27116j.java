package com.p683ss.android.ugc.aweme.crossplatform.activity;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.j */
final /* synthetic */ class C27116j implements Runnable {

    /* renamed from: a */
    private final MixActivityContainer f71532a;

    C27116j(MixActivityContainer mixActivityContainer) {
        this.f71532a = mixActivityContainer;
    }

    public final void run() {
        MixActivityContainer mixActivityContainer = this.f71532a;
        if (mixActivityContainer.f71488b.f71722e.f71822b) {
            C27120n nVar = new C27120n(mixActivityContainer.f71487a);
            OpenURLHintLayout openURLHintLayout = mixActivityContainer.f71493g;
            String string = mixActivityContainer.f71487a.getString(R.string.ho9);
            C52711k.m112240b(openURLHintLayout, "parent");
            C52711k.m112240b(string, C42311c.f106865i);
            DmtTextView dmtTextView = nVar.f71546b;
            if (dmtTextView != null) {
                dmtTextView.setText(string);
            }
            if (openURLHintLayout instanceof FrameLayout) {
                nVar.f71547c = openURLHintLayout;
                View view = nVar.f71545a;
                if (view != null) {
                    view.setLayoutParams(new LayoutParams(-1, -2));
                    ViewGroup viewGroup = nVar.f71547c;
                    if (viewGroup != null) {
                        viewGroup.addView(view);
                    }
                }
            }
        }
    }
}
