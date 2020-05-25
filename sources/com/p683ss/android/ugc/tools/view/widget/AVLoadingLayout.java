package com.p683ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.tools.view.p2511d.C50223a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.tools.view.widget.AVLoadingLayout */
public class AVLoadingLayout extends FrameLayout implements C50223a, C50288l {

    /* renamed from: a */
    private View f125940a;

    /* renamed from: b */
    private FrameLayout f125941b;

    /* renamed from: c */
    private int f125942c;

    /* renamed from: d */
    private boolean f125943d;

    /* renamed from: e */
    private int f125944e;

    /* renamed from: a */
    private void m108456a() {
        if (this.f125943d) {
            LayoutParams layoutParams = (LayoutParams) this.f125941b.getLayoutParams();
            int i = layoutParams.height;
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int a = (((C43303dy.m94967a(getContext()) - this.f125944e) - iArr[1]) / 2) - (i / 2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = a;
            this.f125941b.setLayoutParams(layoutParams);
        }
    }

    public AVLoadingLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo97996a(int i) {
        if (this.f125942c != i) {
            this.f125942c = i;
        }
    }

    public void setUseScreenHeight(int i) {
        this.f125943d = true;
        this.f125944e = i;
        m108456a();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f125940a != null) {
            this.f125940a.setVisibility(i);
        }
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            LayoutParams layoutParams = (LayoutParams) this.f125940a.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            this.f125940a.setLayoutParams(layoutParams);
        }
    }

    public AVLoadingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AVLoadingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f125942c = C39629l.m88232a().mo58564B().mo74262a();
        View inflate = LayoutInflater.from(context).inflate(R.layout.bv_, this, true);
        this.f125940a = inflate.findViewById(R.id.a7h);
        this.f125941b = (FrameLayout) inflate.findViewById(R.id.c64);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m108456a();
    }
}
