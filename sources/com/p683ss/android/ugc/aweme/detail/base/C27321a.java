package com.p683ss.android.ugc.aweme.detail.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.detail.C27365i;
import com.p683ss.android.ugc.aweme.detail.p1619a.C27313b;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.base.a */
public final class C27321a extends C27323c {

    /* renamed from: b */
    private final int f72071b = R.drawable.tm;

    /* renamed from: a */
    public final C27365i mo55767a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "viewGroup");
        return new C27313b(this.f72072a, viewGroup);
    }

    /* renamed from: a */
    public final void mo55768a(RelativeLayout relativeLayout) {
        C52711k.m112240b(relativeLayout, "rootView");
        View inflate = LayoutInflater.from(this.f72072a).inflate(R.layout.b8a, relativeLayout, false);
        C23515d.m57668a((RemoteImageView) inflate.findViewById(R.id.csd), this.f72071b);
        LayoutParams layoutParams = new LayoutParams(C27324d.m65852a(96), C27324d.m65852a(96));
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        layoutParams.bottomMargin = C27324d.m65852a(8);
        relativeLayout.addView(inflate, layoutParams);
    }

    public C27321a(Context context, int i) {
        C52711k.m112240b(context, "context");
        super(context);
    }
}
