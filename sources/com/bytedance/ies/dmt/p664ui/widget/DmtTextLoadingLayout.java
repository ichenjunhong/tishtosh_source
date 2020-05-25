package com.bytedance.ies.dmt.p664ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p030v4.view.C1056u;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.dmt.p664ui.common.C10682e;
import com.bytedance.ies.dmt.p664ui.p669e.C10704b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtTextLoadingLayout */
public class DmtTextLoadingLayout extends FrameLayout implements C10682e, C10726f {

    /* renamed from: a */
    private DoubleColorBallAnimationView f28655a;

    /* renamed from: b */
    private DmtTextView f28656b;

    /* renamed from: c */
    private LinearLayout f28657c;

    /* renamed from: d */
    private int f28658d;

    /* renamed from: e */
    private boolean f28659e;

    /* renamed from: f */
    private int f28660f;

    /* renamed from: a */
    private void m21689a() {
        if (this.f28659e) {
            LayoutParams layoutParams = (LayoutParams) this.f28657c.getLayoutParams();
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int b = (((C10704b.m21578b(getContext()) - this.f28660f) - iArr[1]) / 2) - (this.f28657c.getMeasuredHeight() / 2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = b;
            this.f28657c.setLayoutParams(layoutParams);
        }
    }

    public DmtTextLoadingLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo19029a(int i) {
        if (this.f28658d != i) {
            this.f28658d = i;
        }
    }

    public void setBoxViewBackground(Drawable drawable) {
        C1056u.m3030a((View) this.f28657c, drawable);
    }

    public void setBottomText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f28656b.setText(str);
        }
    }

    public void setUseScreenHeight(int i) {
        this.f28659e = true;
        this.f28660f = i;
        m21689a();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f28655a != null) {
            if (i == 0) {
                this.f28655a.mo19244a();
                return;
            }
            if (this.f28655a.f28661a) {
                this.f28655a.mo19245b();
            }
        }
    }

    public DmtTextLoadingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DmtTextLoadingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28658d = C10675b.m21494a().f28434a;
        View inflate = LayoutInflater.from(context).inflate(R.layout.a50, this, true);
        this.f28655a = (DoubleColorBallAnimationView) inflate.findViewById(R.id.a7i);
        this.f28656b = (DmtTextView) inflate.findViewById(R.id.d77);
        this.f28657c = (LinearLayout) inflate.findViewById(R.id.bek);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m21689a();
    }
}
