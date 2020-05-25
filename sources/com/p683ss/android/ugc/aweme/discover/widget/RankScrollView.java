package com.p683ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.RankScrollView */
public class RankScrollView extends HorizontalScrollView {

    /* renamed from: a */
    private C28973a f75847a;

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.RankScrollView$a */
    public interface C28973a {
        /* renamed from: a */
        void mo56240a(int i);
    }

    public RankScrollView(Context context) {
        super(context);
    }

    public void setOnScrollListener(C28973a aVar) {
        this.f75847a = aVar;
    }

    public RankScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RankScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f75847a != null) {
            this.f75847a.mo56240a(i);
        }
    }
}
