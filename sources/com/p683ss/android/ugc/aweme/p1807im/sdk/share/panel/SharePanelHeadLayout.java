package com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p683ss.android.ugc.aweme.p1807im.sdk.arch.Widget;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelHeadLayout */
public final class SharePanelHeadLayout extends LinearLayout {

    /* renamed from: a */
    public static final C35130a f90345a = new C35130a(null);

    /* renamed from: b */
    private Widget f90346b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelHeadLayout$a */
    public static final class C35130a {
        private C35130a() {
        }

        public /* synthetic */ C35130a(C52707g gVar) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Widget widget = this.f90346b;
        if (widget != null) {
            widget.destroy();
        }
    }

    public final void setWidget(Widget widget) {
        C52711k.m112240b(widget, "widget");
        this.f90346b = widget;
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            Widget widget = this.f90346b;
            if (widget != null) {
                widget.resume();
            }
        }
    }

    public SharePanelHeadLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        View.inflate(context, R.layout.bgs, this);
    }

    public /* synthetic */ SharePanelHeadLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
