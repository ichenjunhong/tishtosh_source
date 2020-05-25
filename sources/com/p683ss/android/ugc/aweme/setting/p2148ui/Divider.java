package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.common.C10678c;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.Divider */
public final class Divider extends LinearLayout {

    /* renamed from: a */
    private View f105686a;

    /* renamed from: b */
    private DmtTextView f105687b;

    /* renamed from: c */
    private View f105688c;

    public Divider(Context context) {
        this(context, null, 0, 6, null);
    }

    public Divider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setLeftText(CharSequence charSequence) {
        C52711k.m112240b(charSequence, "charSequence");
        DmtTextView dmtTextView = this.f105687b;
        if (dmtTextView != null) {
            dmtTextView.setText(charSequence);
        }
    }

    public Divider(Context context, AttributeSet attributeSet, int i) {
        DmtTextView dmtTextView;
        View view;
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f105686a = View.inflate(context, R.layout.at1, this);
        View view2 = this.f105686a;
        LayoutParams layoutParams = null;
        if (view2 != null) {
            dmtTextView = (DmtTextView) view2.findViewById(R.id.db4);
        } else {
            dmtTextView = null;
        }
        this.f105687b = dmtTextView;
        View view3 = this.f105686a;
        if (view3 != null) {
            view = view3.findViewById(R.id.dl9);
        } else {
            view = null;
        }
        this.f105688c = view;
        View view4 = this.f105686a;
        if (view4 != null) {
            view4.setBackgroundColor(C10678c.m21502b(getContext()));
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.n5, R.attr.a39});
        if (obtainStyledAttributes.getBoolean(0, false)) {
            View view5 = this.f105688c;
            if (view5 != null) {
                view5.setVisibility(8);
            }
        }
        View view6 = this.f105688c;
        if (view6 != null) {
            view6.setBackgroundColor(C10678c.m21504d(context));
        }
        View view7 = this.f105686a;
        if (view7 != null) {
            view7.setBackgroundColor(C10678c.m21502b(context));
        }
        CharSequence string = obtainStyledAttributes.getString(1);
        if (!TextUtils.isEmpty(string)) {
            DmtTextView dmtTextView2 = this.f105687b;
            if (dmtTextView2 != null) {
                dmtTextView2.setText(string);
            }
            DmtTextView dmtTextView3 = this.f105687b;
            if (dmtTextView3 != null) {
                dmtTextView3.setFontType(C10751d.f28903b);
            }
        } else {
            DmtTextView dmtTextView4 = this.f105687b;
            if (dmtTextView4 != null) {
                dmtTextView4.setVisibility(8);
            }
            View view8 = this.f105688c;
            if (view8 != null) {
                layoutParams = view8.getLayoutParams();
            }
            if (layoutParams != null) {
                ((MarginLayoutParams) layoutParams).bottomMargin = (int) C9432q.m18687b(getContext(), 8.0f);
            } else {
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        DmtTextView dmtTextView5 = this.f105687b;
        if (dmtTextView5 != null) {
            dmtTextView5.setTextColor(C10678c.m21503c(getContext()));
        }
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ Divider(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
