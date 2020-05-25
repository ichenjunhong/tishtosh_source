package com.p683ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView */
public final class AVDmtPanelRecyleView extends RecyclerView {

    /* renamed from: N */
    public int f118191N;

    /* renamed from: O */
    public int f118192O;

    /* renamed from: P */
    public int f118193P;

    /* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView$a */
    public static final class C46783a extends C1331h {

        /* renamed from: a */
        final /* synthetic */ AVDmtPanelRecyleView f118194a;

        C46783a(AVDmtPanelRecyleView aVDmtPanelRecyleView) {
            this.f118194a = aVDmtPanelRecyleView;
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
            C52711k.m112240b(rect, "outRect");
            C52711k.m112240b(view, "view");
            C52711k.m112240b(recyclerView, "parent");
            C52711k.m112240b(sVar, "state");
            int f = RecyclerView.m4275f(view);
            if (f != -1) {
                if (f == 0) {
                    if (this.f118194a.mo49162o()) {
                        rect.right = this.f118194a.f118192O;
                    } else {
                        rect.left = this.f118194a.f118192O;
                    }
                }
                C1322a adapter = recyclerView.getAdapter();
                if (adapter == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) adapter, "parent.adapter!!");
                if (f == adapter.getItemCount() - 1) {
                    if (this.f118194a.mo49162o()) {
                        rect.left = this.f118194a.f118193P;
                    } else {
                        rect.right = this.f118194a.f118193P;
                    }
                } else if (this.f118194a.mo49162o()) {
                    rect.left = this.f118194a.f118191N;
                } else {
                    rect.right = this.f118194a.f118191N;
                }
            }
        }
    }

    public AVDmtPanelRecyleView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AVDmtPanelRecyleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: o */
    public final boolean mo49162o() {
        if (C1056u.m3055f(this) == 1) {
            return true;
        }
        return false;
    }

    public final void setSecondPanel(boolean z) {
        if (z) {
            int a = C46788b.f118235d.mo94007a(false, z, false, false, false);
            setBackground(C42430at.m93196a(a, a, 0, 0));
        }
    }

    public AVDmtPanelRecyleView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ce, R.attr.abh, R.attr.f5, R.attr.k9, R.attr.lt, R.attr.ml, R.attr.ow, R.attr.ox, R.attr.oy, R.attr.acm, R.attr.p2, R.attr.p3, R.attr.p4, R.attr.aco, R.attr.p5, R.attr.p6, R.attr.p7, R.attr.p8, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.pp, R.attr.q4, R.attr.sk, R.attr.t7, R.attr.uk, R.attr.up, R.attr.uy, R.attr.v3, R.attr.vl, R.attr.ad9, R.attr.a04, R.attr.a1b, R.attr.a1d, R.attr.a1x, R.attr.a1y, R.attr.a3t, R.attr.a6c, R.attr.adn, R.attr.a6k, R.attr.a6o, R.attr.a72, R.attr.a_4, R.attr.adp, R.attr.a__});
            boolean z = obtainStyledAttributes.getBoolean(6, false);
            this.f118191N = (int) obtainStyledAttributes.getDimension(20, 0.0f);
            this.f118192O = (int) obtainStyledAttributes.getDimension(4, 0.0f);
            this.f118193P = (int) obtainStyledAttributes.getDimension(22, 0.0f);
            int b = (int) C9432q.m18687b(context, 2.0f);
            if (obtainStyledAttributes.getBoolean(21, true)) {
                if (this.f118191N > 0) {
                    this.f118191N -= b * 2;
                }
                if (this.f118192O > 0) {
                    this.f118192O -= b;
                }
                if (this.f118193P > 0) {
                    this.f118193P -= b;
                }
            }
            if (z) {
                Drawable a = C46788b.f118235d.mo94009a(context, attributeSet);
                if (a != null) {
                    setBackground(a);
                }
            }
            mo4798a((C1331h) new C46783a(this));
        }
    }

    public /* synthetic */ AVDmtPanelRecyleView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
