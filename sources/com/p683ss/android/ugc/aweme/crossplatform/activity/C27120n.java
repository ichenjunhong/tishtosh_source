package com.p683ss.android.ugc.aweme.crossplatform.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.n */
public final class C27120n {

    /* renamed from: a */
    View f71545a;

    /* renamed from: b */
    DmtTextView f71546b;

    /* renamed from: c */
    ViewGroup f71547c;

    /* renamed from: d */
    private RelativeLayout f71548d;

    public final void dismiss() {
        if (this.f71545a != null) {
            ViewGroup viewGroup = this.f71547c;
            if (viewGroup != null) {
                viewGroup.removeView(this.f71545a);
            }
        }
    }

    public C27120n(Context context) {
        C52711k.m112240b(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.a8w, null);
        this.f71546b = (DmtTextView) inflate.findViewById(R.id.d8j);
        this.f71548d = (RelativeLayout) inflate.findViewById(R.id.cdu);
        RelativeLayout relativeLayout = this.f71548d;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundResource(R.drawable.c_4);
        }
        this.f71545a = inflate;
    }
}
