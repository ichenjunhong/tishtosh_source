package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.an */
public final class C38365an extends C38383h {

    /* renamed from: d */
    public DmtTextView f97627d;

    /* renamed from: e */
    public RelativeLayout f97628e;

    public C38365an(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.f48);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.tv_see_all)");
        this.f97627d = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.eso);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.rl_collapse_view)");
        this.f97628e = (RelativeLayout) findViewById2;
    }
}
