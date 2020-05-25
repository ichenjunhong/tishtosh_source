package com.p100a.p101a;

import android.content.Context;
import android.view.C1522a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.policy.notice.p2081ui.PolicyNoticeToast;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.an */
public final class C2255an implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        context.getResources();
        PolicyNoticeToast policyNoticeToast = new PolicyNoticeToast(context);
        LayoutParams a = C1522a.m5434a(viewGroup, -1, -2);
        policyNoticeToast.setId(R.id.c3j);
        if (LinearLayout.LayoutParams.class.isInstance(a)) {
            ((LinearLayout.LayoutParams) a).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a)) {
            ((FrameLayout.LayoutParams) a).gravity = 80;
        }
        policyNoticeToast.setVisibility(8);
        if (viewGroup != null) {
            policyNoticeToast.setLayoutParams(a);
            if (z) {
                viewGroup.addView(policyNoticeToast);
            }
        }
        C1522a.m5435a(policyNoticeToast);
        return policyNoticeToast;
    }
}
