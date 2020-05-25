package com.bytedance.ies.dmt.p664ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.dmt.p664ui.common.C10682e;
import com.bytedance.ies.dmt.p664ui.p669e.C10704b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout */
public class DmtLoadingLayout extends FrameLayout implements C10682e, C10726f {

    /* renamed from: a */
    private View f28639a;

    /* renamed from: b */
    private FrameLayout f28640b;

    /* renamed from: c */
    private int f28641c;

    /* renamed from: d */
    private boolean f28642d;

    /* renamed from: e */
    private int f28643e;

    /* renamed from: a */
    private void m21655a() {
        if (this.f28642d) {
            LayoutParams layoutParams = (LayoutParams) this.f28640b.getLayoutParams();
            int i = layoutParams.height;
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int b = (((C10704b.m21578b(getContext()) - this.f28643e) - iArr[1]) / 2) - (i / 2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = b;
            this.f28640b.setLayoutParams(layoutParams);
        }
    }

    public DmtLoadingLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo19029a(int i) {
        if (this.f28641c != i) {
            this.f28641c = i;
        }
    }

    public void setUseScreenHeight(int i) {
        this.f28642d = true;
        this.f28643e = i;
        m21655a();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f28639a != null) {
            this.f28639a.setVisibility(i);
        }
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            LayoutParams layoutParams = (LayoutParams) this.f28639a.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            this.f28639a.setLayoutParams(layoutParams);
        }
    }

    public DmtLoadingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DmtLoadingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28641c = C10675b.m21494a().f28434a;
        View inflate = LayoutInflater.from(context).inflate(R.layout.a4t, this, true);
        this.f28639a = inflate.findViewById(R.id.a7h);
        this.f28640b = (FrameLayout) inflate.findViewById(R.id.c64);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m21655a();
    }
}
