package com.p683ss.android.ugc.aweme.tools.draft;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Scroller;
import com.p683ss.android.ugc.aweme.utils.C47918gj;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.DraftItemView */
public class DraftItemView extends LinearLayout {

    /* renamed from: a */
    private Scroller f118633a;

    /* renamed from: b */
    private View f118634b;

    /* renamed from: c */
    private int f118635c;

    /* renamed from: d */
    private boolean f118636d;

    /* renamed from: e */
    private C46952a f118637e;

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.DraftItemView$a */
    public interface C46952a {
        /* renamed from: a */
        void mo94250a(int i, boolean z);
    }

    /* renamed from: a */
    public final void mo94255a() {
        if (!this.f118636d) {
            this.f118636d = true;
            this.f118633a.startScroll(0, 0, -this.f118635c, 0, 200);
            if (this.f118637e != null) {
                this.f118637e.mo94250a(this.f118635c, this.f118636d);
            }
        }
    }

    /* renamed from: b */
    public final void mo94256b() {
        if (this.f118636d) {
            this.f118636d = false;
            this.f118633a.startScroll(-this.f118635c, 0, this.f118635c, 0, 200);
            if (this.f118637e != null) {
                this.f118637e.mo94250a(this.f118635c, this.f118636d);
            }
        }
    }

    public void computeScroll() {
        if (this.f118633a.computeScrollOffset()) {
            scrollTo(this.f118633a.getCurrX(), this.f118633a.getCurrY());
            if (this.f118637e != null) {
                this.f118633a.getCurrX();
                this.f118633a.getCurrY();
            }
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f118634b = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) this.f118634b.getLayoutParams();
        this.f118635c = layoutParams.width + (layoutParams.rightMargin * 2);
        if (C47918gj.m103682a(getContext())) {
            this.f118635c = -this.f118635c;
        }
    }

    public void setOnScrollListener(C46952a aVar) {
        this.f118637e = aVar;
    }

    public DraftItemView(Context context) {
        this(context, null);
    }

    public DraftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f118633a = new Scroller(context);
    }
}
