package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ChooseOneOfMultiItemView */
public final class ChooseOneOfMultiItemView extends ConstraintLayout {

    /* renamed from: h */
    private String f105646h;

    /* renamed from: i */
    private String f105647i;

    /* renamed from: j */
    private boolean f105648j;

    /* renamed from: k */
    private boolean f105649k;

    /* renamed from: l */
    private HashMap f105650l;

    public ChooseOneOfMultiItemView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ChooseOneOfMultiItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    private View m91647a(int i) {
        if (this.f105650l == null) {
            this.f105650l = new HashMap();
        }
        View view = (View) this.f105650l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f105650l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final String getMDesc() {
        return this.f105647i;
    }

    public final String getMText() {
        return this.f105646h;
    }

    public final boolean getSelect() {
        return this.f105649k;
    }

    public final boolean getShowDiv() {
        return this.f105648j;
    }

    public final void setMDesc(String str) {
        this.f105647i = str;
    }

    public final void setMText(String str) {
        this.f105646h = str;
    }

    public final void setSelect(boolean z) {
        this.f105649k = z;
        if (z) {
            ((ImageView) m91647a(R.id.aqa)).setImageResource(R.drawable.d2x);
        } else {
            ((ImageView) m91647a(R.id.aqa)).setImageResource(R.drawable.d40);
        }
    }

    public final void setShowDiv(boolean z) {
        this.f105648j = z;
        if (z) {
            View a = m91647a(R.id.a6e);
            C52711k.m112236a((Object) a, "div");
            a.setVisibility(0);
            return;
        }
        View a2 = m91647a(R.id.a6e);
        C52711k.m112236a((Object) a2, "div");
        a2.setVisibility(8);
    }

    public ChooseOneOfMultiItemView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f105646h = "";
        this.f105647i = "";
        this.f105648j = true;
        ConstraintLayout.inflate(context, R.layout.bhn, this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.acp, R.attr.acq, R.attr.adh, R.attr.adi});
            this.f105646h = obtainStyledAttributes.getString(1);
            this.f105647i = obtainStyledAttributes.getString(0);
            setShowDiv(obtainStyledAttributes.getBoolean(3, true));
            setSelect(obtainStyledAttributes.getBoolean(2, false));
            obtainStyledAttributes.recycle();
        }
        DmtTextView dmtTextView = (DmtTextView) m91647a(R.id.text);
        C52711k.m112236a((Object) dmtTextView, "text");
        dmtTextView.setText(this.f105646h);
        if (TextUtils.isEmpty(this.f105647i)) {
            DmtTextView dmtTextView2 = (DmtTextView) m91647a(R.id.a4e);
            C52711k.m112236a((Object) dmtTextView2, "desc");
            dmtTextView2.setVisibility(8);
            return;
        }
        DmtTextView dmtTextView3 = (DmtTextView) m91647a(R.id.a4e);
        C52711k.m112236a((Object) dmtTextView3, "desc");
        dmtTextView3.setVisibility(0);
        DmtTextView dmtTextView4 = (DmtTextView) m91647a(R.id.a4e);
        C52711k.m112236a((Object) dmtTextView4, "desc");
        dmtTextView4.setText(this.f105647i);
    }

    public /* synthetic */ ChooseOneOfMultiItemView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
