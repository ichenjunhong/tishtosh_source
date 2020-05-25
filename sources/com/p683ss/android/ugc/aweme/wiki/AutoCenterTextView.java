package com.p683ss.android.ugc.aweme.wiki;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.wiki.AutoCenterTextView */
public final class AutoCenterTextView extends DmtTextView {

    /* renamed from: b */
    public boolean f121760b;

    /* renamed from: com.ss.android.ugc.aweme.wiki.AutoCenterTextView$a */
    static final class C48404a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AutoCenterTextView f121761a;

        C48404a(AutoCenterTextView autoCenterTextView) {
            this.f121761a = autoCenterTextView;
        }

        public final void run() {
            LayoutParams layoutParams = this.f121761a.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((MarginLayoutParams) layoutParams);
                layoutParams2.addRule(1, R.id.ui);
                layoutParams2.addRule(17, R.id.ui);
                layoutParams2.addRule(3, R.id.csm);
                this.f121761a.setLayoutParams(layoutParams2);
                this.f121761a.f121760b = false;
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AutoCenterTextView$b */
    static final class C48405b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AutoCenterTextView f121762a;

        C48405b(AutoCenterTextView autoCenterTextView) {
            this.f121762a = autoCenterTextView;
        }

        public final void run() {
            LayoutParams layoutParams = this.f121762a.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((MarginLayoutParams) layoutParams);
                layoutParams2.addRule(14, -1);
                layoutParams2.addRule(3, R.id.csm);
                this.f121762a.setLayoutParams(layoutParams2);
                this.f121762a.f121760b = false;
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public AutoCenterTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AutoCenterTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AutoCenterTextView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f121760b = true;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f121760b = true;
        super.onTextChanged(charSequence, i, i2, i3);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f121760b) {
            if (((float) ((C9432q.m18670a(getContext()) - getMeasuredWidth()) / 2)) < C9432q.m18687b(getContext(), 96.0f)) {
                post(new C48404a(this));
            } else {
                post(new C48405b(this));
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public /* synthetic */ AutoCenterTextView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 16842884;
        }
        this(context, attributeSet, i);
    }
}
