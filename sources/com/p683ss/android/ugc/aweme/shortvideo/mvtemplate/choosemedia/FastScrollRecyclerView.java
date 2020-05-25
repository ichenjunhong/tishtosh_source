package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller.C44028a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller.C44029b;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView */
public final class FastScrollRecyclerView extends RecyclerView {

    /* renamed from: N */
    private FastScroller f111471N;

    /* renamed from: o */
    public final void mo49162o() {
        FastScroller fastScroller = this.f111471N;
        if (fastScroller != null) {
            fastScroller.mo89872e();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        FastScroller fastScroller = this.f111471N;
        if (fastScroller != null) {
            fastScroller.mo89867a((RecyclerView) this);
        }
    }

    public final void onDetachedFromWindow() {
        FastScroller fastScroller = this.f111471N;
        if (fastScroller != null) {
            fastScroller.mo89866a();
        }
        super.onDetachedFromWindow();
    }

    public FastScrollRecyclerView(Context context) {
        C52711k.m112240b(context, "context");
        this(context, null);
    }

    public final void setFastScrollEnabled(boolean z) {
        FastScroller fastScroller = this.f111471N;
        if (fastScroller != null) {
            fastScroller.setEnabled(z);
        }
    }

    public final void setFastScrollListener(C44028a aVar) {
        FastScroller fastScroller = this.f111471N;
        if (fastScroller != null) {
            fastScroller.setFastScrollListener(aVar);
        }
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        FastScroller fastScroller = this.f111471N;
        if (fastScroller != null) {
            fastScroller.setVisibility(i);
        }
    }

    public final void setAdapter(C1322a<?> aVar) {
        super.setAdapter(aVar);
        if (aVar instanceof C44029b) {
            FastScroller fastScroller = this.f111471N;
            if (fastScroller != null) {
                fastScroller.setSectionIndexer((C44029b) aVar);
            }
        }
    }

    public FastScrollRecyclerView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        this(context, attributeSet, 0);
    }

    public FastScrollRecyclerView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f111471N = new FastScroller(context, attributeSet);
        FastScroller fastScroller = this.f111471N;
        if (fastScroller != null) {
            fastScroller.setId(R.id.e85);
        }
    }
}
