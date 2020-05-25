package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.content.C0726c;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.p669e.C10705c;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.ui.LoadingButton */
public final class LoadingButton extends FrameLayout {

    /* renamed from: a */
    public static final C22186a f59861a = new C22186a(null);

    /* renamed from: b */
    private LoadingCircleView f59862b;

    /* renamed from: c */
    private TextView f59863c;

    /* renamed from: d */
    private boolean f59864d;

    /* renamed from: com.ss.android.ugc.aweme.account.ui.LoadingButton$a */
    public static final class C22186a {
        private C22186a() {
        }

        public /* synthetic */ C22186a(C52707g gVar) {
            this();
        }
    }

    public LoadingButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo46295a() {
        m54981a(true);
    }

    /* renamed from: b */
    public final void mo46296b() {
        m54982b(true);
    }

    public final void setText(String str) {
        C52711k.m112240b(str, "text");
        this.f59863c.setText(str);
    }

    /* renamed from: a */
    private void m54981a(boolean z) {
        this.f59864d = true;
        setEnabled(false);
        if (this.f59862b.getVisibility() != 0) {
            this.f59862b.setVisibility(0);
        }
        this.f59862b.mo46299a();
    }

    /* renamed from: b */
    private void m54982b(boolean z) {
        this.f59864d = false;
        setEnabled(true);
        if (this.f59862b.getVisibility() != 8) {
            this.f59862b.setVisibility(8);
        }
        this.f59862b.mo46300b();
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z || this.f59864d) {
            this.f59863c.setTextColor(C0726c.m2098c(getContext(), R.color.jf));
            this.f59863c.setBackground(C0726c.m2091a(getContext(), (int) R.drawable.cek));
        } else {
            this.f59863c.setTextColor(C0726c.m2098c(getContext(), R.color.jk));
            this.f59863c.setBackground(C0726c.m2091a(getContext(), (int) R.drawable.ch_));
        }
        this.f59863c.setEnabled(z);
    }

    public LoadingButton(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842901, 16842904, 16842964, 16843087, R.attr.t2, R.attr.t3, R.attr.t4, R.attr.t5});
        int color = obtainStyledAttributes.getColor(4, -1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, C23728o.m58241a(10.0d));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(7, C23728o.m58241a(20.0d));
        float dimensionPixelSize3 = (float) obtainStyledAttributes.getDimensionPixelSize(5, C23728o.m58241a(3.0d));
        int color2 = obtainStyledAttributes.getColor(1, -16777216);
        String string = obtainStyledAttributes.getString(3);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        View.inflate(context, R.layout.azh, this);
        if (drawable != null) {
            setBackground(drawable);
        }
        View findViewById = findViewById(R.id.bhb);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.loading_button_loading_view)");
        this.f59862b = (LoadingCircleView) findViewById;
        View findViewById2 = findViewById(R.id.bhc);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.loading_button_text)");
        this.f59863c = (TextView) findViewById2;
        this.f59863c.setText(string);
        this.f59863c.setTextColor(color2);
        LayoutParams layoutParams = this.f59862b.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.height = dimensionPixelSize2;
            layoutParams2.width = dimensionPixelSize2;
            layoutParams2.rightMargin = dimensionPixelSize;
            if (VERSION.SDK_INT >= 17) {
                layoutParams2.setMarginEnd(dimensionPixelSize);
            }
            this.f59862b.setLayoutParams(layoutParams2);
            this.f59862b.setLoadingColor(color);
            this.f59862b.setLineWidth(dimensionPixelSize3);
            if (dimensionPixelSize4 != -1) {
                this.f59863c.setTextSize(0, (float) dimensionPixelSize4);
            }
            setEnabled(false);
            C10705c.m21579a(this);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public /* synthetic */ LoadingButton(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
